package org.tura.sirius.diagram.producer.tura;

import java.util.ArrayList;
import java.util.List;

import org.tura.sirius.diagram.producer.tura.config.items.permission.Group2GroupConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.permission.Group2RoleConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.permission.GroupConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.permission.RoleConfigurator;
import org.tura.sirius.dsl.diagram.tEdge;
import org.tura.sirius.dsl.diagram.tNode;
import org.tura.sirius.dsl.diagram.tToolSection;

public class PermissionsDiagram {
	public List<Object> getChildrens() {
		ArrayList<Object> list = new ArrayList<Object>();

		tNode cnt = RoleConfigurator.create();
		list.add(cnt);

		cnt = GroupConfigurator.create();
		list.add(cnt);

		tEdge e = Group2RoleConfigurator.create();
		list.add(e);

		e = Group2GroupConfigurator.create();
		list.add(e);

		tToolSection nodeToolSection = new tToolSection("Nodes");
		list.add(nodeToolSection);
		nodeToolSection.addChildrens(RoleConfigurator.getTools());
		nodeToolSection.addChildrens(GroupConfigurator.getTools());

		tToolSection edgeToolSection = new tToolSection("Connections");
		edgeToolSection.addChildrens(Group2RoleConfigurator.getTools());
		edgeToolSection.addChildrens(Group2GroupConfigurator.getTools());
		list.add(edgeToolSection);

		return list;
	}
}
