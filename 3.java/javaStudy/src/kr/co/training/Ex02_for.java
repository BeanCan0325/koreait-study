package kr.co.training;

public class Ex02_for {

	public static void main(String[] args) {

		// 1.짝수출력하는 for문 작성
		// -범위: 1-20
		// - 해당 범위 안에 있는 짝수만 출력
		for(int i = 1; i <21; i++) {
			if (i%2 == 0 ) {
				System.out.print(" /i값:"+i);
			}
		}
		
		// 2. 3과 5의 공배수 구하는 for문
		// - 범위 1-100  
		// - 99%3 == 0 -> 3의 배수| 15%5 == 0 -> 5의 배수
		
		for(int i = 1; i <101; i++) {
			if(i%3 == 0 && i%5 ==0) {
				System.out.println("3,5의 공배수:"+i);
			}
		}
		
		// 3. 10팩토리얼의 값을 출력하는 for문
		// - 10팩토리얼 = 1*2*3*4*5*6*7*8*9*10   = 3628800 (값)
		
		int output = 1;
		
		for(int i =1; i<11; i++) {
			output = output * i;
		}
		System.out.println(output);
		
		
		// 4. 별찍기 구현
		// *
		// **
		// ***
		// ****
		// ******
		// int height = 5;
		
		String star = "*";
		
		
		for(int i =1; i<=5; i++  ) {
				for(int j=1; j<=i; j++) {
					System.out.print("*");
				}
		System.out.println(); }
			
		//구구단만들기 2단 - 9단
		
		for(int i =2; i<=9; i++  ) {
			for(int j=1; j<=9; j++) {
				System.out.println(i+" X "+j+"= "+i*j); 
			}
			System.out.println(); 
		}
		// ----
	}


	}
