/*
 * 
 */
package infarastructure.diagram.edit.policies;

import infarastructure.diagram.providers.DomainElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

/**
 * @generated
 */
public class InfrastructureConnectionItemSemanticEditPolicy extends
		DomainBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public InfrastructureConnectionItemSemanticEditPolicy() {
		super(DomainElementTypes.InfrastructureConnection_1204009);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}