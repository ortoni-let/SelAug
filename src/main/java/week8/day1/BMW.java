package week8.day1;

public class BMW extends MyCar {

	@Override
	public void applyBrake() {
		System.out.println("DISC");
		
	}
	
	public static void main(String[] args) {
		BMW my = new BMW();
		my.applyBrake();
		my.soundHorn();
	}
	
}
