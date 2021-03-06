package org.tura.metamodel.sirius.properties.actions;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.epsilon.common.dt.util.LogUtil;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;
import org.tura.metamodel.commons.QueryHelper;

import form.DataControl;
import form.FormPackage;
import form.Relation;

public class DeleteDataControlAction implements IExternalJavaAction {

	@Override
	public boolean canExecute(Collection<? extends EObject> arg0) {
		return true;
	}

	@Override
	public void execute(Collection<? extends EObject> arg0, Map<String, Object> arg1) {
		try {

			DataControl dc = (DataControl) arg0.iterator().next();

			Session session = SessionManager.INSTANCE.getSession(dc);
			EditingDomain editingDomain = session.getTransactionalEditingDomain();

			List<Relation> relations = new QueryHelper().findRelation(dc);
			
			editingDomain.getCommandStack().execute(
					RemoveCommand.create(editingDomain,dc.eContainer(),
							FormPackage.eINSTANCE.getControls_Relations(), relations));
			
			
			editingDomain.getCommandStack().execute(
					RemoveCommand.create(editingDomain,dc.eContainer(),
							FormPackage.eINSTANCE.getControls_Controls(), dc));
			
			
		} catch (Exception e) {
			LogUtil.log(e);
		}

	}

}
