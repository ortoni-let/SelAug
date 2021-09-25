package week3.day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://devlabs-860f0.web.app/edit");
		driver.findElementByXPath("//input[@placeholder='first name & last name']").sendKeys("balaji");
		
	
	}

}

















