/*
 * 
 */
package application.diagram.part;

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

import application.diagram.providers.DomainElementTypes;

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
		paletteContainer.add(createApplicationMapper1CreationTool());
		paletteContainer.add(createApplicationMappers2CreationTool());
		paletteContainer.add(createApplicationRecipe3CreationTool());
		paletteContainer.add(createApplicationRecipes4CreationTool());
		paletteContainer.add(createApplicationUILayer5CreationTool());
		paletteContainer.add(createApplicationUIPackage6CreationTool());
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
		paletteContainer.add(createDeloyment2CreationTool());
		paletteContainer.add(createDeplymentComponent3CreationTool());
		paletteContainer.add(createFirstStep4CreationTool());
		paletteContainer.add(createInfrastructures5CreationTool());
		paletteContainer.add(createRecipeConfig6CreationTool());
		paletteContainer.add(createRelation7CreationTool());
		paletteContainer.add(createTypeExtension8CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createApplicationMapper1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ApplicationMapper1CreationTool_title,
				Messages.ApplicationMapper1CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.ApplicationMapper_803002));
		entry.setId("createApplicationMapper1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.ApplicationMapper_803002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createApplicationMappers2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ApplicationMappers2CreationTool_title,
				Messages.ApplicationMappers2CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.ApplicationMappers_802002));
		entry.setId("createApplicationMappers2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.ApplicationMappers_802002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createApplicationRecipe3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ApplicationRecipe3CreationTool_title,
				Messages.ApplicationRecipe3CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.ApplicationRecipe_803001));
		entry.setId("createApplicationRecipe3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.ApplicationRecipe_803001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createApplicationRecipes4CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ApplicationRecipes4CreationTool_title,
				Messages.ApplicationRecipes4CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.ApplicationRecipes_802001));
		entry.setId("createApplicationRecipes4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.ApplicationRecipes_802001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createApplicationUILayer5CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ApplicationUILayer5CreationTool_title,
				Messages.ApplicationUILayer5CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.ApplicationUILayer_802003));
		entry.setId("createApplicationUILayer5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.ApplicationUILayer_802003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createApplicationUIPackage6CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ApplicationUIPackage6CreationTool_title,
				Messages.ApplicationUIPackage6CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.ApplicationUIPackage_803003));
		entry.setId("createApplicationUIPackage6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.ApplicationUIPackage_803003));
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
						.singletonList(DomainElementTypes.ConfigurationConfigExtension_804003));
		entry.setId("createConfigExtension1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.ConfigurationConfigExtension_804003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDeloyment2CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Deloyment2CreationTool_title,
				Messages.Deloyment2CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.RecipeDeloyment_804006));
		entry.setId("createDeloyment2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.RecipeDeloyment_804006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDeplymentComponent3CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.DeplymentComponent3CreationTool_title,
				Messages.DeplymentComponent3CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.DeploymentComponentDeplymentComponent_804007));
		entry.setId("createDeplymentComponent3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.DeploymentComponentDeplymentComponent_804007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createFirstStep4CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.FirstStep4CreationTool_title,
				Messages.FirstStep4CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.DeploymentStarStepFirstStep_804009));
		entry.setId("createFirstStep4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.DeploymentStarStepFirstStep_804009));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInfrastructures5CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Infrastructures5CreationTool_title,
				Messages.Infrastructures5CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.RecipeInfrastructures_804005));
		entry.setId("createInfrastructures5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.RecipeInfrastructures_804005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRecipeConfig6CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.RecipeConfig6CreationTool_title,
				Messages.RecipeConfig6CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.InfrastructureRecipeConfig_804004));
		entry.setId("createRecipeConfig6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.InfrastructureRecipeConfig_804004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRelation7CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Relation7CreationTool_title,
				Messages.Relation7CreationTool_desc,
				Collections.singletonList(DomainElementTypes.Relation_804011));
		entry.setId("createRelation7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.Relation_804011));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTypeExtension8CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.TypeExtension8CreationTool_title,
				Messages.TypeExtension8CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.TypeExtension_804001));
		entry.setId("createTypeExtension8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.TypeExtension_804001));
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
