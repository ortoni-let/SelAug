package week4.day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnTable {
	
	public static void main(String[] args) {
		// table
		
		System.setProperty("webdriver.chrome.driver",
				"./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://devlabs-860f0.web.app/table");
		WebElement table = driver.findElement(By.cssSelector("table tbody"));
//		driver.findElements(By.tagName("tr"));
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		System.out.println(rows.size());
		
		for (int i = 0; i < rows.size(); i++) {
			WebElement row = rows.get(i);
			List<WebElement> columns = row.findElements(By.tagName("td"));
			WebElement name = columns.get(1);
			if(name.getText().equals("Man")) {
				WebElement lastCol = columns.get(3);
				lastCol.findElement(By.tagName("input")).click();
				break;
			}
		}
		driver.quit();
	}

}












