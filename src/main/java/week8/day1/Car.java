package week8.day1;

public interface Car {


	void applyBrake();

// java 8
	default	void soundHorn() {
		System.out.println("");
	}
	static	void soundHorn1() {
		System.out.println("");
	}

}
