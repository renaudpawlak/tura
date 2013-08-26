/*
 * 
 */
package businessobjects.diagram.part;

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

import businessobjects.diagram.providers.DomainElementTypes;

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
		paletteContainer.add(createBusinessObject1CreationTool());
		paletteContainer.add(createCreateMethod2CreationTool());
		paletteContainer.add(createDomainArtifact3CreationTool());
		paletteContainer.add(createInsertMethod4CreationTool());
		paletteContainer.add(createOtherMethod5CreationTool());
		paletteContainer.add(createRemoveMethod6CreationTool());
		paletteContainer.add(createSearchMethod7CreationTool());
		paletteContainer.add(createUpdateMethod8CreationTool());
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
	private ToolEntry createBusinessObject1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.BusinessObject1CreationTool_title,
				Messages.BusinessObject1CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.BusinessObject_602001));
		entry.setId("createBusinessObject1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.BusinessObject_602001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCreateMethod2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.CreateMethod2CreationTool_title,
				Messages.CreateMethod2CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.CreateMethod_603001));
		entry.setId("createCreateMethod2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.CreateMethod_603001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDomainArtifact3CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.DomainArtifact3CreationTool_title,
				Messages.DomainArtifact3CreationTool_desc, null, null) {
		};
		entry.setId("createDomainArtifact3CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInsertMethod4CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.InsertMethod4CreationTool_title,
				Messages.InsertMethod4CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.InsertMethod_603002));
		entry.setId("createInsertMethod4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.InsertMethod_603002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createOtherMethod5CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.OtherMethod5CreationTool_title,
				Messages.OtherMethod5CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.OtherMethod_603006));
		entry.setId("createOtherMethod5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.OtherMethod_603006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRemoveMethod6CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.RemoveMethod6CreationTool_title,
				Messages.RemoveMethod6CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.RemoveMethod_603008));
		entry.setId("createRemoveMethod6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.RemoveMethod_603008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSearchMethod7CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.SearchMethod7CreationTool_title,
				Messages.SearchMethod7CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.SearchMethod_603009));
		entry.setId("createSearchMethod7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.SearchMethod_603009));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createUpdateMethod8CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.UpdateMethod8CreationTool_title,
				Messages.UpdateMethod8CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.UpdateMethod_603007));
		entry.setId("createUpdateMethod8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.UpdateMethod_603007));
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
						.singletonList(DomainElementTypes.ConfigurationConfigExtension_604003));
		entry.setId("createConfigExtension1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.ConfigurationConfigExtension_604003));
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
						.singletonList(DomainElementTypes.RecipeRecipeConfig_604002));
		entry.setId("createRecipeConfig2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.RecipeRecipeConfig_604002));
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
						.singletonList(DomainElementTypes.TypeExtension_604001));
		entry.setId("createTypeExtension3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.TypeExtension_604001));
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