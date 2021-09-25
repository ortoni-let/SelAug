package week5.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LearnWindowHandling {

	@Test
	public void multipleWindow() {
		System.setProperty("webdriver.chrome.driver",
				"./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/jsref/met_win_open.asp");
		driver.findElementByLinkText("Try it Yourself »").click();
		String parentWindow = driver.getWindowHandle(); // parent
		System.out.println(parentWindow);
		Set<String> windowHandles = driver.getWindowHandles(); // all the tabs/windows
//		driver.switchTo().window(windowHandles);
		System.out.println(windowHandles);
		List<String> myWin = new ArrayList<>(windowHandles);
		System.out.println(myWin);
		driver.switchTo().window(myWin.get(1));		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.quit();
		driver.switchTo().window(parentWindow); // myWin.get(0)
		System.out.println(driver.getTitle());

	}

}
