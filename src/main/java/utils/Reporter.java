package utils;

import java.io.IOException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.model.Media;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public abstract class Reporter {

	public static ExtentSparkReporter reporter;
	public static ExtentReports extent;
	public static ExtentTest test;

	public String testcaseName, testcaseDec, author, category;

	@BeforeSuite
	public void startReport() {
		reporter = new ExtentSparkReporter("./reports/result.html");
		extent = new ExtentReports();
		extent.attachReporter(reporter);
	}

	@BeforeClass
	public void report() throws IOException {
		test = extent.createTest(testcaseName, testcaseDec);
		test.assignAuthor(author);
		test.assignCategory(category);  
	}

	public abstract long takeSnap();
	
	public void reportStep(String dec, String status,boolean bSnap ) {
		Media img = null;
		if(bSnap && !status.equalsIgnoreCase("INFO")){
			long snapNumber = 100000L;
			snapNumber = takeSnap();
			img = MediaEntityBuilder
					.createScreenCaptureFromPath("./../reports/images/"+snapNumber+".jpg")
					.build();
		}
		if(status.equalsIgnoreCase("pass")) {
			test.pass(dec, img);
		} else if(status.equalsIgnoreCase("fail")) {
			test.fail(dec, img); 
		}
	}

	public void reportStep(String desc, String status) {
		reportStep(desc, status, true);
	}


	@AfterSuite
	public void stopReport() {
		extent.flush();
	}
}