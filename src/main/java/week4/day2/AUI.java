package week4.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AUI {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");

		// mouse hover
		driver.findElementByXPath("//button[.='✕']").click();
		WebElement elec = driver.findElementByXPath("//div[text()='Electronics']");
		Actions builder = new Actions(driver);

		// hover
		builder.moveToElement(elec).perform();
		driver.findElementByLinkText("Gaming").click();

		System.out.println("Expecting Gaming "+driver.getTitle());
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.titleContains("Gaming1"));
		String title = driver.getTitle();
		System.out.println("Expecting Gaming "+title);
		driver.quit();
	}
}








