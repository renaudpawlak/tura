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
package artifact.diagram.navigator;

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

import artifact.diagram.edit.parts.ArtifactEditPart;
import artifact.diagram.edit.parts.ArtifactNameEditPart;
import artifact.diagram.edit.parts.ArtifactsEditPart;
import artifact.diagram.edit.parts.ConfigVariableEditPart;
import artifact.diagram.edit.parts.ConfigVariableNameEditPart;
import artifact.diagram.edit.parts.GenerationHintEditPart;
import artifact.diagram.edit.parts.GenerationHintNameEditPart;
import artifact.diagram.edit.parts.ModelQueryEditPart;
import artifact.diagram.edit.parts.ModelQueryNameEditPart;
import artifact.diagram.edit.parts.SpecifierEditPart;
import artifact.diagram.edit.parts.SpecifierNameEditPart;
import artifact.diagram.part.DomainDiagramEditorPlugin;
import artifact.diagram.part.DomainVisualIDRegistry;
import artifact.diagram.providers.DomainElementTypes;
import artifact.diagram.providers.DomainParserProvider;
import domain.Artifacts;

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
		case ArtifactsEditPart.VISUAL_ID:
			return getImage("Navigator?Diagram?http://tura.org/2013/v1/domain?Artifacts", //$NON-NLS-1$
					DomainElementTypes.Artifacts_701000);
		case ArtifactEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://tura.org/2013/v1/domain?Artifact", //$NON-NLS-1$
					DomainElementTypes.Artifact_702001);
		case SpecifierEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://tura.org/2013/v1/domain?Specifier", //$NON-NLS-1$
					DomainElementTypes.Specifier_703003);
		case ConfigVariableEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://tura.org/2013/v1/domain?ConfigVariable", //$NON-NLS-1$
					DomainElementTypes.ConfigVariable_703004);
		case ModelQueryEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://tura.org/2013/v1/domain?ModelQuery", //$NON-NLS-1$
					DomainElementTypes.ModelQuery_703005);
		case GenerationHintEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://tura.org/2013/v1/domain?GenerationHint", //$NON-NLS-1$
					DomainElementTypes.GenerationHint_703006);
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
		case ArtifactsEditPart.VISUAL_ID:
			return getArtifacts_701000Text(view);
		case ArtifactEditPart.VISUAL_ID:
			return getArtifact_702001Text(view);
		case SpecifierEditPart.VISUAL_ID:
			return getSpecifier_703003Text(view);
		case ConfigVariableEditPart.VISUAL_ID:
			return getConfigVariable_703004Text(view);
		case ModelQueryEditPart.VISUAL_ID:
			return getModelQuery_703005Text(view);
		case GenerationHintEditPart.VISUAL_ID:
			return getGenerationHint_703006Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	* @generated
	*/
	private String getArtifacts_701000Text(View view) {
		Artifacts domainModelElement = (Artifacts) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getUid();
		} else {
			DomainDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 701000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getArtifact_702001Text(View view) {
		IParser parser = DomainParserProvider.getParser(DomainElementTypes.Artifact_702001,
				view.getElement() != null ? view.getElement() : view,
				DomainVisualIDRegistry.getType(ArtifactNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DomainDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 705004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getSpecifier_703003Text(View view) {
		IParser parser = DomainParserProvider.getParser(DomainElementTypes.Specifier_703003,
				view.getElement() != null ? view.getElement() : view,
				DomainVisualIDRegistry.getType(SpecifierNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DomainDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 705003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getConfigVariable_703004Text(View view) {
		IParser parser = DomainParserProvider.getParser(DomainElementTypes.ConfigVariable_703004,
				view.getElement() != null ? view.getElement() : view,
				DomainVisualIDRegistry.getType(ConfigVariableNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DomainDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 705005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getModelQuery_703005Text(View view) {
		IParser parser = DomainParserProvider.getParser(DomainElementTypes.ModelQuery_703005,
				view.getElement() != null ? view.getElement() : view,
				DomainVisualIDRegistry.getType(ModelQueryNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DomainDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 705006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getGenerationHint_703006Text(View view) {
		IParser parser = DomainParserProvider.getParser(DomainElementTypes.GenerationHint_703006,
				view.getElement() != null ? view.getElement() : view,
				DomainVisualIDRegistry.getType(GenerationHintNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DomainDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 705007); //$NON-NLS-1$
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
		return ArtifactsEditPart.MODEL_ID.equals(DomainVisualIDRegistry.getModelID(view));
	}

}