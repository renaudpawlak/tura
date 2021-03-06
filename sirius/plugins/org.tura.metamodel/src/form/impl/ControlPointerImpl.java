/**
 */
package form.impl;

import form.ControlPointer;
import form.DataControl;
import form.FormPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import type.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Control Pointer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link form.impl.ControlPointerImpl#getSourcePointer <em>Source Pointer</em>}</li>
 *   <li>{@link form.impl.ControlPointerImpl#getValuePointer <em>Value Pointer</em>}</li>
 *   <li>{@link form.impl.ControlPointerImpl#getSourceCast <em>Source Cast</em>}</li>
 *   <li>{@link form.impl.ControlPointerImpl#getSourceCastDataControl <em>Source Cast Data Control</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ControlPointerImpl extends EObjectImpl implements ControlPointer {
	/**
	 * The cached value of the '{@link #getSourcePointer() <em>Source Pointer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourcePointer()
	 * @generated
	 * @ordered
	 */
	protected DataControl sourcePointer;

	/**
	 * The cached value of the '{@link #getValuePointer() <em>Value Pointer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValuePointer()
	 * @generated
	 * @ordered
	 */
	protected EObject valuePointer;

	/**
	 * The cached value of the '{@link #getSourceCast() <em>Source Cast</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceCast()
	 * @generated
	 * @ordered
	 */
	protected Type sourceCast;

	/**
	 * The cached value of the '{@link #getSourceCastDataControl() <em>Source Cast Data Control</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceCastDataControl()
	 * @generated
	 * @ordered
	 */
	protected DataControl sourceCastDataControl;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControlPointerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FormPackage.Literals.CONTROL_POINTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataControl getSourcePointer() {
		if (sourcePointer != null && sourcePointer.eIsProxy()) {
			InternalEObject oldSourcePointer = (InternalEObject)sourcePointer;
			sourcePointer = (DataControl)eResolveProxy(oldSourcePointer);
			if (sourcePointer != oldSourcePointer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FormPackage.CONTROL_POINTER__SOURCE_POINTER, oldSourcePointer, sourcePointer));
			}
		}
		return sourcePointer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataControl basicGetSourcePointer() {
		return sourcePointer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourcePointer(DataControl newSourcePointer) {
		DataControl oldSourcePointer = sourcePointer;
		sourcePointer = newSourcePointer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.CONTROL_POINTER__SOURCE_POINTER, oldSourcePointer, sourcePointer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getValuePointer() {
		if (valuePointer != null && valuePointer.eIsProxy()) {
			InternalEObject oldValuePointer = (InternalEObject)valuePointer;
			valuePointer = eResolveProxy(oldValuePointer);
			if (valuePointer != oldValuePointer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FormPackage.CONTROL_POINTER__VALUE_POINTER, oldValuePointer, valuePointer));
			}
		}
		return valuePointer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetValuePointer() {
		return valuePointer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValuePointer(EObject newValuePointer) {
		EObject oldValuePointer = valuePointer;
		valuePointer = newValuePointer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.CONTROL_POINTER__VALUE_POINTER, oldValuePointer, valuePointer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getSourceCast() {
		if (sourceCast != null && sourceCast.eIsProxy()) {
			InternalEObject oldSourceCast = (InternalEObject)sourceCast;
			sourceCast = (Type)eResolveProxy(oldSourceCast);
			if (sourceCast != oldSourceCast) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FormPackage.CONTROL_POINTER__SOURCE_CAST, oldSourceCast, sourceCast));
			}
		}
		return sourceCast;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type basicGetSourceCast() {
		return sourceCast;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceCast(Type newSourceCast) {
		Type oldSourceCast = sourceCast;
		sourceCast = newSourceCast;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.CONTROL_POINTER__SOURCE_CAST, oldSourceCast, sourceCast));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataControl getSourceCastDataControl() {
		if (sourceCastDataControl != null && sourceCastDataControl.eIsProxy()) {
			InternalEObject oldSourceCastDataControl = (InternalEObject)sourceCastDataControl;
			sourceCastDataControl = (DataControl)eResolveProxy(oldSourceCastDataControl);
			if (sourceCastDataControl != oldSourceCastDataControl) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FormPackage.CONTROL_POINTER__SOURCE_CAST_DATA_CONTROL, oldSourceCastDataControl, sourceCastDataControl));
			}
		}
		return sourceCastDataControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataControl basicGetSourceCastDataControl() {
		return sourceCastDataControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceCastDataControl(DataControl newSourceCastDataControl) {
		DataControl oldSourceCastDataControl = sourceCastDataControl;
		sourceCastDataControl = newSourceCastDataControl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.CONTROL_POINTER__SOURCE_CAST_DATA_CONTROL, oldSourceCastDataControl, sourceCastDataControl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FormPackage.CONTROL_POINTER__SOURCE_POINTER:
				if (resolve) return getSourcePointer();
				return basicGetSourcePointer();
			case FormPackage.CONTROL_POINTER__VALUE_POINTER:
				if (resolve) return getValuePointer();
				return basicGetValuePointer();
			case FormPackage.CONTROL_POINTER__SOURCE_CAST:
				if (resolve) return getSourceCast();
				return basicGetSourceCast();
			case FormPackage.CONTROL_POINTER__SOURCE_CAST_DATA_CONTROL:
				if (resolve) return getSourceCastDataControl();
				return basicGetSourceCastDataControl();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FormPackage.CONTROL_POINTER__SOURCE_POINTER:
				setSourcePointer((DataControl)newValue);
				return;
			case FormPackage.CONTROL_POINTER__VALUE_POINTER:
				setValuePointer((EObject)newValue);
				return;
			case FormPackage.CONTROL_POINTER__SOURCE_CAST:
				setSourceCast((Type)newValue);
				return;
			case FormPackage.CONTROL_POINTER__SOURCE_CAST_DATA_CONTROL:
				setSourceCastDataControl((DataControl)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case FormPackage.CONTROL_POINTER__SOURCE_POINTER:
				setSourcePointer((DataControl)null);
				return;
			case FormPackage.CONTROL_POINTER__VALUE_POINTER:
				setValuePointer((EObject)null);
				return;
			case FormPackage.CONTROL_POINTER__SOURCE_CAST:
				setSourceCast((Type)null);
				return;
			case FormPackage.CONTROL_POINTER__SOURCE_CAST_DATA_CONTROL:
				setSourceCastDataControl((DataControl)null);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case FormPackage.CONTROL_POINTER__SOURCE_POINTER:
				return sourcePointer != null;
			case FormPackage.CONTROL_POINTER__VALUE_POINTER:
				return valuePointer != null;
			case FormPackage.CONTROL_POINTER__SOURCE_CAST:
				return sourceCast != null;
			case FormPackage.CONTROL_POINTER__SOURCE_CAST_DATA_CONTROL:
				return sourceCastDataControl != null;
		}
		return super.eIsSet(featureID);
	}

} //ControlPointerImpl
