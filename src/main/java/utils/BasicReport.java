package utils;
//package utils;
//
//import com.aventstack.extentreports.ExtentReports;
//import com.aventstack.extentreports.ExtentTest;
//import com.aventstack.extentreports.MediaEntityBuilder;
//import com.aventstack.extentreports.reporter.ExtentSparkReporter;
//
//public class AutomationReport {
//
//
//	public static void main(String[] args) {
//		// create html file
//		ExtentSparkReporter report = new ExtentSparkReporter("./reports.html");
//		// act as a reporter
//		ExtentReports extent = new ExtentReports();
//		extent.attachReporter(report);
//		ExtentTest test = extent.createTest("TC001 - Sign up");
//		test.assignAuthor("Balaji");
//		test.assignCategory("Regression");
//		test.pass("enter user name");
//		test.pass("enter password is success");
//		test.pass("user created successfully");
//		test = extent.createTest("TC002 - Login");
//		test.assignAuthor("Luis");
//		test.assignCategory("Smoke");
//		test.pass("enter user name");
//		test.pass("enter password");
//		test.pass("Logged in",
//				MediaEntityBuilder
//				.createScreenCaptureFromPath("./naukriws.png")
//				.build());
//		// save
//		extent.flush();
//		System.out.println("Completed");
//	}
//
//}
