package utils;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class Common {
	protected String ExcelFileName = "";
	long timeOuts = 20;
	protected RemoteWebDriver driver;
	@Parameters({"browser", "URL"})
	@BeforeMethod
	public void startBroswer(String browser, String URL){
		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"./driver/chromedriver.exe");			
			driver = new ChromeDriver();
		}else {
			driver = new EdgeDriver();
			System.out.println("It should run on edge");
		}
		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(timeOuts, TimeUnit.SECONDS);
	}
	
	@AfterMethod
	public void closeBrowser() {
		// screenshot
		File screenshot = driver.getScreenshotAs(OutputType.FILE);
		try {
			FileHandler.copy(screenshot, new File("./sc"+new Date().getTime()+".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
	}

	
	@DataProvider(name="loginSauce")
	public String[][] mytestData() {
		String[][] data = null;
		try {
			data = ExcelDataLib.getData(ExcelFileName);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return data;
	}
}










