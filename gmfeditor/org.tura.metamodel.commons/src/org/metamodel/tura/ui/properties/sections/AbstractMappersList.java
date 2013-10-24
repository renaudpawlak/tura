package org.metamodel.tura.ui.properties.sections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.dialogs.ListSelectionDialog;
import org.metamodel.tura.ui.properties.sections.AbstractMappersListPropertySelection.ITaskListViewer;

import domain.ApplicationMapper;
import domain.DomainPackage;

public abstract class AbstractMappersList {

	private ArrayList<domain.ApplicationMapper> options = new ArrayList<domain.ApplicationMapper>();
	@SuppressWarnings("rawtypes")
	private Set changeListeners = new HashSet();
	private String[] spOptions;
	private AbstractMappersListPropertySelection mappersListPropertySelection;

	/**
	 * Constructor
	 */
	public AbstractMappersList(
			AbstractMappersListPropertySelection mappersListPropertySelection) {
		super();
		this.mappersListPropertySelection = mappersListPropertySelection;
		this.initData();
	}

	public String[] getMapperOptions() {
		return spOptions;
	}

	public abstract List<domain.ApplicationMapper> findRemovedMappers(
			domain.UsingMappers usingMappers);

	public abstract Set<domain.ApplicationMapper> findAvailableMappers(
			domain.UsingMappers usingMappers);

	private void initData() {

		EditingDomain editingDomain = ((DiagramEditor) mappersListPropertySelection
				.getPart()).getEditingDomain();

		try {

			List<ApplicationMapper> removeMappers = findRemovedMappers((domain.UsingMappers) mappersListPropertySelection.eObject);

			// Remove
			for (Iterator<ApplicationMapper> itr = removeMappers.iterator(); itr
					.hasNext();) {
				ApplicationMapper ms = itr.next();
				editingDomain
						.getCommandStack()
						.execute(
								RemoveCommand
										.create(editingDomain,
												((domain.UsingMappers) mappersListPropertySelection.eObject),
												DomainPackage.eINSTANCE
														.getUsingMappers_Mappers(),
												ms));
			}

			for (Iterator<domain.ApplicationMapper> i = ((domain.UsingMappers) mappersListPropertySelection.eObject)
					.getMappers().iterator(); i.hasNext();) {
				domain.ApplicationMapper p = i.next();
				options.add(p);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Return the collection of tasks
	 */
	public List<?> getOptions() {
		return options;
	}

	/**
	 * Add a new task to the collection of tasks
	 */
	public void addTask() {
		Set<ApplicationMapper> set = findAvailableMappers((domain.UsingMappers) mappersListPropertySelection.eObject);
		ListSelectionDialog dlg = new ListSelectionDialog(Display.getCurrent()
				.getActiveShell(), set, new ArrayContentProvider(),
				new MappersLabelProvider(), "Select Mappers:");
		dlg.setTitle("Mappers Selection");
		dlg.setInitialElementSelections(((domain.UsingMappers) mappersListPropertySelection.eObject)
				.getMappers());
		List<Object> result = new ArrayList<>();
		if (dlg.open() == Window.OK) {
			result = Arrays.asList(dlg.getResult());

			List<domain.ApplicationMapper> addMappers = new ArrayList<domain.ApplicationMapper>();
			for (Iterator<?> itr = result.iterator(); itr.hasNext();) {
				domain.ApplicationMapper mapper = (domain.ApplicationMapper) itr
						.next();
				if (!((domain.UsingMappers) mappersListPropertySelection.eObject)
						.getMappers().contains(mapper)) {
					addMappers.add(mapper);
				}
			}

			List<domain.ApplicationMapper> removeMappers = new ArrayList<domain.ApplicationMapper>();
			for (Iterator<?> itr = ((domain.UsingMappers) mappersListPropertySelection.eObject)
					.getMappers().iterator(); itr.hasNext();) {
				domain.ApplicationMapper mapper = (domain.ApplicationMapper) itr
						.next();
				if (!result.contains(mapper)) {
					removeMappers.add(mapper);
				}
			}

			EditingDomain editingDomain = ((DiagramEditor) mappersListPropertySelection
					.getPart()).getEditingDomain();

			editingDomain
					.getCommandStack()
					.execute(
							AddCommand
									.create(editingDomain,
											((domain.UsingMappers) mappersListPropertySelection.eObject),
											DomainPackage.eINSTANCE
													.getUsingMappers_Mappers(),
											addMappers));

			editingDomain
					.getCommandStack()
					.execute(
							RemoveCommand
									.create(editingDomain,
											((domain.UsingMappers) mappersListPropertySelection.eObject),
											DomainPackage.eINSTANCE
													.getUsingMappers_Mappers(),
											removeMappers));

			options.removeAll(removeMappers);
			options.addAll(addMappers);

			Iterator<?> iterator = changeListeners.iterator();
			while (iterator.hasNext())
				((ITaskListViewer) iterator.next()).addOption(addMappers);

			iterator = changeListeners.iterator();
			while (iterator.hasNext())
				((ITaskListViewer) iterator.next()).removeOption(removeMappers);
		}

	}

	/**
	 * @param task
	 */
	public void removeTask(Object option) {

	}

	/**
	 * @param task
	 */
	public void taskChanged(domain.ApplicationMapper task) {
		Iterator<?> iterator = changeListeners.iterator();
		while (iterator.hasNext())
			((ITaskListViewer) iterator.next()).updateOption(task);
	}

	/**
	 * @param viewer
	 */
	public void removeChangeListener(ITaskListViewer viewer) {
		changeListeners.remove(viewer);
	}

	/**
	 * @param viewer
	 */
	@SuppressWarnings("unchecked")
	public void addChangeListener(ITaskListViewer viewer) {
		changeListeners.add(viewer);
	}

	class MappersLabelProvider extends LabelProvider {
		public String getText(Object element) {
			return element == null ? "" : ((domain.ApplicationMapper) element).getName();//$NON-NLS-1$
		}

	}

}