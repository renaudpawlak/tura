package org.tura.sirius.diagram.producer.tura.config.items.form;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.sirius.diagram.ContainerLayout;
import org.eclipse.sirius.diagram.description.ConditionalContainerStyleDescription;
import org.eclipse.sirius.diagram.description.style.ContainerStyleDescription;
import org.eclipse.sirius.diagram.description.style.FlatContainerStyleDescription;
import org.eclipse.sirius.diagram.description.style.StyleFactory;
import org.eclipse.sirius.tools.api.ui.color.EnvironmentSystemColorFactory;
import org.eclipse.sirius.viewpoint.description.SystemColor;
import org.eclipse.sirius.viewpoint.description.tool.ToolEntry;
import org.tura.sirius.dsl.config.ContainerConfigurator;
import org.tura.sirius.dsl.diagram.tContainer;

public class LayerHolderinTreeColumn implements ContainerConfigurator {
	public static tContainer create() {
		return new tContainer(new LayerHolderinTreeColumn());
	}

	public String getName() {
		return "LayerHolderinTreeColumn";
	}

	public String getCandidates() {
		return "service:getCandidates";
	}

	public String getDomainClass() {
		return "form.LayerHolder";
	}

	public ContainerStyleDescription getStyle() {
		FlatContainerStyleDescription style = StyleFactory.eINSTANCE.createFlatContainerStyleDescription();
		style.setLabelExpression("aql:self.name");
		style.setLabelSize(12);
		style.setBorderSizeComputationExpression("1");
		style.setShowIcon(true);
		style.setHideLabelByDefault(true);
		SystemColor foregroundColor = EnvironmentSystemColorFactory.getDefault().getSystemColorDescription("white");
		style.setForegroundColor(foregroundColor);
		style.setIconPath("/org.tura.metamodel.sirius.diagram.designer/icons/layerholder.png");

		return style;
	}

	public ContainerLayout getContainerLayout() {
		return ContainerLayout.FREE_FORM;
	}

	public static List<ToolEntry> getTools() {
		List<ToolEntry> list = new ArrayList<ToolEntry>();

		return list;
	}

	public List<ConditionalContainerStyleDescription> getConditionalStyle() {
		return null;
	}
}
