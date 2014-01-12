package org.tura.metamodel.populate.hr;

import java.util.HashMap;
import java.util.UUID;

import org.eclipse.emf.ecore.resource.Resource;
import org.tura.metamodel.commons.initdiagram.InitDiagram;

public class PopulateTypesMapping {

	
	public void execute(domain.Domain model, Resource resource) {
		
		domain.DomainApplication app = domain.DomainFactory.eINSTANCE.createDomainApplication();
		app.setName(Constants.HR_APPLICATION);
		app.setUid(UUID.randomUUID().toString());
		model.getDomainApplications().getApplications().add(app);
		
		domain.Application appl = InitDiagram.initApplicationDiagram(resource);
		app.setApplication(appl);

		domain.ApplicationMapper mapping = domain.DomainFactory.eINSTANCE
				.createApplicationMapper();
		mapping.setUid(UUID.randomUUID().toString());
		mapping.setName(Constants.HR_TYPE_MAPPER);
		resource.getContents().add(mapping);
		
		appl.getApplicationMappers().getMappers().add(mapping);
		
		domain.Mappers mps =  domain.DomainFactory.eINSTANCE.createMappers();
		mps.setUid(UUID.randomUUID().toString());
		mapping.setMapper(mps);
        resource.getContents().add(mps); 
        mapping.setMapper(mps);

        
		populateDepartmentsTypeMapping(mps,resource);
		populateEmployeesTypeMapping(mps,resource);
		
	}
	
