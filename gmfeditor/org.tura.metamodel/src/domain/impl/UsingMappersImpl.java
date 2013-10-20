/**
 */
package domain.impl;

import domain.DomainPackage;
import domain.Mappers;
import domain.UsingMappers;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Using Mappers</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link domain.impl.UsingMappersImpl#getMappers <em>Mappers</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UsingMappersImpl extends EObjectImpl implements UsingMappers
{
  /**
   * The cached value of the '{@link #getMappers() <em>Mappers</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMappers()
   * @generated
   * @ordered
   */
  protected EList<Mappers> mappers;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected UsingMappersImpl()
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
    return DomainPackage.Literals.USING_MAPPERS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Mappers> getMappers()
  {
    if (mappers == null)
    {
      mappers = new EObjectResolvingEList<Mappers>(Mappers.class, this, DomainPackage.USING_MAPPERS__MAPPERS);
    }
    return mappers;
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
      case DomainPackage.USING_MAPPERS__MAPPERS:
        return getMappers();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DomainPackage.USING_MAPPERS__MAPPERS:
        getMappers().clear();
        getMappers().addAll((Collection<? extends Mappers>)newValue);
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
      case DomainPackage.USING_MAPPERS__MAPPERS:
        getMappers().clear();
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
      case DomainPackage.USING_MAPPERS__MAPPERS:
        return mappers != null && !mappers.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //UsingMappersImpl
