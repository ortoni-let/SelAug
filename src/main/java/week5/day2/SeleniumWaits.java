package week5.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

/*
 * 
 * Wait
 * 0. Thread.sleep() -> JAVA
 * 1. Implicit wait - > find element & find elements
 * 2. Explicit wait ->
 * 	Fluent  & WebDriverWait ->
 * 
 * alertIsPresent
 * ElementTobeclickable
 * visibilityof
 * invisibilityOf
 * 
 */

public class SeleniumWaits {

	ChromeDriver driver;
	@Test
	public void testFlipkart() {
		System.setProperty("webdriver.chrome.driver",
				"./driver/chromedriver.exe");			
		driver = new ChromeDriver();
		driver.get("https://devlabs-860f0.web.app/waitforalert");
		driver.findElementById("mye").click();
		// expecting an alert
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.alertIsPresent()); // 500 ms
		// fluent wait = 2000 - 2 sec

		Wait<WebDriver> wa = new FluentWait<WebDriver>(driver)
				.withTimeout(30, TimeUnit.SECONDS)
				.pollingEvery(5, TimeUnit.SECONDS);
		wa.until(ExpectedConditions.alertIsPresent());

		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();

		//		drive/

	}
	@AfterMethod(alwaysRun = true)
	public void close() {
		driver.quit();
	}

}
