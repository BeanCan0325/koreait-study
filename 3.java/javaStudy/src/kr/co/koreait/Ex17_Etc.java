package kr.co.koreait;

import java.util.Arrays;

public class Ex17_Etc {

	public static void main(String[] args) {
	
//(개념)		
//	[기본형 변수의 콜스택]	
//		1. 콜스택에 메인 메서드가 올라간다. 
//		  > num =10  (기본형변수num : 값만 올라간다.)
//		  > println()
//		  > changeInt 's num => 1000
//		  > 1000출력 후  changeInt빠진다.
//		  > 기존에 있던 num =10 스택이 남아있다.
//		  > num =10; 출력
		
		Ex17_Etc e = new Ex17_Etc();
		int num = 10;
		System.out.println("메서드 호출 전:  "+ num); // 10
		
//		e.changeInt(num);
		System.out.println("메서드 호출 전:  "+ num);//10
	
//	[ 참조형 변수의 콜스택]	---------------------
		int[] numArr = {1,2,3};
		System.out.println("메서드 호출 전: "+ Arrays.toString(numArr));
		
		e.changeInt(numArr);
		
		System.out.println("메서드 호출 후: "+ Arrays.toString(numArr));
	
	}
	
//		public void changeInt(int num) {
//			num= 1000;
//			System.out.println("메서드 호출: "+ num); //10;
//		}
		public void changeInt(int numbers[]) {
			numbers[0]= 999;
			System.out.println("메서드 호출: "+ Arrays.toString(numbers)); //10;
		}

}
