package org.swaglabs.selenium.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import utils.Common;

public class HeaderPage extends Common{
	public HeaderPage(RemoteWebDriver driver) {
		this.driver = driver;
	}
	
	public void openMenu(){
		driver.findElementById("react-burger-menu-btn").click();
	}
	
	public void openCart() {
		
	}
}
