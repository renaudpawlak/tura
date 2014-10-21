package org.tura.metamodel.commons;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.StringWriter;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static java.nio.file.StandardCopyOption.*;

import org.apache.commons.lang.StringUtils;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.epsilon.common.dt.util.LogUtil;
import org.eclipse.epsilon.egl.EglTemplate;
import org.eclipse.epsilon.egl.EglTemplateFactory;
import org.eclipse.ocl.OCL;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.EcoreEnvironmentFactory;
import org.eclipse.ocl.expressions.OCLExpression;
import org.eclipse.ocl.helper.OCLHelper;
import org.tura.metamodel.commons.preferences.IPreferenceConstants;

import domain.DomainPackage;
import freemarker.template.Configuration;
import freemarker.template.DefaultObjectWrapper;
import freemarker.template.Template;
import freemarker.template.TemplateExceptionHandler;

public class Util {

	public boolean ifInternalElement(EObject element) {

		EObject top = element.eContainer();
		if (top == null)
			return false;
		if (top instanceof domain.Table)
			return true;

		return ifInternalElement(top);

	}

	public static void move(String src, String dst) throws IOException{
		Path srcPath = FileSystems.getDefault().getPath(src);
		Path dstPath = FileSystems.getDefault().getPath(dst);

		Files.move(srcPath, dstPath, REPLACE_EXISTING);
		
	}
	
	public static String buildExpression(domain.ContextValue contextValue) {

		return contextValue.getValue();
		
//		if (!contextValue.isConstant())
//			return contextValue.getValue();
//
//		String value = "";
//		int i = 0;
//		for (Iterator<domain.ExpressionPart> itr = contextValue.getExpression()
//				.iterator(); itr.hasNext(); i++) {
//			domain.ExpressionPart exp = itr.next();
//			IWorkbenchAdapter adapter = (IWorkbenchAdapter) Platform
//					.getAdapterManager().getAdapter(exp.getObjRef(),
//							IWorkbenchAdapter.class);
//			if (i != 0)
//				value = value + ".";
//			value = value + adapter.getLabel(exp.getObjRef());
//		}
//		return value;
	}

	public static boolean mapperRecognizer(Set<domain.Mapper> mappers,
			domain.Ingredient ingredient) {

		for (Iterator<domain.Mapper> itr = mappers.iterator(); itr.hasNext();) {
			domain.Mapper mapper = itr.next();

			int ui = mapper.isUiLayer() ? 1 : 0;
			int s = mapper.isServiceLayer() ? 1 : 0;
			int ingr = ingredient.getLayer().getValue();

			if ((((ui << 1) + s) & ingr) != 0)
				return true;
		}
		return false;
	}

	public static domain.TypeMapper mapType(Set<domain.TypeMapper> mappers,
			domain.Ingredient ingredient, domain.TypeElement typeElement)
			throws Exception {

		for (Iterator<domain.TypeMapper> itr = mappers.iterator(); itr
				.hasNext();) {
			domain.TypeMapper mapper = itr.next();

			int ui = mapper.isUiLayer() ? 1 : 0;
			int s = mapper.isServiceLayer() ? 1 : 0;
			int ingr = ingredient.getLayer().getValue();

			if (((((ui << 1) + s) & ingr) != 0)
					&& (mapper.getTypeRef().getUid() == typeElement.getUid())) {
				return mapper;
			}
		}
		return null;
	}

