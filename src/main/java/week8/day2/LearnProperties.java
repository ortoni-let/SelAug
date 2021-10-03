package week8.day2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LearnProperties {
	
	public static void main1(String[] args) throws FileNotFoundException, IOException {
		
		Properties prop = new Properties();
		prop.load(new FileInputStream("locatorsFrench.properties"));
//		String loginBtnXpath = prop.get("LoginPage.loginBtn.xpath").toString();
//		System.out.println(loginBtnXpath);
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.findElementById(prop.get("LoginPage.userName.id").toString())
			.sendKeys("standard_user");
		driver.findElementById(prop.get("LoginPage.password.id").toString())
			.sendKeys("secret_sauce");
		driver.findElementByXPath(prop.get("LoginPage.loginBtn.xpath").toString())
		.click();
		
	}
	
	@FindBy(id="user-name") WebElement eleUserName;
	@FindBy(id="password") WebElement elePassword;
	@FindBy(id="login-button") WebElement eleLoginBtn;
	
	@Test
	public void test() {		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		PageFactory.initElements(driver, this);
		driver.get("https://www.saucedemo.com/");
		eleUserName.sendKeys("standard_user");
		elePassword.sendKeys("secret_sauce");
		eleLoginBtn.click();
	}

}
