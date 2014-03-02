package org.tura.metamodel.wizard.infrastructure;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.validation.model.EvaluationMode;
import org.eclipse.emf.validation.model.IConstraintStatus;
import org.eclipse.emf.validation.service.IBatchValidator;
import org.eclipse.emf.validation.service.ModelValidationService;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.emf.core.util.EMFCoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.tura.metamodel.commons.Util;

import recipe.diagram.part.DomainDiagramEditorPlugin;
import recipe.diagram.part.DomainDiagramEditorUtil;
import recipe.diagram.providers.DomainMarkerNavigationProvider;
import domain.Ingredient;
import domain.Recipes;

public class GMFValidation {

	private IProgressMonitor monitor;

	private boolean validationError = false;

	public GMFValidation(IProgressMonitor monitor) {
		this.monitor = monitor;
	}

	public boolean isValidationError() {
		return validationError;
	}

	public void setValidationError(boolean validationError) {
		this.validationError = validationError;
	}

	public void validate(DiagramEditPart diagramEditPart, View view) {
		IFile target = view.eResource() != null ? WorkspaceSynchronizer
				.getFile(view.eResource()) : null;
		if (target != null) {
			DomainMarkerNavigationProvider.deleteMarkers(target);
		}
		Diagnostic[] diagnostic = runGMFValidator(view);
		for (int i = 0; i < diagnostic.length; i++) {
			createMarkers(target, diagnostic[i], diagramEditPart);

		}
		IBatchValidator validator = (IBatchValidator) ModelValidationService
				.getInstance().newValidator(EvaluationMode.BATCH);
		validator.setIncludeLiveConstraints(true);
		if (view.isSetElement() && view.getElement() != null) {
			IStatus status = validator.validate(view.getElement());
			createMarkers(target, status, diagramEditPart);
		}
	}

	private static void createMarkers(IFile target,
			Diagnostic emfValidationStatus, DiagramEditPart diagramEditPart) {
		if (emfValidationStatus.getSeverity() == Diagnostic.OK) {
			return;
		}
		final Diagnostic rootStatus = emfValidationStatus;
		List<Diagnostic> allDiagnostics = new ArrayList<Diagnostic>();

		HashMap<String, Diagnostic> hash = new HashMap<String, Diagnostic>();
		for (Iterator<Diagnostic> it = emfValidationStatus.getChildren()
				.iterator(); it.hasNext();) {
			Diagnostic nextDiagnostic = it.next();
			List<?> data = nextDiagnostic.getData();
			if (data != null && !data.isEmpty()
					&& data.get(0) instanceof EObject) {
				EObject element = (EObject) data.get(0);

				hash.put(
						EMFCoreUtil.getProxyID(element)
								+ nextDiagnostic.getMessage(), nextDiagnostic);
			}
		}

		DomainDiagramEditorUtil.LazyElement2ViewMap element2ViewMap = new DomainDiagramEditorUtil.LazyElement2ViewMap(
				diagramEditPart.getDiagramView(), collectTargetElements(
						rootStatus, new HashSet<EObject>(), allDiagnostics));
		for (Iterator<Diagnostic> it = hash.values().iterator(); it.hasNext();) {
			Diagnostic nextDiagnostic = (Diagnostic) it.next();
			List<?> data = nextDiagnostic.getData();
			if (data != null && !data.isEmpty()
					&& data.get(0) instanceof EObject) {
				EObject element = (EObject) data.get(0);
				View view = DomainDiagramEditorUtil.findView(diagramEditPart,
						element, element2ViewMap);
				addMarker(
						diagramEditPart.getViewer(),
						target,
						view.eResource().getURIFragment(view),
						EMFCoreUtil.getQualifiedName(element, true),
						nextDiagnostic.getMessage(),
						diagnosticToStatusSeverity(nextDiagnostic.getSeverity()));
			}
		}
	}

	private static int diagnosticToStatusSeverity(int diagnosticSeverity) {
		if (diagnosticSeverity == Diagnostic.OK) {
			return IStatus.OK;
		} else if (diagnosticSeverity == Diagnostic.INFO) {
			return IStatus.INFO;
		} else if (diagnosticSeverity == Diagnostic.WARNING) {
			return IStatus.WARNING;
		} else if (diagnosticSeverity == Diagnostic.ERROR
				|| diagnosticSeverity == Diagnostic.CANCEL) {
			return IStatus.ERROR;
		}
		return IStatus.INFO;
	}

	private static void createMarkers(IFile target, IStatus validationStatus,
			DiagramEditPart diagramEditPart) {
		if (validationStatus.isOK()) {
			return;
		}
		final IStatus rootStatus = validationStatus;
		List<IStatus> allStatuses = new ArrayList<IStatus>();
		DomainDiagramEditorUtil.LazyElement2ViewMap element2ViewMap = new DomainDiagramEditorUtil.LazyElement2ViewMap(
				diagramEditPart.getDiagramView(), collectTargetElements(
						rootStatus, new HashSet<EObject>(), allStatuses));
		for (Iterator<IStatus> it = allStatuses.iterator(); it.hasNext();) {
			IConstraintStatus nextStatus = (IConstraintStatus) it.next();
			View view = DomainDiagramEditorUtil.findView(diagramEditPart,
					nextStatus.getTarget(), element2ViewMap);
			addMarker(diagramEditPart.getViewer(), target, view.eResource()
					.getURIFragment(view), EMFCoreUtil.getQualifiedName(
					nextStatus.getTarget(), true), nextStatus.getMessage(),
					nextStatus.getSeverity());
		}
	}

