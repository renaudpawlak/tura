/**
 * Tura - application generation platform
 *
 * Copyright (c) 2012 - 2015, Arseniy Isakov
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
package org.tura.platform.primefaces.resourcehandler;

import static org.omnifaces.util.Faces.evaluateExpressionGet;
import static org.omnifaces.util.Faces.getInitParameter;
import static org.omnifaces.util.Utils.isEmpty;

import java.util.HashMap;
import java.util.Map;

import javax.faces.application.Resource;
import javax.faces.application.ResourceDependency;
import javax.faces.application.ResourceHandler;

import org.omnifaces.resourcehandler.DefaultResource;
import org.omnifaces.resourcehandler.DefaultResourceHandler;
import org.omnifaces.resourcehandler.ResourceIdentifier;

/**
 * <p>
 * This {@link ResourceHandler} implementation allows the developer to provide CDN URLs instead of the default local
 * URLs for JSF resources as provided by <code>&lt;h:outputScript&gt;</code>, <code>&lt;h:outputStylesheet&gt;</code>
 * and <code>&lt;h:graphicImage&gt;</code>.
 *
 * <h3>Installation</h3>
 * <p>
 * To get it to run, this handler needs be registered as follows in <code>faces-config.xml</code>:
 * <pre>
 * &lt;application&gt;
 *     &lt;resource-handler&gt;org.omnifaces.resourcehandler.CDNResourceHandler&lt;/resource-handler&gt;
 * &lt;/application&gt;
 * </pre>
 *
 * <h3>Standard configuration</h3>
 * <p>
 * To configure the CDN URLs, a {@value org.omnifaces.resourcehandler.CDNResourceHandler#PARAM_NAME_CDN_RESOURCES}
 * context parameter has to be provided wherein the CDN resources are been specified as a comma separated string of
 * <code>libraryName:resourceName=http://cdn.example.com/url</code> key=value pairs. The key represents the default
 * JSF resource identifier and the value represents the full CDN URL, including the scheme. The CDN URL is not validated
 * by this resource handler, so you need to make absolutely sure yourself that it is valid. Here's an example:
 * <pre>
 * &lt;context-param&gt;
 *     &lt;param-name&gt;org.omnifaces.CDN_RESOURCE_HANDLER_URLS&lt;/param-name&gt;
 *     &lt;param-value&gt;
 *         js/script1.js=http://cdn.example.com/js/script1.js,
 *         somelib:js/script2.js=http://cdn.example.com/somelib/js/script2.js,
 *         otherlib:style.css=http://cdn.example.com/otherlib/style.css,
 *         images/logo.png=http://cdn.example.com/logo.png
 *     &lt;/param-value&gt;
 * &lt;/context-param&gt;
 * </pre>
 * <p>
 * With the above configuration, the following resources:
 * <pre>
 * &lt;h:outputScript name="js/script1.js" /&gt;
 * &lt;h:outputScript library="somelib" name="js/script2.js" /&gt;
 * &lt;h:outputStylesheet library="otherlib" name="style.css" /&gt;
 * &lt;h:graphicImage name="images/logo.png" /&gt;
 * </pre>
 * <p>
 * Will be rendered as:
 * <pre>
 * &lt;script type="text/javascript" src="http://cdn.example.com/js/script1.js"&gt;&lt;/script&gt;
 * &lt;script type="text/javascript" src="http://cdn.example.com/somelib/js/script2.js"&gt;&lt;/script&gt;
 * &lt;link type="text/css" rel="stylesheet" href="http://cdn.example.com/otherlib/style.css" /&gt;
 * &lt;img src="http://cdn.example.com/logo.png" /&gt;
 * </pre>
 * <p>
 * Note that you can also use this on resources provided as {@link ResourceDependency} by the JSF implementation and/or
 * component libraries. For example, JSF's own <code>javax.faces:jsf.js</code> resource which is been used by
 * <code>&lt;f:ajax&gt;</code> can be provided by a CDN URL using the following syntax:
 * <pre>
 * javax.faces:jsf.js=http://cdn.example.com/jsf.js
 * </pre>
 *
 * <h3>Wildcard configuration</h3>
 * <p>
 * You can also use the wildcard syntax to map every single resource of a specific library to a common CDN URL. To
 * achieve that, just use <code>*</code> as the sole resource name and make sure that the CDN URL ends with
 * <code>/*</code>. Here's an example:
 * <pre>
 * &lt;context-param&gt;
 *     &lt;param-name&gt;org.omnifaces.CDN_RESOURCE_HANDLER_URLS&lt;/param-name&gt;
 *     &lt;param-value&gt;jquery-cdn:*=http://code.jquery.com/*&lt;/param-value&gt;
 * &lt;/context-param&gt;
 * </pre>
 * With the above configuration, the following resources:
 * <pre>
 * &lt;h:outputScript library="jquery-cdn" name="jquery-1.9.1.js" /&gt;
 * &lt;h:outputScript library="jquery-cdn" name="ui/1.10.3/jquery-ui.js" /&gt;
 * </pre>
 * <p>
 * Will be rendered as:
 * <pre>
 * &lt;script type="text/javascript" src="http://code.jquery.com/jquery-1.9.1.js"&gt;&lt;/script&gt;
 * &lt;script type="text/javascript" src="http://code.jquery.com/ui/1.10.3/jquery-ui.js"&gt;&lt;/script&gt;
 * </pre>
 *
 * <h3>EL expressions</h3>
 * <p>The CDN resource handler supports evaluating EL expessions in the CDN URL. Here's an example:</p>
 * <pre>
 * &lt;context-param&gt;
 *     &lt;param-name&gt;org.omnifaces.CDN_RESOURCE_HANDLER_URLS&lt;/param-name&gt;
 *     &lt;param-value&gt;jquery-cdn:*=http://#{settings.jqueryCDN}/*&lt;/param-value&gt;
 * &lt;/context-param&gt;
 * </pre>
 * <p>The EL expression is resolved on a per-request basis.</p>
 *
 * <h3>Conditionally disable CDN resource handler</h3>
 * <p>
 * If you'd like to supply a context parameter which conditionally disables the CDN resource handler, then set the
 * context parameter {@value org.omnifaces.resourcehandler.CDNResourceHandler#PARAM_NAME_CDN_DISABLED} accordingly.
 * <pre>
 * &lt;context-param&gt;
 *     &lt;param-name&gt;org.omnifaces.CDN_RESOURCE_HANDLER_DISABLED&lt;/param-name&gt;
 *     &lt;param-value&gt;true&lt;/param-value&gt;
 * &lt;/context-param&gt;
 * &lt;!-- or --&gt;
 * &lt;context-param&gt;
 *     &lt;param-name&gt;org.omnifaces.CDN_RESOURCE_HANDLER_DISABLED&lt;/param-name&gt;
 *     &lt;param-value&gt;#{facesContext.application.projectStage eq 'Development'}&lt;/param-value&gt;
 * &lt;/context-param&gt;
 * &lt;!-- or --&gt;
 * &lt;context-param&gt;
 *     &lt;param-name&gt;org.omnifaces.CDN_RESOURCE_HANDLER_DISABLED&lt;/param-name&gt;
 *     &lt;param-value&gt;#{someBean.someBooleanProperty}&lt;/param-value&gt;
 * &lt;/context-param&gt;
 * </pre>
 * <p>The EL expression is resolved on a per-request basis.</p>
 *
 * <h3>CombinedResourceHandler</h3>
 * <p>
 * If you're also using the {@link CombinedResourceHandler}, then you need to understand that CDN resources can
 * simply not be combined, as that would defeat the CDN purpose. The {@link CombinedResourceHandler} will therefore
 * automatically exclude all CDN resources from combining.
 *
 * @author Bauke Scholtz
 * @since 1.2
 * @see DefaultResource
 * @see DefaultResourceHandler
 */
