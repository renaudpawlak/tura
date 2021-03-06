package org.tura.sirius.diagram.producer.tura;

import java.util.ArrayList;
import java.util.List;

import org.tura.sirius.diagram.producer.tura.config.items.form.InftastructureContextMenu;
import org.tura.sirius.diagram.producer.tura.config.items.recipe.ConfigExtensionConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.recipe.ConfigurationConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.recipe.ConfigurationContextMenu;
import org.tura.sirius.diagram.producer.tura.config.items.recipe.HashPropertiesConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.recipe.HashPropertyConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.recipe.Infrastructure2ConfigurationConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.recipe.InfrastructureConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.recipe.IngredientConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.recipe.JavaComponentConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.recipe.ModelMapperConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.recipe.PropertiesConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.recipe.PropertyConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.recipe.QueryConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.recipe.Recipe2InfrastructureConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.recipe.RecipeConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.recipe.RecipeContextMenu;
import org.tura.sirius.dsl.diagram.tContainer;
import org.tura.sirius.dsl.diagram.tNode;
import org.tura.sirius.dsl.diagram.tToolSection;

public class RecipeDiagram {
	public List<Object> getChildrens() {
		ArrayList<Object> list = new ArrayList<Object>();

		tContainer cnt = RecipeConfigurator.create()
				.addChild(IngredientConfigurator.create().addChild(JavaComponentConfigurator.create()
						.addChild(ModelMapperConfigurator.create().addChild(QueryConfigurator.create()))));

		list.add(cnt);

		tNode node = InfrastructureConfigurator.create();
		list.add(node);

		cnt = ConfigurationConfigurator.create();
		cnt.addChild(PropertiesConfigurator.create().addChild(PropertyConfigurator.create()));
		cnt.addChild(HashPropertiesConfigurator.create().addChild(HashPropertyConfigurator.create()));
		list.add(cnt);

		list.add(ConfigExtensionConfigurator.create());
		list.add(Recipe2InfrastructureConfigurator.create());
		list.add(Infrastructure2ConfigurationConfigurator.create());

		tToolSection nodeToolSection = new tToolSection("Nodes");
		list.add(nodeToolSection);
		nodeToolSection.addChildrens(RecipeConfigurator.getTools());
		nodeToolSection.addChildrens(IngredientConfigurator.getTools());
		nodeToolSection.addChildrens(JavaComponentConfigurator.getTools());
		nodeToolSection.addChildrens(ModelMapperConfigurator.getTools());
		nodeToolSection.addChildrens(QueryConfigurator.getTools());
		nodeToolSection.addChildrens(InfrastructureConfigurator.getTools());
		nodeToolSection.addChildrens(ConfigurationConfigurator.getTools());
		nodeToolSection.addChildrens(ConfigurationContextMenu.getMenu());
		nodeToolSection.addChildrens(RecipeContextMenu.getMenu());

		nodeToolSection = new tToolSection("Connection");
		list.add(nodeToolSection);
		nodeToolSection.addChildrens(ConfigExtensionConfigurator.getTools());
		nodeToolSection.addChildrens(Recipe2InfrastructureConfigurator.getTools());
		nodeToolSection.addChildrens(Infrastructure2ConfigurationConfigurator.getTools());
		nodeToolSection.addChildrens(InftastructureContextMenu.getMenu());

		return list;
	}
}
