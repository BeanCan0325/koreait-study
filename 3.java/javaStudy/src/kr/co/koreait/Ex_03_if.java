package kr.co.koreait;

public class Ex_03_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1. if문 
		//  - 조건을 검사하고 true면 특정 코드를 실행시키는 문법
		int num =10;
		
		if(num > 5) {
			System.out.println("number의 값은 5보다 큽니다!");
			System.out.println("a의 값은: " + 5);
		}
		
		//2. if-else문 
		//  -여러 개의 조건식을 사용하고 싶을 때 사용하는 문법
		int number2 =25;
		
		if(number2 >30) {
			System.out.println("num2는 30보다 큽니다.");
		} else if (number2 >25) {
		System.out.println("num2는 25보다 큽니다.");
		} else if (number2 > 20) {
		System.out.println("num2는 20보다 큽니다.");
	}
	     //3. else 문
	    // -위의 조건 외 모두 거짓일때 코드를 실행하는 문법
        // - 그외
		int num3 = 17;
		
		if(num3>30) {
			System.out.println("num3이 30보다 큽니다.");
		}else if(num3> 20) {
		System.out.println("num3이 20보다 큽니다.");
		}else {
		System.out.println("위의 조건식 모두 거짓");
		} 
}
}
