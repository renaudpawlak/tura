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
package org.tura.platform.repository.cdi.rest;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MultivaluedHashMap;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;

import org.tura.platform.datacontrol.commons.OrderCriteria;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.repository.cdi.Repo;
import org.tura.platform.repository.core.DataProvider;
import org.tura.platform.repository.core.Repository;
import org.tura.platform.repository.core.RepositoryException;
import org.tura.platform.repository.core.SearchRequest;
import org.tura.platform.repository.core.SearchResult;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.module.jaxb.JaxbAnnotationIntrospector;



@Path("repository")
public class RestRepository {

	@Inject
	@Repo("repository")
	private Repository repository;

	public void addProvider(DataProvider provider, String objectClass) {

	}

	public void addCommand(DataProvider provider, String dataClass) {

	}

	@GET
	@Path("create/{id}")
	public Response create(@PathParam("id") String objectClass) {
		try {
			Object obj = repository.create(objectClass);
			return Response.status(Response.Status.OK).entity(obj).build();
		} catch (Exception e) {
			return Response.status(Response.Status.BAD_REQUEST).entity(e.getMessage()).build();
		}
	}

	@POST
	@Path("find")
	public Response find(SearchRequest  request) {
		try {
			for( SearchCriteria  sc : request.getSearch() ) {
				Class<?> clazz = Class.forName(sc.getClassName());
				Constructor<?> constractor = clazz.getConstructor(String.class);
				sc.setValue(  constractor.newInstance(sc.getValue()));
			}
			
			SearchResult result = repository.find(request.getSearch(), request.getOrder(), request.getStartIndex(), request.getEndIndex(), request.getObjectClass());

			ObjectMapper mapper = new ObjectMapper();
			AnnotationIntrospector introspector = new JaxbAnnotationIntrospector();
			mapper.setAnnotationIntrospector(introspector);

			MultivaluedMap<String, String> formData = new MultivaluedHashMap<String, String>();
			formData.add("size",  new Long(result.getNumberOfRows()).toString());

			int index = 0;
			for (Object o : result.getSearchResult()) {
				formData.add(new Integer(index).toString()+"_type", o.getClass().getName());
				formData.add(new Integer(index).toString(), mapper.writeValueAsString(o));
				index++;
			}
			
			return Response.status(Response.Status.OK).entity(formData).build();
		} catch (Exception e) {
			return Response.status(Response.Status.BAD_REQUEST).entity(e.getMessage()).build();
		}
	}

	@POST
	@Path("insert")
	public Response insert(Object obj, String objectClass) throws RepositoryException {
		return Response.status(Response.Status.BAD_REQUEST).entity("UnsupportedOperationException").build();
	}

	@POST
	@Path("remove")
	public Response remove(Object obj, String objectClass) throws RepositoryException {
		return Response.status(Response.Status.BAD_REQUEST).entity("UnsupportedOperationException").build();
	}

	@POST
	@Path("applyChanges")
	public Response applyChanges(MultivaluedMap<String,String> map) {
		try {
			ObjectMapper mapper = new ObjectMapper();
		    AnnotationIntrospector introspector = new JaxbAnnotationIntrospector();
		    mapper.setAnnotationIntrospector(introspector);
		    ArrayList<Object> list = new ArrayList<>();
		    
			for (int i  = 0; ;i++){
				String key = new Integer(i).toString();
				if (map.get(key) == null){
					break;
				}
				String className = map.get(key+"_type").get(0);
				Class<?> clazz = Class.forName(className);
				list.add( mapper.readValue(map.get(key).get(0),clazz));
			}

			repository.applyChanges(list);
			return Response.status(Response.Status.OK).build();
		} catch (Exception e) {
			return Response.status(Response.Status.BAD_REQUEST).entity(e.getMessage()).build();
		}
	}
}
