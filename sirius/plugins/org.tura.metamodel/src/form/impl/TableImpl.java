/**
 */
package form.impl;

import common.CommonPackage;
import common.HTMLLayerHolder;

import form.Column;
import form.Context;
import form.FormPackage;
import form.MultiLangLabel;
import form.Table;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link form.impl.TableImpl#getMultiLangLabel <em>Multi Lang Label</em>}</li>
 *   <li>{@link form.impl.TableImpl#getColumns <em>Columns</em>}</li>
 *   <li>{@link form.impl.TableImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link form.impl.TableImpl#getRowNumber <em>Row Number</em>}</li>
 *   <li>{@link form.impl.TableImpl#getCols <em>Cols</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TableImpl extends SourcesPointerImpl implements Table {
	/**
	 * The cached value of the '{@link #getMultiLangLabel() <em>Multi Lang Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiLangLabel()
	 * @generated
	 * @ordered
	 */
	protected Context multiLangLabel;

	/**
	 * The default value of the '{@link #getColumns() <em>Columns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumns()
	 * @generated
	 * @ordered
	 */
	protected static final int COLUMNS_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getColumns() <em>Columns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumns()
	 * @generated
	 * @ordered
	 */
	protected int columns = COLUMNS_EDEFAULT;

	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getRowNumber() <em>Row Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRowNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int ROW_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRowNumber() <em>Row Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRowNumber()
	 * @generated
	 * @ordered
	 */
	protected int rowNumber = ROW_NUMBER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCols() <em>Cols</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCols()
	 * @generated
	 * @ordered
	 */
	protected EList<Column> cols;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FormPackage.Literals.TABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Context getMultiLangLabel() {
		return multiLangLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMultiLangLabel(Context newMultiLangLabel, NotificationChain msgs) {
		Context oldMultiLangLabel = multiLangLabel;
		multiLangLabel = newMultiLangLabel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FormPackage.TABLE__MULTI_LANG_LABEL, oldMultiLangLabel, newMultiLangLabel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiLangLabel(Context newMultiLangLabel) {
		if (newMultiLangLabel != multiLangLabel) {
			NotificationChain msgs = null;
			if (multiLangLabel != null)
				msgs = ((InternalEObject)multiLangLabel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FormPackage.TABLE__MULTI_LANG_LABEL, null, msgs);
			if (newMultiLangLabel != null)
				msgs = ((InternalEObject)newMultiLangLabel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FormPackage.TABLE__MULTI_LANG_LABEL, null, msgs);
			msgs = basicSetMultiLangLabel(newMultiLangLabel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.TABLE__MULTI_LANG_LABEL, newMultiLangLabel, newMultiLangLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getColumns() {
		return columns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumns(int newColumns) {
		int oldColumns = columns;
		columns = newColumns;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.TABLE__COLUMNS, oldColumns, columns));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel) {
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.TABLE__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRowNumber() {
		return rowNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRowNumber(int newRowNumber) {
		int oldRowNumber = rowNumber;
		rowNumber = newRowNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.TABLE__ROW_NUMBER, oldRowNumber, rowNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Column> getCols() {
		if (cols == null) {
			cols = new EObjectContainmentEList<Column>(Column.class, this, FormPackage.TABLE__COLS);
		}
		return cols;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FormPackage.TABLE__MULTI_LANG_LABEL:
				return basicSetMultiLangLabel(null, msgs);
			case FormPackage.TABLE__COLS:
				return ((InternalEList<?>)getCols()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FormPackage.TABLE__MULTI_LANG_LABEL:
				return getMultiLangLabel();
			case FormPackage.TABLE__COLUMNS:
				return getColumns();
			case FormPackage.TABLE__LABEL:
				return getLabel();
			case FormPackage.TABLE__ROW_NUMBER:
				return getRowNumber();
			case FormPackage.TABLE__COLS:
				return getCols();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FormPackage.TABLE__MULTI_LANG_LABEL:
				setMultiLangLabel((Context)newValue);
				return;
			case FormPackage.TABLE__COLUMNS:
				setColumns((Integer)newValue);
				return;
			case FormPackage.TABLE__LABEL:
				setLabel((String)newValue);
				return;
			case FormPackage.TABLE__ROW_NUMBER:
				setRowNumber((Integer)newValue);
				return;
			case FormPackage.TABLE__COLS:
				getCols().clear();
				getCols().addAll((Collection<? extends Column>)newValue);
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
			case FormPackage.TABLE__MULTI_LANG_LABEL:
				setMultiLangLabel((Context)null);
				return;
			case FormPackage.TABLE__COLUMNS:
				setColumns(COLUMNS_EDEFAULT);
				return;
			case FormPackage.TABLE__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case FormPackage.TABLE__ROW_NUMBER:
				setRowNumber(ROW_NUMBER_EDEFAULT);
				return;
			case FormPackage.TABLE__COLS:
				getCols().clear();
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
			case FormPackage.TABLE__MULTI_LANG_LABEL:
				return multiLangLabel != null;
			case FormPackage.TABLE__COLUMNS:
				return columns != COLUMNS_EDEFAULT;
			case FormPackage.TABLE__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case FormPackage.TABLE__ROW_NUMBER:
				return rowNumber != ROW_NUMBER_EDEFAULT;
			case FormPackage.TABLE__COLS:
				return cols != null && !cols.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == MultiLangLabel.class) {
			switch (derivedFeatureID) {
				case FormPackage.TABLE__MULTI_LANG_LABEL: return FormPackage.MULTI_LANG_LABEL__MULTI_LANG_LABEL;
				default: return -1;
			}
		}
		if (baseClass == HTMLLayerHolder.class) {
			switch (derivedFeatureID) {
				case FormPackage.TABLE__COLUMNS: return CommonPackage.HTML_LAYER_HOLDER__COLUMNS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == MultiLangLabel.class) {
			switch (baseFeatureID) {
				case FormPackage.MULTI_LANG_LABEL__MULTI_LANG_LABEL: return FormPackage.TABLE__MULTI_LANG_LABEL;
				default: return -1;
			}
		}
		if (baseClass == HTMLLayerHolder.class) {
			switch (baseFeatureID) {
				case CommonPackage.HTML_LAYER_HOLDER__COLUMNS: return FormPackage.TABLE__COLUMNS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (columns: ");
		result.append(columns);
		result.append(", label: ");
		result.append(label);
		result.append(", rowNumber: ");
		result.append(rowNumber);
		result.append(')');
		return result.toString();
	}

} //TableImpl
