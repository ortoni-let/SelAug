package week6.day2;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class LearnJSExecutor {
	
	// TODO 1: Print the page title without using getTitle()
	// TODO 2: Change the 3rd button color to red - https://devlabs-860f0.web.app/button
	
	
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
//		driver.get("https://devlabs-860f0.web.app/edit");
//		// sendKeys
//		driver.executeScript("document.getElementById(\"fullName\").value = \"Balaji\"");
//		
		/*
		 * WebElement edit = driver.findElementByXPath("//*[@id='fullName']");
		 * String script1 = "arguments[0].value = 'Balaji C'";
		 * driver.executeScript(script1,edit);
		 */
		
		// click
		driver.get("https://devlabs-860f0.web.app/button");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.executeScript("document.getElementById(\"button1\").click()");
		String script = "arguments[0].style.background =\"red\"";
	    WebElement button3 = driver.findElementById("button3");
	    driver.executeScript(script, button3);
	    
	    
	    try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		// scroll
		driver.get("https://www.naukri.com/");
//		WebElement iq = driver.findElementByLinkText("Interview Questions");
//		System.out.println(iq.getText());
//		int y = iq.getLocation().getY();
//		driver.executeScript("scroll(0, "+y+")");
//		
//		File screenshotAs = driver.getScreenshotAs(OutputType.FILE);
//		try {
//			FileHandler.copy(screenshotAs, new File("./naukriws.png"));
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		driver.executeScript("arguments[0].click()", iq);
	}
	
	

}
