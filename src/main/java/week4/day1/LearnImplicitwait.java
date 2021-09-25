package week4.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnImplicitwait {
	
//	Explicit
//	Implicit
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.saucedemo.com/");
//		0.5 sec
		driver.findElementById("user-name1").sendKeys("standard_user");
		driver.findElementById("user-name1").sendKeys("standard_user");
		driver.findElementById("user-name1").sendKeys("standard_user");
		driver.findElementById("user-name1").sendKeys("standard_user");
		driver.findElementById("user-name1").sendKeys("standard_user");
		driver.quit();
	}

}
