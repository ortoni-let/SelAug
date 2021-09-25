package week3.day2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlerts {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://devlabs-860f0.web.app/alert");
//		driver.findElementByXPath("//button[.='Prompt']").click();
		// handle the alert
//		Alert alert = driver.switchTo().alert();
		String text = driver.switchTo().alert().getText();
		System.out.println(text);
		
//		driver.findElementByXPath("//button[.='Sweet']").click();
//		driver.switchTo().alert().accept(); // ok
//		driver.switchTo().alert().dismiss(); // cancel
//		driver.switchTo().alert().sendKeys("balaji");
//		driver.switchTo().alert().accept();
//		Alert alert = driver.switchTo().alert();
//		alert.sendKeys("balaji");
//		alert.accept();
	}

}

















