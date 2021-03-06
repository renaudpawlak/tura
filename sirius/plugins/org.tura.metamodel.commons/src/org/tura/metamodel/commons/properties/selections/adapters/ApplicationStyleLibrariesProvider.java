package org.tura.metamodel.commons.properties.selections.adapters;

import java.util.ArrayList;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.model.IWorkbenchAdapter;

import application.ApplicationStyleLibraries;

public class ApplicationStyleLibrariesProvider implements IWorkbenchAdapter ,IReturnTypeProvider{

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
		ApplicationStyleLibraries p = (ApplicationStyleLibraries) o;
		ArrayList<Object> ls = new ArrayList<>();
		ls.addAll(p.getStyleLibraries());

		return ls.toArray();
	}

	@Override
	public ImageDescriptor getImageDescriptor(Object object) {
		return null;
	}

	@Override
	public String getLabel(Object o) {
		return "Application Style Libraries";
	}

	@Override
	public Object getParent(Object o) {
		return null;
	}

}