public class OmniResourceHandlerWrapper extends DefaultResourceHandler {

	// Constants ------------------------------------------------------------------------------------------------------

	/** The context parameter name to specify CDN URLs for the given resource identifiers. */
	public static final String PARAM_NAME_CDN_RESOURCES = "org.omnifaces.CDN_RESOURCE_HANDLER_URLS";

	/** The context parameter name to conditionally disable CDN resource handler. @since 2.0 */
	public static final String PARAM_NAME_CDN_DISABLED = "org.omnifaces.CDN_RESOURCE_HANDLER_DISABLED";

	private static final String ERROR_MISSING_INIT_PARAM =
		"Context parameter '" + PARAM_NAME_CDN_RESOURCES + "' is missing in web.xml or web-fragment.xml.";
	private static final String ERROR_INVALID_INIT_PARAM =
		"Context parameter '" + PARAM_NAME_CDN_RESOURCES + "' is in invalid syntax."
			+ " It must follow 'resourceId=URL,resourceId=URL,resourceId=URL' syntax.";
	private static final String ERROR_INVALID_WILDCARD =
		"Context parameter '" + PARAM_NAME_CDN_RESOURCES + "' is in invalid syntax."
			+ " Wildcard can only represent entire resource name '*' and URL suffix '/*' as in"
			+ " 'libraryName:*=http://cdn.example.com/*'.";

