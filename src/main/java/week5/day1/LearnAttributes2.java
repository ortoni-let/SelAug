package week5.day1;

import org.testng.annotations.Test;

public class LearnAttributes2 {
	@Test(dependsOnMethods = "week5.day1.LearnAttributes2.signup")
	public void login() {
		System.out.println("login");
		throw new RuntimeException();
	}
	@Test()
	public void checkOut() {
		System.out.println("checkOut");
	}
	@Test()
	public void signup() {
		System.out.println("signup");
	}
	@Test(alwaysRun = true, enabled = false, dependsOnMethods = "week5.day1.LearnAttributes2.login")
	public void addToCart() {
		System.out.println("addToCart");
	}


}
