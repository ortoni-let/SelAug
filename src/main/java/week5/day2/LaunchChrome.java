package week5.day2;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LaunchChrome {

	@Test()
	public void searchSystem() {
		
		// login
		System.setProperty("webdriver.chrome.driver",
				"./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://computer-database.gatling.io/computers");
		driver.findElementById("searchbox").sendKeys("ACE");
		driver.findElementById("searchsubmit").click();
		driver.quit();
	}

}

















