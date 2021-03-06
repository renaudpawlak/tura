package org.tura.metamodel.sirius.properties.selections.adapters.dropdown;

import java.util.Map;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.tura.metamodel.sirius.properties.selections.DropDownDataAdapter;

import message.MessagePackage;
import message.Translation;

public class TranslationLanguage implements DropDownDataAdapter {

	@Override
	public EStructuralFeature[] getFeature() {
		return new EStructuralFeature[] { MessagePackage.eINSTANCE.getTranslation_Lang() };
	}

	@Override
	public String getFeatureAsText(Object eObject) {
		if (((Translation) eObject).getLang() != null)
			return ((Translation) eObject).getLang().getLang();
		else
			return "";
	}

	@Override
	public Object getSelectedFeatureValue(Object eObject, Map<String, Object> values, EStructuralFeature feature,
			Object... obj) {
		return values.get(obj[0]);
	}

	@Override
	public boolean isEqual(Map<String, Object> values, Object key, Object eObject) {
		if (((Translation) eObject).getLang() == null)
			return false;

		if (((Translation) eObject).getLang().getLang()== null)
			return false;

		return values.get(key).equals(((Translation) eObject).getLang().getLang());
	}

	@Override
	public Object[] getWatchPointObject(Object eObject) {
		return new Object[] {};
	}

	@Override
	public EStructuralFeature[] getWatchPointFeature() {
		return new EStructuralFeature[] {};
	}

	@Override
	public Class<?> getExpectedClass() {
		return null;
	}

	@Override
	public Object getCurrentFeatureValue(Object eObject, EStructuralFeature feature) {
		return null;
	}

}
