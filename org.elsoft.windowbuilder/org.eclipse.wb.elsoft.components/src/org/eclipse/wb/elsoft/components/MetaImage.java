/*******************************************************************************
 * Copyright 2012 Arseniy Isakov
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package org.eclipse.wb.elsoft.components;

import org.eclipse.e4.xwt.elsoft.types.IteratorProperty;
import org.eclipse.e4.xwt.elsoft.types.SourceProperty;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;

public class MetaImage extends Button {

	private IteratorProperty iteratorProperty;
	private SourceProperty sourceProperty;
	private String cssStyle;
	private String cssStyleClass;

	public MetaImage(Composite parent, int style) {
		super(parent, SWT.None);
		Display display = Display.getCurrent();
		ImageRegistry registry = new ImageRegistry(display);
		loadImages(registry);
		this.setImage(registry.get("element"));
	}

	
	public String getCssStyle() {
		return cssStyle;
	}

	public void setCssStyle(String cssStyle) {
		this.cssStyle = cssStyle;
	}

	public String getCssStyleClass() {
		return cssStyleClass;
	}

	public void setCssStyleClass(String cssStyleClass) {
		this.cssStyleClass = cssStyleClass;
	}

	protected void checkSubclass() {
	}

	public IteratorProperty getIteratorProperty() {
		return iteratorProperty;
	}

	public void setIteratorProperty(IteratorProperty iteratorProperty) {
		this.iteratorProperty = iteratorProperty;
	}

	private void loadImages(ImageRegistry registry) {
		registry.put("element", ImageDescriptor.createFromFile(MetaLOV.class,
				"apple-red.png"));
	}

	public SourceProperty getSourceProperty() {
		return sourceProperty;
	}

	public void setSourceProperty(SourceProperty sourceProperty) {
		this.sourceProperty = sourceProperty;
	}

}
