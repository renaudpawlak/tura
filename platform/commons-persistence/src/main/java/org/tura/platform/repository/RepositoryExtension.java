/**
 * Tura - application generation platform
 *
 * Copyright (c) 2012 - 2015, Arseniy Isakov
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
package org.tura.platform.repository;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.spi.CreationalContext;
import javax.enterprise.event.Observes;
import javax.enterprise.inject.spi.Bean;
import javax.enterprise.inject.spi.BeanManager;
import javax.enterprise.inject.spi.CDI;
import javax.enterprise.inject.spi.Extension;
import javax.enterprise.inject.spi.ProcessBean;

@ApplicationScoped
public class RepositoryExtension implements Extension {

	private ArrayList<Bean<?>> dataProviderBeans = new ArrayList<>();

	public <T> void collect(@Observes ProcessBean<T> event) {
		if (event.getAnnotated().isAnnotationPresent(ObjectProvider.class)) {
			dataProviderBeans.add(event.getBean());
		}
	}

	public List<DataProvider> getDataProviders() {

		ArrayList<DataProvider> array = new ArrayList<>();

		for (Bean<?> bean : dataProviderBeans) {
			BeanManager bm = CDI.current().getBeanManager();

			CreationalContext<?> ctx = bm.createCreationalContext(bean);
			DataProvider provider = (DataProvider) bm.getReference(bean, DataProvider.class, ctx);

			array.add(provider);
		}

		return array;
	}
}
