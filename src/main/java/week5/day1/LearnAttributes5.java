package week5.day1;

import org.testng.annotations.Test;

public class LearnAttributes5 {
	@Test(groups = {"reg"})
	public void login() {
		System.out.println("login");
	}
	@Test(groups = {"smoke", "reg"})
	public void signup() {
		System.out.println("signup");
	}
	@Test(groups = {"smoke"})
	public void addToCart() {
		System.out.println("addToCart");
	}
	@Test(alwaysRun = true)
	public void checkout() {
		System.out.println("checkout");
	}


}
