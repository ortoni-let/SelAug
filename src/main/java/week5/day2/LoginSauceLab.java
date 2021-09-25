package week5.day2;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import utils.Common;

public class LoginSauceLab extends Common {
	
	
	@Parameters({"username", "url"})
	@Test
	public void login(String user, String url, String some) {
		driver.get(url);
		driver.findElementById("user-name").sendKeys(user);
		driver.findElementById("password").sendKeys("secret_sauce");
		driver.findElementByCssSelector("#login-button").click();
		System.out.println(driver.getTitle());
	}

}
