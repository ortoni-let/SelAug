package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import myCucumberhooks.DriverInstance;

public class StoryStep extends DriverInstance{
	
	
	// ctrl + shift + o => to do import
	
//	protected ChromeDriver driver;
	
	@Given("user should launch browser")
	public void userShouldLaunchBrowser() {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver = new ChromeDriver();
	}

	@And("user goto google website")
	public void userGotoGoogleWebsite() {
	   driver.get("https://www.google.com/");
	   System.out.println("After navigation: "+driver.getTitle());
	}

	@When("user search for the {string} and {string}")
	public void userSearchForThe(String value, String value1) {
	driver.findElement(By.name("q")).sendKeys(value + value1, Keys.ENTER);
	}

	@Then("page title should have {string}")
	public void pageTitleShouldHave(String expectedValue) {
		if(driver.getTitle().contains(expectedValue)) {
			System.out.println(expectedValue);			
		}else {
			System.out.println("fail");
		}
	}
//	@Then("close the browser")
//	public void closeTheBrowser() {
//	  driver.quit();
//	}
}
