package org.tura.metamodel.sirius.properties.selections.grid.impl;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.tura.metamodel.commons.QueryHelper;
import org.tura.metamodel.commons.properties.selections.adapters.helper.TreeRoot;
import org.tura.metamodel.sirius.properties.selections.TextDataAdapter;
import org.tura.metamodel.sirius.properties.selections.adapters.textdata.ParametersName;
import org.tura.metamodel.sirius.properties.selections.adapters.textdata.ParametersOrder;
import org.tura.metamodel.sirius.properties.selections.adapters.textdata.TypePointerTypeName;
import org.tura.metamodel.sirius.properties.selections.grid.GridColumn;
import org.tura.metamodel.sirius.properties.selections.grid.GridProperty;
import org.tura.metamodel.sirius.properties.selections.grid.GridTextAndDialogColumn;
import org.tura.metamodel.sirius.properties.selections.grid.GridTextColumn;

import type.Parameter;
import type.TypeElement;
import type.TypePackage;

public class ParametersPropertySelection extends GridProperty {

	protected List<GridColumn> columnList;
	private TextDataAdapter paramNameTextAdapter = new ParametersName();
	private TextDataAdapter typeNameTextAdapter = new TypePointerTypeName();
	private TextDataAdapter parameterOrderTextAdapter = new ParametersOrder();
	
	public ParametersPropertySelection(){
		ds = new ParameterDS(this);
	}
	
	@Override
	public List<GridColumn> getColumns() {
		if (columnList == null) {
			columnList = new ArrayList<GridColumn>();
			columnList.add(new ParameterColumn(table, this, 0,paramNameTextAdapter));
			columnList.add(new TypeColumn(table, this, 1,typeNameTextAdapter));
			columnList.add(new OrderColumn(table, this, 2,parameterOrderTextAdapter));
			
		}
		return columnList;
	}

	public void createControls(Composite parent,
			TabbedPropertySheetPage aTabbedPropertySheetPage) {

		Composite composite = aTabbedPropertySheetPage.getWidgetFactory()
				.createFlatFormComposite(parent);

		GridLayout layout = new GridLayout(1, false);
		layout.marginWidth = 4;
		composite.setLayout(layout);
		super.createControls(composite, aTabbedPropertySheetPage);
		createButtons(composite,aTabbedPropertySheetPage);
	}	
	
	private void createButtons(Composite parent,TabbedPropertySheetPage aTabbedPropertySheetPage) {

		Composite composite = aTabbedPropertySheetPage.getWidgetFactory()
				.createFlatFormComposite(parent);

		GridLayout layout = new GridLayout(2, false);
		layout.marginWidth = 4;
		composite.setLayout(layout);
		
		// Create and configure the "Add" button
		Button add = new Button(composite, SWT.PUSH | SWT.CENTER);
		add.setText("Add");

		GridData gridData = new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING);
		gridData.widthHint = 80;
		add.setLayoutData(gridData);
		add.addSelectionListener(new SelectionAdapter() {

			// Add the selection and refresh the view
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
				Object row = ((IStructuredSelection) tableViewer
						.getSelection()).getFirstElement();
				if (row != null) {
					removeRow(row);
				}
			}
		});

	}
	
	class ParameterColumn extends GridTextColumn{

		public ParameterColumn(Table table, GridProperty property, int col,TextDataAdapter textAdapter) {
			super(table, property, col);
			setTextDataAdapter(textAdapter);
			this.setColumnName("Param name");
		}
		
	}
	
	class TypeColumn extends GridTextAndDialogColumn {

		public TypeColumn(Table table, GridProperty property, int col,TextDataAdapter textAdapter) {
			super(table, property, col);
			setColumnName("Type");
			setTextDataAdapter(textAdapter);
		}

		@Override
		public void modify(Object element, Object value) {
			if (element == null || value instanceof String)
				return;
			super.modify(element, value);
			TableItem item = (TableItem) element;

			Object data = modelConverter( item.getData());
			Object obj = ((TreePath) value).getLastSegment();
			if (checkType(data, obj)) {
				EObject eobject = (EObject) obj;
			    GridColumn col = getProperty().getColumns().get(1);
			    if (col.getValue(data) == null ||  "".equals(col.getValue(data))){
			        col.modify(element, eobject.eGet(TypePackage.eINSTANCE.getTypePointer_TypeRef()));
			    }
			}
		}		
		
		@Override
		public Object modelConverter(Object model){
			return model;
			
		}
		@Override
		public TreeRoot getContextRoot() {
			TreeRoot rootOfTree = new TreeRoot();
			try {
				rootOfTree.addChild(  new QueryHelper().getTypesRepository(getModel()));
			} catch (Exception e) {
				// ignore
			}
			return rootOfTree;
		}

		@Override
		public boolean checkType(Object tableItem, Object selectedElement) {
			if (selectedElement instanceof TypeElement )
				return true;
			return false;
		}
	}
		
	class OrderColumn extends GridTextColumn{
		
		public OrderColumn(Table table, GridProperty property, int col,TextDataAdapter textAdapter) {
			super(table, property, col);
			setTextDataAdapter(textAdapter);
			this.setColumnName("Order");
		}
		@Override
		public int compareOptions(Object o1, Object o2) {
			Parameter i1 = (Parameter) o1;
			Parameter i2 = (Parameter) o2;
			return new Integer(i1.getOrder()).compareTo( new Integer(i2.getOrder()));
		}
		
	}

}
