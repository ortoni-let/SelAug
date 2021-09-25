package week5.day2;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import utils.Common;

public class LoginSauceLabDataProvider extends Common {


	@Test(dataProvider = "loginSauce")
	public void login(String[] data) {
		driver.findElementById("user-name").sendKeys(data[0]);
		driver.findElementById("password").sendKeys(data[1]);
		driver.findElementByCssSelector("#login-button").click();
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, "https://www.saucedemo.com/inventory.html");
	}

	@DataProvider(name="loginSauce")
	public String[][] mytestData() {
		String[][] data = new String[2][2];
		data[0][0] ="standard_user"; // username 
		data[0][1] ="secret_sauce"; // password
		
		data[1][0] ="locked_out_user";
		data[1][1] ="secret_sauce";
		
		return data;

	}

	/*
	 * @DataProvider(name="signup") public void mytestData1() { String[][] data =
	 * new String[2][2]; data[0][0] ="standard_user"; data[0][1] ="secret_sauce";
	 * 
	 * data[1][0] ="locked_out_user"; data[1][1] ="secret_sauce";
	 * 
	 * }
	 */
}




