	private void populateDepartmentsTypeMapping(domain.Mappers mps,Resource resource){

		HashMap<String, domain.TypeElement> typesHash = InitDiagram
				.getTypeElements(resource);

		
		domain.JavaMapper jm =  domain.DomainFactory.eINSTANCE.createJavaMapper();
		mps.getMappers().add(jm);
        jm.setPackageRef(typesHash.get(Constants.PACKAGE_HR + "_" + Constants.TYPE_DEPARTMENT)
				.getParent().getParent());
        jm.setTypeRef(typesHash.get(Constants.PACKAGE_HR + "_" + Constants.TYPE_DEPARTMENT));
        
        jm.setMappedToPackageName("org.elsoft.platform.hr.departments");
        jm.setMappedToClassName("DepartmentsDAO");
        jm.setGroupId("org.elsoft.platform.Manufacturing.BackOffice");
        jm.setArtifactId("Model-Manufacturing-BackOffice-HR-client");
        jm.setVersion("1.0");
        jm.setUiLayer(true);
        jm.setServiceLayer(false);
        
		jm =  domain.DomainFactory.eINSTANCE.createJavaMapper();
		mps.getMappers().add(jm);
        jm.setPackageRef(typesHash.get(Constants.PACKAGE_HR + "_" + Constants.TYPE_DEPARTMENT)
				.getParent().getParent());
        jm.setTypeRef(typesHash.get(Constants.PACKAGE_HR + "_" + Constants.TYPE_DEPARTMENT));
        jm.setMappedToPackageName("org.elsoft.platform.hr.objects");
        jm.setMappedToClassName("DepartmentsDAO");
        jm.setUiLayer(false);
        jm.setServiceLayer(true);
        
		jm =  domain.DomainFactory.eINSTANCE.createJavaMapper();
		mps.getMappers().add(jm);
        jm.setPackageRef(typesHash.get(Constants.PACKAGE_HR + "_" + Constants.TYPE_DEPARTMENTS_QUERY_SERVICE)
				.getParent().getParent());
        jm.setTypeRef(typesHash.get(Constants.PACKAGE_HR + "_" + Constants.TYPE_DEPARTMENTS_QUERY_SERVICE));
        jm.setMappedToPackageName("org.elsoft.platform.hr.departments.impl");
        jm.setMappedToClassName("DepartmentsService");
        jm.setGroupId("org.elsoft.platform.Manufacturing.BackOffice");
        jm.setArtifactId("Model-Manufacturing-BackOffice-HR-client");
        jm.setVersion("1.0");
        jm.setUiLayer(true);
        jm.setServiceLayer(false);
        
		jm =  domain.DomainFactory.eINSTANCE.createJavaMapper();
		mps.getMappers().add(jm);
        jm.setPackageRef(typesHash.get(Constants.PACKAGE_HR + "_" + Constants.TYPE_DEPARTMENTS_QUERY_SERVICE)
				.getParent().getParent());
        jm.setTypeRef(typesHash.get(Constants.PACKAGE_HR + "_" + Constants.TYPE_DEPARTMENTS_QUERY_SERVICE));
        jm.setMappedToPackageName("org.elsoft.platform.hr.services.impl");
        jm.setMappedToClassName("DepartmentsService");
        jm.setUiLayer(false);
        jm.setServiceLayer(true);

		jm =  domain.DomainFactory.eINSTANCE.createJavaMapper();
		mps.getMappers().add(jm);
        jm.setPackageRef(typesHash.get(Constants.PACKAGE_HR + "_" + Constants.TYPE_DEPARTMENTS_QUERY_SERVICE_REMOTE)
				.getParent().getParent());
        jm.setTypeRef(typesHash.get(Constants.PACKAGE_HR + "_" + Constants.TYPE_DEPARTMENTS_QUERY_SERVICE_REMOTE));
        jm.setMappedToPackageName("org.elsoft.platform.hr.services");
        jm.setMappedToClassName("DepartmentsServiceRemote");
        jm.setUiLayer(false);
        jm.setServiceLayer(true);

		jm =  domain.DomainFactory.eINSTANCE.createJavaMapper();
		mps.getMappers().add(jm);
        jm.setPackageRef(typesHash.get(Constants.PACKAGE_HR + "_" + Constants.TYPE_DEPARTMENTS_QUERY_SERVICE_LOCAL)
				.getParent().getParent());
        jm.setTypeRef(typesHash.get(Constants.PACKAGE_HR + "_" + Constants.TYPE_DEPARTMENTS_QUERY_SERVICE_LOCAL));
        jm.setMappedToPackageName("org.elsoft.platform.hr.services");
        jm.setMappedToClassName("DepartmentsServiceLocal");
        jm.setUiLayer(false);
        jm.setServiceLayer(true);
        
        
        jm =  domain.DomainFactory.eINSTANCE.createJavaMapper();
		mps.getMappers().add(jm);
        jm.setPackageRef(typesHash.get(Constants.PACKAGE_HR + "_" + Constants.TYPE_LIST_OF_DEPARTMENTS)
				.getParent().getParent());
        jm.setTypeRef(typesHash.get(Constants.PACKAGE_HR + "_" + Constants.TYPE_LIST_OF_DEPARTMENTS));
        jm.setMappedToPackageName("java.util");
        jm.setMappedToClassName("List<org.elsoft.platform.hr.objects.DepartmentsDAO>");
        jm.setUiLayer(true);
        jm.setServiceLayer(true);
        

		jm =  domain.DomainFactory.eINSTANCE.createJavaMapper();
		mps.getMappers().add(jm);
        jm.setPackageRef(typesHash.get(Constants.PACKAGE_HR + "_" + Constants.TYPE_SEARCH_CRITERIAS_FOR_DEPARTMENTS)
				.getParent().getParent());
        jm.setTypeRef(typesHash.get(Constants.PACKAGE_HR + "_" + Constants.TYPE_SEARCH_CRITERIAS_FOR_DEPARTMENTS));
        jm.setMappedToPackageName("java.util");
        jm.setMappedToClassName("List<org.elsoft.platform.SearchCriteria>");
        jm.setUiLayer(true);
        jm.setServiceLayer(true);
        
		jm =  domain.DomainFactory.eINSTANCE.createJavaMapper();
		mps.getMappers().add(jm);
        jm.setPackageRef(typesHash.get(Constants.PACKAGE_HR + "_" + Constants.TYPE_ORDERBY_CRITERIAS_FOR_DEPARTMENTS)
				.getParent().getParent());
        jm.setTypeRef(typesHash.get(Constants.PACKAGE_HR + "_" + Constants.TYPE_ORDERBY_CRITERIAS_FOR_DEPARTMENTS));
        jm.setMappedToPackageName("java.util");
        jm.setMappedToClassName("List<org.elsoft.platform.OrderCriteria>");
        jm.setUiLayer(true);
        jm.setServiceLayer(true);
        

	}
	
