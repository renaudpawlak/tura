package org.tura.sirius.diagram.producer.tura;

import java.util.ArrayList;
import java.util.List;

import org.tura.sirius.diagram.producer.tura.config.items.artifact.ArtifactConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.artifact.ConfigHashWithNickNameConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.artifact.ConfigHashWithNickNamesConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.artifact.ConfigVariableWithNickNameConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.artifact.ConfigVariableWithNickNamesConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.artifact.ModelQueryConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.artifact.ModelQueryesConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.artifact.TechnologiesConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.artifact.TechnologyConfigurator;
import org.tura.sirius.dsl.diagram.tContainer;
import org.tura.sirius.dsl.diagram.tToolSection;

public class ArtifactDiagram {
	public List<Object> getChildrens() {
		ArrayList<Object> list = new ArrayList<Object>();

		tContainer cnt = ArtifactConfigurator.create();
		list.add(cnt);
		cnt.addChild(ModelQueryesConfigurator.create().addChild(ModelQueryConfigurator.create()));
		cnt.addChild(TechnologiesConfigurator.create().addChild(TechnologyConfigurator.create()));
		cnt.addChild(ConfigVariableWithNickNamesConfigurator.create()
				.addChild(ConfigVariableWithNickNameConfigurator.create()));
		cnt.addChild(
				ConfigHashWithNickNamesConfigurator.create().addChild(ConfigHashWithNickNameConfigurator.create()));

		tToolSection nodeToolSection = new tToolSection("Nodes");
		list.add(nodeToolSection);
		nodeToolSection.addChildrens(ArtifactConfigurator.getTools());
		nodeToolSection.addChildrens(ModelQueryConfigurator.getTools());
		nodeToolSection.addChildrens(TechnologyConfigurator.getTools());

		return list;
	}
}
