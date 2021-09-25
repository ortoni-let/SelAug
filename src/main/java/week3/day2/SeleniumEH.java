package week3.day2;


import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumEH {

	public static void main(String[] args) throws NoSuchElementException{
		System.setProperty("webdriver.chrome.driver",
				"./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.findElementById("user-name1").sendKeys("standard_user");
//		try {
//		} catch (NoSuchElementException e) {
//			System.err.println("here is error");
////			throw new NoSuchElementException("Element not found hence failing the test");
//		}
		driver.findElementById("password").sendKeys("secret_sauce");
//		driver.quit();
	}
	// TODO: throw vs throws

}
