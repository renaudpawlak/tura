package org.tura.sirius.diagram.producer.tura;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.sirius.diagram.description.ContainerMapping;
import org.tura.sirius.diagram.producer.tura.config.items.form.ButtonConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.form.CheckBoxConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.form.ColumnConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.form.ColumnElementConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.form.DateConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.form.DropDownSelectionConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.form.ImageConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.form.InputTextConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.form.LabelConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.form.LayerHolderConfiguration;
import org.tura.sirius.diagram.producer.tura.config.items.form.LayerHolderinTableColumn;
import org.tura.sirius.diagram.producer.tura.config.items.form.LayerHolderinTreeColumn;
import org.tura.sirius.diagram.producer.tura.config.items.form.LinkToLabelConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.form.LinkToMessageConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.form.MenuConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.form.MessageElementConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.form.OutputTextConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.form.PasswordConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.form.TableColumnsConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.form.TableConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.form.TreeColumnsConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.form.TreeConfigurator;
import org.tura.sirius.dsl.config.ObjectWrapper;
import org.tura.sirius.dsl.diagram.tContainer;
import org.tura.sirius.dsl.diagram.tToolSection;
import org.tura.sirius.dsl.viewpoint.tRoot;

public class CanvasDiagram {
	public List<Object> getChildrens() {
		ArrayList<Object> list = new ArrayList<Object>();

		tContainer cnt = LayerHolderConfiguration.create().addChild(ButtonConfigurator.create("0"))
				.addChild(CheckBoxConfigurator.create("0")).addChild(DateConfigurator.create("0"))
				.addChild(DropDownSelectionConfigurator.create("0")).addChild(ImageConfigurator.create("0"))
				.addChild(InputTextConfigurator.create("0")).addChild(OutputTextConfigurator.create("0"))
				.addChild(PasswordConfigurator.create("0"))
				.addChild(
						LabelConfigurator.create("0"))
				.addChild(
						TableConfigurator.create()
								.addChild(
										TableColumnsConfigurator.create()
												.addChild(ColumnConfigurator.create("Table")
														.addChild(ColumnElementConfigurator.create()
																.addChild(LayerHolderinTableColumn.create()
																		.addChild(ButtonConfigurator.create("1"))
																		.addChild(CheckBoxConfigurator.create("1"))
																		.addChild(DateConfigurator.create("1"))
																		.addChild(DropDownSelectionConfigurator
																				.create("1"))
																		.addChild(ImageConfigurator.create("1"))
																		.addChild(InputTextConfigurator.create("1"))
																		.addChild(OutputTextConfigurator.create("1"))
																		.addChild(PasswordConfigurator.create("1"))
																		.addChild(LabelConfigurator.create("1")))

																.addChild(ButtonConfigurator.create("2",
																		"feature:element"))
																.addChild(CheckBoxConfigurator.create("2",
																		"feature:element"))
																.addChild(
																		DateConfigurator.create("2", "feature:element"))
																.addChild(DropDownSelectionConfigurator.create("2",
																		"feature:element"))
																.addChild(ImageConfigurator.create("2",
																		"feature:element"))
																.addChild(InputTextConfigurator.create("2",
																		"feature:element"))
																.addChild(OutputTextConfigurator.create("2",
																		"feature:element"))
																.addChild(PasswordConfigurator.create("2",
																		"feature:element"))
																.addChild(LabelConfigurator.create("2",
																		"feature:element"))))))

				.addChild(
						TreeConfigurator.create()
								.addChild(
										TreeColumnsConfigurator.create()
												.addChild(ColumnConfigurator.create("Tree")
														.addChild(ColumnElementConfigurator.create()
																.addChild(LayerHolderinTreeColumn.create()
																		.addChild(ButtonConfigurator.create("3"))
																		.addChild(CheckBoxConfigurator.create("3"))
																		.addChild(DateConfigurator.create("3"))
																		.addChild(DropDownSelectionConfigurator
																				.create("3"))
																		.addChild(ImageConfigurator.create("3"))
																		.addChild(InputTextConfigurator.create("3"))
																		.addChild(OutputTextConfigurator.create("3"))
																		.addChild(PasswordConfigurator.create("3"))
																		.addChild(LabelConfigurator.create("3")))

																.addChild(ButtonConfigurator.create("4",
																		"feature:element"))
																.addChild(CheckBoxConfigurator.create("4",
																		"feature:element"))
																.addChild(
																		DateConfigurator.create("4", "feature:element"))
																.addChild(DropDownSelectionConfigurator.create("4",
																		"feature:element"))
																.addChild(ImageConfigurator.create("4",
																		"feature:element"))
																.addChild(InputTextConfigurator.create("4",
																		"feature:element"))
																.addChild(OutputTextConfigurator.create("4",
																		"feature:element"))
																.addChild(PasswordConfigurator.create("4",
																		"feature:element"))
																.addChild(LabelConfigurator.create("4",
																		"feature:element"))))))

				.addChild(MenuConfigurator.create()).addChild(MessageElementConfigurator.create());

		list.add(cnt);

		list.add(LinkToLabelConfigurator.create());
		list.add(LinkToMessageConfigurator.create());

		tToolSection nodeToolSection = new tToolSection("Nodes");
		list.add(nodeToolSection);
		nodeToolSection.addChildrens(LayerHolderConfiguration.getTools());
		nodeToolSection.addChildrens(ButtonConfigurator.getTools());
		nodeToolSection.addChildrens(CheckBoxConfigurator.getTools());
		nodeToolSection.addChildrens(DateConfigurator.getTools());
		nodeToolSection.addChildrens(DropDownSelectionConfigurator.getTools());
		nodeToolSection.addChildrens(ImageConfigurator.getTools());
		nodeToolSection.addChildrens(InputTextConfigurator.getTools());
		nodeToolSection.addChildrens(OutputTextConfigurator.getTools());
		nodeToolSection.addChildrens(PasswordConfigurator.getTools());
		nodeToolSection.addChildrens(LabelConfigurator.getTools());
		nodeToolSection.addChildrens(TableConfigurator.getTools());
		nodeToolSection.addChildrens(ColumnConfigurator.getTools());
		nodeToolSection.addChildrens(TreeConfigurator.getTools());
		nodeToolSection.addChildrens(MenuConfigurator.getTools());
		nodeToolSection.addChildrens(MessageElementConfigurator.getTools());

		tToolSection edgeToolSection = new tToolSection("Connections");
		list.add(edgeToolSection);

		edgeToolSection.addChildrens(LinkToLabelConfigurator.getTools());
		edgeToolSection.addChildrens(LinkToMessageConfigurator.getTools());

		ObjectWrapper wrapper = (ObjectWrapper) tRoot.context.get("LayerHolder" + tContainer.class.getName());

		ContainerMapping mapper = (ContainerMapping) wrapper.getWrapedObject();
		if (mapper == null) {
			throw new RuntimeException("Tool mapping is null");
		}
		mapper.getReusedContainerMappings().add(mapper);

		wrapper = (ObjectWrapper) tRoot.context.get("LayerHolderinTableColumn" + tContainer.class.getName());

		mapper = (ContainerMapping) wrapper.getWrapedObject();
		if (mapper == null) {
			throw new RuntimeException("Tool mapping is null");
		}
		mapper.getReusedContainerMappings().add(mapper);

		wrapper = (ObjectWrapper) tRoot.context.get("LayerHolderinTreeColumn" + tContainer.class.getName());

		mapper = (ContainerMapping) wrapper.getWrapedObject();
		if (mapper == null) {
			throw new RuntimeException("Tool mapping is null");
		}
		mapper.getReusedContainerMappings().add(mapper);

		return list;
	}
}
