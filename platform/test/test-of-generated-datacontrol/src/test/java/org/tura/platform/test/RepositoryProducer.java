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
package org.tura.platform.test;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Priority;
import javax.enterprise.context.spi.CreationalContext;
import javax.enterprise.inject.Alternative;
import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.Bean;
import javax.enterprise.inject.spi.BeanManager;
import javax.enterprise.inject.spi.CDI;
import javax.enterprise.inject.spi.InjectionPoint;
import javax.inject.Inject;

import org.tura.platform.repository.cdi.RepositoryExtension;
import org.tura.platform.repository.core.DataProvider;
import org.tura.platform.repository.core.ExtendedQuery;
import org.tura.platform.repository.core.Repository;
import org.tura.platform.repository.core.Triggers;


@Alternative
@Priority(0)
public class RepositoryProducer {
	
	@Inject
	private RepositoryExtension repositoryExtension;
	
	@Inject
	private LocalTransactionRepository repository;
	
	
    @Produces
	public Repository getRepository(InjectionPoint injectionPoint) {

		for ( DataProvider provider : getDataProviders()){
			provider.setRepository(repository);
			provider.init();

			for (Triggers triggers: getQueryTriggers()) {
				provider.setTriggers(triggers);
			}
			
			for (ExtendedQuery query: getExtendedQuery()) {
				provider.setExtendedQuery(query);
			}
		}
		return repository;
	}

    
	private  List<DataProvider> getDataProviders() {

		ArrayList<DataProvider> array = new ArrayList<>();

		for (Bean<?> bean : repositoryExtension.getDataProviderBeans()) {
			BeanManager bm = CDI.current().getBeanManager();

			CreationalContext<?> ctx = bm.createCreationalContext(bean);
			DataProvider provider = (DataProvider) bm.getReference(bean, DataProvider.class, ctx);

			array.add(provider);
		}

		return array;
	}

	
	private  List<ExtendedQuery> getExtendedQuery() {

		ArrayList<ExtendedQuery> array = new ArrayList<>();

		for (Bean<?> bean : repositoryExtension.getCustomQueryBeans()) {
			BeanManager bm = CDI.current().getBeanManager();

			CreationalContext<?> ctx = bm.createCreationalContext(bean);
			ExtendedQuery provider = (ExtendedQuery) bm.getReference(bean, ExtendedQuery.class, ctx);

			array.add(provider);
		}

		return array;
	}
	

	private  List<Triggers> getQueryTriggers() {

		ArrayList<Triggers> array = new ArrayList<>();

		for (Bean<?> bean : repositoryExtension.getRepositoryTriggersBeans()) {
			BeanManager bm = CDI.current().getBeanManager();

			CreationalContext<?> ctx = bm.createCreationalContext(bean);
			Triggers provider = (Triggers) bm.getReference(bean, Triggers.class, ctx);

			array.add(provider);
		}

		return array;
	}
	
	
	
}
