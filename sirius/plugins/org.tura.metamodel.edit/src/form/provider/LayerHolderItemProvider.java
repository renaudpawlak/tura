/**
 */
package form.provider;


import common.CommonPackage;

import form.FormFactory;
import form.FormPackage;
import form.LayerHolder;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link form.LayerHolder} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LayerHolderItemProvider extends UielementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LayerHolderItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addColumnsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Columns feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addColumnsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_HTMLLayerHolder_columns_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_HTMLLayerHolder_columns_feature", "_UI_HTMLLayerHolder_type"),
				 CommonPackage.Literals.HTML_LAYER_HOLDER__COLUMNS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(FormPackage.Literals.CHILDREN_HOLDER__CHILDREN);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns LayerHolder.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/LayerHolder"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((LayerHolder)object).getNickname();
		return label == null || label.length() == 0 ?
			getString("_UI_LayerHolder_type") :
			getString("_UI_LayerHolder_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(LayerHolder.class)) {
			case FormPackage.LAYER_HOLDER__COLUMNS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case FormPackage.LAYER_HOLDER__CHILDREN:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(FormPackage.Literals.CHILDREN_HOLDER__CHILDREN,
				 FormFactory.eINSTANCE.createUielement()));

		newChildDescriptors.add
			(createChildParameter
				(FormPackage.Literals.CHILDREN_HOLDER__CHILDREN,
				 FormFactory.eINSTANCE.createSourcesPointer()));

		newChildDescriptors.add
			(createChildParameter
				(FormPackage.Literals.CHILDREN_HOLDER__CHILDREN,
				 FormFactory.eINSTANCE.createInputElement()));

		newChildDescriptors.add
			(createChildParameter
				(FormPackage.Literals.CHILDREN_HOLDER__CHILDREN,
				 FormFactory.eINSTANCE.createOptionSelection()));

		newChildDescriptors.add
			(createChildParameter
				(FormPackage.Literals.CHILDREN_HOLDER__CHILDREN,
				 FormFactory.eINSTANCE.createLayerHolder()));

		newChildDescriptors.add
			(createChildParameter
				(FormPackage.Literals.CHILDREN_HOLDER__CHILDREN,
				 FormFactory.eINSTANCE.createInputText()));

		newChildDescriptors.add
			(createChildParameter
				(FormPackage.Literals.CHILDREN_HOLDER__CHILDREN,
				 FormFactory.eINSTANCE.createPassword()));

		newChildDescriptors.add
			(createChildParameter
				(FormPackage.Literals.CHILDREN_HOLDER__CHILDREN,
				 FormFactory.eINSTANCE.createLabel()));

		newChildDescriptors.add
			(createChildParameter
				(FormPackage.Literals.CHILDREN_HOLDER__CHILDREN,
				 FormFactory.eINSTANCE.createMessageElement()));

		newChildDescriptors.add
			(createChildParameter
				(FormPackage.Literals.CHILDREN_HOLDER__CHILDREN,
				 FormFactory.eINSTANCE.createOutputText()));

		newChildDescriptors.add
			(createChildParameter
				(FormPackage.Literals.CHILDREN_HOLDER__CHILDREN,
				 FormFactory.eINSTANCE.createCheckBox()));

		newChildDescriptors.add
			(createChildParameter
				(FormPackage.Literals.CHILDREN_HOLDER__CHILDREN,
				 FormFactory.eINSTANCE.createDropDownSelection()));

		newChildDescriptors.add
			(createChildParameter
				(FormPackage.Literals.CHILDREN_HOLDER__CHILDREN,
				 FormFactory.eINSTANCE.createImage()));

		newChildDescriptors.add
			(createChildParameter
				(FormPackage.Literals.CHILDREN_HOLDER__CHILDREN,
				 FormFactory.eINSTANCE.createDate()));

		newChildDescriptors.add
			(createChildParameter
				(FormPackage.Literals.CHILDREN_HOLDER__CHILDREN,
				 FormFactory.eINSTANCE.createButton()));

		newChildDescriptors.add
			(createChildParameter
				(FormPackage.Literals.CHILDREN_HOLDER__CHILDREN,
				 FormFactory.eINSTANCE.createTable()));

		newChildDescriptors.add
			(createChildParameter
				(FormPackage.Literals.CHILDREN_HOLDER__CHILDREN,
				 FormFactory.eINSTANCE.createMenu()));

		newChildDescriptors.add
			(createChildParameter
				(FormPackage.Literals.CHILDREN_HOLDER__CHILDREN,
				 FormFactory.eINSTANCE.createTree()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == FormPackage.Literals.STYLE_ELEMENT__STYLE ||
			childFeature == FormPackage.Literals.ENABLED_UI_ITEM__ENABLED ||
			childFeature == FormPackage.Literals.UIELEMENT__REQUIRED ||
			childFeature == FormPackage.Literals.UIELEMENT__READ_ONLY ||
			childFeature == FormPackage.Literals.FLEX_FIELDS__FIELDS;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
