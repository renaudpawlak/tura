package org.tura.sirius.diagram.producer.tura.config.items.artifact;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.sirius.tools.api.ui.color.EnvironmentSystemColorFactory;
import org.eclipse.sirius.tree.description.DescriptionFactory;
import org.eclipse.sirius.tree.description.TreeItemEditionTool;
import org.eclipse.sirius.tree.description.TreeItemStyleDescription;
import org.eclipse.sirius.tree.description.TreeItemTool;
import org.eclipse.sirius.viewpoint.description.SystemColor;
import org.eclipse.sirius.viewpoint.description.tool.ChangeContext;
import org.eclipse.sirius.viewpoint.description.tool.SetValue;
import org.eclipse.sirius.viewpoint.description.tool.ToolFactory;
import org.tura.sirius.dsl.config.TreeItemConfigurator;
import org.tura.sirius.dsl.treediagram.ToolHelper;
import org.tura.sirius.dsl.treediagram.tTreeItem;

public class ConfigHashConfigurator implements TreeItemConfigurator {
	public static tTreeItem create() {
		return new tTreeItem(new ConfigHashConfigurator());
	}

	public String getDomainClass() {
		return "artifact.ConfigHash";
	}

	public String getCandidates() {
		return "feature:configHashes";
	}

	public String getName() {
		return "Configuration Set";
	}

	public TreeItemStyleDescription getStyle() {
		SystemColor backgroundColor = EnvironmentSystemColorFactory.getDefault().getSystemColorDescription("white");
		SystemColor labelColor = EnvironmentSystemColorFactory.getDefault().getSystemColorDescription("dark_blue");
		TreeItemStyleDescription style = DescriptionFactory.eINSTANCE.createTreeItemStyleDescription();
		style.setLabelSize(12);
		style.setLabelExpression("feature:name");
		style.setLabelColor(labelColor);
		style.setBackgroundColor(backgroundColor);

		return style;
	}

	public List<TreeItemTool> getTools() {
		ArrayList<TreeItemTool> tools = new ArrayList<TreeItemTool>();
		tools.add(getDirectEditLabel());
		return tools;
	}

	private static TreeItemTool getDirectEditLabel() {
		TreeItemEditionTool tool = DescriptionFactory.eINSTANCE.createTreeItemEditionTool();
		tool.setName("Technology edit label");

		tool.setMask(ToolHelper.getEditMaskVariables("{0}"));
		tool.setElement(ToolHelper.getElementDropVariable("element"));
		tool.setRoot(ToolHelper.getElementDropVariable("root"));

		ChangeContext c1 = ToolFactory.eINSTANCE.createChangeContext();
		c1.setBrowseExpression("var:element");
		tool.setFirstModelOperation(c1);

		SetValue c2 = ToolFactory.eINSTANCE.createSetValue();
		c2.setFeatureName("name");
		c2.setValueExpression("var:0");
		c1.getSubModelOperations().add(c2);

		return tool;
	}
}
