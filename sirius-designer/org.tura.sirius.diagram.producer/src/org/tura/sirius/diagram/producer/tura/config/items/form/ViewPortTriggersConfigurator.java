package org.tura.sirius.diagram.producer.tura.config.items.form;

import java.util.List;
import org.eclipse.sirius.diagram.ContainerLayout;
import org.eclipse.sirius.diagram.description.ConditionalContainerStyleDescription;
import org.eclipse.sirius.diagram.description.style.ContainerStyleDescription;
import org.eclipse.sirius.diagram.description.style.FlatContainerStyleDescription;
import org.eclipse.sirius.diagram.description.style.StyleFactory;
import org.eclipse.sirius.tools.api.ui.color.EnvironmentSystemColorFactory;
import org.eclipse.sirius.viewpoint.description.SystemColor;
import org.tura.sirius.diagram.producer.tura.ViewsDiagram;
import org.tura.sirius.dsl.config.ContainerConfigurator;
import org.tura.sirius.dsl.diagram.tContainer;

public class ViewPortTriggersConfigurator implements ContainerConfigurator {
	public static tContainer create() {
		return new tContainer(new ViewPortTriggersConfigurator());
	}

	public String getName() {
		return "ViewPortTriggers" + ViewsDiagram.ID;
	}

	public String getCandidates() {
		return "var:self";
	}

	public String getDomainClass() {
		return "form.ViewPort";
	}

	public ContainerStyleDescription getStyle() {
		FlatContainerStyleDescription style = StyleFactory.eINSTANCE.createFlatContainerStyleDescription();
		style.setLabelExpression("ViewPortTriggers");
		style.setLabelSize(12);
		style.setShowIcon(false);
		style.setHideLabelByDefault(true);
		SystemColor foregroundColor = EnvironmentSystemColorFactory.getDefault()
				.getSystemColorDescription("light_green");
		style.setForegroundColor(foregroundColor);
		style.setBorderSizeComputationExpression("1");

		return style;
	}

	public ContainerLayout getContainerLayout() {
		return ContainerLayout.LIST;
	}

	public List<ConditionalContainerStyleDescription> getConditionalStyle() {
		return null;
	}
}
