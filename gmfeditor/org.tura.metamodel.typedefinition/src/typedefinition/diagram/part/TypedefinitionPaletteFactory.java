/*
 * 
 */
package typedefinition.diagram.part;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import typedefinition.diagram.providers.TypedefinitionElementTypes;

/**
 * @generated
 */
public class TypedefinitionPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createObjects1Group());
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
		paletteContainer.add(createOperation2CreationTool());
		paletteContainer.add(createReturnValue3CreationTool());
		paletteContainer.add(createType4CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAttribute1CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(TypedefinitionElementTypes.Attribute_3001);
		types.add(TypedefinitionElementTypes.Attribute_3003);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Attribute1CreationTool_title,
				Messages.Attribute1CreationTool_desc, types);
		entry.setId("createAttribute1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TypedefinitionElementTypes
				.getImageDescriptor(TypedefinitionElementTypes.Attribute_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createOperation2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Operation2CreationTool_title,
				Messages.Operation2CreationTool_desc,
				Collections
						.singletonList(TypedefinitionElementTypes.Operation_3002));
		entry.setId("createOperation2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TypedefinitionElementTypes
				.getImageDescriptor(TypedefinitionElementTypes.Operation_3002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createReturnValue3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ReturnValue3CreationTool_title,
				Messages.ReturnValue3CreationTool_desc,
				Collections
						.singletonList(TypedefinitionElementTypes.ReturnValue_3004));
		entry.setId("createReturnValue3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TypedefinitionElementTypes
				.getImageDescriptor(TypedefinitionElementTypes.ReturnValue_3004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createType4CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Type4CreationTool_title,
				Messages.Type4CreationTool_desc,
				Collections.singletonList(TypedefinitionElementTypes.Type_2001));
		entry.setId("createType4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TypedefinitionElementTypes
				.getImageDescriptor(TypedefinitionElementTypes.Type_2001));
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
}
