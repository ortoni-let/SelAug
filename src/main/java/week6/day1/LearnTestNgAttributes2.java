package week6.day1;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LearnTestNgAttributes2{
	@Test(expectedExceptions = NoSuchElementException.class)
	public void addToCart() {
		System.setProperty("webdriver.chrome.driver",
			"./driver/chromedriver.exe");		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		try {
			driver.findElementById("user-name").sendKeys("locked_out_user");
		} catch (NoSuchElementException e) {
			throw new NoSuchElementException("Element not found hence failing the test");
		}
		driver.findElementById("password").sendKeys("secret_sauce");
		driver.findElementByCssSelector("#login-button1").click();
		System.out.println(driver.getTitle());
	}
}
