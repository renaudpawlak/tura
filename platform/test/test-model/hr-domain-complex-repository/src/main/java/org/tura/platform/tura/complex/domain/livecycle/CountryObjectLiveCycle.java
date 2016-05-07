package org.tura.platform.tura.complex.domain.livecycle;

import java.util.List;

import org.elsoft.platform.hr.objects.complex.model.CountryObject;
import org.elsoft.platform.hr.objects.complex.model.StateObject;
import org.elsoft.platform.hr.objects.jpa.simple.model.CountryJPA;
import org.elsoft.platform.hr.objects.jpa.simple.model.StateJPA;
import org.tura.platform.object.model.DomainObject;
import org.tura.platform.object.persistence.PersistenceObject;
import org.tura.platform.services.JPAService;
import org.tura.platform.tura.complex.domain.provider.ComplexObjectTuraProvider;
import org.tura.platform.tura.complex.domain.provider.ObjectLiveCycle;

public class CountryObjectLiveCycle extends ObjectLiveCycle{

	public CountryObjectLiveCycle(JPAService service) {
		super(service);
	}


	public ObjectLiveCycle getLiveCycle() {
		return ((ComplexObjectTuraProvider)getProvider()).getObjectLiveCycle(StateObject.class.getName());
	}

	
	@Override
	public Object load(Object persistedObject) throws Exception {
        check(persistedObject,CountryJPA.class);
		DomainObject domainObject = loadObject(persistedObject, CountryObject.class);

		loadChildren(domainObject,getLiveCycle(), "stateObject", StateJPA.class);		
		return domainObject;
	}	
	

	@Override
	public void save(Object object) throws Exception {
        check(object,CountryObject.class);
        CountryObject domainObject = (CountryObject) object;
        
		saveObject(domainObject,CountryJPA.class);
		saveChildren(domainObject, getLiveCycle(), domainObject.getStateObject(), StateJPA.class,StateObject.class);

	}
	
	@Override
	public void remove(Object object) throws Exception {
        check(object,CountryObject.class);
        CountryObject domainObject = (CountryObject) object;

	   	@SuppressWarnings("rawtypes")
		List list = findChildren(domainObject, StateJPA.class);
 
    	if (list.size() != 0 ){
			for (Object obj : list){
				StateObject dObject = new StateObject();
				dObject.setObjId(((PersistenceObject)obj).getObjId());
				getLiveCycle().remove(dObject);
			}
	    }		
    	
		PersistenceObject persistedObject =  findObjectByDomainObject(domainObject, CountryJPA.class);		
		if (persistedObject != null)
		getService().remove(persistedObject);
	}
	
}
