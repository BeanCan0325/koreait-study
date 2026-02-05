package kr.co.koreait;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex26_Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Ex26_1_Book book = new Ex26_1_Book(); // 도서관련 기능이 있는 객체

		ArrayList<Ex26_1_BookInfo> list = new ArrayList<>();

		while (true) { // """ 세개 쓰면 긴줄, 개행도 가능 java 8버전부터 사용가능
			System.out.print("""
					1. 도서 추가
					2. 도서 삭제
					3. 도서 전체 조회
					4. 도서 검색
					0. 종료
					메뉴: """);

			try {

				int menu = sc.nextInt();
				sc.nextLine();

				switch (menu) {
				case 1 -> book.add(list); // -> 넣으면 break 자동으로 해줌.

				case 2 -> book.remove(list);

				case 3 -> book.show(list);

				case 4 -> book.search(list);

				case 0 -> {
					System.out.println("프로그램 종료");
					return;
				}
				}

			} catch (InputMismatchException e) {
				System.out.println("숫자를 입력");
				sc.nextLine();
			}

		}
	}

}
