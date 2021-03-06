package org.tura.metamodel.commons.properties.selections.adapters;

import java.util.ArrayList;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.model.IWorkbenchAdapter;

import application.Application;

public class ApplicationProvider implements IWorkbenchAdapter ,IReturnTypeProvider{

	@Override
	public Object getReturnType(Object o) {
		return null;
	}

	@Override
	public Object getApplicationType(Object o) {
		return null;
	}
	
	@Override
	public Object[] getChildren(Object o) {
		Application p = (Application) o;
		ArrayList<Object> ls = new ArrayList<>();
		ls.add(p.getApplicationRole());
		ls.add(p.getApplicationStyle());
		ls.addAll(p.getApplicationUILayer().getApplicationUIPackages());
		

		return ls.toArray();
	}

	@Override
	public ImageDescriptor getImageDescriptor(Object object) {
		return null;
	}

	@Override
	public String getLabel(Object o) {
		Application p = (Application) o;
		return p.getName();
	}

	@Override
	public Object getParent(Object o) {
		return null;
	}

}
