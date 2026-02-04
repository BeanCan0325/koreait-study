package kr.co.koreait;

public  abstract class Ex24_1_Phone {
	
	abstract void openingLogo();
	
	void powerOn() {
		openingLogo();
		System.out.println("핸드폰이 켜집니다.");
	}
	
	void powerOff() {
		System.out.println("핸드폰이 꺼집니다.");
	}

}