	public static Object runQuery(domain.Query query, EObject eobj)
			throws Exception {
		String strQuery = query.getQueryRef().getQuery();
		for (Iterator<domain.QueryVariable> itrVar = query.getVariables()
				.iterator(); itrVar.hasNext();) {
			domain.QueryVariable var = itrVar.next();
			strQuery = strQuery.replaceAll("\\$\\{"
					+ var.getQueryParamRef().getName() + "\\}", var.getValue());
		}
		IEclipsePreferences pref = InstanceScope.INSTANCE
				.getNode("org.tura.metamodel.commons.preferences");
		if ("true".equals(pref.get(IPreferenceConstants.DEBUGING, "false"))) {
			LogUtil.logInfo("Query : " + strQuery);
		}

		return executeQuery(strQuery, eobj);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static List<?> runQuery(domain.ModelMapper mapper, String queryName,
			EObject eobj) throws Exception {
		ArrayList result = new ArrayList<>();
		for (Iterator<domain.Query> itr = mapper.getQueries().iterator(); itr
				.hasNext();) {
			domain.Query query = itr.next();
			if (query.getQueryRef().getName().equals(queryName)) {
				Collection<?> ls = (Collection<?>) runQuery(query, eobj);
				result.addAll(ls);
			}
		}

		return result;

	}

	public static GroupBy runQueryWithGrouping(domain.ModelMapper mapper,
			String queryName, EObject eobj) throws Exception {
		GroupBy result = new GroupBy();
		for (Iterator<domain.Query> itr = mapper.getQueries().iterator(); itr
				.hasNext();) {
			domain.Query query = itr.next();
			if (query.getQueryRef().getName().equals(queryName)) {
				Collection<?> ls = (Collection<?>) runQuery(query, eobj);
				result.add(query.getGroupCode(), ls);
			}
		}
		return result;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	private static Object executeQuery(String strQuery, EObject eobj)
			throws Exception {

		OCL ocl = OCL.newInstance(EcoreEnvironmentFactory.INSTANCE);
		OCLHelper<EClassifier, ?, ?, Constraint> helper = ocl.createOCLHelper();
		helper.setContext(DomainPackage.eINSTANCE.getEClassifier("Domain"));

		OCLExpression<EClassifier> query = helper.createQuery(strQuery);

		Object obj = (Collection<EObject>) ocl.evaluate(eobj, query);

		return obj;
	}

	public static String mergeAndCapitalize(String name) {
		String[] ls = StringUtils.split(name, " ");
		for (int i = 0; i < ls.length; i++) {
			ls[i] = StringUtils.capitalize(ls[i]);
		}
		return StringUtils.join(ls);
	}

	public static void saveFile(String path, String fileName, String in)
			throws IOException {

		File f = new File(path);
		f.mkdirs();

		FileOutputStream out = new FileOutputStream(new File(f, fileName));
		out.write(in.getBytes());
		out.close();
	}

	public static void println(Object obj) {
		System.out.println(obj);
	}

	
	public static void populateTechnologies(EglTemplate template, domain.ModelMapper mapper){
		for (  domain.MappingSpecifier tech : mapper.getSpecifiers()){
			template.populate(tech.getSpecifierRef().getName().replace(' ', '_'),	tech.getValueRef().getValue());
		}
	}
	
	public static void populateTechnologies(Map<String,Object> hash, domain.ModelMapper mapper){
		for (  domain.MappingSpecifier tech : mapper.getSpecifiers()){
			hash.put(tech.getSpecifierRef().getName().replace(' ', '_'),	tech.getValueRef().getValue());
		}
	}
	
	
	public static EglTemplate loadTemplate(String templateFile,
			HashMap<String, Object> parameters, EglTemplateFactory factory)
			throws Exception {

		/* Create and adjust the configuration */
		Configuration cfg = new Configuration();

		cfg.setObjectWrapper(new DefaultObjectWrapper());
		cfg.setDefaultEncoding("UTF-8");
		cfg.setTemplateExceptionHandler(TemplateExceptionHandler.HTML_DEBUG_HANDLER);
		cfg.setTemplateLoader(new FreeMarkeResourceLoader());
		cfg.setLocalizedLookup(false);

		Template t = cfg.getTemplate(templateFile);

		StringWriter writer = new StringWriter();
		t.process(parameters, writer);

		IEclipsePreferences pref = InstanceScope.INSTANCE
				.getNode("org.tura.metamodel.commons.preferences");
		if ("true"
				.equals(pref.get(IPreferenceConstants.LOG_TEMPLATES, "false"))) {
			LogUtil.logInfo("Template" + templateFile + " : \n"
					+ writer.toString());
		}

		EglTemplate egltemplate = factory.prepare(writer.toString());

		if (egltemplate == null || !egltemplate.getParseProblems().isEmpty()) {
			if (egltemplate != null)
				LogUtil.logInfo("Error during pursing template" + templateFile
						+ " : \n" + writer.toString());
			throw new Exception(egltemplate.getParseProblems().toString());
		}

		for (Iterator<String> itr = parameters.keySet().iterator(); itr
				.hasNext();) {
			String key = itr.next();
			egltemplate.populate(key, parameters.get(key));
		}
		return egltemplate;
	}

}