	private void populateEmployeesTypeMapping(domain.Mappers mps,Resource resource){

		HashMap<String, domain.TypeElement> typesHash = InitDiagram
				.getTypeElements(resource);
		
		domain.JavaMapper jm =  domain.DomainFactory.eINSTANCE.createJavaMapper();
		mps.getMappers().add(jm);
        jm.setPackageRef(typesHash.get(Constants.PACKAGE_HR + "_" + Constants.TYPE_EMPLOYEE)
  				.getParent().getParent());
        jm.setTypeRef(typesHash.get(Constants.PACKAGE_HR + "_" + Constants.TYPE_EMPLOYEE));
        jm.setMappedToPackageName("org.elsoft.platform.hr.employees");
        jm.setMappedToClassName("EmployeesDAO");
        jm.setGroupId("org.elsoft.platform.Manufacturing.BackOffice");
        jm.setArtifactId("Model-Manufacturing-BackOffice-HR-client");
        jm.setVersion("1.0");
        jm.setUiLayer(true);
        jm.setServiceLayer(false);

		jm =  domain.DomainFactory.eINSTANCE.createJavaMapper();
		mps.getMappers().add(jm);
        jm.setPackageRef(typesHash.get(InitDiagram.BASE_PACKAGE + "_BaseType")
  				.getParent().getParent());
        jm.setTypeRef(typesHash.get(InitDiagram.BASE_PACKAGE + "_BaseType"));

        jm.setMappedToPackageName("org.elsoft.platform.metamodel.objects");
        jm.setMappedToClassName("ELsoftObject");
        jm.setGroupId("org.elsoft.platform");
        jm.setArtifactId("commons-platform-datastructure");
        jm.setVersion("1.0");
        jm.setUiLayer(true);
        jm.setServiceLayer(true);       
        
		jm =  domain.DomainFactory.eINSTANCE.createJavaMapper();
		mps.getMappers().add(jm);
        jm.setPackageRef(typesHash.get(Constants.PACKAGE_HR + "_" + Constants.TYPE_EMPLOYEE)
  				.getParent().getParent());
        jm.setTypeRef(typesHash.get(Constants.PACKAGE_HR + "_" + Constants.TYPE_EMPLOYEE));
        jm.setMappedToPackageName("org.elsoft.platform.hr.objects");
        jm.setMappedToClassName("EmployeesDAO");
        jm.setUiLayer(false);
        jm.setServiceLayer(true);
        
		jm =  domain.DomainFactory.eINSTANCE.createJavaMapper();
		mps.getMappers().add(jm);
        jm.setPackageRef(typesHash.get(Constants.PACKAGE_HR + "_" + Constants.TYPE_EMPLOYEES_QUERY_SERVICE)
				.getParent().getParent());
        jm.setTypeRef(typesHash.get(Constants.PACKAGE_HR + "_" + Constants.TYPE_EMPLOYEES_QUERY_SERVICE));
        jm.setMappedToPackageName("org.elsoft.platform.hr.employees.impl");
        jm.setMappedToClassName("EmployeesService");
        jm.setGroupId("org.elsoft.platform.Manufacturing.BackOffice");
        jm.setArtifactId("Model-Manufacturing-BackOffice-HR-client");
        jm.setVersion("1.0");
        jm.setUiLayer(true);
        jm.setServiceLayer(false);
        
		jm =  domain.DomainFactory.eINSTANCE.createJavaMapper();
		mps.getMappers().add(jm);
        jm.setPackageRef(typesHash.get(Constants.PACKAGE_HR + "_" + Constants.TYPE_EMPLOYEES_QUERY_SERVICE)
				.getParent().getParent());
        jm.setTypeRef(typesHash.get(Constants.PACKAGE_HR + "_" + Constants.TYPE_EMPLOYEES_QUERY_SERVICE));
        jm.setMappedToPackageName("org.elsoft.platform.hr.services.impl");
        jm.setMappedToClassName("EmployeesService");
        jm.setUiLayer(false);
        jm.setServiceLayer(true);

		jm =  domain.DomainFactory.eINSTANCE.createJavaMapper();
		mps.getMappers().add(jm);
        jm.setPackageRef(typesHash.get(Constants.PACKAGE_HR + "_" + Constants.TYPE_EMPLOYEES_QUERY_SERVICE_REMOTE)
				.getParent().getParent());
        jm.setTypeRef(typesHash.get(Constants.PACKAGE_HR + "_" + Constants.TYPE_EMPLOYEES_QUERY_SERVICE_REMOTE));
        jm.setMappedToPackageName("org.elsoft.platform.hr.services");
        jm.setMappedToClassName("EmployeesServiceRemote");
        jm.setUiLayer(false);
        jm.setServiceLayer(true);
        
		jm =  domain.DomainFactory.eINSTANCE.createJavaMapper();
		mps.getMappers().add(jm);
        jm.setPackageRef(typesHash.get(Constants.PACKAGE_HR + "_" + Constants.TYPE_EMPLOYEES_QUERY_SERVICE_LOCAL)
				.getParent().getParent());
        jm.setTypeRef(typesHash.get(Constants.PACKAGE_HR + "_" + Constants.TYPE_EMPLOYEES_QUERY_SERVICE_LOCAL));
        jm.setMappedToPackageName("org.elsoft.platform.hr.services");
        jm.setMappedToClassName("EmployeesServiceLocal");
        jm.setUiLayer(false);
        jm.setServiceLayer(true);
        
        
		jm =  domain.DomainFactory.eINSTANCE.createJavaMapper();
		mps.getMappers().add(jm);
        jm.setPackageRef(typesHash.get(Constants.PACKAGE_HR + "_" + Constants.TYPE_LIST_OF_EMPLOYEES)
				.getParent().getParent());
        jm.setTypeRef(typesHash.get(Constants.PACKAGE_HR + "_" + Constants.TYPE_LIST_OF_EMPLOYEES));
        jm.setMappedToPackageName("java.util");
        jm.setMappedToClassName("List<org.elsoft.platform.hr.objects.EmployeesDAO>");
        jm.setUiLayer(true);
        jm.setServiceLayer(true);
        

		jm =  domain.DomainFactory.eINSTANCE.createJavaMapper();
		mps.getMappers().add(jm);
        jm.setPackageRef(typesHash.get(Constants.PACKAGE_HR + "_" + Constants.TYPE_SEARCH_CRITERIAS_FOR_EMPLOYEES)
				.getParent().getParent());
        jm.setTypeRef(typesHash.get(Constants.PACKAGE_HR + "_" + Constants.TYPE_SEARCH_CRITERIAS_FOR_EMPLOYEES));
        jm.setMappedToPackageName("java.util");
        jm.setMappedToClassName("List<org.elsoft.platform.SearchCriteria>");
        jm.setUiLayer(true);
        jm.setServiceLayer(true);
        
		jm =  domain.DomainFactory.eINSTANCE.createJavaMapper();
		mps.getMappers().add(jm);
        jm.setPackageRef(typesHash.get(Constants.PACKAGE_HR + "_" + Constants.TYPE_ORDERBY_CRITERIAS_FOR_EMPLOYEES)
				.getParent().getParent());
        jm.setTypeRef(typesHash.get(Constants.PACKAGE_HR + "_" + Constants.TYPE_ORDERBY_CRITERIAS_FOR_EMPLOYEES));
        jm.setMappedToPackageName("java.util");
        jm.setMappedToClassName("List<org.elsoft.platform.OrderCriteria>");
        jm.setUiLayer(true);
        jm.setServiceLayer(true);
        
	}
	
}
