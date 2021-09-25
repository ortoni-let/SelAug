package week6.day2;

import org.apache.xmlbeans.impl.piccolo.io.FileFormatException;

public class ThrowVsThrows {
	
	
	
	void sleep() {
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			
		}
		
	}
	
	
	void eat() {
		sleep();
		
	}
	
	public static void main(String[] args) {
		ThrowVsThrows th = new ThrowVsThrows();
		th.eat();
	}
	
	

}
