package pomTests;

import org.swaglabs.selenium.pages.HeaderPage;
import org.swaglabs.selenium.pages.LoginPage;
import org.swaglabs.selenium.pages.SideMenuPage;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utils.Common;

public class Tc001_Logintest extends Common{
	@BeforeTest
	public void setData(){
		testcaseDec = "Swag labs login test";
		author = "Balaji";
		category = "smoke";
		testcaseName ="TC001";
		ExcelFileName = "tc002";	
	}
	@Test(dataProvider = "loginSauce")
	public void myLoginTest(String user, String pass) {
		LoginPage lp = new LoginPage(driver);
		HeaderPage hp = new HeaderPage(driver);
		SideMenuPage menu = new SideMenuPage(driver);
		Assert.assertEquals(driver.getTitle(), "Swag Labs");
		lp.login(user, pass);
		Assert.assertEquals(driver.getTitle(), "Swag Labs");
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/inventory.html");
		hp.openMenu();
		menu.clickLogOut();
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/");
	}
}









