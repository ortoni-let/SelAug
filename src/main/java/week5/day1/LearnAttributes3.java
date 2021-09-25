package week5.day1;

import org.testng.annotations.Test;

public class LearnAttributes3 {
	@Test(dependsOnMethods = "signup")
	public void login() {
		System.out.println("login");
	}
	@Test(priority = -1, dependsOnMethods = "addToCart")
	public void signup() {
		System.out.println("signup");
	}
	@Test(priority = -2, dependsOnMethods = "login")
	public void addToCart() {
		System.out.println("addToCart");
	}


}
