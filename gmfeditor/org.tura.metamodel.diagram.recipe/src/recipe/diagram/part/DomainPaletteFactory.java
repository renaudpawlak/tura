/*
 * 
 */
package recipe.diagram.part;

import java.util.ArrayList;
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

import recipe.diagram.providers.DomainElementTypes;

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
		paletteContainer.add(createComponent1CreationTool());
		paletteContainer.add(createConfiguration2CreationTool());
		paletteContainer.add(createInfrastructure3CreationTool());
		paletteContainer.add(createIngredient4CreationTool());
		paletteContainer.add(createModelMapper5CreationTool());
		paletteContainer.add(createProperty6CreationTool());
		paletteContainer.add(createRecipe7CreationTool());
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
		paletteContainer.add(createInfrastructures2CreationTool());
		paletteContainer.add(createRecipeConfig3CreationTool());
		paletteContainer.add(createTypeExtension4CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createComponent1CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(DomainElementTypes.Component_303006);
		types.add(DomainElementTypes.Component_303002);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Component1CreationTool_title,
				Messages.Component1CreationTool_desc, types);
		entry.setId("createComponent1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.Component_303006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConfiguration2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Configuration2CreationTool_title,
				Messages.Configuration2CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.Configuration_302002));
		entry.setId("createConfiguration2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.Configuration_302002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInfrastructure3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Infrastructure3CreationTool_title,
				Messages.Infrastructure3CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.Infrastructure_302003));
		entry.setId("createInfrastructure3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.Infrastructure_302003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createIngredient4CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Ingredient4CreationTool_title,
				Messages.Ingredient4CreationTool_desc,
				Collections.singletonList(DomainElementTypes.Ingredient_303005));
		entry.setId("createIngredient4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.Ingredient_303005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createModelMapper5CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ModelMapper5CreationTool_title,
				Messages.ModelMapper5CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.ModelMapper_303003));
		entry.setId("createModelMapper5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.ModelMapper_303003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createProperty6CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Property6CreationTool_title,
				Messages.Property6CreationTool_desc,
				Collections.singletonList(DomainElementTypes.Property_303004));
		entry.setId("createProperty6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.Property_303004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRecipe7CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Recipe7CreationTool_title,
				Messages.Recipe7CreationTool_desc,
				Collections.singletonList(DomainElementTypes.Recipe_302001));
		entry.setId("createRecipe7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.Recipe_302001));
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
						.singletonList(DomainElementTypes.ConfigurationConfigExtension_304003));
		entry.setId("createConfigExtension1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.ConfigurationConfigExtension_304003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInfrastructures2CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Infrastructures2CreationTool_title,
				Messages.Infrastructures2CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.RecipeInfrastructures_304005));
		entry.setId("createInfrastructures2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.RecipeInfrastructures_304005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRecipeConfig3CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.RecipeConfig3CreationTool_title,
				Messages.RecipeConfig3CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.InfrastructureRecipeConfig_304004));
		entry.setId("createRecipeConfig3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.InfrastructureRecipeConfig_304004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTypeExtension4CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.TypeExtension4CreationTool_title,
				Messages.TypeExtension4CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.TypeExtension_304001));
		entry.setId("createTypeExtension4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.TypeExtension_304001));
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
