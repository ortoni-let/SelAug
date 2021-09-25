package week3.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Max {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
		driver.manage().window().fullscreen();
		driver.get("https://computer-database.gatling.io/computers");
		driver.findElementById("searchbox").sendKeys("ACE");
		driver.findElementById("searchsubmit").click();
	
	}

}

















