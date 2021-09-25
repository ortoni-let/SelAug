package week4.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draggable {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.get("https://jqueryui.com/draggable/");
//		driver.switchTo().frame(0);
//		WebElement source = driver.findElementById("draggable");
		Actions builder = new Actions(driver);
//		builder.dragAndDropBy(source, 
//				source.getLocation().getX()+20, 
//				source.getLocation().getY()+20)
//		.perform();
		
		driver.get("https://jqueryui.com/sortable/");
		driver.switchTo().frame(0);
		WebElement item2 = driver.findElementByXPath("//li[text()='Item 2']");
		WebElement item5 = driver.findElementByXPath("//li[text()='Item 5']");
		builder.dragAndDropBy(item2, 0, item5.getLocation().getY()/2).perform();

	}
}
