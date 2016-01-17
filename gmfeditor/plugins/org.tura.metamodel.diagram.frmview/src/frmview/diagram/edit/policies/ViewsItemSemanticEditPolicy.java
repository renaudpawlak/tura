/*
 * 
 */
package frmview.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

import frmview.diagram.edit.commands.CanvasCreateCommand;
import frmview.diagram.edit.commands.MenuDefinitionCreateCommand;
import frmview.diagram.edit.commands.PopupCanvasCreateCommand;
import frmview.diagram.edit.commands.TabCanvasCreateCommand;
import frmview.diagram.edit.commands.TabPageCreateCommand;
import frmview.diagram.edit.commands.WindowCreateCommand;
import frmview.diagram.providers.DomainElementTypes;

/**
 * @generated
 */
public class ViewsItemSemanticEditPolicy extends
		DomainBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ViewsItemSemanticEditPolicy() {
		super(DomainElementTypes.Views_1301000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (DomainElementTypes.PopupCanvas_1302009 == req.getElementType()) {
			return getGEFWrapper(new PopupCanvasCreateCommand(req));
		}
		if (DomainElementTypes.Canvas_1302003 == req.getElementType()) {
			return getGEFWrapper(new CanvasCreateCommand(req));
		}
		if (DomainElementTypes.Window_1302007 == req.getElementType()) {
			return getGEFWrapper(new WindowCreateCommand(req));
		}
		if (DomainElementTypes.TabPage_1302002 == req.getElementType()) {
			return getGEFWrapper(new TabPageCreateCommand(req));
		}
		if (DomainElementTypes.TabCanvas_1302008 == req.getElementType()) {
			return getGEFWrapper(new TabCanvasCreateCommand(req));
		}
		if (DomainElementTypes.MenuDefinition_1302011 == req.getElementType()) {
			return getGEFWrapper(new MenuDefinitionCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost())
				.getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	 * @generated
	 */
	private static class DuplicateAnythingCommand extends
			DuplicateEObjectsCommand {

		/**
		 * @generated
		 */
		public DuplicateAnythingCommand(
				TransactionalEditingDomain editingDomain,
				DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req
					.getElementsToBeDuplicated(), req
					.getAllDuplicatedElementsMap());
		}

	}

}
