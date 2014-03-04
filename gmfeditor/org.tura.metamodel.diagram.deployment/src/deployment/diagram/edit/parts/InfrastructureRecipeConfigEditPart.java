/*
 * 
 */
package deployment.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.PolylineDecoration;
import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.notation.View;

import deployment.diagram.edit.policies.InfrastructureRecipeConfigItemSemanticEditPolicy;

/**
 * @generated
 */
public class InfrastructureRecipeConfigEditPart extends ConnectionNodeEditPart
		implements ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 904006;

	/**
	 * @generated
	 */
	public InfrastructureRecipeConfigEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new InfrastructureRecipeConfigItemSemanticEditPolicy());
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */

	protected Connection createConnectionFigure() {
		return new InfrastructureRecipeConfigFigure();
	}

	/**
	 * @generated
	 */
	public InfrastructureRecipeConfigFigure getPrimaryShape() {
		return (InfrastructureRecipeConfigFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class InfrastructureRecipeConfigFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		public InfrastructureRecipeConfigFigure() {
			this.setLineStyle(Graphics.LINE_DASH);

			setTargetDecoration(createTargetDecoration());
		}

		/**
		 * @generated
		 */
		private RotatableDecoration createTargetDecoration() {
			PolylineDecoration df = new PolylineDecoration();
			return df;
		}

	}

}
