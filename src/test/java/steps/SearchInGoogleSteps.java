package steps;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

class SearchInGoogleSteps {
	
	ChromeDriver driver;
	
	@Given("User should launch the browser")
	public void UserShouldLaunchTheBrowser() {
		System.setProperty("webdriver.chrome.driver", 
				"./driver/chromedriver.exe");
		driver = new ChromeDriver();
		
	}
	@And("User go to the google")
	public void UserGoToTheGoogle() {
		driver.get("https://www.google.com/");
	}
	// person A done some change

	
// 	person b has done some changes
}
