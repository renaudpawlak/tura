/**
 */
package domain.provider;


import domain.DomainFactory;
import domain.DomainPackage;
import domain.PopupCanvas;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link domain.PopupCanvas} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PopupCanvasItemProvider
  extends CanvasFrameItemProvider
  implements
    IEditingDomainItemProvider,
    IStructuredItemContentProvider,
    ITreeItemContentProvider,
    IItemLabelProvider,
    IItemPropertySource
{
  /**
   * This constructs an instance from a factory and a notifier.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PopupCanvasItemProvider(AdapterFactory adapterFactory)
  {
    super(adapterFactory);
  }

  /**
   * This returns the property descriptors for the adapted class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object)
  {
    if (itemPropertyDescriptors == null)
    {
      super.getPropertyDescriptors(object);

      addColumnsPropertyDescriptor(object);
      addDefaultCanvasPropertyDescriptor(object);
      addModalPropertyDescriptor(object);
    }
    return itemPropertyDescriptors;
  }

  /**
   * This adds a property descriptor for the Columns feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addColumnsPropertyDescriptor(Object object)
  {
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
   * This adds a property descriptor for the Default Canvas feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addDefaultCanvasPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_DefaultCavas_defaultCanvas_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_DefaultCavas_defaultCanvas_feature", "_UI_DefaultCavas_type"),
         DomainPackage.Literals.DEFAULT_CAVAS__DEFAULT_CANVAS,
         true,
         false,
         false,
         ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Modal feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addModalPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_PopupCanvas_modal_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_PopupCanvas_modal_feature", "_UI_PopupCanvas_type"),
         DomainPackage.Literals.POPUP_CANVAS__MODAL,
         true,
         false,
         false,
         ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
  public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object)
  {
    if (childrenFeatures == null)
    {
      super.getChildrenFeatures(object);
      childrenFeatures.add(DomainPackage.Literals.VIEW_PORT_HOLDER__VIEW_ELEMENT);
      childrenFeatures.add(DomainPackage.Literals.MULTI_LANG_LABEL__MULTI_LANG_LABEL);
      childrenFeatures.add(DomainPackage.Literals.CATEGORIZED__CLASSIFIERS);
    }
    return childrenFeatures;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EStructuralFeature getChildFeature(Object object, Object child)
  {
    // Check the type of the specified child object and return the proper feature to use for
    // adding (see {@link AddCommand}) it as a child.

    return super.getChildFeature(object, child);
  }

  /**
   * This returns PopupCanvas.gif.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object getImage(Object object)
  {
    return overlayImage(object, getResourceLocator().getImage("full/obj16/PopupCanvas"));
  }

  /**
   * This returns the label text for the adapted class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getText(Object object)
  {
    String label = ((PopupCanvas)object).getName();
    return label == null || label.length() == 0 ?
      getString("_UI_PopupCanvas_type") :
      getString("_UI_PopupCanvas_type") + " " + label;
  }

  /**
   * This handles model notifications by calling {@link #updateChildren} to update any cached
   * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void notifyChanged(Notification notification)
  {
    updateChildren(notification);

    switch (notification.getFeatureID(PopupCanvas.class))
    {
      case DomainPackage.POPUP_CANVAS__COLUMNS:
      case DomainPackage.POPUP_CANVAS__DEFAULT_CANVAS:
      case DomainPackage.POPUP_CANVAS__MODAL:
        fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
        return;
      case DomainPackage.POPUP_CANVAS__VIEW_ELEMENT:
      case DomainPackage.POPUP_CANVAS__MULTI_LANG_LABEL:
      case DomainPackage.POPUP_CANVAS__CLASSIFIERS:
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
  protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object)
  {
    super.collectNewChildDescriptors(newChildDescriptors, object);

    newChildDescriptors.add
      (createChildParameter
        (DomainPackage.Literals.VIEW_PORT_HOLDER__VIEW_ELEMENT,
         DomainFactory.eINSTANCE.createViewElement()));

    newChildDescriptors.add
      (createChildParameter
        (DomainPackage.Literals.VIEW_PORT_HOLDER__VIEW_ELEMENT,
         DomainFactory.eINSTANCE.createViewPort()));

    newChildDescriptors.add
      (createChildParameter
        (DomainPackage.Literals.VIEW_PORT_HOLDER__VIEW_ELEMENT,
         DomainFactory.eINSTANCE.createViewArea()));

    newChildDescriptors.add
      (createChildParameter
        (DomainPackage.Literals.MULTI_LANG_LABEL__MULTI_LANG_LABEL,
         DomainFactory.eINSTANCE.createContext()));

    newChildDescriptors.add
      (createChildParameter
        (DomainPackage.Literals.CATEGORIZED__CLASSIFIERS,
         DomainFactory.eINSTANCE.createClassifier()));
  }

  /**
   * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection)
  {
    Object childFeature = feature;
    Object childObject = child;

    boolean qualify =
      childFeature == DomainPackage.Literals.STYLE_ELEMENT__STYLE ||
      childFeature == DomainPackage.Literals.STYLE_ELEMENT__STYLE_CLASS ||
      childFeature == DomainPackage.Literals.MULTI_LANG_LABEL__MULTI_LANG_LABEL;

    if (qualify)
    {
      return getString
        ("_UI_CreateChild_text2",
         new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
    }
    return super.getCreateChildText(owner, feature, child, selection);
  }

}