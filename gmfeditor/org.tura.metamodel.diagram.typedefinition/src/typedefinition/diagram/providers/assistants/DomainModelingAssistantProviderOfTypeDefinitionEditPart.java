/*
 * 
 */
package typedefinition.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import typedefinition.diagram.providers.DomainElementTypes;
import typedefinition.diagram.providers.DomainModelingAssistantProvider;

/**
 * @generated
 */
public class DomainModelingAssistantProviderOfTypeDefinitionEditPart extends DomainModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(4);
		types.add(DomainElementTypes.Type_102002);
		types.add(DomainElementTypes.TypeReference_102001);
		types.add(DomainElementTypes.Primitive_102004);
		types.add(DomainElementTypes.Enumarator_102005);
		return types;
	}

}
