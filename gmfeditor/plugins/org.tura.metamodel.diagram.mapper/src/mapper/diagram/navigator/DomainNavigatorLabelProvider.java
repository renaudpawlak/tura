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
package mapper.diagram.navigator;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

import domain.Mappers;
import mapper.diagram.edit.parts.CSSMapperEditPart;
import mapper.diagram.edit.parts.CSSMapperFakePackageNameFakeTypeEditPart;
import mapper.diagram.edit.parts.JavaMapperEditPart;
import mapper.diagram.edit.parts.JavaMapperFakePackageNameFakeTypeEditPart;
import mapper.diagram.edit.parts.JavaScriptMapperEditPart;
import mapper.diagram.edit.parts.JavaScriptMapperFakePackageNameFakeTypeEditPart;
import mapper.diagram.edit.parts.MappersEditPart;
import mapper.diagram.edit.parts.RoleMapperEditPart;
import mapper.diagram.edit.parts.RoleMapperFakeRoleNameEditPart;
import mapper.diagram.part.DomainDiagramEditorPlugin;
import mapper.diagram.part.DomainVisualIDRegistry;
import mapper.diagram.providers.DomainElementTypes;
import mapper.diagram.providers.DomainParserProvider;

/**
 * @generated
 */
public class DomainNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	* @generated
	*/
	static {
		DomainDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?UnknownElement", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
		DomainDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?ImageNotFound", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
	}

	/**
	* @generated
	*/
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof DomainNavigatorItem && !isOwnView(((DomainNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	* @generated
	*/
	public Image getImage(Object element) {
		if (element instanceof DomainNavigatorGroup) {
			DomainNavigatorGroup group = (DomainNavigatorGroup) element;
			return DomainDiagramEditorPlugin.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof DomainNavigatorItem) {
			DomainNavigatorItem navigatorItem = (DomainNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getImage(view);
			}
		}

		return super.getImage(element);
	}

	/**
	* @generated
	*/
	public Image getImage(View view) {
		switch (DomainVisualIDRegistry.getVisualID(view)) {
		case MappersEditPart.VISUAL_ID:
			return getImage("Navigator?Diagram?http://tura.org/2013/v1/domain?Mappers", //$NON-NLS-1$
					DomainElementTypes.Mappers_401000);
		case JavaMapperEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://tura.org/2013/v1/domain?JavaMapper", //$NON-NLS-1$
					DomainElementTypes.JavaMapper_402001);
		case JavaScriptMapperEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://tura.org/2013/v1/domain?JavaScriptMapper", //$NON-NLS-1$
					DomainElementTypes.JavaScriptMapper_402003);
		case CSSMapperEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://tura.org/2013/v1/domain?CSSMapper", //$NON-NLS-1$
					DomainElementTypes.CSSMapper_402004);
		case RoleMapperEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://tura.org/2013/v1/domain?RoleMapper", //$NON-NLS-1$
					DomainElementTypes.RoleMapper_402005);
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = DomainDiagramEditorPlugin.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null && DomainElementTypes.isKnownElementType(elementType)) {
			image = DomainElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	* @generated
	*/
	public String getText(Object element) {
		if (element instanceof DomainNavigatorGroup) {
			DomainNavigatorGroup group = (DomainNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof DomainNavigatorItem) {
			DomainNavigatorItem navigatorItem = (DomainNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getText(view);
			}
		}

		return super.getText(element);
	}

	/**
	* @generated
	*/
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (DomainVisualIDRegistry.getVisualID(view)) {
		case MappersEditPart.VISUAL_ID:
			return getMappers_401000Text(view);
		case JavaMapperEditPart.VISUAL_ID:
			return getJavaMapper_402001Text(view);
		case JavaScriptMapperEditPart.VISUAL_ID:
			return getJavaScriptMapper_402003Text(view);
		case CSSMapperEditPart.VISUAL_ID:
			return getCSSMapper_402004Text(view);
		case RoleMapperEditPart.VISUAL_ID:
			return getRoleMapper_402005Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	* @generated
	*/
	private String getMappers_401000Text(View view) {
		Mappers domainModelElement = (Mappers) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getUid();
		} else {
			DomainDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 401000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getJavaMapper_402001Text(View view) {
		IParser parser = DomainParserProvider.getParser(DomainElementTypes.JavaMapper_402001,
				view.getElement() != null ? view.getElement() : view,
				DomainVisualIDRegistry.getType(JavaMapperFakePackageNameFakeTypeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DomainDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 405001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getJavaScriptMapper_402003Text(View view) {
		IParser parser = DomainParserProvider.getParser(DomainElementTypes.JavaScriptMapper_402003,
				view.getElement() != null ? view.getElement() : view,
				DomainVisualIDRegistry.getType(JavaScriptMapperFakePackageNameFakeTypeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DomainDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 405003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCSSMapper_402004Text(View view) {
		IParser parser = DomainParserProvider.getParser(DomainElementTypes.CSSMapper_402004,
				view.getElement() != null ? view.getElement() : view,
				DomainVisualIDRegistry.getType(CSSMapperFakePackageNameFakeTypeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DomainDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 405004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getRoleMapper_402005Text(View view) {
		IParser parser = DomainParserProvider.getParser(DomainElementTypes.RoleMapper_402005,
				view.getElement() != null ? view.getElement() : view,
				DomainVisualIDRegistry.getType(RoleMapperFakeRoleNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DomainDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 405005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	* @generated
	*/
	public void restoreState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public void saveState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	* @generated
	*/
	private boolean isOwnView(View view) {
		return MappersEditPart.MODEL_ID.equals(DomainVisualIDRegistry.getModelID(view));
	}

}