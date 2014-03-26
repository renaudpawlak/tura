/*
 * 
 */
package deployment.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;

import deployment.diagram.edit.commands.DeploymentComponentDeplymentComponentCreateCommand;
import deployment.diagram.edit.commands.DeploymentComponentDeplymentComponentReorientCommand;
import deployment.diagram.edit.commands.DeploymentStarStepFirstStepCreateCommand;
import deployment.diagram.edit.commands.DeploymentStarStepFirstStepReorientCommand;
import deployment.diagram.edit.parts.DeploymentComponentDeplymentComponentEditPart;
import deployment.diagram.edit.parts.DeploymentStarStepFirstStepEditPart;
import deployment.diagram.part.DomainVisualIDRegistry;
import deployment.diagram.providers.DomainElementTypes;

/**
 * @generated
 */
public class DeploymentComponentItemSemanticEditPolicy extends
		DomainBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public DeploymentComponentItemSemanticEditPolicy() {
		super(DomainElementTypes.DeploymentComponent_902001);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(
				getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		for (Iterator<?> it = view.getTargetEdges().iterator(); it.hasNext();) {
			Edge incomingLink = (Edge) it.next();
			if (DomainVisualIDRegistry.getVisualID(incomingLink) == DeploymentComponentDeplymentComponentEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (DomainVisualIDRegistry.getVisualID(incomingLink) == DeploymentStarStepFirstStepEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (DomainVisualIDRegistry.getVisualID(outgoingLink) == DeploymentComponentDeplymentComponentEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
		}
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyShortcutsCommand(cmd, view);
			// delete host element
			cmd.add(new DestroyElementCommand(req));
		} else {
			cmd.add(new DeleteCommand(getEditingDomain(), view));
		}
		return getGEFWrapper(cmd.reduce());
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super
				.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (DomainElementTypes.DeploymentComponentDeplymentComponent_904002 == req
				.getElementType()) {
			return getGEFWrapper(new DeploymentComponentDeplymentComponentCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (DomainElementTypes.DeploymentStarStepFirstStep_904008 == req
				.getElementType()) {
			return null;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (DomainElementTypes.DeploymentComponentDeplymentComponent_904002 == req
				.getElementType()) {
			return getGEFWrapper(new DeploymentComponentDeplymentComponentCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (DomainElementTypes.DeploymentStarStepFirstStep_904008 == req
				.getElementType()) {
			return getGEFWrapper(new DeploymentStarStepFirstStepCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * Returns command to reorient EReference based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientReferenceRelationshipCommand(
			ReorientReferenceRelationshipRequest req) {
		switch (getVisualID(req)) {
		case DeploymentComponentDeplymentComponentEditPart.VISUAL_ID:
			return getGEFWrapper(new DeploymentComponentDeplymentComponentReorientCommand(
					req));
		case DeploymentStarStepFirstStepEditPart.VISUAL_ID:
			return getGEFWrapper(new DeploymentStarStepFirstStepReorientCommand(
					req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}