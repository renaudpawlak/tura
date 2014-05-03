package org.metamodel.tura.ui.properties.sections.dropdown.impl;

import java.util.HashMap;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.metamodel.tura.ui.properties.sections.dropdown.DropDownDataSupplier;

import domain.DomainPackage;

public class DomainMapperQueryRef  implements DropDownDataSupplier {

	@Override
	public EStructuralFeature[] getFeature() {
		return new EStructuralFeature[] { DomainPackage.eINSTANCE
				.getQuery_QueryRef() };
	}

	@Override
	public String getFeatureAsText(Object eObject) {
		if (((domain.Query) eObject).getQueryRef() != null)
			return ((domain.Query) eObject).getQueryRef().getName();
		else
			return "";
	}

	@Override
	public Object getFeatureValue(Object eObject,
			HashMap<String, Object> values, EStructuralFeature feature,
			Object... obj) {
		return values.get(obj[0]);
	}

	@Override
	public boolean isEqual(HashMap<String, Object> values, Object key,
			Object eObject) {
		if (((domain.Query) eObject).getQueryRef() == null)
			return false;

		if (((domain.Query) eObject).getQueryRef().getName() == null)
			return false;

		return values.get(key).equals(
				((domain.Query) eObject).getQueryRef().getName());
	}

	@Override
	public Object[] getWatchPointObject(Object eObject) {
		return new Object[]{};
	}

	@Override
	public EStructuralFeature[] getWatchPointFeature() {
		// TODO Auto-generated method stub
		return new EStructuralFeature[] { };
	}

	@Override
	public Class<?> getExpectedClass() {
		// TODO Auto-generated method stub
		return null;
	}


}
