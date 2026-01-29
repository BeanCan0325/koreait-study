package kr.co.training;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex05_HashMap {
	public static void main(String[] arsg) {

//		이름, 전화번호 형태의 phoneBook이라는 HashMap생성
		Scanner sc = new Scanner(System.in);
		boolean isTrue = true;

		HashMap<String, String> phoneBook = new HashMap<>();

		while (isTrue) {
			try {

				System.out.println("1.전화번호 추가");
				System.out.println("2.전화번호 검색");
				System.out.println("3.전화번호 전체 검색");
				System.out.println("4.전화번호 삭제");
				System.out.println("0.프로그램 종료");
				System.out.print("메뉴 입력:  ");
				int menu = sc.nextInt();
				sc.nextLine();

				switch (menu) {

				case 1:
//		1번 입력시 : 사용자로부터 이름, 전화번호 입력받음
//					입력받은 이름을 키로, 전화번호를 값으로 phoneBook에 저장
					System.out.print("이름 입력:");
					String name = sc.nextLine();
					System.out.print("전화번호 입력:");
					String phone = sc.nextLine();
					phoneBook.put(name, phone);
					break;

				case 2:
//		2번 입력시 : 사용자로부터 검색할 이름을 입력받습니다.
//					phoneBook에 일치하는 이름이 있다면
//					> "000의 전화번호는 000-000-0000입니다." 출력
//					phoneBook에 일치하는 이름이 없다면
//					> "000의 전화번호를 찾을 수 없습니다."출력
					System.out.print("검색할 이름 입력:");
					String input2 = sc.nextLine();

//			get으로 가져오고 없으면 null뜬다.
//			constainsKey("키") -> 이방법도 있음  : true 나 false로 나옴 
					if (phoneBook.get(input2) != null) {

						System.out.println(input2 + "의 번호:" + phoneBook.get(input2));
						break;
					} else {
						System.out.println("===검색결과 없는데요===");
						break;
					}

				case 3:
//		3번 입력시 : phoneBook에 존재하는 모든 목록을 출력
//					> "이름: 000, 전화번호 : 000-0000-0000"
					System.out.println(phoneBook);
					break;
//					해답:
//					for(String key : phoneBook){
						System.out.println("이름: "+ );
	
				case 4:
//		4번 입력시 : 사용자로부터 삭제할 이름을 입력받는다.
//					phoneBook에 일치하는 이름이 있다면
//					> phoneBook에서 해당 이름을 가진 전화번호 제거 후 "000이름을 삭제했습니다" 출력
//					phoneBook에 일치하는 이름이 없다면
//					> "000의 전화번호를 찾을 수 없습니다." 출력
					System.out.print("삭제할 이름 입력: ");
					String deleteName = sc.nextLine();
					phoneBook.remove(deleteName);
					System.out.println(deleteName + "=삭제완료");
					break;
//					if(phoneBook.constrainKey() else (000전화번호를 찾을 수 없습니다.)

				case 0:
//		0번 입력시: "프로그램을 종료합니다." 출력 후 프로그램 종료
//		그외: 	"올바른 메뉴를 입력해주세요" 출력
					System.out.println("=======프로그램을 종료합니다.===");
					return;

				default:
					System.out.println("==올바른 메뉴를 입력해주세요===");
				}
			} catch (InputMismatchException e) {
				System.out.println("======[오류] 숫자만 입력하쇼======");
				sc.nextLine();
			}
		}//들여쓰기 중괄호 맞추기 ctrl +shift + f
	}

}
