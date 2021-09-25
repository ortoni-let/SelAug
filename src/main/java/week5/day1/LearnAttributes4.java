package week5.day1;

import org.testng.annotations.Test;

public class LearnAttributes4 {
	@Test(description = "this test is to do login", enabled = false)
	public void login() {
		System.out.println("login");
	}
	@Test()
	public void signup() {
		System.out.println("signup");
	}
	@Test()
	public void addToCart() {
		System.out.println("addToCart");
	}


}
