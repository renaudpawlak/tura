/*
 * 
 */
package control.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import control.diagram.edit.commands.POSTQueryTriggerCreateCommand;
import control.diagram.providers.DomainElementTypes;

/**
 * @generated
 */
public class DataControlDataControlPostQueryTriggerCompartmentItemSemanticEditPolicy
		extends DomainBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public DataControlDataControlPostQueryTriggerCompartmentItemSemanticEditPolicy() {
		super(DomainElementTypes.DataControl_1102002);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (DomainElementTypes.POSTQueryTrigger_1103003 == req.getElementType()) {
			return getGEFWrapper(new POSTQueryTriggerCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}