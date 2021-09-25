package week6.day2;

import java.io.File;

import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	// sendKeys - file path
	// Robot class
	// Sikuli, AutoIt -> OCR

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		File file = new File("./data/sample.pdf");
		driver.findElementByCssSelector("#file_upload")
		.sendKeys(file.getAbsolutePath());
		System.out.println(file.getAbsolutePath());
		
		// TODO:
//		LocalFileDetector detector = new LocalFileDetector();
//		File localFile = detector.getLocalFile("./data/sample.pdf");
//		driver.setFileDetector(new LocalFileDetector());
//		driver.findElementByCssSelector("#file_upload")
//		.sendKeys(localFile.getAbsolutePath());
	}

}
