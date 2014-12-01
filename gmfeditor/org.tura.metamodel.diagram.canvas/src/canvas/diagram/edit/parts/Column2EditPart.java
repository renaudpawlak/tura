/*
 * 
 */
package canvas.diagram.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.core.edithelpers.CreateElementRequestAdapter;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.edit.policies.reparent.CreationEditPolicyWithCustomReparent;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Display;

import canvas.diagram.edit.policies.Column2ItemSemanticEditPolicy;
import canvas.diagram.edit.policies.OpenDiagramEditPolicy;
import canvas.diagram.part.DomainVisualIDRegistry;
import canvas.diagram.providers.DomainElementTypes;

/**
 * @generated
 */
public class Column2EditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 1603026;

	/**
	 * @generated
	 */
	protected IFigure contentPane;

	/**
	 * @generated
	 */
	protected IFigure primaryShape;

	/**
	 * @generated
	 */
	public Column2EditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicyWithCustomReparent(
						DomainVisualIDRegistry.TYPED_INSTANCE));
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new Column2ItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		installEditPolicy(EditPolicyRoles.OPEN_ROLE,
				new OpenDiagramEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {
		org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy lep = new org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				EditPolicy result = child
						.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
				if (result == null) {
					result = new NonResizableEditPolicy();
				}
				return result;
			}

			protected Command getMoveChildrenCommand(Request request) {
				return null;
			}

			protected Command getCreateCommand(CreateRequest request) {
				return null;
			}
		};
		return lep;
	}

	/**
	 * @generated
	 */
	protected IFigure createNodeShape() {
		return primaryShape = new ColumnFigure();
	}

	/**
	 * @generated
	 */
	public ColumnFigure getPrimaryShape() {
		return (ColumnFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ColumnLabel2EditPart) {
			((ColumnLabel2EditPart) childEditPart).setLabel(getPrimaryShape()
					.getFigureColumnLabelFigure());
			return true;
		}
		if (childEditPart instanceof ColumnColumnElementCompartment2EditPart) {
			IFigure pane = getPrimaryShape()
					.getColumnElementCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((ColumnColumnElementCompartment2EditPart) childEditPart)
					.getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ColumnLabel2EditPart) {
			return true;
		}
		if (childEditPart instanceof ColumnColumnElementCompartment2EditPart) {
			IFigure pane = getPrimaryShape()
					.getColumnElementCompartmentFigure();
			pane.remove(((ColumnColumnElementCompartment2EditPart) childEditPart)
					.getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, -1);
	}

	/**
	 * @generated
	 */
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	 * @generated
	 */
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {
		if (editPart instanceof ColumnColumnElementCompartment2EditPart) {
			return getPrimaryShape().getColumnElementCompartmentFigure();
		}
		return getContentPane();
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(40, 40);
		return result;
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */
	protected NodeFigure createNodeFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	 * Default implementation treats passed figure as content pane.
	 * Respects layout one may have set for generated figure.
	 * @param nodeShape instance of generated figure class
	 * @generated
	 */
	protected IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			layout.setSpacing(5);
			nodeShape.setLayoutManager(layout);
		}
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	 * @generated
	 */
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	 * @generated
	 */
	protected void setForegroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setForegroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setBackgroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setBackgroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineWidth(int width) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineWidth(width);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineType(int style) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineStyle(style);
		}
	}

	/**
	 * @generated
	 */
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(DomainVisualIDRegistry
				.getType(ColumnLabel2EditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public EditPart getTargetEditPart(Request request) {
		if (request instanceof CreateViewAndElementRequest) {
			CreateElementRequestAdapter adapter = ((CreateViewAndElementRequest) request)
					.getViewAndElementDescriptor()
					.getCreateElementRequestAdapter();
			IElementType type = (IElementType) adapter
					.getAdapter(IElementType.class);
			if (type == DomainElementTypes.Button_1603023) {
				return getChildBySemanticHint(DomainVisualIDRegistry
						.getType(ColumnColumnElementCompartment2EditPart.VISUAL_ID));
			}
			if (type == DomainElementTypes.DropDownSelection_1603010) {
				return getChildBySemanticHint(DomainVisualIDRegistry
						.getType(ColumnColumnElementCompartment2EditPart.VISUAL_ID));
			}
			if (type == DomainElementTypes.Table_1603021) {
				return getChildBySemanticHint(DomainVisualIDRegistry
						.getType(ColumnColumnElementCompartment2EditPart.VISUAL_ID));
			}
			if (type == DomainElementTypes.Tree_1603022) {
				return getChildBySemanticHint(DomainVisualIDRegistry
						.getType(ColumnColumnElementCompartment2EditPart.VISUAL_ID));
			}
			if (type == DomainElementTypes.LayerHolder_1603020) {
				return getChildBySemanticHint(DomainVisualIDRegistry
						.getType(ColumnColumnElementCompartment2EditPart.VISUAL_ID));
			}
			if (type == DomainElementTypes.InputText_1603012) {
				return getChildBySemanticHint(DomainVisualIDRegistry
						.getType(ColumnColumnElementCompartment2EditPart.VISUAL_ID));
			}
			if (type == DomainElementTypes.OutputText_1603014) {
				return getChildBySemanticHint(DomainVisualIDRegistry
						.getType(ColumnColumnElementCompartment2EditPart.VISUAL_ID));
			}
			if (type == DomainElementTypes.CheckBox_1603015) {
				return getChildBySemanticHint(DomainVisualIDRegistry
						.getType(ColumnColumnElementCompartment2EditPart.VISUAL_ID));
			}
			if (type == DomainElementTypes.Label_1603013) {
				return getChildBySemanticHint(DomainVisualIDRegistry
						.getType(ColumnColumnElementCompartment2EditPart.VISUAL_ID));
			}
		}
		return super.getTargetEditPart(request);
	}

	/**
	 * @generated
	 */
	public class ColumnFigure extends RoundedRectangle {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureColumnLabelFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fColumnElementCompartmentFigure;

		/**
		 * @generated
		 */
		public ColumnFigure() {
			this.setCornerDimensions(new Dimension(getMapMode().DPtoLP(8),
					getMapMode().DPtoLP(8)));
			this.setBorder(new MarginBorder(getMapMode().DPtoLP(5),
					getMapMode().DPtoLP(5), getMapMode().DPtoLP(5),
					getMapMode().DPtoLP(5)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureColumnLabelFigure = new WrappingLabel();

			fFigureColumnLabelFigure.setText("Column");

			fFigureColumnLabelFigure.setFont(FFIGURECOLUMNLABELFIGURE_FONT);

			fFigureColumnLabelFigure.setMaximumSize(new Dimension(getMapMode()
					.DPtoLP(10000), getMapMode().DPtoLP(50)));

			this.add(fFigureColumnLabelFigure);

			fColumnElementCompartmentFigure = new RectangleFigure();

			fColumnElementCompartmentFigure.setOutline(false);

			this.add(fColumnElementCompartmentFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureColumnLabelFigure() {
			return fFigureColumnLabelFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getColumnElementCompartmentFigure() {
			return fColumnElementCompartmentFigure;
		}

	}

	/**
	 * @generated
	 */
	static final Font FFIGURECOLUMNLABELFIGURE_FONT = new Font(
			Display.getCurrent(), "Palatino", 12, SWT.ITALIC);

}