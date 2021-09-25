package week4.day1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSLocators {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://devlabs-860f0.web.app/button");
		WebElement btn = driver.findElementByCssSelector("#button3");
		btn.sendKeys("cricket", Keys.ENTER);
		String color = btn.getCssValue("color");
		System.out.println(color);
	}

}
