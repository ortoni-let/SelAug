package week6.day1;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utils.Common;

public class LoginServiceNow extends Common{
	@BeforeTest
	void setData(){
		ExcelFileName = "tc001";		
	}
	
	@Test(dataProvider = "loginSauce")
	public void loginNow(String[] data) {
		for (int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
		}
	}
	


}
