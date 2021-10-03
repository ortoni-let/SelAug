package utils;

import java.io.IOException;

import org.labs.selenium.framework.SeleniumBaseFunctions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

public class Common extends SeleniumBaseFunctions{
	protected String ExcelFileName = "";
	
	@BeforeMethod
	public void startBroswer(){
		super.startApp("https://www.saucedemo.com");
	}
	
	@AfterMethod
	public void closeBrowser() {
		quit();
	}

	@DataProvider(name="loginSauce")
	public String[][] mytestData() {
		String[][] data = null;
		try {
			data = ExcelDataLib.getData(ExcelFileName);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return data;
	}
}










