package week8.day1;

import org.labs.selenium.framework.Locators;
import org.labs.selenium.framework.SeleniumBaseFunctions;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utils.Common;

public class FwTest extends Common {
	
	@BeforeTest
	public void init() {
		testcaseDec = "Swag labs login test";
		author = "Balaji";
		category = "smoke";
		testcaseName ="TC001";
	}
	
	@Test
	public void login() {
		WebElement userName = findElementBy(Locators.id, "user-name");
		clearAndType(userName, "standard_user");
		clearAndType(findElementBy(Locators.id, "password"), "secret_sauce");
	}

}
