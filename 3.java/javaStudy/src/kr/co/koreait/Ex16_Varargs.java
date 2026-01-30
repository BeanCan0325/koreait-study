package kr.co.koreait;

import java.util.Arrays;

public class Ex16_Varargs {

	public static void main(String[] args) {
//(개념)
//  가변길이 매개변수
//		- 매개변수의 개수를 유동적으로 받는 방식
//		- 특징: 배열로 받음
//		- 사용방법: 자료형...
//		- 주의사항1: 가변길이 매개변수는 마지막에 작성되어야 한다.
//		- 주의사항1: 가변길이 매개변수가 작성된 오버로딩은 우선순위가 낮음
//			> 오버로딩은 **시그니처**가 가장 정확히 일치하는 메서드를 우선 호출
//			> 생성자 한줄 = 시그니처
		
//(실습)		
		Ex16_Varargs va = new Ex16_Varargs();
//		va.printNumbers();
		va.printNumbers(1);
		va.printNumbers(1,2);
		va.printNumbers(1,2,3);
		
	}
	
	public void printNumbers(int num, int num2) {
//		이런 순서대로는 안됨.▶(int... , int num) 
//		@**가변길이 매개변수**는 무조건 뒤에 있어야한다.
		System.out.println("매개변수: "+ num);
		System.out.println(num2);
	}
	public void printNumbers(int num, int... numbers) {
		System.out.println("매개변수: "+ num);
		System.out.println("가변길이 매개변수: "+ Arrays.toString(numbers));
	}

}
