package week4.day1;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElementByName("q").sendKeys("cricket", Keys.ENTER);
        List<WebElement> cricketList = driver.findElementsByXPath("//*[contains(text(),'cricket') or contains(text(),'Cricket')]");
        System.out.println("Number of Cricket words is: " + cricketList.size());
        driver.quit();
		
		
	}

}
