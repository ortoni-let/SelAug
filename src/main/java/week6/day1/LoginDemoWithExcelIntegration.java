package week6.day1;

import org.testng.Assert;
import org.testng.annotations.Test;

import utils.Common;

public class LoginDemoWithExcelIntegration extends Common {


	@Test(dataProvider = "loginSauce")
	public void login(String[] data) {
		driver.findElementById("user-name").sendKeys(data[0]);
		driver.findElementById("password").sendKeys(data[1]);
		driver.findElementByCssSelector("#login-button").click();
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, "https://www.saucedemo.com/inventory.html");
	}





}