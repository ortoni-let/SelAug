package steps;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

class TestByAPerson {
	
	ChromeDriver driver;
	
	@Given("User should launch the browser")
	public void UserShouldLaunchTheBrowser() {
		System.setProperty("webdriver.chrome.driver", 
				"./driver/chromedriver.exe");
	}
}
