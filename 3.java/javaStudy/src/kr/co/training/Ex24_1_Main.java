package kr.co.training;

public class Ex24_1_Main {
	public static void main(String[] args) {
		
		Ex24_1_Car sc = new Ex24_1_SportsCar();
		sc.start();
		sc.accelerate();
		sc.brak();
		
		System.out.println("==========================");
		
		Ex24_1_RegularCar rc = new Ex24_1_RegularCar();
		rc.start();
		rc.accelerate();
		rc.brak();
	}

}
