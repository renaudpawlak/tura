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
package message.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

import message.diagram.part.DomainVisualIDRegistry;

/**
 * @generated
 */
public class DomainEditPartFactory implements EditPartFactory {

	/**
	* @generated
	*/
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (DomainVisualIDRegistry.getVisualID(view)) {

			case MessagesEditPart.VISUAL_ID:
				return new MessagesEditPart(view);

			case MessageLibraryEditPart.VISUAL_ID:
				return new MessageLibraryEditPart(view);

			case MessageLibraryNameEditPart.VISUAL_ID:
				return new MessageLibraryNameEditPart(view);

			case LanguageEditPart.VISUAL_ID:
				return new LanguageEditPart(view);

			case LanguageLangEditPart.VISUAL_ID:
				return new LanguageLangEditPart(view);

			case MessageEditPart.VISUAL_ID:
				return new MessageEditPart(view);

			case MessageNameEditPart.VISUAL_ID:
				return new MessageNameEditPart(view);

			case MessageLibraryMessageLibraryMessagesCompartmentEditPart.VISUAL_ID:
				return new MessageLibraryMessageLibraryMessagesCompartmentEditPart(view);
			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	* @generated
	*/
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	* @generated
	*/
	public static CellEditorLocator getTextCellEditorLocator(ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE.getTextCellEditorLocator(source);
	}

}