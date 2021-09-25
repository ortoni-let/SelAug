package week3.day2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {

	// unexpected error in a program
	// compile time 
	// run time -> selenium, arrayoutofbound
	
//	throw vs throws
	
//	try {
		// +ve
//	}
//	catch(exp) {
//		-ve
//	}
	public static void main(String[] args) {
		System.out.println("Enter data");
		Scanner sc = new Scanner(System.in);
		try {
			int number = sc.nextInt();
			System.out.println(number%0);	
		}catch (ArithmeticException e) {
//			e.printStackTrace();
			System.err.println("% by 0 not possible "+ e.getMessage());
		}catch(InputMismatchException e) {
			System.err.println("Please enter only number format");
		}catch (Exception e) {
			System.err.println("Some unexpected error");
		}
		finally {
			System.out.println("completed");			
		}

	}

}
