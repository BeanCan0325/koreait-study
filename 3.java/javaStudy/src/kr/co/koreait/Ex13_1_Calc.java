package kr.co.koreait;

public class Ex13_1_Calc {
	
//	(덧셈 메서드)
	public int add(int num1, int num2) {
		
		System.out.println(num1 + num2);
	
		return num1 + num2;
		
	}
	
//	(빼기 메서드)  sub
//	- 매개변수 3개를 받습니다.
//	- 3개를 뺀 값을 반환합니다.
	public int sub(int numbers[]) {
		/**
		 * 숫자 세개 곱하는 메서드에요
		 */
		int resultSum = 0;
		for(int i=0; i<numbers.length; i++) {
			resultSum += numbers[i];
		}
		System.out.println(resultSum);
		
		return resultSum;
	}
	
//	(곱셈 메서드) mul
//	- 매개변수 4개를 받는다.
//	- 4개를 곱한 값을 반환
	public int mul(int n1, int n2, int n3, int n4) {
		int result = n1*n2*n3*n4 ;
		return result;
		
	}
	
//	(나눗셈) div
//	- 매개변수 2개 받
//	-2개를 나눈 몫을 출력
//	-2개를 나눈 나머지를 반환
	public int div(int n1, int n2) {
		System.out.println(n1/n2);
		return (n1%n2);
	}

}
