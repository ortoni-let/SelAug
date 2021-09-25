package week6.day1;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Verification {

	// TestNg Assert
	//	2 types of assert
	//	1. Hard assert -> when failure it will stop the execution
	//	2. Soft assert -> opposite to hard assert

	@Test
	public void myTest() {
		System.setProperty("webdriver.chrome.driver",
				"./driver/chromedriver.exe");			
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://devlabs-860f0.web.app/edit");
		WebElement ele = driver.findElementById("clearMe");
		// actuals
		boolean displayed = ele.isDisplayed();
		boolean enabled = ele.isEnabled();
		System.out.println("Is enabled: "+ enabled);
		System.out.println(displayed);
		SoftAssert sf = new SoftAssert();
//		sf.assertEquals(displayed, false);		
		System.out.println("Is Selected?");
		driver.get("https://devlabs-860f0.web.app/checkbox");
		boolean selected = driver.findElementById("checkbox4").isSelected();
		assertTrue(selected);
		
		sf.assertAll();

		//		Hard assert
		//		Assert.assertEquals(displayed, true);
		//		assertTrue(displayed);
		//		assertFalse(displayed);
		//		System.out.println("saomspa");



	}

}
