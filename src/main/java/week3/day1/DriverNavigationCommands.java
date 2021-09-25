package week3.day1;

import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverNavigationCommands {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://computer-database.gatling.io/computers");
		String url = driver.getCurrentUrl();
		System.out.println("computer-database -> "+url);
//		driver.navigate().to("https://www.google.com/");
//		driver.get("https://www.google.com/");
//		System.out.println(driver.getTitle());
		Navigation navigate = driver.navigate();
		navigate.to("https://www.google.com/");
		navigate.back();
		System.out.println("expecting: Computers db " + driver.getTitle());
		navigate.forward();
		System.out.println("expecting: goolge "+ driver.getTitle());
		navigate.refresh();
		System.out.println("expecting: goolge "+ driver.getTitle());
		
		// isEnabled, isSelected, isDisplayed
	
	}

}

















