package org.tura.metamodel.commons.properties.sections.dropdown.impl;

import java.util.HashMap;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.tura.metamodel.commons.properties.sections.dropdown.DropDownDataSupplier;

import domain.DomainPackage;

public class SelectionValueOptionPointer implements DropDownDataSupplier {

	public EStructuralFeature[] getFeature() {

		return new EStructuralFeature[] { DomainPackage.eINSTANCE
				.getSelection_ValueOptionPointer() };
	}

	public String getFeatureAsText(Object eObject) {
		String name = null;
		if (((domain.DropDownSelection) eObject).getSelection().getValueOptionPointer() instanceof domain.Attribute)
			name = ((domain.Attribute) ((domain.DropDownSelection) eObject).getSelection()
					.getValueOptionPointer()).getName();

		if (((domain.DropDownSelection) eObject).getSelection().getValueOptionPointer() instanceof domain.ArtificialField)
			name = ((domain.ArtificialField) ((domain.DropDownSelection) eObject).getSelection()
					.getValueOptionPointer()).getName();

		return name;
	}

	public Object getFeatureValue(Object eObject,
			HashMap<String, Object> values, EStructuralFeature feature,
			Object... obj) {
		if (feature.equals(DomainPackage.eINSTANCE
				.getSelection_ValueOptionPointer()))
			return values.get(obj[0]);

		return null;
	}

	public boolean isEqual(HashMap<String, Object> values, Object key,
			Object eObject) {
		if (((domain.DropDownSelection) eObject).getSelection().getValueOptionPointer() == null)
			return false;

		String name = null;
		if (((domain.DropDownSelection) eObject).getSelection().getValueOptionPointer() instanceof domain.Attribute)
			name = ((domain.Attribute) ((domain.Selection) eObject)
					.getValueOptionPointer()).getName();

		if (((domain.DropDownSelection) eObject).getSelection().getValueOptionPointer() instanceof domain.ArtificialField)
			name = ((domain.ArtificialField) ((domain.DropDownSelection) eObject).getSelection()
					.getValueOptionPointer()).getName();

		if (name == null)
			return false;
		return values.get(key).equals(name);
	}

	public Object[] getWatchPointObject(Object eObject) {
		return new Object[] {((domain.OptionSelection) eObject).getOptionPointer(),
				((domain.OptionSelection) eObject).getOptionCast()
				};
	}

	public EStructuralFeature[] getWatchPointFeature() {
		return new EStructuralFeature[] 
				{ DomainPackage.eINSTANCE.getOptionSelection_OptionPointer(),
				  DomainPackage.eINSTANCE.getOptionSelection_OptionCast()
				};
	}

	public Class<?> getExpectedClass() {
		return EObject.class;
	}
}