/**
 * Tura - application generation platform
 *
 * Copyright (c) 2012 - 2017, Arseniy Isakov
 *
 * This project includes software developed by Arseniy Isakov
 * http://sourceforge.net/p/tura/wiki/Home/
 *
 * Licensed under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.tura.example.ui.hrcontroller.actions;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.faces.component.EditableValueHolder;
import javax.faces.component.UIComponent;
import javax.faces.component.visit.VisitContext;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.inject.Inject;
import javax.inject.Named;

import org.tura.example.ui.hrmanager.hrcontroller.datacontrol.IBeanFactory;
import org.tura.platform.datacontrol.CommandStack;
import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.datacontrol.ELResolver;
import org.tura.platform.datacontrol.IDataControl;
import org.tura.platform.datacontrol.TreeDataControl;
import org.tura.platform.datacontrol.command.base.CommandStackProvider;
import org.tura.platform.datacontrol.commons.Constants;
import org.tura.platform.datacontrol.commons.TuraException;
import org.tura.platform.hr.objects.serialization.Company;
import org.tura.platform.hr.objects.serialization.ProxyRepository;
import org.tura.platform.primefaces.EditableValueHoldersVisitCallback;
import org.tura.platform.primefaces.lib.EventAccessor;
import org.tura.platform.primefaces.model.ViewModel;
import org.tura.platform.repository.core.ObjectControl;
import org.tura.platform.repository.core.Repository;

public class Actions implements EventAccessor {
	private ActionEvent event;

	private transient Logger logger = Logger.getLogger(Actions.class.getName());

	@Inject
	ELResolver elResolver;

	@Inject
	@Named("hrmanager.hrcontroller")
	CommandStack commandStack;

	@Inject
	Repository repository;

	@SuppressWarnings("rawtypes")
	public void openCompanyDetailsPopup() {
		try {
			Object[] row = (Object[]) event.getComponent().getAttributes().get("param1");

			DataControl dc = (DataControl) elResolver
					.getValue("#{beanFactoryHrManagerHRController.popupCompanyDCProvider}");

			IBeanFactory bf = (IBeanFactory) elResolver.getValue("#{beanFactoryHrManagerHRController}");
			bf.setCmpId(((Company) (row[2])).getObjId());
			dc.forceRefresh();

			dc.getCommandStack().savePoint();

		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}
	}

	@SuppressWarnings("rawtypes")
	public void createCompanyPopup() {
		try {

			DataControl dc = (DataControl) elResolver
					.getValue("#{beanFactoryHrManagerHRController.popupCompanyDCProvider}");

			dc.getCommandStack().savePoint();
			dc.islolate();

			IBeanFactory bf = (IBeanFactory) elResolver.getValue("#{beanFactoryHrManagerHRController}");

			Company cmp = (Company) dc.createObject();

			bf.setCmpId(cmp.getObjId());

		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}

	}

	public void saveApplication() {
		try {
			CommandStackProvider sp = new CommandStackProvider();
			sp.setCommandStack(commandStack);

			ProxyRepository proxyRepository = new ProxyRepository(repository, sp);

			proxyRepository.applyChanges(null);
		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}
	}

	public void rallbackApplication() {
		try {
			commandStack.rallbackCommand();
		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}
	}

	public void createRow(IDataControl datacontrol) {
	}

	public void createChildRow(IDataControl datacontrol) {
		try {
			TreeDataControl tdc = (TreeDataControl) datacontrol;
			ObjectControl w = (ObjectControl) tdc.getCurrentObject();
			DataControl<?> dc = (DataControl<?>) w.getAttributes().get(Constants.DATA_CONTROL);
			String rel = dc.getRelationsName().iterator().next();
			if (rel != null)
				tdc.createChildObject(rel);
		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}
	}

	@SuppressWarnings("rawtypes")
	public void applyChanges() {
		DataControl dc = (DataControl) elResolver
				.getValue("#{beanFactoryHrManagerHRController.popupCompanyDCProvider}");
		try {
			dc.flush();
		} catch (TuraException e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}
	}

	@SuppressWarnings("rawtypes")
	public void rallbackChanges() {

		try {
			DataControl dc = (DataControl) elResolver
					.getValue("#{beanFactoryHrManagerHRController.popupCompanyDCProvider}");
			dc.getCommandStack().rallbackSavePoint();

			UIComponent target = ViewModel.findComponent(IBeanFactory.POPUPCOMPAMYDETAILS);

			EditableValueHoldersVisitCallback visitCallback = new EditableValueHoldersVisitCallback();
			target.visitTree(VisitContext.createVisitContext(FacesContext.getCurrentInstance()), visitCallback);

			// iterate over found sub-components and reset their values
			List<EditableValueHolder> editableValueHolders = visitCallback.getEditableValueHolders();
			for (EditableValueHolder editableValueHolder : editableValueHolders) {
				editableValueHolder.resetValue();
			}
		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}

	}

	@Override
	public void setEvent(ActionEvent event) {
		this.event = event;

	}

	@SuppressWarnings("rawtypes")
	public boolean empDetailsEnable() {
		try {
			DataControl dc = (DataControl) elResolver.getValue("#{beanFactoryHrManagerHRController.employee}");

			dc.getCurrentObject();
			if (dc.getScroller().size() != 0)
				return false;

		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}
		return true;

	}
}
