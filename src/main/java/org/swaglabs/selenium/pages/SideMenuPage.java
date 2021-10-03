package org.swaglabs.selenium.pages;

import org.labs.selenium.framework.Locators;
import org.openqa.selenium.remote.RemoteWebDriver;

import utils.Common;

public class SideMenuPage extends Common{
	public SideMenuPage(RemoteWebDriver driver) {
		this.driver = driver;
	}
	
	public void clickLogOut() {
		click(findElementBy(Locators.id, "logout_sidebar_link"));
//		driver.findElementById("").click();
	}

}
