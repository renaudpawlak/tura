/**
 */
package domain.impl;

import domain.Application;
import domain.DomainApplication;
import domain.DomainApplications;
import domain.DomainPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Application</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link domain.impl.DomainApplicationImpl#getName <em>Name</em>}</li>
 *   <li>{@link domain.impl.DomainApplicationImpl#getApplication <em>Application</em>}</li>
 *   <li>{@link domain.impl.DomainApplicationImpl#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DomainApplicationImpl extends EObjectImpl implements DomainApplication
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getApplication() <em>Application</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getApplication()
   * @generated
   * @ordered
   */
  protected Application application;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DomainApplicationImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return DomainPackage.Literals.DOMAIN_APPLICATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.DOMAIN_APPLICATION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Application getApplication()
  {
    if (application != null && application.eIsProxy())
    {
      InternalEObject oldApplication = (InternalEObject)application;
      application = (Application)eResolveProxy(oldApplication);
      if (application != oldApplication)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainPackage.DOMAIN_APPLICATION__APPLICATION, oldApplication, application));
      }
    }
    return application;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Application basicGetApplication()
  {
    return application;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetApplication(Application newApplication, NotificationChain msgs)
  {
    Application oldApplication = application;
    application = newApplication;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.DOMAIN_APPLICATION__APPLICATION, oldApplication, newApplication);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setApplication(Application newApplication)
  {
    if (newApplication != application)
    {
      NotificationChain msgs = null;
      if (application != null)
        msgs = ((InternalEObject)application).eInverseRemove(this, DomainPackage.APPLICATION__PARENT, Application.class, msgs);
      if (newApplication != null)
        msgs = ((InternalEObject)newApplication).eInverseAdd(this, DomainPackage.APPLICATION__PARENT, Application.class, msgs);
      msgs = basicSetApplication(newApplication, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.DOMAIN_APPLICATION__APPLICATION, newApplication, newApplication));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DomainApplications getParent()
  {
    if (eContainerFeatureID() != DomainPackage.DOMAIN_APPLICATION__PARENT) return null;
    return (DomainApplications)eContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParent(DomainApplications newParent, NotificationChain msgs)
  {
    msgs = eBasicSetContainer((InternalEObject)newParent, DomainPackage.DOMAIN_APPLICATION__PARENT, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParent(DomainApplications newParent)
  {
    if (newParent != eInternalContainer() || (eContainerFeatureID() != DomainPackage.DOMAIN_APPLICATION__PARENT && newParent != null))
    {
      if (EcoreUtil.isAncestor(this, newParent))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newParent != null)
        msgs = ((InternalEObject)newParent).eInverseAdd(this, DomainPackage.DOMAIN_APPLICATIONS__APPLICATIONS, DomainApplications.class, msgs);
      msgs = basicSetParent(newParent, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.DOMAIN_APPLICATION__PARENT, newParent, newParent));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case DomainPackage.DOMAIN_APPLICATION__APPLICATION:
        if (application != null)
          msgs = ((InternalEObject)application).eInverseRemove(this, DomainPackage.APPLICATION__PARENT, Application.class, msgs);
        return basicSetApplication((Application)otherEnd, msgs);
      case DomainPackage.DOMAIN_APPLICATION__PARENT:
        if (eInternalContainer() != null)
          msgs = eBasicRemoveFromContainer(msgs);
        return basicSetParent((DomainApplications)otherEnd, msgs);
    }
    return super.eInverseAdd(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case DomainPackage.DOMAIN_APPLICATION__APPLICATION:
        return basicSetApplication(null, msgs);
      case DomainPackage.DOMAIN_APPLICATION__PARENT:
        return basicSetParent(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs)
  {
    switch (eContainerFeatureID())
    {
      case DomainPackage.DOMAIN_APPLICATION__PARENT:
        return eInternalContainer().eInverseRemove(this, DomainPackage.DOMAIN_APPLICATIONS__APPLICATIONS, DomainApplications.class, msgs);
    }
    return super.eBasicRemoveFromContainerFeature(msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case DomainPackage.DOMAIN_APPLICATION__NAME:
        return getName();
      case DomainPackage.DOMAIN_APPLICATION__APPLICATION:
        if (resolve) return getApplication();
        return basicGetApplication();
      case DomainPackage.DOMAIN_APPLICATION__PARENT:
        return getParent();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DomainPackage.DOMAIN_APPLICATION__NAME:
        setName((String)newValue);
        return;
      case DomainPackage.DOMAIN_APPLICATION__APPLICATION:
        setApplication((Application)newValue);
        return;
      case DomainPackage.DOMAIN_APPLICATION__PARENT:
        setParent((DomainApplications)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case DomainPackage.DOMAIN_APPLICATION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case DomainPackage.DOMAIN_APPLICATION__APPLICATION:
        setApplication((Application)null);
        return;
      case DomainPackage.DOMAIN_APPLICATION__PARENT:
        setParent((DomainApplications)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case DomainPackage.DOMAIN_APPLICATION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case DomainPackage.DOMAIN_APPLICATION__APPLICATION:
        return application != null;
      case DomainPackage.DOMAIN_APPLICATION__PARENT:
        return getParent() != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //DomainApplicationImpl