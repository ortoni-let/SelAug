package week3.day2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrames {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://devlabs-860f0.web.app/frame");
		WebElement frame = driver.findElementByXPath("//iframe[@src='/login']");
		driver.switchTo().frame(frame);
		driver.findElementById("username").sendKeys("admin");
		
		driver.switchTo().defaultContent(); // main page
		driver.switchTo().parentFrame(); // parent 
	}

}
