package kr.co.koreait;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex26_1_Book {
	Scanner sc = new Scanner(System.in);

//	------[ add 메서드 ]-----------
	void add(ArrayList<Ex26_1_BookInfo> list) {

//		=> 도서이름 입력:
		System.out.print("도서 이름: ");
		String title = sc.nextLine();
//					도서이름 중복검사
		for (Ex26_1_BookInfo s : list) {
			if (s.getTitle().equals(title)) {
				throw new Ex26_1_DuplicateBookException("이미 존재하는 책");
			}
		}

//		---
//		=>저자이름 입력
		System.out.print("저자 이름:");
		String author = sc.nextLine();

		Ex26_1_BookInfo bi1 = new Ex26_1_BookInfo(title, author);
		list.add(bi1);
	}

//	------[ remove 메서드 ]-----------
	void remove(ArrayList<Ex26_1_BookInfo> list) {

		System.out.print("삭제할 책 이름을 입력하세요:");
		String title = sc.nextLine();

		boolean found = false;

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getTitle().equals(title)) {
				list.remove(i);
				found = true;
				System.out.printf("[%s] 삭제완료...\n ", title);
				break;
			}
		}

		if (found) {
		} else {
			System.out.printf("[%s]이라는 책은 없습니다.\n", title);
		}
	}

//	-----------show 메서드-------------------
	void show(ArrayList<Ex26_1_BookInfo> list) {
//		전체 도서를 출력(도서이름, 저자)

		for (Ex26_1_BookInfo s : list) {
			System.out.println("제목:" + s.getTitle() + " 저자:" + s.getAuthor());
		}

	}

//	-----------search 메서드-------------------
	void search(ArrayList<Ex26_1_BookInfo> list) {
//		-검색할 도서 이름을 입력받(문자열)
//		도서리스트에 존재하지 않는 도서라면 Ex26_12_BookNotFoundException 발생
//		- 리스트에 해당하는 도서가 있다면 정보를 출력하세요.(도서이름, 저자) 

		System.out.print("검색할 도서 이름 입력:");
		String title = sc.nextLine();

		for (int i =0; i < list.size(); i++) {
			if (list.get(i).getTitle().equals(title)) {
				System.out.printf("[찾는 책 정보] \n 제목: %s \n 저자: %s \n", title, list.get(i).getAuthor());
			} else {
				throw new Ex26_1_BookNotFoundException("존재하지 않는 도서입니다.");
			}
		}
	}
}
//	---------------------------------------------
