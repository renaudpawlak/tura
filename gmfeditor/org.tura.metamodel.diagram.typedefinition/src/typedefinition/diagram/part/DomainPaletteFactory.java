/*
 * 
 */
package typedefinition.diagram.part;

import java.util.Collections;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import typedefinition.diagram.providers.DomainElementTypes;

/**
 * @generated
 */
public class DomainPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createObjects1Group());
		paletteRoot.add(createConnections2Group());
	}

	/**
	 * Creates "Objects" palette tool group
	 * @generated
	 */
	private PaletteContainer createObjects1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Objects1Group_title);
		paletteContainer.setId("createObjects1Group"); //$NON-NLS-1$
		paletteContainer.add(createAttribute1CreationTool());
		paletteContainer.add(createEnumAttribute2CreationTool());
		paletteContainer.add(createEnumarator3CreationTool());
		paletteContainer.add(createOperation4CreationTool());
		paletteContainer.add(createParameter5CreationTool());
		paletteContainer.add(createReturnValue6CreationTool());
		paletteContainer.add(createType7CreationTool());
		paletteContainer.add(createTypeReference8CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Connections" palette tool group
	 * @generated
	 */
	private PaletteContainer createConnections2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Connections2Group_title);
		paletteContainer.setId("createConnections2Group"); //$NON-NLS-1$
		paletteContainer.add(createConfigExtension1CreationTool());
		paletteContainer.add(createRecipeConfig2CreationTool());
		paletteContainer.add(createTypeExtension3CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAttribute1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Attribute1CreationTool_title,
				Messages.Attribute1CreationTool_desc,
				Collections.singletonList(DomainElementTypes.Attribute_103001));
		entry.setId("createAttribute1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.Attribute_103001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEnumAttribute2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.EnumAttribute2CreationTool_title,
				Messages.EnumAttribute2CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.EnumAttribute_103005));
		entry.setId("createEnumAttribute2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.EnumAttribute_103005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEnumarator3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Enumarator3CreationTool_title,
				Messages.Enumarator3CreationTool_desc,
				Collections.singletonList(DomainElementTypes.Enumarator_102003));
		entry.setId("createEnumarator3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.Enumarator_102003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createOperation4CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Operation4CreationTool_title,
				Messages.Operation4CreationTool_desc,
				Collections.singletonList(DomainElementTypes.Operation_103002));
		entry.setId("createOperation4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.Operation_103002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createParameter5CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Parameter5CreationTool_title,
				Messages.Parameter5CreationTool_desc,
				Collections.singletonList(DomainElementTypes.Parameter_103006));
		entry.setId("createParameter5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.Parameter_103006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createReturnValue6CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ReturnValue6CreationTool_title,
				Messages.ReturnValue6CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.ReturnValue_103004));
		entry.setId("createReturnValue6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.ReturnValue_103004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createType7CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Type7CreationTool_title,
				Messages.Type7CreationTool_desc,
				Collections.singletonList(DomainElementTypes.Type_102002));
		entry.setId("createType7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.Type_102002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTypeReference8CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.TypeReference8CreationTool_title,
				Messages.TypeReference8CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.TypeReference_102001));
		entry.setId("createTypeReference8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.TypeReference_102001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConfigExtension1CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.ConfigExtension1CreationTool_title,
				Messages.ConfigExtension1CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.ConfigurationConfigExtension_104003));
		entry.setId("createConfigExtension1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.ConfigurationConfigExtension_104003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRecipeConfig2CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.RecipeConfig2CreationTool_title,
				Messages.RecipeConfig2CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.RecipeRecipeConfig_104002));
		entry.setId("createRecipeConfig2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.RecipeRecipeConfig_104002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTypeExtension3CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.TypeExtension3CreationTool_title,
				Messages.TypeExtension3CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.TypeExtension_104001));
		entry.setId("createTypeExtension3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.TypeExtension_104001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private static class NodeToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> elementTypes;

		/**
		 * @generated
		 */
		private NodeToolEntry(String title, String description,
				List<IElementType> elementTypes) {
			super(title, description, null, null);
			this.elementTypes = elementTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}

	/**
	 * @generated
	 */
	private static class LinkToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> relationshipTypes;

		/**
		 * @generated
		 */
		private LinkToolEntry(String title, String description,
				List<IElementType> relationshipTypes) {
			super(title, description, null, null);
			this.relationshipTypes = relationshipTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeConnectionTool(relationshipTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
}
