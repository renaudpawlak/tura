/**
 */
package form.impl;

import artifact.ArtifactPackage;
import artifact.Categorized;
import artifact.Classifier;

import form.FormPackage;
import form.MenuDefinition;
import form.MenuFolder;
import form.ToSubmenu;

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
 * An implementation of the model object '<em><b>Menu Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link form.impl.MenuDefinitionImpl#getClassifiers <em>Classifiers</em>}</li>
 *   <li>{@link form.impl.MenuDefinitionImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link form.impl.MenuDefinitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link form.impl.MenuDefinitionImpl#getMenuFolders <em>Menu Folders</em>}</li>
 *   <li>{@link form.impl.MenuDefinitionImpl#getToSubMenu <em>To Sub Menu</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MenuDefinitionImpl extends StyleElementImpl implements MenuDefinition {
	/**
	 * The cached value of the '{@link #getClassifiers() <em>Classifiers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassifiers()
	 * @generated
	 * @ordered
	 */
	protected EList<Classifier> classifiers;

	/**
	 * The default value of the '{@link #getUid() <em>Uid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUid()
	 * @generated
	 * @ordered
	 */
	protected static final String UID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUid() <em>Uid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUid()
	 * @generated
	 * @ordered
	 */
	protected String uid = UID_EDEFAULT;

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
	 * The cached value of the '{@link #getMenuFolders() <em>Menu Folders</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMenuFolders()
	 * @generated
	 * @ordered
	 */
	protected EList<MenuFolder> menuFolders;

	/**
	 * The cached value of the '{@link #getToSubMenu() <em>To Sub Menu</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToSubMenu()
	 * @generated
	 * @ordered
	 */
	protected EList<ToSubmenu> toSubMenu;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MenuDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FormPackage.Literals.MENU_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Classifier> getClassifiers() {
		if (classifiers == null) {
			classifiers = new EObjectContainmentEList<Classifier>(Classifier.class, this, FormPackage.MENU_DEFINITION__CLASSIFIERS);
		}
		return classifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUid() {
		return uid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUid(String newUid) {
		String oldUid = uid;
		uid = newUid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.MENU_DEFINITION__UID, oldUid, uid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.MENU_DEFINITION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MenuFolder> getMenuFolders() {
		if (menuFolders == null) {
			menuFolders = new EObjectContainmentEList<MenuFolder>(MenuFolder.class, this, FormPackage.MENU_DEFINITION__MENU_FOLDERS);
		}
		return menuFolders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ToSubmenu> getToSubMenu() {
		if (toSubMenu == null) {
			toSubMenu = new EObjectContainmentEList<ToSubmenu>(ToSubmenu.class, this, FormPackage.MENU_DEFINITION__TO_SUB_MENU);
		}
		return toSubMenu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FormPackage.MENU_DEFINITION__CLASSIFIERS:
				return ((InternalEList<?>)getClassifiers()).basicRemove(otherEnd, msgs);
			case FormPackage.MENU_DEFINITION__MENU_FOLDERS:
				return ((InternalEList<?>)getMenuFolders()).basicRemove(otherEnd, msgs);
			case FormPackage.MENU_DEFINITION__TO_SUB_MENU:
				return ((InternalEList<?>)getToSubMenu()).basicRemove(otherEnd, msgs);
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
			case FormPackage.MENU_DEFINITION__CLASSIFIERS:
				return getClassifiers();
			case FormPackage.MENU_DEFINITION__UID:
				return getUid();
			case FormPackage.MENU_DEFINITION__NAME:
				return getName();
			case FormPackage.MENU_DEFINITION__MENU_FOLDERS:
				return getMenuFolders();
			case FormPackage.MENU_DEFINITION__TO_SUB_MENU:
				return getToSubMenu();
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
			case FormPackage.MENU_DEFINITION__CLASSIFIERS:
				getClassifiers().clear();
				getClassifiers().addAll((Collection<? extends Classifier>)newValue);
				return;
			case FormPackage.MENU_DEFINITION__UID:
				setUid((String)newValue);
				return;
			case FormPackage.MENU_DEFINITION__NAME:
				setName((String)newValue);
				return;
			case FormPackage.MENU_DEFINITION__MENU_FOLDERS:
				getMenuFolders().clear();
				getMenuFolders().addAll((Collection<? extends MenuFolder>)newValue);
				return;
			case FormPackage.MENU_DEFINITION__TO_SUB_MENU:
				getToSubMenu().clear();
				getToSubMenu().addAll((Collection<? extends ToSubmenu>)newValue);
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
			case FormPackage.MENU_DEFINITION__CLASSIFIERS:
				getClassifiers().clear();
				return;
			case FormPackage.MENU_DEFINITION__UID:
				setUid(UID_EDEFAULT);
				return;
			case FormPackage.MENU_DEFINITION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case FormPackage.MENU_DEFINITION__MENU_FOLDERS:
				getMenuFolders().clear();
				return;
			case FormPackage.MENU_DEFINITION__TO_SUB_MENU:
				getToSubMenu().clear();
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
			case FormPackage.MENU_DEFINITION__CLASSIFIERS:
				return classifiers != null && !classifiers.isEmpty();
			case FormPackage.MENU_DEFINITION__UID:
				return UID_EDEFAULT == null ? uid != null : !UID_EDEFAULT.equals(uid);
			case FormPackage.MENU_DEFINITION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case FormPackage.MENU_DEFINITION__MENU_FOLDERS:
				return menuFolders != null && !menuFolders.isEmpty();
			case FormPackage.MENU_DEFINITION__TO_SUB_MENU:
				return toSubMenu != null && !toSubMenu.isEmpty();
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
		if (baseClass == Categorized.class) {
			switch (derivedFeatureID) {
				case FormPackage.MENU_DEFINITION__CLASSIFIERS: return ArtifactPackage.CATEGORIZED__CLASSIFIERS;
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
		if (baseClass == Categorized.class) {
			switch (baseFeatureID) {
				case ArtifactPackage.CATEGORIZED__CLASSIFIERS: return FormPackage.MENU_DEFINITION__CLASSIFIERS;
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
		result.append(" (uid: ");
		result.append(uid);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //MenuDefinitionImpl
