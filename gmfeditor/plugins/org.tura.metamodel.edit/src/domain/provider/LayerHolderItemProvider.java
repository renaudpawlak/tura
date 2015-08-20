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
/**
 */
package domain.provider;


import domain.DomainFactory;
import domain.DomainPackage;
import domain.LayerHolder;

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
 * This is the item provider adapter for a {@link domain.LayerHolder} object.
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
				 DomainPackage.Literals.HTML_LAYER_HOLDER__COLUMNS,
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
			childrenFeatures.add(DomainPackage.Literals.CHILDREN_HOLDER__CHILDREN);
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
			case DomainPackage.LAYER_HOLDER__COLUMNS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case DomainPackage.LAYER_HOLDER__CHILDREN:
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
				(DomainPackage.Literals.CHILDREN_HOLDER__CHILDREN,
				 DomainFactory.eINSTANCE.createUielement()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.CHILDREN_HOLDER__CHILDREN,
				 DomainFactory.eINSTANCE.createSourcesPointer()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.CHILDREN_HOLDER__CHILDREN,
				 DomainFactory.eINSTANCE.createInputElement()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.CHILDREN_HOLDER__CHILDREN,
				 DomainFactory.eINSTANCE.createOptionSelection()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.CHILDREN_HOLDER__CHILDREN,
				 DomainFactory.eINSTANCE.createLayerHolder()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.CHILDREN_HOLDER__CHILDREN,
				 DomainFactory.eINSTANCE.createInputText()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.CHILDREN_HOLDER__CHILDREN,
				 DomainFactory.eINSTANCE.createLabel()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.CHILDREN_HOLDER__CHILDREN,
				 DomainFactory.eINSTANCE.createOutputText()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.CHILDREN_HOLDER__CHILDREN,
				 DomainFactory.eINSTANCE.createCheckBox()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.CHILDREN_HOLDER__CHILDREN,
				 DomainFactory.eINSTANCE.createDropDownSelection()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.CHILDREN_HOLDER__CHILDREN,
				 DomainFactory.eINSTANCE.createImage()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.CHILDREN_HOLDER__CHILDREN,
				 DomainFactory.eINSTANCE.createDate()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.CHILDREN_HOLDER__CHILDREN,
				 DomainFactory.eINSTANCE.createButton()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.CHILDREN_HOLDER__CHILDREN,
				 DomainFactory.eINSTANCE.createTable()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.CHILDREN_HOLDER__CHILDREN,
				 DomainFactory.eINSTANCE.createTree()));
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
			childFeature == DomainPackage.Literals.STYLE_ELEMENT__STYLE ||
			childFeature == DomainPackage.Literals.UIELEMENT__ENABLED ||
			childFeature == DomainPackage.Literals.UIELEMENT__REQUIRED ||
			childFeature == DomainPackage.Literals.UIELEMENT__READ_ONLY;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}