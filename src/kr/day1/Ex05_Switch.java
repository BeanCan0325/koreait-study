package kr.co.koreait;

import java.util.Scanner;

public class Ex05_Switch {

	public static void main(String[] args) {
		// <switch>
		//  - if와 똑같이 조건문인지만 조건에 사용되는 연산자는 == 만이 가능
		
		// switch문에서 break를 사용하지 않을 경우 fall-through가 발생
		// 코드 흐름이 아래로 쭉 이어져서 코드가 계속 실행되는 현상
		int num = 1;
		
		switch(num) {
		case 1:
			System.out.println("num은 1입니다.");
			break; // switch문을 벗어나겠다.
		case 2:
			System.out.println("num은 2입니다.");
			break;
		default:
			System.out.println("num은 1도 2도 아닙니다.");
		}
		
		// Ctrl + Shift + O
		Scanner sc = new Scanner(System.in);
		
		System.out.println("-----메뉴판-----");
		System.out.println("1. 아이스 아메리카노");
		System.out.println("2. 카페라떼");
		System.out.println("3. 딸기 요거트 스무디");
		System.out.print("메뉴를 선택하세요 : ");
		int choice = sc.nextInt();
		
		// 사용자가 1번을 입력했을 경우 "아이스 아메리카노를 선택하셨습니다." 출력
		// 2번 : "카페라떼를 선택하셨습니다." 출력
		// 3번 : "딸기 요거트 스무디를 선택하셨습니다" 출력
		// 그 외 : "해당하는 메뉴가 없습니다" 출력
		switch(choice) {
		case 1:
			System.out.println("아이스 아메리카노를 선택하셨습니다.");
			break;
		case 2:
			System.out.println("카페라떼를 선택하셨습니다.");
			break;
		case 3:
			System.out.println("딸기 요거트 스무디를 선택하셨습니다.");
			break;
		default:
			System.out.println("해당하는 메뉴가 없습니다.");
		}


	}

}












