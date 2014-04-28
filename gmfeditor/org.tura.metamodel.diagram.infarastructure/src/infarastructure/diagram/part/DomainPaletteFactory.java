/*
 * 
 */
package infarastructure.diagram.part;

import infarastructure.diagram.providers.DomainElementTypes;

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
		paletteContainer.add(createApplicationRole1CreationTool());
		paletteContainer.add(createApplicationStyle2CreationTool());
		paletteContainer.add(createDatacenter3CreationTool());
		paletteContainer.add(createHub4CreationTool());
		paletteContainer.add(createInfrastructureLayer5CreationTool());
		paletteContainer.add(createRouter6CreationTool());
		paletteContainer.add(createServer7CreationTool());
		paletteContainer.add(createServerClaster8CreationTool());
		paletteContainer.add(createStorage9CreationTool());
		paletteContainer.add(createSubsystem10CreationTool());
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
		paletteContainer.add(createInfrastructureConnection1CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createApplicationRole1CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.ApplicationRole1CreationTool_title,
				Messages.ApplicationRole1CreationTool_desc, null, null) {
		};
		entry.setId("createApplicationRole1CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createApplicationStyle2CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.ApplicationStyle2CreationTool_title,
				Messages.ApplicationStyle2CreationTool_desc, null, null) {
		};
		entry.setId("createApplicationStyle2CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDatacenter3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Datacenter3CreationTool_title,
				Messages.Datacenter3CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.Datacenter_1202002));
		entry.setId("createDatacenter3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainDiagramEditorPlugin
				.findImageDescriptor("/org.tura.metamodel.commons/icons/datacenter.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createHub4CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Hub4CreationTool_title,
				Messages.Hub4CreationTool_desc,
				Collections.singletonList(DomainElementTypes.Hub_1203005));
		entry.setId("createHub4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainDiagramEditorPlugin
				.findImageDescriptor("/org.tura.metamodel.commons/icons/hub.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInfrastructureLayer5CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.InfrastructureLayer5CreationTool_title,
				Messages.InfrastructureLayer5CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.InfrastructureLayer_1203002));
		entry.setId("createInfrastructureLayer5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainDiagramEditorPlugin
				.findImageDescriptor("/org.tura.metamodel.commons/icons/infra.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRouter6CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Router6CreationTool_title,
				Messages.Router6CreationTool_desc,
				Collections.singletonList(DomainElementTypes.Router_1203004));
		entry.setId("createRouter6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainDiagramEditorPlugin
				.findImageDescriptor("/org.tura.metamodel.commons/icons/router.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createServer7CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(DomainElementTypes.Server_1203003);
		types.add(DomainElementTypes.Server_1203008);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Server7CreationTool_title,
				Messages.Server7CreationTool_desc, types);
		entry.setId("createServer7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainDiagramEditorPlugin
				.findImageDescriptor("/org.tura.metamodel.commons/icons/server.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createServerClaster8CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ServerClaster8CreationTool_title,
				Messages.ServerClaster8CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.ServerClaster_1203007));
		entry.setId("createServerClaster8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainDiagramEditorPlugin
				.findImageDescriptor("/org.tura.metamodel.commons/icons/serverclaster.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createStorage9CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Storage9CreationTool_title,
				Messages.Storage9CreationTool_desc,
				Collections.singletonList(DomainElementTypes.Storage_1203006));
		entry.setId("createStorage9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainDiagramEditorPlugin
				.findImageDescriptor("/org.tura.metamodel.commons/icons/storage.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSubsystem10CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Subsystem10CreationTool_title,
				Messages.Subsystem10CreationTool_desc,
				Collections.singletonList(DomainElementTypes.Subsystem_1203001));
		entry.setId("createSubsystem10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainDiagramEditorPlugin
				.findImageDescriptor("/org.tura.metamodel.commons/icons/subsystem.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInfrastructureConnection1CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.InfrastructureConnection1CreationTool_title,
				Messages.InfrastructureConnection1CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.InfrastructureConnection_1204009));
		entry.setId("createInfrastructureConnection1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.InfrastructureConnection_1204009));
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