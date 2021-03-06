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
package org.tura.platform.primefaces.menu;

import java.util.ArrayList;

import javax.enterprise.context.spi.CreationalContext;
import javax.enterprise.inject.spi.Bean;
import javax.enterprise.inject.spi.BeanManager;
import javax.enterprise.inject.spi.CDI;

import org.primefaces.model.menu.MenuElement;
import org.tura.platform.datacontrol.ELResolver;
import org.tura.platform.datacontrol.commons.TuraException;

public class FormsExtensionPointResolver {

	@SuppressWarnings({ "unchecked" })
	public static ArrayList<MenuElement> find(String application,String uipackage, String form, String menu, ELResolver elResolver) throws TuraException {
		
		String path =  application + "." + uipackage + "."+ form +"." +menu;
		
		BeanManager bm = CDI.current().getBeanManager();

		Bean<MenuExtension> bean = (Bean<MenuExtension>) bm.getBeans(MenuExtension.class).iterator().next();
		CreationalContext<MenuExtension> ctx = bm.createCreationalContext(bean);
		MenuExtension registry = (MenuExtension) bm.getReference(bean, MenuExtension.class, ctx);
		
		AbsractMenuProvider m =  registry.getMenu(path);

		return (ArrayList<MenuElement>) m.getMenu(elResolver);
	}

}
