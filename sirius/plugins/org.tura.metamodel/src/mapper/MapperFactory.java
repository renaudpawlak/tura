/**
 */
package mapper;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see mapper.MapperPackage
 * @generated
 */
public interface MapperFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MapperFactory eINSTANCE = mapper.impl.MapperFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Mappers</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mappers</em>'.
	 * @generated
	 */
	Mappers createMappers();

	/**
	 * Returns a new object of class '<em>Mapper</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mapper</em>'.
	 * @generated
	 */
	Mapper createMapper();

	/**
	 * Returns a new object of class '<em>Mapping Layer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mapping Layer</em>'.
	 * @generated
	 */
	MappingLayer createMappingLayer();

	/**
	 * Returns a new object of class '<em>Type Mapper</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type Mapper</em>'.
	 * @generated
	 */
	TypeMapper createTypeMapper();

	/**
	 * Returns a new object of class '<em>Package Mapper</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Package Mapper</em>'.
	 * @generated
	 */
	PackageMapper createPackageMapper();

	/**
	 * Returns a new object of class '<em>Java Mapper</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Java Mapper</em>'.
	 * @generated
	 */
	JavaMapper createJavaMapper();

	/**
	 * Returns a new object of class '<em>Java Package Mapper</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Java Package Mapper</em>'.
	 * @generated
	 */
	JavaPackageMapper createJavaPackageMapper();

	/**
	 * Returns a new object of class '<em>Java Script Mapper</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Java Script Mapper</em>'.
	 * @generated
	 */
	JavaScriptMapper createJavaScriptMapper();

	/**
	 * Returns a new object of class '<em>CSS Mapper</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CSS Mapper</em>'.
	 * @generated
	 */
	CSSMapper createCSSMapper();

	/**
	 * Returns a new object of class '<em>Role Mapper</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role Mapper</em>'.
	 * @generated
	 */
	RoleMapper createRoleMapper();

	/**
	 * Returns a new object of class '<em>XML Package Mapper</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XML Package Mapper</em>'.
	 * @generated
	 */
	XMLPackageMapper createXMLPackageMapper();

	/**
	 * Returns a new object of class '<em>XML Type Mapper</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XML Type Mapper</em>'.
	 * @generated
	 */
	XMLTypeMapper createXMLTypeMapper();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MapperPackage getMapperPackage();

} //MapperFactory
