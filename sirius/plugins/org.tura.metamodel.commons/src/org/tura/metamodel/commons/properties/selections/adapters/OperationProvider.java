package org.tura.metamodel.commons.properties.selections.adapters;

import java.util.ArrayList;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.model.IWorkbenchAdapter;

import type.Operation;

public class OperationProvider implements IWorkbenchAdapter ,IReturnTypeProvider{

	@Override
	public Object[] getChildren(Object o) {
		ArrayList<Object> ls = new ArrayList<>();
		Operation opr = (Operation) o;
		if (opr.getReturnValue() != null) {
			ls.add(opr.getReturnValue().getTypeRef());
		}
		return ls.toArray();
	}

	@Override
	public ImageDescriptor getImageDescriptor(Object object) {
		return null;
	}

	@Override
	public String getLabel(Object o) {
	     Operation opr = (Operation) o;
		return opr.getName()+"()";
	}

	@Override
	public Object getParent(Object o) {
		return null;
	}

	@Override
	public Object getReturnType(Object o) {
		if (((Operation) o).getReturnValue() != null) {
			return ((Operation) o).getReturnValue().getTypeRef();
		}
		return null;
	}

	@Override
	public Object getApplicationType(Object o) {
		if (((Operation) o).getReturnValue() != null) {
			return ((Operation) o).getReturnValue().getTypeRef();
		}
		return null;
	}	
	
}
