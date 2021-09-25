package org.swaglabs.selenium.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import utils.Common;

public class SideMenuPage extends Common{
	public SideMenuPage(RemoteWebDriver driver) {
		this.driver = driver;
	}
	
	public void clickLogOut() {
		driver.findElementById("logout_sidebar_link").click();
	}

}
