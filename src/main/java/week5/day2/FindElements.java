package week5.day2;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FindElements {

	@Test()
	public void findElements() {
		
		// login
		System.setProperty("webdriver.chrome.driver",
				"./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://devlabs-860f0.web.app/edit");
		List<WebElement> inputs = driver.findElementsByTagName("input");
		if(inputs.size() == 4) {
			System.out.println("As expected");
		}else {
			System.err.println("Failed");
		}	
		driver.quit();
	}
}

















