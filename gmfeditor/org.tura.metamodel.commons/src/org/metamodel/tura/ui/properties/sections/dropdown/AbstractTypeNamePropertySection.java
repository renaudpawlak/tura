package org.metamodel.tura.ui.properties.sections.dropdown;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.validation.internal.modeled.model.validation.Constraint;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.ocl.OCL;
import org.eclipse.ocl.ecore.EcoreEnvironmentFactory;
import org.eclipse.ocl.expressions.OCLExpression;
import org.eclipse.ocl.helper.OCLHelper;
import org.metamodel.tura.ui.properties.sections.dropdown.impl.DomainOperationTypeRef;
import org.metamodel.tura.ui.properties.sections.dropdown.impl.DomainTypePointerTypeRef;

import domain.DomainPackage;

public abstract class AbstractTypeNamePropertySection extends
		AbstractDependentEnumerationPropertySection {

	protected String getLabelText() {
		return "Type name";//$NON-NLS-1$
	}

	protected void init() {
		if (eObject instanceof domain.TypePointer)
			dropDownDataSupplier = new DomainTypePointerTypeRef();
		if (eObject instanceof domain.Operation)
			dropDownDataSupplier = new DomainOperationTypeRef();
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	protected HashMap<String, Object> getEnumerationFeatureValues() {
		if (dropDownDataSupplier == null)
			init();

		if (values == null) {
			values = new HashMap<String, Object>();

			Diagram diagram = (Diagram) editPart.getRoot().getContents()
					.getModel();
			EObject types = (EObject) diagram.getElement();

			if (dropDownDataSupplier.getWatchPointObject(eObject) == null)
				return values;

			OCL ocl = OCL.newInstance(EcoreEnvironmentFactory.INSTANCE);
			OCLHelper<EClassifier, ?, ?, Constraint> helper = ocl
					.createOCLHelper();
			helper.setContext(DomainPackage.eINSTANCE.getEClassifier("Types"));

			try {

				String strQuery = getQuery().replaceAll(
						"\\$1",
						((domain.Package) dropDownDataSupplier
								.getWatchPointObject(eObject)).getUid());

				OCLExpression<EClassifier> query = helper.createQuery(strQuery);

				Collection<domain.TypeElement> map = (Collection<domain.TypeElement>) ocl
						.evaluate(types, query);

				for (Iterator<domain.TypeElement> i = map.iterator(); i
						.hasNext();) {
					domain.TypeElement p = i.next();
					values.put((p.getName()), p);
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		return values;
	}

	protected abstract String getQuery();

}