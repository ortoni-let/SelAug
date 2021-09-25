package week3.day1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnDropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.findElementById("user-name").sendKeys("standard_user");
		driver.findElementById("password").sendKeys("secret_sauce");
		driver.findElementById("login-button").click();
//		driver.findElementByXPath("")
		
//		driver.findElementByLinkText(" Login flipart ");
//		driver.findElementByPartialLinkText("flipart"); // a tag only
		WebElement pricedd = driver.findElementByClassName("product_sort_container");
		Select dropdown = new Select(pricedd);
		// select the last option
		List<WebElement> options = dropdown.getOptions();
		System.out.println(options.size());
		dropdown.selectByIndex(options.size() -1);
		// re find -> StaleElementReferenceException
		WebElement price = driver.findElementByClassName("product_sort_container");
		Select newDrop = new Select(price);
		WebElement firstSelectedOption = newDrop.getFirstSelectedOption();
		System.out.println(firstSelectedOption.getText());
		
		//		dropdown.selectByVisibleText("Price (low to high)");
		//		dropdown.selectByValue("hilo");
		//		dropdown.deselectByIndex(1);
		//		boolean multiple = dropdown.isMultiple();
		//		System.out.println(multiple);


	}

}