	// Properties -----------------------------------------------------------------------------------------------------

	private String disabledParam;
	private Map<ResourceIdentifier, String> cdnResources;

	// Constructors ---------------------------------------------------------------------------------------------------

	/**
	 * Creates a new instance of this CDN resource handler which wraps the given resource handler. If the current JSF
	 * project stage is <strong>not</strong> set to <code>Development</code>, then the CDN resources will be initialized
	 * based on the {@value org.omnifaces.resourcehandler.CDNResourceHandler#PARAM_NAME_CDN_RESOURCES} context
	 * parameter.
	 * @param wrapped The resource handler to be wrapped.
	 * @throws IllegalArgumentException When the context parameter is missing or is in invalid format.
	 */
	public OmniResourceHandlerWrapper(ResourceHandler wrapped) {
		super(wrapped);
		disabledParam = getInitParameter(PARAM_NAME_CDN_DISABLED);
		cdnResources = initCDNResources();

		if (cdnResources == null) {
			throw new IllegalArgumentException(ERROR_MISSING_INIT_PARAM);
		}
	}

	// Actions --------------------------------------------------------------------------------------------------------

	/**
	 * Delegate to {@link #createResource(String, String, String)} of the wrapped resource handler. If it returns
	 * non-<code>null</code> and the current JSF project stage is <strong>not</strong> set to <code>Development</code>,
	 * then the properties file will be consulted if any CDN URL is available for the given resource. If there is none,
	 * then just return the JSF default resource, otherwise return a wrapped resource whose
	 * {@link Resource#getRequestPath()} returns the CDN URL as is been set in the
	 * {@value org.omnifaces.resourcehandler.CDNResourceHandler#PARAM_NAME_CDN_RESOURCES} context parameter.
	 */
	@Override
	public Resource createResource(String resourceName, String libraryName, String contentType) {
		Resource resource = super.createResource(resourceName, libraryName, contentType);

		if (resource != null || (disabledParam != null && Boolean.valueOf(String.valueOf(evaluateExpressionGet(disabledParam))))) {
			return resource;
		}

		String requestPath = null;

		if (cdnResources != null) {
			requestPath = cdnResources.get(new ResourceIdentifier(libraryName, resourceName));

			if (requestPath == null) {
				requestPath = cdnResources.get(new ResourceIdentifier(libraryName, "*"));

				if (requestPath != null) {
					requestPath = requestPath.substring(0, requestPath.length() - 1) + resourceName;
				}
			}
		}

		if (requestPath == null) {
			return resource;
		}

		final String evaluatedRequestPath = evaluateExpressionGet(requestPath);

		return new DefaultResource(resource) {
			@Override
			public String getRequestPath() {
				return evaluatedRequestPath;
			}
		};
	}

	// Helpers --------------------------------------------------------------------------------------------------------

	/**
	 * Initialize the CDN resources.
	 * @return The CDN resources, or <code>null</code> if the context parameter has not been set.
	 * @throws IllegalArgumentException When the context parameter value is in invalid format.
	 */
	static Map<ResourceIdentifier, String> initCDNResources() {
		String cdnResourcesParam = getInitParameter(PARAM_NAME_CDN_RESOURCES);

		if (isEmpty(cdnResourcesParam)) {
			return null;
		}

		Map<ResourceIdentifier, String> cdnResources = new HashMap<>();

		for (String cdnResource : cdnResourcesParam.split("\\s*,\\s*")) {
			String[] cdnResourceIdAndURL = cdnResource.split("\\s*=\\s*", 2);

			if (cdnResourceIdAndURL.length != 2) {
				throw new IllegalArgumentException(ERROR_INVALID_INIT_PARAM);
			}

			ResourceIdentifier id = new ResourceIdentifier(cdnResourceIdAndURL[0]);

			if (id.getName().contains("*") && (!id.getName().equals("*") || !cdnResourceIdAndURL[1].endsWith("/*"))) {
				throw new IllegalArgumentException(ERROR_INVALID_WILDCARD);
			}

			cdnResources.put(id, cdnResourceIdAndURL[1]);
		}

		return cdnResources;
	}

}