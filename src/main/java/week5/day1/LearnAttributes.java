package week5.day1;

import org.testng.annotations.Test;

public class LearnAttributes {
	@Test(priority = 0)
	public void login() {
		System.out.println("login");
		throw new RuntimeException();
	}
	@Test(priority = -1)
	public void signup() {
		System.out.println("signup");
	}
	@Test(priority = 3)
	public void addToCart() {
		System.out.println("addToCart");
	}


}