	private static void addMarker(EditPartViewer viewer, IFile target,
			String elementId, String location, String message,
			int statusSeverity) {
		if (target == null) {
			return;
		}
		DomainMarkerNavigationProvider.addMarker(target, elementId, location,
				message, statusSeverity);
	}

	private static Set<EObject> collectTargetElements(IStatus status,
			Set<EObject> targetElementCollector,
			List<IStatus> allConstraintStatuses) {
		if (status instanceof IConstraintStatus) {
			targetElementCollector
					.add(((IConstraintStatus) status).getTarget());
			allConstraintStatuses.add(status);
		}
		if (status.isMultiStatus()) {
			IStatus[] children = status.getChildren();
			for (int i = 0; i < children.length; i++) {
				collectTargetElements(children[i], targetElementCollector,
						allConstraintStatuses);
			}
		}
		return targetElementCollector;
	}

	private static Set<EObject> collectTargetElements(Diagnostic diagnostic,
			Set<EObject> targetElementCollector, List<Diagnostic> allDiagnostics) {
		List<?> data = diagnostic.getData();
		EObject target = null;
		if (data != null && !data.isEmpty() && data.get(0) instanceof EObject) {
			target = (EObject) data.get(0);
			targetElementCollector.add(target);
			allDiagnostics.add(diagnostic);
		}
		if (diagnostic.getChildren() != null
				&& !diagnostic.getChildren().isEmpty()) {
			for (Iterator<Diagnostic> it = diagnostic.getChildren().iterator(); it
					.hasNext();) {
				collectTargetElements((Diagnostic) it.next(),
						targetElementCollector, allDiagnostics);
			}
		}
		return targetElementCollector;
	}

	@SuppressWarnings("unchecked")
	private Diagnostic[] runGMFValidator(View target) {

		if (target.isSetElement() && target.getElement() != null) {

			Diagnostician diagnostician = new Diagnostician() {

				public String getObjectLabel(EObject eObject) {
					return EMFCoreUtil.getQualifiedName(eObject, true);
				}
			};
			ArrayList<Diagnostic> diag = new ArrayList<Diagnostic>();

			// Validate recipe
			monitor.beginTask("Recipe validation", 1);
			domain.Recipes recipes = (Recipes) target.getElement();
			diag.add(diagnostician.validate(recipes));
			monitor.worked(1);
			monitor.done();

			for (Iterator<Diagnostic> diagItr = diag.iterator(); diagItr
					.hasNext();) {
				Diagnostic d = diagItr.next();
				if (d.getSeverity() == Diagnostic.ERROR) {
					validationError = true;
					return diag.toArray(new Diagnostic[diag.size()]);
				}
			}

			try {
				Indicator.clean();
				Indicator.runTime = 1;

				Indicator.currentRecipe = recipes.getRecipe();
				for (Iterator<Ingredient> itr = recipes.getRecipe()
						.getIngredients().iterator(); itr.hasNext();) {
					Ingredient ingredient = itr.next();
					Indicator.currentIngredient = ingredient;
					for (Iterator<domain.Component> itrComp = ingredient
							.getComponents().iterator(); itrComp.hasNext();) {
						domain.Component comp = itrComp.next();
						Indicator.currentComponent = comp;
						monitor.beginTask(
								"Component validation:" + comp.getName(), comp
										.getMappers().size());
						for (Iterator<domain.ModelMapper> itrMap = comp
								.getMappers().iterator(); itrMap.hasNext();) {
							domain.ModelMapper mapper = itrMap.next();
							Indicator.currentModelMapper = mapper;
							monitor.subTask("Mapper validetion :"
									+ mapper.getName());
							for (Iterator<domain.Query> itrQuery = mapper
									.getQueries().iterator(); itrQuery
									.hasNext();) {
								domain.Query query = itrQuery.next();
								Indicator.currentQuery = query;
								if (query.getQueryRef() != null
										&& query.getQueryRef().getQuery() != null
										&& query.getQueryRef().getQuery() != null) {
									try {
										Object result = Util.runQuery(query,
												mapper);
										if (result == null)
											continue;
										if (result instanceof Collection) {
											for (Iterator<EObject> itrRes = ((Collection<EObject>) result)
													.iterator(); itrRes
													.hasNext();) {
												EObject obj = itrRes.next();
												diag.add(diagnostician
														.validate(obj));
											}
										}
										if (result instanceof EObject) {
											diag.add(diagnostician
													.validate((EObject) result));
										}

									} catch (Exception e) {
										DomainDiagramEditorPlugin
												.getInstance()
												.logError(
														"Validation action failed",
														e);
										validationError = true;
									}
								}

							}
							monitor.worked(1);
						}
					}
				}
			} finally {
				Indicator.runTime = 0;
			}

			for (Iterator<Diagnostic> diagItr = diag.iterator(); diagItr
					.hasNext();) {
				Diagnostic d = diagItr.next();
				if (d.getSeverity() == Diagnostic.ERROR)
					validationError = true;
			}
			return diag.toArray(new Diagnostic[diag.size()]);

		}
		return new Diagnostic[] { Diagnostic.OK_INSTANCE };
	}

}