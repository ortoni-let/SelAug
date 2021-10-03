package org.swaglabs.selenium.pages;

import org.labs.selenium.framework.Locators;
import org.openqa.selenium.remote.RemoteWebDriver;

import utils.Common;

public class HeaderPage extends Common{
	public HeaderPage(RemoteWebDriver driver) {
		this.driver = driver;
	}
	
	public void openMenu(){
		click(findElementBy(Locators.id, "react-burger-menu-btn"));
//		driver.findElementById("react-burger-menu-btn").click();
	}
	
	public void openCart() {
		
	}
}
