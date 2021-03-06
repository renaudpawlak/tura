package org.tura.metamodel.sirius.properties.selections.grid.impl;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.CheckboxCellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.tura.metamodel.sirius.properties.selections.adapters.textdata.AreaNickname;
import org.tura.metamodel.sirius.properties.selections.adapters.textdata.RefreshAreaGroup;
import org.tura.metamodel.sirius.properties.selections.grid.GridColumn;
import org.tura.metamodel.sirius.properties.selections.grid.GridProperty;
import org.tura.metamodel.sirius.properties.selections.grid.GridTextColumn;
import org.tura.metamodel.sirius.properties.selections.grid.TextColumnConverter;

import form.AreaRef;
import form.FormFactory;
import form.FormPackage;


public class MenuItemOnEventRefreshAreaPropertySelection extends GridProperty {

	private List<GridColumn> columnList;

	public MenuItemOnEventRefreshAreaPropertySelection() {
		ds = new MenuItemOnEventRefreshAreaDS(this);
	}

	@Override
	public List<GridColumn> getColumns() {
		if (columnList == null) {
			columnList = new ArrayList<GridColumn>();
			columnList.add(new NickColumn(table, this, 0));
			columnList.add(new RefrashableColumn(table, this, 1));
			columnList.add(new GroupColumn(table, this,2));
		}
		return columnList;
	}

	class NickColumn extends GridTextColumn {

		public NickColumn(Table table, GridProperty property, int col) {
			super(table, property, col);
			setTextDataAdapter(new AreaNickname());
			this.setColumnName("Nick name");
		}

		@Override
		public boolean isModify(Object element, String property) {
			return false;
		}
	}

	class RefrashableColumn implements GridColumn {

		// Set the table column property names
		private final String REFRASHABLE_COLUMN = "Is refreshable";
		private int col;

		private Table table;
		private GridProperty property;

		public RefrashableColumn(Table table, GridProperty property, int col) {
			this.table = table;
			this.property = property;
			this.col = col;
		}

		@Override
		public TableColumn createColumn() {
			TableColumn column = new TableColumn(table, SWT.LEFT, col);
			column.setText(REFRASHABLE_COLUMN);
			column.setWidth(80);
			return column;
		}

		@Override
		public String getName() {
			return REFRASHABLE_COLUMN;
		}

		@Override
		public CellEditor getEditor() {
			CheckboxCellEditor textEditor = new CheckboxCellEditor(table);
			return textEditor;
		}

		@Override
		public int compareOptions(Object o1, Object o2) {
			return 0;
		}

		@Override
		public Object getValue(Object element) {
			RefreshAreaRow opt = (RefreshAreaRow) element;
			return opt.isRefreshedArea();
		}

		@Override
		public void modify(Object element, Object value) {

			TableItem item = (TableItem) element;
			RefreshAreaRow opt = (RefreshAreaRow) item
					.getData();

			Boolean refreshable = ((Boolean) value);
			EditingDomain editingDomain = ((DiagramEditor) getPart())
					.getEditingDomain();

			if (refreshable) {
				AreaRef ref = FormFactory.eINSTANCE.createAreaRef();
				ref.setArea(opt.getNickNamed());

				ArrayList<AreaRef> ls = new ArrayList<AreaRef>();
				ls.add(ref);

				editingDomain.getCommandStack().execute(
						AddCommand.create(editingDomain, property.getModel(),
								FormPackage.eINSTANCE
										.getMenuItem_RefreshAreas(), ls));

				opt.setRef(ref);

			} else {
				AreaRef ref = opt.getRef();
				ArrayList<AreaRef> ls = new ArrayList<AreaRef>();
				ls.add(ref);

				editingDomain.getCommandStack().execute(
						RemoveCommand.create(editingDomain,
								property.getModel(), FormPackage.eINSTANCE
										.getMenuItem_RefreshAreas(), ls));

				opt.setRef(null);
				opt.setNickNamed(ref.getArea());

			}

		}

		@Override
		public boolean isModify(Object element, String property) {
			return true;
		}

		@Override
		public Object getText(Object element) {
			return getValue(element);
		}

	}

	class GroupColumn extends GridTextColumn{
		
		public GroupColumn(Table table, GridProperty property, int col) {
			super(table, property, col);
			setTextDataAdapter(new RefreshAreaGroup());
			this.setColumnName("Group");
		}
		
		@Override
		public Object getText(Object element) {
			EStructuralFeature feature = dataAdapter.getFeature();
			if (dataAdapter instanceof TextColumnConverter)
			    return ((TextColumnConverter) dataAdapter).convertToText( element);
			else
			    return dataAdapter.getFeatureValue( element, feature);
		}		
		
		@Override
		public Object getValue(Object element) {
			EStructuralFeature feature = dataAdapter.getFeature();
			Object obj = null;
			if (dataAdapter instanceof TextColumnConverter)
				obj =  ((TextColumnConverter) dataAdapter).convertToText(element);
			else
				obj =  dataAdapter.getFeatureValue((EObject) element, feature);
			
			if (obj == null)
				return "";
			else 
				return obj;
		}		
		
		
		@Override
		public boolean isModify(Object element, String property) {
			RefreshAreaRow opt = (RefreshAreaRow) element;
			return opt.isRefreshedArea();
		}		
		
		@Override
		public void modify(Object element, Object value) {

			TableItem item = (TableItem) element;
			RefreshAreaRow opt = (RefreshAreaRow) item
					.getData();

			EditingDomain editingDomain = ((DiagramEditor) getPart())
					.getEditingDomain();

			editingDomain.getCommandStack().execute(
					SetCommand.create(editingDomain, opt.getRef(),
							FormPackage.eINSTANCE
									.getAreaRef_Group(), new Integer ((String)value) ));
			
			
		}
		
		
		
	}	
	
	
}