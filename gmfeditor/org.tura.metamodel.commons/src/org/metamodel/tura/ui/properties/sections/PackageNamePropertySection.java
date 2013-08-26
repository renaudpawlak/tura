package org.metamodel.tura.ui.properties.sections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.validation.internal.modeled.model.validation.Constraint;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.ocl.OCL;
import org.eclipse.ocl.ecore.EcoreEnvironmentFactory;
import org.eclipse.ocl.expressions.OCLExpression;
import org.eclipse.ocl.helper.OCLHelper;

import domain.DomainPackage;

public class PackageNamePropertySection extends
		AbstractEnumerationPropertySection {

	private ArrayList<String> values;

	protected EAttribute getFeature() {
		return DomainPackage.eINSTANCE.getTypePointer_PackageName();
	}

	protected String getFeatureAsText() {
		return ((domain.TypePointer) eObject).getPackageName();
	}

	protected Object getFeatureValue(int index) {
		return values.get(index);
	}

	protected String getLabelText() {
		return "Package name";//$NON-NLS-1$
	}

	protected boolean isEqual(int index) {
		if (((domain.TypePointer) eObject).getPackageName() == null)
			return false;
		return values.get(index).equals(
				((domain.TypePointer) eObject).getPackageName());
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	protected String[] getEnumerationFeatureValues() {

		if (values == null) {
			values = new ArrayList<String>();
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
						.createQuery("domain::Package.allInstances()->asOrderedSet()->select(r|r.oclIsKindOf(domain::Package) and  r.oclAsType(domain::Package).name <> null)");

				Collection<domain.Package> map = (Collection<domain.Package>) ocl
						.evaluate(types, query);

				for (Iterator<domain.Package> i = map.iterator(); i.hasNext();) {
					domain.Package p = i.next();
					values.add(p.getName());
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			values.add("Primitives");

		}

		return values.toArray(new String[values.size()]);
	}
}