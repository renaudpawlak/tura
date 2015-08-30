/*******************************************************************************
 * Tura - application generation platform
 *
 * Copyright (c) 2012, 2015, Arseniy Isakov
 *  
 * This project includes software developed by Arseniy Isakov
 * http://sourceforge.net/p/tura/wiki/Home/
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
/*
 * 
 */
package frmview.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import domain.CanvasFrame;
import domain.ViewInheritance;
import domain.ViewPort;
import domain.Views;
import frmview.diagram.edit.policies.DomainBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class ViewInheritanceReorientCommand extends EditElementCommand {

	/**
	 * @generated
	 */
	private final int reorientDirection;

	/**
	 * @generated
	 */
	private final EObject oldEnd;

	/**
	 * @generated
	 */
	private final EObject newEnd;

	/**
	 * @generated
	 */
	public ViewInheritanceReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof ViewInheritance) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof ViewPort && newEnd instanceof ViewPort)) {
			return false;
		}
		CanvasFrame target = getLink().getTarget();
		if (!(getLink().eContainer() instanceof Views)) {
			return false;
		}
		Views container = (Views) getLink().eContainer();
		return DomainBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistViewInheritance_1304001(container, getLink(),
						getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof CanvasFrame && newEnd instanceof CanvasFrame)) {
			return false;
		}
		ViewPort source = getLink().getSource();
		if (!(getLink().eContainer() instanceof Views)) {
			return false;
		}
		Views container = (Views) getLink().eContainer();
		return DomainBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistViewInheritance_1304001(container, getLink(), source,
						getNewTarget());
	}

	/**
	 * @generated
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException(
					"Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientSource() throws ExecutionException {
		getLink().setSource(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setTarget(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected ViewInheritance getLink() {
		return (ViewInheritance) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected ViewPort getOldSource() {
		return (ViewPort) oldEnd;
	}

	/**
	 * @generated
	 */
	protected ViewPort getNewSource() {
		return (ViewPort) newEnd;
	}

	/**
	 * @generated
	 */
	protected CanvasFrame getOldTarget() {
		return (CanvasFrame) oldEnd;
	}

	/**
	 * @generated
	 */
	protected CanvasFrame getNewTarget() {
		return (CanvasFrame) newEnd;
	}
}
