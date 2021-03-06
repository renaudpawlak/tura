package org.tura.sirius.diagram.producer.tura.config.items.form;

import java.util.List;
import org.eclipse.sirius.diagram.ContainerLayout;
import org.eclipse.sirius.diagram.description.ConditionalContainerStyleDescription;
import org.eclipse.sirius.diagram.description.style.ContainerStyleDescription;
import org.eclipse.sirius.diagram.description.style.FlatContainerStyleDescription;
import org.eclipse.sirius.diagram.description.style.StyleFactory;
import org.eclipse.sirius.tools.api.ui.color.EnvironmentSystemColorFactory;
import org.eclipse.sirius.viewpoint.description.SystemColor;
import org.tura.sirius.dsl.config.ContainerConfigurator;
import org.tura.sirius.dsl.diagram.tContainer;

public class TableColumnsConfigurator implements ContainerConfigurator {
	private String suffix = "";

	public TableColumnsConfigurator(String suffix) {
		this.suffix = suffix;
	}

	public TableColumnsConfigurator() {
	}

	public static tContainer create(String suffix) {
		return new tContainer(new TableColumnsConfigurator(suffix));
	}

	public static tContainer create() {
		return new tContainer(new TableColumnsConfigurator());
	}

	public String getName() {
		return "TableColumns" + this.suffix;
	}

	public String getCandidates() {
		return "var:self";
	}

	public String getDomainClass() {
		return "form.Table";
	}

	public ContainerStyleDescription getStyle() {
		FlatContainerStyleDescription style = StyleFactory.eINSTANCE.createFlatContainerStyleDescription();
		style.setLabelExpression("TableColumns");
		style.setLabelSize(12);
		style.setShowIcon(false);
		style.setHideLabelByDefault(true);
		SystemColor foregroundColor = EnvironmentSystemColorFactory.getDefault().getSystemColorDescription("white");
		style.setForegroundColor(foregroundColor);
		style.setBorderSizeComputationExpression("1");

		return style;
	}

	public ContainerLayout getContainerLayout() {
		return ContainerLayout.FREE_FORM;
	}

	public List<ConditionalContainerStyleDescription> getConditionalStyle() {
		return null;
	}
}
