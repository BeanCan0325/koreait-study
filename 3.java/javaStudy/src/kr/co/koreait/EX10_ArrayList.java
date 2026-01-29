package kr.co.koreait;

import java.util.ArrayList;

public class EX10_ArrayList {
 public static void main(String[] args) {
//1.29 목 수업

//	 [ArrayList]
//	 - 같은 자료형을 가진 데이터를 묶어서 관리하는 자료구조( 배열)
//	 - 크기를 동적으로 조절
//	 	▲ArrayList는 기본길이가 10 -> 다 차면 공식에 맞게 배열을 새로 만들어서 깊은복사함.
//	    ▲ArrayLㅑst<> list = new ArrayList 하면 기본 길이가 10로 나온다는거 
	 
//			  ↓< 자료형: 기본형 변수 올 수 없음. 무조건 래퍼클래스(참조형) 변수 >	 
	 ArrayList<Integer> intList = new ArrayList<>();
	 intList.add(10);
	 intList.add(20);
	 intList.add(30);
	 intList.add(40);
	 
	 intList.add(2,999);
//	 ▲이렇게 특정 리스트에도 넣을 수 있다.
	 
	 System.out.print(intList); 
//	 ▲ArrayList는 sout해도 참조값 출력이 아니고 배열다 출력됨
	 System.out.println("ArrayList의 길이: " + intList.size() );
//	 ▲ intlList.size() : ArrayList에 요소가 몇 개 들어가 있는지 반환 시켜줌
//	 ▲ 넣은 요소의 개수 (길이가 아님) 
	 
	 for (Integer n : intList) {
		System.out.println(n);
	}
	 
	 intList.remove(2);
//	 ▲ 2번 인덱스 요소 삭제
	 System.out.println(intList.get(2));
//	 ▲ 2번 인덱스에 있는 요소 출력
	 
	 intList.clear();
//	 ▲ 전체요소 삭제 
	 System.out.println("삭제 후 intList :"+ intList);
	 System.out.println("isEmpty :"+ intList.isEmpty());
//	 ▲리스트가 비워져있는지. 비워져있음 true 
	 
	 
	 
	 
	 
 }
}
