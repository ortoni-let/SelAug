package week4.day2;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Solution {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"./driver/chromedriver.exe");
		// disable notification
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(opt);
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.findElementByCssSelector("button[type='submit'].btn-primary").click();
		Thread.sleep(3000);
		driver.findElementByCssSelector("a[alt='IRCTCofficial instagram']").click();
		Set<String> windowHandles = driver.getWindowHandles();
		for (String win : windowHandles) {
			driver.switchTo().window(win);
			String title = driver.getTitle();
			if(title.contains("Facebook")) {
				break;
			}
		}
		System.out.println(driver.getCurrentUrl());
		driver.quit();

	}

}
