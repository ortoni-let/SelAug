package week6.day1;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utils.Common;

public class LoginSwagLabs extends Common{
	@BeforeTest
	void setData(){
		ExcelFileName = "tc002";		
	}
	@Test(dataProvider = "loginSauce")
	public void loginSwag(String[] data) {
		ExcelFileName = "tc001";
		for (int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
		}
	}

}
