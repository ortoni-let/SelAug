package org.swaglabs.selenium.pages;


import org.openqa.selenium.remote.RemoteWebDriver;

import utils.Common;

public class LoginPage extends Common{
	public LoginPage(RemoteWebDriver driver) {
		this.driver = driver;
//		PageFactory.initElements(driver, this);
	}
	
	// Page factory
	
//	String xpath = "";
//	
//	@FindBy(id="login-button") WebElement eleLoginBtn;
//	@FindBy(id="user-name") WebElement eleUserName;
//	
//	@FindBy(how = How.ID, using = "login-button") WebElement eleLo;
	
	public void login(String username, String password) {
//		eleUserName.sendKeys(username);
		driver.findElementById("user-name").sendKeys(username);
		driver.findElementById("password").sendKeys(password);
//		eleLoginBtn.click();
		driver.findElementById("login-button").click();
	}

}
