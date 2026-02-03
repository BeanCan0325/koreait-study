package kr.co.koreait;

public class Ex22_2_Dog extends Ex22_2_Animal {
  
	@Override
	void eat() {
		System.out.println("멍멍이 먹는 중");
	}
	
	@Override
	void sleep() {
		System.out.println("멍멍이 자는 중");
	}
	
	@Override
	void makeSound() {
		System.out.println("멍멍");
	}
}
