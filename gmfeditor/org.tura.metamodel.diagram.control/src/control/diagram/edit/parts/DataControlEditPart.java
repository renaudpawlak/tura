/*
 * 
 */
package control.diagram.edit.parts;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EcorePackage;
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

import control.diagram.edit.policies.DataControlItemSemanticEditPolicy;
import control.diagram.edit.policies.OpenDiagramEditPolicy;
import control.diagram.part.DomainVisualIDRegistry;
import control.diagram.providers.DomainElementTypes;

/**
 * @generated
 */
public class DataControlEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 1102002;

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
	public DataControlEditPart(View view) {
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
				new DataControlItemSemanticEditPolicy());
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
		return primaryShape = new DataControlFigure();
	}

	/**
	 * @generated
	 */
	public DataControlFigure getPrimaryShape() {
		return (DataControlFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof DataControlNameEditPart) {
			((DataControlNameEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureDataControlLabelFigure());
			return true;
		}
		if (childEditPart instanceof DataControlDataControlPreQueryTriggerCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getDataControlPreQueryTriggerCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((DataControlDataControlPreQueryTriggerCompartmentEditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof DataControlDataControlPostQueryTriggerCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getDataControlPostQueryTriggerCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((DataControlDataControlPostQueryTriggerCompartmentEditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof DataControlDataControlPreInsertTriggerCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getDataControlPreInsertTriggerCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((DataControlDataControlPreInsertTriggerCompartmentEditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof DataControlDataControlPreDeleteTriggerCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getDataControlPreDeleteTriggerCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((DataControlDataControlPreDeleteTriggerCompartmentEditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof DataControlDataControlPreCreateTriggerCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getDataControlPreCreateTriggerCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((DataControlDataControlPreCreateTriggerCompartmentEditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof DataControlDataControlArtificialFieldCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getDataControlArtificialFieldCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((DataControlDataControlArtificialFieldCompartmentEditPart) childEditPart)
					.getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof DataControlNameEditPart) {
			return true;
		}
		if (childEditPart instanceof DataControlDataControlPreQueryTriggerCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getDataControlPreQueryTriggerCompartmentFigure();
			pane.remove(((DataControlDataControlPreQueryTriggerCompartmentEditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof DataControlDataControlPostQueryTriggerCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getDataControlPostQueryTriggerCompartmentFigure();
			pane.remove(((DataControlDataControlPostQueryTriggerCompartmentEditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof DataControlDataControlPreInsertTriggerCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getDataControlPreInsertTriggerCompartmentFigure();
			pane.remove(((DataControlDataControlPreInsertTriggerCompartmentEditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof DataControlDataControlPreDeleteTriggerCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getDataControlPreDeleteTriggerCompartmentFigure();
			pane.remove(((DataControlDataControlPreDeleteTriggerCompartmentEditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof DataControlDataControlPreCreateTriggerCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getDataControlPreCreateTriggerCompartmentFigure();
			pane.remove(((DataControlDataControlPreCreateTriggerCompartmentEditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof DataControlDataControlArtificialFieldCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getDataControlArtificialFieldCompartmentFigure();
			pane.remove(((DataControlDataControlArtificialFieldCompartmentEditPart) childEditPart)
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
		if (editPart instanceof DataControlDataControlPreQueryTriggerCompartmentEditPart) {
			return getPrimaryShape()
					.getDataControlPreQueryTriggerCompartmentFigure();
		}
		if (editPart instanceof DataControlDataControlPostQueryTriggerCompartmentEditPart) {
			return getPrimaryShape()
					.getDataControlPostQueryTriggerCompartmentFigure();
		}
		if (editPart instanceof DataControlDataControlPreInsertTriggerCompartmentEditPart) {
			return getPrimaryShape()
					.getDataControlPreInsertTriggerCompartmentFigure();
		}
		if (editPart instanceof DataControlDataControlPreDeleteTriggerCompartmentEditPart) {
			return getPrimaryShape()
					.getDataControlPreDeleteTriggerCompartmentFigure();
		}
		if (editPart instanceof DataControlDataControlPreCreateTriggerCompartmentEditPart) {
			return getPrimaryShape()
					.getDataControlPreCreateTriggerCompartmentFigure();
		}
		if (editPart instanceof DataControlDataControlArtificialFieldCompartmentEditPart) {
			return getPrimaryShape()
					.getDataControlArtificialFieldCompartmentFigure();
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
				.getType(DataControlNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSource() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(DomainElementTypes.Relation_1104009);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof control.diagram.edit.parts.DataControlEditPart) {
			types.add(DomainElementTypes.Relation_1104009);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForTarget(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == DomainElementTypes.Relation_1104009) {
			types.add(DomainElementTypes.DataControl_1102002);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(DomainElementTypes.Relation_1104009);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == DomainElementTypes.Relation_1104009) {
			types.add(DomainElementTypes.DataControl_1102002);
		}
		return types;
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
			if (type == DomainElementTypes.PREQueryTrigger_1103002) {
				return getChildBySemanticHint(DomainVisualIDRegistry
						.getType(DataControlDataControlPreQueryTriggerCompartmentEditPart.VISUAL_ID));
			}
			if (type == DomainElementTypes.POSTQueryTrigger_1103003) {
				return getChildBySemanticHint(DomainVisualIDRegistry
						.getType(DataControlDataControlPostQueryTriggerCompartmentEditPart.VISUAL_ID));
			}
			if (type == DomainElementTypes.PREInsertTrigger_1103004) {
				return getChildBySemanticHint(DomainVisualIDRegistry
						.getType(DataControlDataControlPreInsertTriggerCompartmentEditPart.VISUAL_ID));
			}
			if (type == DomainElementTypes.PREDeleteTrigger_1103005) {
				return getChildBySemanticHint(DomainVisualIDRegistry
						.getType(DataControlDataControlPreDeleteTriggerCompartmentEditPart.VISUAL_ID));
			}
			if (type == DomainElementTypes.PRECreateTrigger_1103006) {
				return getChildBySemanticHint(DomainVisualIDRegistry
						.getType(DataControlDataControlPreCreateTriggerCompartmentEditPart.VISUAL_ID));
			}
			if (type == DomainElementTypes.ArtificialField_1103007) {
				return getChildBySemanticHint(DomainVisualIDRegistry
						.getType(DataControlDataControlArtificialFieldCompartmentEditPart.VISUAL_ID));
			}
		}
		return super.getTargetEditPart(request);
	}

	/**
	 * @generated
	 */
	protected void handleNotificationEvent(Notification event) {
		if (event.getNotifier() == getModel()
				&& EcorePackage.eINSTANCE.getEModelElement_EAnnotations()
						.equals(event.getFeature())) {
			handleMajorSemanticChange();
		} else {
			super.handleNotificationEvent(event);
		}
	}

	/**
	 * @generated
	 */
	public class DataControlFigure extends RoundedRectangle {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureDataControlLabelFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fDataControlPreQueryTriggerCompartmentFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fDataControlPostQueryTriggerCompartmentFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fDataControlPreInsertTriggerCompartmentFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fDataControlPreDeleteTriggerCompartmentFigure;

		/**
		 * @generated
		 */
		private RectangleFigure fDataControlPreCreateTriggerCompartmentFigure;

		/**
		 * @generated
		 */
		private RectangleFigure fDataControlArtificialFieldCompartmentFigure;

		/**
		 * @generated
		 */
		public DataControlFigure() {
			this.setCornerDimensions(new Dimension(getMapMode().DPtoLP(8),
					getMapMode().DPtoLP(8)));
			this.setForegroundColor(THIS_FORE);
			this.setBackgroundColor(THIS_BACK);
			this.setBorder(new MarginBorder(getMapMode().DPtoLP(5),
					getMapMode().DPtoLP(5), getMapMode().DPtoLP(5),
					getMapMode().DPtoLP(5)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureDataControlLabelFigure = new WrappingLabel();

			fFigureDataControlLabelFigure.setText("DataControl");

			fFigureDataControlLabelFigure
					.setFont(FFIGUREDATACONTROLLABELFIGURE_FONT);

			fFigureDataControlLabelFigure.setMaximumSize(new Dimension(
					getMapMode().DPtoLP(10000), getMapMode().DPtoLP(50)));

			this.add(fFigureDataControlLabelFigure);

			fDataControlPreQueryTriggerCompartmentFigure = new RectangleFigure();

			fDataControlPreQueryTriggerCompartmentFigure.setOutline(false);

			this.add(fDataControlPreQueryTriggerCompartmentFigure);

			fDataControlPostQueryTriggerCompartmentFigure = new RectangleFigure();

			fDataControlPostQueryTriggerCompartmentFigure.setOutline(false);

			this.add(fDataControlPostQueryTriggerCompartmentFigure);

			fDataControlPreInsertTriggerCompartmentFigure = new RectangleFigure();

			fDataControlPreInsertTriggerCompartmentFigure.setOutline(false);

			this.add(fDataControlPreInsertTriggerCompartmentFigure);

			fDataControlPreDeleteTriggerCompartmentFigure = new RectangleFigure();

			fDataControlPreDeleteTriggerCompartmentFigure.setOutline(false);

			this.add(fDataControlPreDeleteTriggerCompartmentFigure);

			fDataControlPreCreateTriggerCompartmentFigure = new RectangleFigure();

			fDataControlPreCreateTriggerCompartmentFigure.setOutline(false);

			this.add(fDataControlPreCreateTriggerCompartmentFigure);

			fDataControlArtificialFieldCompartmentFigure = new RectangleFigure();

			fDataControlArtificialFieldCompartmentFigure.setOutline(false);

			this.add(fDataControlArtificialFieldCompartmentFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDataControlLabelFigure() {
			return fFigureDataControlLabelFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getDataControlPreQueryTriggerCompartmentFigure() {
			return fDataControlPreQueryTriggerCompartmentFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getDataControlPostQueryTriggerCompartmentFigure() {
			return fDataControlPostQueryTriggerCompartmentFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getDataControlPreInsertTriggerCompartmentFigure() {
			return fDataControlPreInsertTriggerCompartmentFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getDataControlPreDeleteTriggerCompartmentFigure() {
			return fDataControlPreDeleteTriggerCompartmentFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getDataControlPreCreateTriggerCompartmentFigure() {
			return fDataControlPreCreateTriggerCompartmentFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getDataControlArtificialFieldCompartmentFigure() {
			return fDataControlArtificialFieldCompartmentFigure;
		}

	}

	/**
	 * @generated
	 */
	static final Color THIS_FORE = new Color(null, 0, 0, 0);

	/**
	 * @generated
	 */
	static final Color THIS_BACK = new Color(null, 241, 238, 203);

	/**
	 * @generated
	 */
	static final Font FFIGUREDATACONTROLLABELFIGURE_FONT = new Font(
			Display.getCurrent(), "Palatino", 12, SWT.ITALIC);

}
