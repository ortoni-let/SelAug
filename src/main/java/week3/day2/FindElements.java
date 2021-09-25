package week3.day2;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://devlabs-860f0.web.app/edit");
		List<WebElement> inputs = driver.findElementsByTagName("input");
		if(inputs.size() == 4) {
			System.out.println("As expected");
		}else {
			System.err.println("Failed");
		}	
	}
	
	// TODO: Web Table

}

















