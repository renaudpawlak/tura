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
package org.tura.metamodel.commons.properties.selections.adapters.dropdown;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.tura.metamodel.commons.properties.selections.DropDownDataAdapter;

import domain.DomainPackage;

public class SelectionValueOptionPointer implements DropDownDataAdapter {

	public EStructuralFeature[] getFeature() {

		return new EStructuralFeature[] { DomainPackage.eINSTANCE.getSelection_ValueOptionPointer() };
	}

	public String getFeatureAsText(Object eObject) {
		String name = null;
		if (((domain.DropDownSelection) eObject).getSelection().getValueOptionPointer() instanceof domain.Attribute)
			name = ((domain.Attribute) ((domain.DropDownSelection) eObject).getSelection().getValueOptionPointer())
					.getName();

		if (((domain.DropDownSelection) eObject).getSelection().getValueOptionPointer() instanceof domain.ArtificialField)
			name = ((domain.ArtificialField) ((domain.DropDownSelection) eObject).getSelection()
					.getValueOptionPointer()).getName();

		return name;
	}

	public Object getSelectedFeatureValue(Object eObject, Map<String, Object> values, EStructuralFeature feature,
			Object... obj) {
		if (feature.equals(DomainPackage.eINSTANCE.getSelection_ValueOptionPointer()))
			return values.get(obj[0]);

		return null;
	}

	public boolean isEqual(Map<String, Object> values, Object key, Object eObject) {
		if (((domain.DropDownSelection) eObject).getSelection().getValueOptionPointer() == null)
			return false;

		String name = null;
		if (((domain.DropDownSelection) eObject).getSelection().getValueOptionPointer() instanceof domain.Attribute)
			name = ((domain.Attribute) ((domain.Selection) eObject).getValueOptionPointer()).getName();

		if (((domain.DropDownSelection) eObject).getSelection().getValueOptionPointer() instanceof domain.ArtificialField)
			name = ((domain.ArtificialField) ((domain.DropDownSelection) eObject).getSelection()
					.getValueOptionPointer()).getName();

		if (name == null)
			return false;
		return values.get(key).equals(name);
	}

	public Object[] getWatchPointObject(Object eObject) {
		return new Object[] { ((domain.OptionSelection) eObject).getOptionPointer(),
				((domain.OptionSelection) eObject).getOptionCast(),
				((domain.OptionSelection) eObject).getOptionCastDataControl() };
	}

	public EStructuralFeature[] getWatchPointFeature() {
		return new EStructuralFeature[] { DomainPackage.eINSTANCE.getOptionSelection_OptionPointer(),
				DomainPackage.eINSTANCE.getOptionSelection_OptionCast(),
				DomainPackage.eINSTANCE.getOptionSelection_OptionCastDataControl() };
	}

	public Class<?> getExpectedClass() {
		return EObject.class;
	}

	@Override
	public Object getCurrentFeatureValue(Object eObject, EStructuralFeature feature) {
		return null;
	}
}