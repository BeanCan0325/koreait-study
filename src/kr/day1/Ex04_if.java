package kr.co.koreait;

import java.util.Scanner;

public class Ex04_if {

	public static void main(String[] args) {
		// <if문>
		//  - 조건을 검사하고 조건이 참일 때 코드를 실행하는 문법
		int result = 0;
		int number = 5;
		
		// number가 10보다 크거나 같으면 result의 값을 3으로 할당
		if(number >= 10) {
			result = 3;
		}
		
		System.out.println(result);
		
		// 사용자로부터 키보드로 입력받기 위한 자바 표준 클래스
		Scanner sc = new Scanner(System.in);
		
		// print : 줄바꿈 없음
		// println : 기본적으로 줄바꿈을 자동으로 적용
		System.out.print("나이를 입력하세요 : ");
		
		int age = sc.nextInt();
		
		System.out.println("입력된 나이 : " + age);
		
		// 입력받은 나이가 19세 이상이면 "성인입니다." 출력
		if(age >= 19) {
			System.out.println("성인입니다.");
		}
		
		// <if-else if>
		//  - 여러 개의 조건을 주고 싶을 때 사용하는 문법
		int num1 = 7;
		
		if(num1 < 5) {
			System.out.println("num1은 5보다 작습니다.");
		} else if(num1 > 5) {
			System.out.println("num1은 5보다 큽니다.");
		}
		
		
		// <if-else>
		//  - 위의 모든 조건식이 false일 때 실행
		//  - 그 외
		int num2 = 5;
		
		if(num2 != 5) {
			System.out.println("num2는 5가 아닙니다.");
		} else {
			System.out.println("num2는 5입니다.");
		}
		
		
		System.out.print("숫자를 입력하세요 : ");
		int num3 = sc.nextInt();
		
		if(num3 == 10) {
			System.out.println("입력한 값은 10 입니다.");
		} else if(num3 == 20) {
			System.out.println("입력한 값은 20 입니다.");
		} else if(num3 == 30) {
			System.out.println("입력한 값은 30 입니다.");
		} else {
			System.out.println("그 외 다른 값을 입력하셨습니다.");
		}
		
		System.out.print("숫자를 입력하세요 : ");
		int num4 = sc.nextInt();
		
		// "num4가 10보다 크거나 같다." 그리고 "num4가 20보다 작거나 같다"
		//   - 위의 조건에 해당하면 "10~20입니다." 출력
		// "num4가 21과 같다." 또는 "num4가 22와 같다"
		//   - 위의 조건에 해당하면 "21 또는 22와 같습니다."
		// 그 외에는 "잘못된 값을 입력하셨습니다." 출력
		if(num4 >= 10 && num4 <= 20) {
			System.out.println("10~20입니다.");
		} else if(num4 == 21 || num4 == 22) {
			System.out.println("21 또는 22와 같습니다.");
		} else {
			System.out.println("잘못된 값을 입력하셨습니다.");
		}
		
		// 홀수, 짝수, 배수 구하기
		int num5 = 10;
		
		if(num5 % 2 == 0) {
			System.out.println("짝수입니다.");
		} else if(num5 % 2 == 1) {
			System.out.println("홀수입니다.");
		}
		
		
	}

}









