package org.metamodel.tura.ui.properties.sections.grid.impl;

import java.text.Collator;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.metamodel.tura.ui.properties.sections.grid.GridColumn;
import org.metamodel.tura.ui.properties.sections.grid.GridProperty;

import domain.DomainPackage;

public class QueryParameterPropertySelection extends GridProperty {

	private List<GridColumn> columnList;

	public QueryParameterPropertySelection() {
		ds = new QueryParameterDS(this);
	}

	@Override
	public List<GridColumn> getColumns() {
		if (columnList == null) {
			columnList = new ArrayList<GridColumn>();
			columnList.add(new ParameterColumn(table, this));
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
	

	class ParameterColumn implements GridColumn {

		// Set the table column property names
		private final String PARAMETER_COLUMN = "Parameter";

		private Table table;
		@SuppressWarnings("unused")
		private GridProperty property;

		public ParameterColumn(Table table, GridProperty property) {
			this.table = table;
			this.property = property;
		}

		@Override
		public TableColumn createColumn() {
			TableColumn column = new TableColumn(table, SWT.LEFT, 0);
			column.setText(PARAMETER_COLUMN);
			column.setWidth(400);
			return column;
		}

		@Override
		public String getName() {
			return PARAMETER_COLUMN;
		}

		@Override
		public CellEditor getEditor() {
			TextCellEditor textEditor = new TextCellEditor(table);
			((Text) textEditor.getControl()).setTextLimit(60);
			return textEditor;
		}

		@Override
		public int compareOptions(Object o1, Object o2) {
			domain.QueryParameter op1 = (domain.QueryParameter) o1;
			domain.QueryParameter op2 = (domain.QueryParameter) o2;
			return Collator.getInstance().compare(op1.getName(), op2.getName());
		}

		@Override
		public Object getValue(Object element) {
			String result = "";
			domain.QueryParameter task = (domain.QueryParameter) element;
			if (task.getName() != null)
				result = task.getName();
			return result;
		}

		@Override
		public void modify(Object element, Object value) {

			TableItem item = (TableItem) element;
			domain.QueryParameter opt = (domain.QueryParameter) item.getData();
			String valueString;

			valueString = ((String) value).trim();
			EditingDomain editingDomain = ((DiagramEditor) getPart())
					.getEditingDomain();
			/* apply the property change to single selected object */
			editingDomain.getCommandStack().execute(
					SetCommand.create(editingDomain, opt,
							DomainPackage.eINSTANCE.getQueryParameter_Name(),
							valueString));

		}

		@Override
		public boolean isModify() {
			return true;
		}
	}

}
