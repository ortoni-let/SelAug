package org.swaglabs.selenium.pages;


import org.openqa.selenium.remote.RemoteWebDriver;

import utils.Common;

public class LoginPage extends Common{
	public LoginPage(RemoteWebDriver driver) {
		this.driver = driver;
	}
	
	
	public void login(String username, String password) {
		driver.findElementById("user-name").sendKeys(username);
		driver.findElementById("password").sendKeys(password);
		driver.findElementById("login-button").click();
	}

}
