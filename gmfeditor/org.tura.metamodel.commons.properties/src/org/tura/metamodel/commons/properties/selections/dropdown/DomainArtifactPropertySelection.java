package org.tura.metamodel.commons.properties.selections.dropdown;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.validation.internal.modeled.model.validation.Constraint;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.ocl.OCL;
import org.eclipse.ocl.ecore.EcoreEnvironmentFactory;
import org.eclipse.ocl.expressions.OCLExpression;
import org.eclipse.ocl.helper.OCLHelper;
import org.tura.metamodel.commons.properties.selections.dropdown.impl.DomainDomainArtifactArtifactRef;

import domain.DomainPackage;

public class DomainArtifactPropertySelection extends
		AbstractEnumerationPropertySection {

	protected String getLabelText() {
		return "Domain artifact name";//$NON-NLS-1$
	}

	protected void init() {
		dropDownDataSupplier = new DomainDomainArtifactArtifactRef();
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	protected HashMap<String, Object> getEnumerationFeatureValues() {

		if (values == null) {
			values = new HashMap<String, Object>();
			Diagram diagram = (Diagram) editPart.getRoot().getContents()
					.getModel();
			try {
				OCL ocl = OCL.newInstance(EcoreEnvironmentFactory.INSTANCE);
				OCLHelper<EClassifier, ?, ?, Constraint> helper = ocl
						.createOCLHelper();
				helper.setContext(DomainPackage.eINSTANCE
						.getEClassifier("Types"));

				EObject types = (EObject) diagram.getElement();

				OCLExpression<EClassifier> query = helper
						.createQuery("domain::DomainArtifact.allInstances()->asOrderedSet()->select(r|r.oclIsKindOf(domain::DomainArtifact) and  r.oclAsType(domain::DomainArtifact).name <> null)");

				Collection<domain.DomainArtifact> map = (Collection<domain.DomainArtifact>) ocl
						.evaluate(types, query);

				for (Iterator<domain.DomainArtifact> i = map.iterator(); i
						.hasNext();) {
					domain.DomainArtifact p = i.next();
					values.put(p.getName(), p);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		return values;
	}

	@Override
	public EObject getModel() {
		return getEObject();
	}

	@Override
	public EObject getModel(EStructuralFeature feature) {
		return getEObject();
	}
}