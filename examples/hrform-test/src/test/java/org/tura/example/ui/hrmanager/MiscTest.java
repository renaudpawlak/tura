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
package org.tura.example.ui.hrmanager;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.io.File;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.tura.example.ui.hrmanager.miscelements.pageobject.MiscElementsWindowPageObject;
import org.tura.platform.selenium.CheckBox;
import org.tura.platform.selenium.DropDownSelection;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MiscTest {

	static WebDriver driver;
	static ChromeDriverService service;

	@BeforeClass
	public static void beforeClass() {
		try {
			service = new ChromeDriverService.Builder()
					.usingDriverExecutable(
							new File("/Users/arseniy/Downloads/chromedriver"))
					.usingAnyFreePort().build();

			service.start();
		} catch (Exception e) {
			e.printStackTrace();

		}

	}

	@AfterClass
	public static void createAndStopService() {
		service.stop();
	}

	@Before
	public void createDriver() {
		driver = new RemoteWebDriver(service.getUrl(),
				DesiredCapabilities.chrome());
	}

	@After
	public void quitDriver() {
		driver.quit();
	}

	@Test
	public void t1_validateDropDown() {
		try {
			driver.get("http://localhost:8080/hrapplication/hrmanager/miscelements/MiscElementsWindow.xhtml");

			MiscElementsWindowPageObject miscPage = new MiscElementsWindowPageObject(
					driver);

			DropDownSelection el = miscPage.getDepartmentDropDown();
			assertEquals("Select one", el.getValue());
			el.setValue("Department 1");

			el = miscPage.getEmployeesDropDown();
			el.setValue("Last Name 1");
			assertEquals("Last Name 1", el.getValue());

		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}

	
	
	@Test
	public void t2_validateCheckBox() {
		try {
			driver.get("http://localhost:8080/hrapplication/hrmanager/miscelements/MiscElementsWindow.xhtml");

			MiscElementsWindowPageObject miscPage = new MiscElementsWindowPageObject(
					driver);

			CheckBox el = miscPage.getChkBox();
			assertEquals(false, el.getValue());
			el.setValue(true);
			assertEquals(true, el.getValue());

		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}

}
