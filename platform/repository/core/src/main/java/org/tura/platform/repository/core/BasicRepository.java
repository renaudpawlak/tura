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
package org.tura.platform.repository.core;

import java.util.HashMap;
import java.util.List;

import org.tura.platform.datacontrol.commons.OrderCriteria;
import org.tura.platform.datacontrol.commons.SearchCriteria;

public class BasicRepository implements Repository{

	private HashMap<String, DataProvider> providerTable = new HashMap<>();
	private HashMap <String,DataProvider> cmdHash = new HashMap<>(); 

	public void addProvider(DataProvider provider, String objectClass) {
		providerTable.put(objectClass, provider);
	}

	public void addCommand(DataProvider provider, String dataClass) {
		cmdHash.put(dataClass, provider);
	}

	private DataProvider findprovider(String objectClass) throws RepositoryException {
		DataProvider provider = providerTable.get(objectClass);
		if (provider == null)
			throw new RepositoryException( "No provider for "+objectClass);
		return provider;
	}

	public Object create(String objectClass) throws RepositoryException {
		DataProvider provider = findprovider(objectClass);
		return provider.create(objectClass);
	}

	public SearchResult find(List<SearchCriteria> searchCriteria, List<OrderCriteria> orderCriteria, Integer startIndex,
			Integer endIndex, String objectClass) throws RepositoryException {
		DataProvider provider = findprovider(objectClass);
		return provider.find(searchCriteria, orderCriteria, startIndex, endIndex, objectClass);
	}

    @SuppressWarnings("rawtypes")
	public void applyChanges(List changes) throws RepositoryException{
    	try{
	    	for (Object change:changes ){
	    		DataProvider provider = cmdHash.get(change.getClass().getName());
	    		Command cmd = provider.getCommand(change.getClass().getName());
	    		cmd.execute(change);
	    	}
    	}catch(Exception e){
    		throw new RepositoryException(e);
    	}
    }

	@Override
	public void insert(Object obj, String objectClass) {
		throw new UnsupportedOperationException();
		
	}

	@Override
	public void remove(Object obj, String objectClass) {
		throw new UnsupportedOperationException();
		
	}

}
