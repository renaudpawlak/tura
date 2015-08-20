/*******************************************************************************
 * Tura - application generation platform
 *
 * Copyright (c) 2012, 2015, Arseniy Isakov
 *  
 * This project includes software developed by Arseniy Isakov
 * http://sourceforge.net/p/tura/wiki/Home/
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/

/*
 * 
 */
package domain.diagram.part;

import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

import domain.diagram.providers.DomainElementTypes;

/**
 * @generated
 */
public class DomainPaletteFactory {

	/**
	* @generated
	*/
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createObjects1Group());
	}

	/**
	* Creates "Objects" palette tool group
	* @generated
	*/
	private PaletteContainer createObjects1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Objects1Group_title);
		paletteContainer.setId("createObjects1Group"); //$NON-NLS-1$
		paletteContainer.add(createContinuousIintegration1CreationTool());
		paletteContainer.add(createDomainApplication2CreationTool());
		paletteContainer.add(createDomainApplications3CreationTool());
		paletteContainer.add(createDomainArtifact4CreationTool());
		paletteContainer.add(createDomainArtifacts5CreationTool());
		paletteContainer.add(createDomainTypes6CreationTool());
		paletteContainer.add(createEJBService7CreationTool());
		paletteContainer.add(createJPAService8CreationTool());
		paletteContainer.add(createORMEntity9CreationTool());
		return paletteContainer;
	}

	/**
	* @generated
	*/
	private ToolEntry createContinuousIintegration1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.ContinuousIintegration1CreationTool_title,
				Messages.ContinuousIintegration1CreationTool_desc,
				Collections.singletonList(DomainElementTypes.ContinuousIintegration_503006));
		entry.setId("createContinuousIintegration1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes.getImageDescriptor(DomainElementTypes.ContinuousIintegration_503006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createDomainApplication2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.DomainApplication2CreationTool_title,
				Messages.DomainApplication2CreationTool_desc,
				Collections.singletonList(DomainElementTypes.DomainApplication_503001));
		entry.setId("createDomainApplication2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes.getImageDescriptor(DomainElementTypes.DomainApplication_503001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createDomainApplications3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.DomainApplications3CreationTool_title,
				Messages.DomainApplications3CreationTool_desc,
				Collections.singletonList(DomainElementTypes.DomainApplications_502003));
		entry.setId("createDomainApplications3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes.getImageDescriptor(DomainElementTypes.DomainApplications_502003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createDomainArtifact4CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.DomainArtifact4CreationTool_title,
				Messages.DomainArtifact4CreationTool_desc,
				Collections.singletonList(DomainElementTypes.DomainArtifact_503002));
		entry.setId("createDomainArtifact4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes.getImageDescriptor(DomainElementTypes.DomainArtifact_503002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createDomainArtifacts5CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.DomainArtifacts5CreationTool_title,
				Messages.DomainArtifacts5CreationTool_desc,
				Collections.singletonList(DomainElementTypes.DomainArtifacts_502001));
		entry.setId("createDomainArtifacts5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes.getImageDescriptor(DomainElementTypes.DomainArtifacts_502001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createDomainTypes6CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.DomainTypes6CreationTool_title,
				Messages.DomainTypes6CreationTool_desc,
				Collections.singletonList(DomainElementTypes.DomainTypes_502002));
		entry.setId("createDomainTypes6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes.getImageDescriptor(DomainElementTypes.DomainTypes_502002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createEJBService7CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.EJBService7CreationTool_title,
				Messages.EJBService7CreationTool_desc, Collections.singletonList(DomainElementTypes.EJBService_503005));
		entry.setId("createEJBService7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes.getImageDescriptor(DomainElementTypes.EJBService_503005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createJPAService8CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.JPAService8CreationTool_title,
				Messages.JPAService8CreationTool_desc, Collections.singletonList(DomainElementTypes.JPAService_503004));
		entry.setId("createJPAService8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes.getImageDescriptor(DomainElementTypes.JPAService_503004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createORMEntity9CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.ORMEntity9CreationTool_title,
				Messages.ORMEntity9CreationTool_desc, Collections.singletonList(DomainElementTypes.ORMEntity_503003));
		entry.setId("createORMEntity9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes.getImageDescriptor(DomainElementTypes.ORMEntity_503003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}