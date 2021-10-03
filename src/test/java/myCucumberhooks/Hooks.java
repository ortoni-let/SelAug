package myCucumberhooks;

import org.openqa.selenium.OutputType;

import cucumber.api.Result.Type;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.AfterStep;
import cucumber.api.java.Before;
import cucumber.api.java.BeforeStep;

public class Hooks extends DriverInstance{


	@BeforeStep
	public void beforeEachStep(Scenario sc) {
//		if(driver != null) {
//			byte[] screenshotAs = driver.getScreenshotAs(OutputType.BYTES);
//			sc.embed(screenshotAs, "image/png");
//		}
	}
	@AfterStep
	public void afterEachStep(Scenario sc) {
		byte[] screenshotAs = driver.getScreenshotAs(OutputType.BYTES);
		sc.embed(screenshotAs, "image/png");
	}



	@Before
	public void beforeSc(Scenario sc) {
		System.out.println("Scenario Name from hooks: "+sc.getName());
		//		Type status = sc.getStatus();
		//		System.out.println("Result: "+ status);
	}
	@After
	public void afterSc(Scenario sc) {
		Type status = sc.getStatus();
		System.out.println("Result: "+ status);
		boolean failed = sc.isFailed();
		if(failed) {
			byte[] screenshotAs = driver.getScreenshotAs(OutputType.BYTES);
			sc.embed(screenshotAs, "image/png");
		}
		driver.quit();
	}

}
