package week5.day2;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import utils.Common;

public class AddToCart extends Common {
	
	@Test
	public void addToCart() {
		driver.get("https://www.saucedemo.com/");
		try {
			driver.findElementById("user-name").sendKeys("locked_out_user");
		} catch (NoSuchElementException e) {
			throw new NoSuchElementException("Element not found hence failing the test");
		}
		driver.findElementById("password").sendKeys("secret_sauce");
		driver.findElementByCssSelector("#login-button").click();
		System.out.println(driver.getTitle());
	}

}
