package org.tura.platform.hr.controls;

import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.cfg.Configuration;
import org.tura.platform.datacontrol.CommandStack;

@Named("MasterDetail")
public class CDICommandStack extends CommandStack{

	
	private EntityManager em;
	
	public CDICommandStack(){
		Configuration config = new Configuration();
		config.addResource("META-INF/persistence.xml");
		EntityManagerFactory emf = Persistence.createEntityManagerFactory(
				"MasterDetail", config.getProperties());
		em = emf.createEntityManager();
		
	}
	
	
	@Override
	public void beginTransaction() {
		em.getTransaction().begin();

	}

	@Override
	public void commitTransaction() {
		em.getTransaction().commit();

	}

	@Override
	public void rallbackTransaction() {
		em.getTransaction().rollback();
	}

}
