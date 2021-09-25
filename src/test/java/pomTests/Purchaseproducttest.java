package pomTests;

import org.swaglabs.selenium.pages.HeaderPage;
import org.swaglabs.selenium.pages.LoginPage;
import org.swaglabs.selenium.pages.ProductsPage;
import org.swaglabs.selenium.pages.SideMenuPage;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utils.Common;

public class Purchaseproducttest extends Common{
	@BeforeTest
	void setData(){
		ExcelFileName = "login";		
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
		ProductsPage pp = new ProductsPage(driver);
		
	}
}









