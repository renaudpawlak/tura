package org.tura.metamodel.sirius.properties.actions;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;
import org.eclipse.sirius.viewpoint.DRepresentationElement;

import recipe.Configuration;

public class ConfigVariablesAction implements IExternalJavaAction{

	@Override
	public boolean canExecute(Collection<? extends EObject> arg0) {
		return true;
	}

	@Override
	public void execute(Collection<? extends EObject> arg0, Map<String, Object> arg1) {
		DRepresentationElement node = (DRepresentationElement) arg0.iterator().next();
		
		new ConfigVarDialog().runDialog((Configuration) node.getTarget());
		
	}

}
