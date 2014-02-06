package org.metamodel.tura.ui.properties.sections.dropdown;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.validation.internal.modeled.model.validation.Constraint;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ocl.OCL;
import org.eclipse.ocl.ecore.EcoreEnvironmentFactory;
import org.eclipse.ocl.expressions.OCLExpression;
import org.eclipse.ocl.helper.OCLHelper;
import org.eclipse.ui.IWorkbenchPart;
import org.metamodel.tura.ui.properties.sections.dropdown.impl.DomainBusinessMethodMethodRef;

import domain.DomainPackage;

public class MethodNamePropertySection extends
		AbstractEnumerationPropertySection {

	protected HashMap<String, Object> values;
	private boolean isFirstTime = true;
	private DropDownDataSupplier methodNameProperty;
	private AdapterImpl adapter;

	protected EStructuralFeature[] getFeature() {
		if (methodNameProperty == null)
			init();
		return methodNameProperty.getFeature();
	}

	protected String getFeatureAsText() {
		if (methodNameProperty == null)
			init();
		return methodNameProperty.getFeatureAsText(eObject);
	}

	protected Object getFeatureValue(EStructuralFeature feature, Object... obj) {
		if (methodNameProperty == null)
			init();
		return methodNameProperty
				.getFeatureValue(eObject, values, feature, obj);
	}

	protected String getLabelText() {
		return "Method name";//$NON-NLS-1$
	}

	protected boolean isEqual(Object key) {
		if (methodNameProperty == null)
			init();
		return methodNameProperty.isEqual(values, key, eObject);
	}

	public void setInput(IWorkbenchPart part, ISelection selection) {
		super.setInput(part, selection);
		values = null;
		if (isFirstTime) {

			adapter = new AdapterImpl() {
				public void notifyChanged(Notification notification) {
					if (notification.getFeatureID(methodNameProperty
							.getExpectedClass()) == methodNameProperty
							.getWatchPointFeature().getFeatureID()) {
						values = null;

						EditingDomain editingDomain = ((DiagramEditor) getPart())
								.getEditingDomain();
						CompoundCommand compoundCommand = new CompoundCommand();
						EStructuralFeature[] features = getFeature();
						for (int i = 0; i < features.length; i++) {
							if (features[i].getFeatureID() != methodNameProperty
									.getWatchPointFeature().getFeatureID())
								compoundCommand.append(SetCommand.create(
										editingDomain, eObject, features[i],
										null));
						}
						editingDomain.getCommandStack()
								.execute(compoundCommand);
						refresh();
					}
				}

			};
			eObject.eAdapters().add(adapter);
		}

	}

	private void init() {
		methodNameProperty = new DomainBusinessMethodMethodRef();
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	protected HashMap<String, Object> getEnumerationFeatureValues() {

		if (values == null) {
			values = new HashMap<String, Object>();

			Diagram diagram = (Diagram) editPart.getRoot().getContents()
					.getModel();
			EObject types = (EObject) diagram.getElement();

			if ((((domain.BusinessMethod) eObject).getTypeRef() == null)
					|| ((domain.BusinessMethod) eObject).getPackageRef() == null)
				return values;

			OCL ocl = OCL.newInstance(EcoreEnvironmentFactory.INSTANCE);
			OCLHelper<EClassifier, ?, ?, Constraint> helper = ocl
					.createOCLHelper();
			helper.setContext(DomainPackage.eINSTANCE.getEClassifier("Types"));

			try {
				OCLExpression<EClassifier> query = helper
						.createQuery("domain::Package.allInstances()->select(r|r.oclAsType(domain::Package).uid='"
								+ ((domain.TypePointer) eObject)
										.getPackageRef().getUid()
								+ "').oclAsType(domain::Package).typedefinition.types->select(r|r.oclIsKindOf(domain::Type) and  r.oclAsType(domain::Type).uid = '"
								+ ((domain.BusinessMethod) eObject)
										.getTypeRef().getUid()
								+ "').oclAsType(domain::Type).operations");

				Collection<domain.Operation> map = (Collection<domain.Operation>) ocl
						.evaluate(types, query);

				for (Iterator<domain.Operation> i = map.iterator(); i.hasNext();) {
					domain.Operation p = i.next();
					values.put(p.getName(), p);
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		return values;
	}

	public void dispose() {
		super.dispose();
		eObject.eAdapters().remove(adapter);
	}
}
