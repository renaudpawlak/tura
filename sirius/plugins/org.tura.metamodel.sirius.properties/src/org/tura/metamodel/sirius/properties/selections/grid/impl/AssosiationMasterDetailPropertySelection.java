package org.tura.metamodel.sirius.properties.selections.grid.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.tura.metamodel.commons.QueryHelper;
import org.tura.metamodel.sirius.properties.selections.adapters.dropdown.LinkDetailField;
import org.tura.metamodel.sirius.properties.selections.adapters.dropdown.LinkMasterField;
import org.tura.metamodel.sirius.properties.selections.grid.GridColumn;
import org.tura.metamodel.sirius.properties.selections.grid.GridDropDownColumn;
import org.tura.metamodel.sirius.properties.selections.grid.GridProperty;

import type.Assosiation;
import type.Attribute;
import type.Generalization;
import type.Link;
import type.Type;
import type.TypeElement;
import type.TypeReference;


public class AssosiationMasterDetailPropertySelection extends GridProperty {

	private List<GridColumn> columnList;

	public AssosiationMasterDetailPropertySelection() {
		ds = new AssosiationMasterDetailDS(this);
	}

	@Override
	public List<GridColumn> getColumns() {
		if (columnList == null) {
			columnList = new ArrayList<GridColumn>();
			columnList.add(new MasterColumn(table, this, 0));
			columnList.add(new DetailColumn(table, this, 1));
		}
		return columnList;
	}

	public void createControls(Composite parent, TabbedPropertySheetPage aTabbedPropertySheetPage) {

		Composite composite = aTabbedPropertySheetPage.getWidgetFactory().createFlatFormComposite(parent);

		GridLayout layout = new GridLayout(1, false);
		layout.marginWidth = 4;
		composite.setLayout(layout);
		super.createControls(composite, aTabbedPropertySheetPage);
		createButtons(composite, aTabbedPropertySheetPage);
	}

	private void createButtons(Composite parent, TabbedPropertySheetPage aTabbedPropertySheetPage) {
		Composite composite = aTabbedPropertySheetPage.getWidgetFactory().createFlatFormComposite(parent);

		GridLayout layout = new GridLayout(2, false);
		layout.marginWidth = 4;
		composite.setLayout(layout);

		// Create and configure the "Delete" button
		Button add = new Button(composite, SWT.PUSH | SWT.CENTER);
		add.setText("Add");
		GridData gridData = new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING);
		gridData.widthHint = 80;
		add.setLayoutData(gridData);

		add.addSelectionListener(new SelectionAdapter() {

			// Remove the selection and refresh the view
			public void widgetSelected(SelectionEvent e) {
				addRow();
			}
		});

		// Create and configure the "Delete" button
		Button delete = new Button(composite, SWT.PUSH | SWT.CENTER);
		delete.setText("Delete");
		gridData = new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING);
		gridData.widthHint = 80;
		delete.setLayoutData(gridData);

		delete.addSelectionListener(new SelectionAdapter() {

			// Remove the selection and refresh the view
			public void widgetSelected(SelectionEvent e) {
				Object row = ((IStructuredSelection) tableViewer.getSelection()).getFirstElement();
				if (row != null) {
					removeRow(row);
				}
			}
		});

	}
	
	class MasterColumn extends GridDropDownColumn {

		public MasterColumn(Table table, GridProperty property, int col) {
			super(table, property, col);
			setColumnName("Master column");
			setDropDownDataAdapter(new LinkMasterField());
		}

		@Override
		public Map<String, Object> getEnumerationFeatureValues(EObject base) {

			Link opt = (Link) base;

			Type type  = (Type) ((Assosiation)  opt.eContainer()).getSource();

			if (type == null)
				return new HashMap<String, Object>();

			List<Attribute> attributes = initOptions(type);

			LinkedHashMap<String, Object> ls = new LinkedHashMap<>();
			for (Attribute attr : attributes)
				ls.put(attr.getName(), attr);

			return ls;
		}
	}
	
	class DetailColumn extends GridDropDownColumn {

		public DetailColumn(Table table, GridProperty property, int col) {
			super(table, property, col);
			setColumnName("Detail column");
			setDropDownDataAdapter(new LinkDetailField());
		}

		@Override
		public Map<String, Object> getEnumerationFeatureValues(EObject base) {
			Link opt = (Link) base;

			Type type  = (Type) ((Assosiation)  opt.eContainer()).getTarget();

			if (type == null)
				return new HashMap<String, Object>();

			List<Attribute> attributes = initOptions(type);

			LinkedHashMap<String, Object> ls = new LinkedHashMap<>();
			for (Attribute attr : attributes)
				ls.put(attr.getName(), attr);

			return ls;

		}

	}
	
	public List<Attribute> initOptions(Type type) {
		List<Attribute> attrs = new ArrayList<>();

		Collection<Generalization> ls =  new QueryHelper().getTypeExtension(type);

		if (ls.size() != 0) {
			for (Generalization ext : ls ) {
				TypeElement typeElement = ext.getTarget();
				if (typeElement instanceof Type)
					attrs.addAll(initOptions((Type) typeElement));

				if (typeElement instanceof TypeReference)
					attrs.addAll(initOptions((Type) ((TypeReference) typeElement).getTypeRef()));
			}
		}
		attrs.addAll(type.getAttributes());
		return attrs;
	}
	
}
