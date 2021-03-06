package org.tura.metamodel.sirius.properties.actions;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;
import org.eclipse.sirius.viewpoint.DRepresentationElement;
import org.tura.metamodel.epsilon.command.EolCommand;

import form.DataControl;

public class DataControlCompressorCommandAction implements IExternalJavaAction{

	@Override
	public boolean canExecute(Collection<? extends EObject> arg0) {
		return true;
	}

	@Override
	public void execute(Collection<? extends EObject> arg0, Map<String, Object> arg1) {
		DRepresentationElement node = (DRepresentationElement) arg0.iterator().next();
		DataControl control = (DataControl) node.getTarget();
		
		Session session = SessionManager.INSTANCE.getSession(control);
		EditingDomain editingDomain = session.getTransactionalEditingDomain();
		
		EolCommand cmd = new EolCommand(control.eResource(), "platform:/plugin/org.tura.metamodel.generation/template/commons/MaindcWithCompressedCommand.eol");
		HashMap<String , Object> parameters = new HashMap<String, Object>();
		parameters.put("self",control);
		cmd.setVariables(parameters);
		editingDomain.getCommandStack().execute(cmd);
		
	}

}
