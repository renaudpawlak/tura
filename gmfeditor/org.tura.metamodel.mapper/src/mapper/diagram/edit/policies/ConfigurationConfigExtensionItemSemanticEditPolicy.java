/*
 * 
 */
package mapper.diagram.edit.policies;

import mapper.diagram.providers.DomainElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

/**
 * @generated
 */
public class ConfigurationConfigExtensionItemSemanticEditPolicy extends
		DomainBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ConfigurationConfigExtensionItemSemanticEditPolicy() {
		super(DomainElementTypes.ConfigurationConfigExtension_404003);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
