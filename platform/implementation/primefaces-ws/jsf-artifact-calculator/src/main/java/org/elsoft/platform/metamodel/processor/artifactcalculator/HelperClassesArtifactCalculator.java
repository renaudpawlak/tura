package org.elsoft.platform.metamodel.processor.artifactcalculator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.elsoft.platform.metamodel.MetamodelArtifactType;
import org.elsoft.platform.metamodel.processor.ArtifactCalculator;


public class HelperClassesArtifactCalculator extends ArtifactCalculator {

	@Override
	protected List<Artifact> getArtifactList(Object model,
			HashMap<String, Object> context,HashMap<String, Object> outputContext) {
		ArrayList<Artifact> list = new ArrayList<Artifact>();

		list.add(new Artifact(MetamodelArtifactType.HelperClasses,null));

		return list;
	}

	@Override
	protected String getTechnology() {
		return "JSF";
	}

}