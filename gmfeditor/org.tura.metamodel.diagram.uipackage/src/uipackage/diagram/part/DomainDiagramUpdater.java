/*
 * 
 */
package uipackage.diagram.part;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import uipackage.diagram.edit.parts.FormDataControlsEditPart;
import uipackage.diagram.edit.parts.FormEditPart;
import uipackage.diagram.edit.parts.FormFormDatacontrolsCompartmentEditPart;
import uipackage.diagram.edit.parts.FormFormViewCompartmentEditPart;
import uipackage.diagram.edit.parts.FormViewEditPart;
import uipackage.diagram.edit.parts.RelationEditPart;
import uipackage.diagram.edit.parts.TypeExtensionEditPart;
import uipackage.diagram.edit.parts.UIPackageEditPart;
import domain.Form;
import domain.FormDataControls;
import domain.FormView;
import domain.UIPackage;

/**
 * @generated
 */
public class DomainDiagramUpdater {

	/**
	 * @generated
	 */
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null
				|| view.getElement().eIsProxy();
	}

	/**
	 * @generated
	 */
	public static List<DomainNodeDescriptor> getSemanticChildren(View view) {
		switch (DomainVisualIDRegistry.getVisualID(view)) {
		case UIPackageEditPart.VISUAL_ID:
			return getUIPackage_1001000SemanticChildren(view);
		case FormFormViewCompartmentEditPart.VISUAL_ID:
			return getFormFormViewCompartment_1007001SemanticChildren(view);
		case FormFormDatacontrolsCompartmentEditPart.VISUAL_ID:
			return getFormFormDatacontrolsCompartment_1007002SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainNodeDescriptor> getUIPackage_1001000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		UIPackage modelElement = (UIPackage) view.getElement();
		LinkedList<DomainNodeDescriptor> result = new LinkedList<DomainNodeDescriptor>();
		for (Iterator<?> it = modelElement.getForms().iterator(); it.hasNext();) {
			Form childElement = (Form) it.next();
			int visualID = DomainVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == FormEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DomainNodeDescriptor> getFormFormViewCompartment_1007001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Form modelElement = (Form) containerView.getElement();
		LinkedList<DomainNodeDescriptor> result = new LinkedList<DomainNodeDescriptor>();
		{
			FormView childElement = modelElement.getView();
			int visualID = DomainVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == FormViewEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DomainNodeDescriptor> getFormFormDatacontrolsCompartment_1007002SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Form modelElement = (Form) containerView.getElement();
		LinkedList<DomainNodeDescriptor> result = new LinkedList<DomainNodeDescriptor>();
		{
			FormDataControls childElement = modelElement.getDatacontrols();
			int visualID = DomainVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == FormDataControlsEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getContainedLinks(View view) {
		switch (DomainVisualIDRegistry.getVisualID(view)) {
		case UIPackageEditPart.VISUAL_ID:
			return getUIPackage_1001000ContainedLinks(view);
		case FormEditPart.VISUAL_ID:
			return getForm_1002002ContainedLinks(view);
		case FormViewEditPart.VISUAL_ID:
			return getFormView_1003001ContainedLinks(view);
		case FormDataControlsEditPart.VISUAL_ID:
			return getFormDataControls_1003002ContainedLinks(view);
		case TypeExtensionEditPart.VISUAL_ID:
			return getTypeExtension_1004001ContainedLinks(view);
		case RelationEditPart.VISUAL_ID:
			return getRelation_1004009ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getIncomingLinks(View view) {
		switch (DomainVisualIDRegistry.getVisualID(view)) {
		case FormEditPart.VISUAL_ID:
			return getForm_1002002IncomingLinks(view);
		case FormViewEditPart.VISUAL_ID:
			return getFormView_1003001IncomingLinks(view);
		case FormDataControlsEditPart.VISUAL_ID:
			return getFormDataControls_1003002IncomingLinks(view);
		case TypeExtensionEditPart.VISUAL_ID:
			return getTypeExtension_1004001IncomingLinks(view);
		case RelationEditPart.VISUAL_ID:
			return getRelation_1004009IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getOutgoingLinks(View view) {
		switch (DomainVisualIDRegistry.getVisualID(view)) {
		case FormEditPart.VISUAL_ID:
			return getForm_1002002OutgoingLinks(view);
		case FormViewEditPart.VISUAL_ID:
			return getFormView_1003001OutgoingLinks(view);
		case FormDataControlsEditPart.VISUAL_ID:
			return getFormDataControls_1003002OutgoingLinks(view);
		case TypeExtensionEditPart.VISUAL_ID:
			return getTypeExtension_1004001OutgoingLinks(view);
		case RelationEditPart.VISUAL_ID:
			return getRelation_1004009OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getUIPackage_1001000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getForm_1002002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getFormView_1003001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getFormDataControls_1003002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getTypeExtension_1004001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getRelation_1004009ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getForm_1002002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getFormView_1003001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getFormDataControls_1003002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getTypeExtension_1004001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getRelation_1004009IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getForm_1002002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getFormView_1003001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getFormDataControls_1003002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getTypeExtension_1004001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getRelation_1004009OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		 * @generated
		 */
		@Override
		public List<DomainNodeDescriptor> getSemanticChildren(View view) {
			return DomainDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<DomainLinkDescriptor> getContainedLinks(View view) {
			return DomainDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<DomainLinkDescriptor> getIncomingLinks(View view) {
			return DomainDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<DomainLinkDescriptor> getOutgoingLinks(View view) {
			return DomainDiagramUpdater.getOutgoingLinks(view);
		}
	};

}