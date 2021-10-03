package week8.day2;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnChromeOptions {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		ChromeOptions opt  = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		opt.addArguments("--incognito");
//		opt.addArguments("--start-fullscreen");
		opt.addArguments("--disable-infobars");
		ChromeDriver driver = new ChromeDriver(opt);
		driver.get("https://www.irctc.co.in/nget/train-search");
	}

}
