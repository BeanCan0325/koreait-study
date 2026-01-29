package kr.co.koreait;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;

public class EX11_LinkedList_HashSet {
	public static void main(String[] args) {
		
//		◒[LinkedList]◒
//		- 각각의 노드가 데이터와 포인터를 가지고 있는 자료구조
//		(생성)
		LinkedList<String> linked =new LinkedList<>();
		linked.add("A");
		linked.add("B");
		linked.add("C");
		
		
//		삭제
		linked.remove(1);
		System.out.println(linked);
		
		
//		===========================================================
//		◒[HashSet]◒
//		- 중복 불가
//		- 순서보장 X : 중복제거 할때 주로 사용 
//					▲ ArrayList안에 있는거 다 꺼내서 HashSet 안에 넣으면 중복제거
//		(생성)
		
		HashSet<Integer> hash = new HashSet<>();
		hash.add(10);
		hash.add(20);
		hash.add(30);
		hash.add(40);
		System.out.println(hash);
		
		
//		(중복제거)
		ArrayList<String> a = new ArrayList<>();
		a.add("A");;
		a.add("B");
		a.add("C");
		a.add("B");
		a.add("A");
//		                                    ↓ : ArrayList에 있는 데이터를 HashSet으로 변환 
		HashSet<String> set = new HashSet<>(a);
		System.out.println(set);
		
		ArrayList<String> result = new ArrayList<>();
//		Set은 순서를 보장하지 않으니 ArrayList로 다시 변환  
		
		Collections.sort(result);
//		다시 순서대로 배치
		}

}
