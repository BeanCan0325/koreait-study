package kr.co.koreait;

import java.util.HashMap;

public class Ex12_HashMap {
  public static void main(String[] args) {
	  
//	  [HashMap]
//	  - key-value 형태를 가진 자료구조
//	  - 순서보장
//	  - 키는 중복 허용 X, 값은 중복 허용 0
	  
	  HashMap<String, Integer> map = new HashMap<>();
	  map.put("키1", 10);
	  map.put("키2", 20);
	  map.put("키3", 30);
	  map.put("키1", 40);
	  
//	  (값 가져오기)
	  System.out.println("--------------------------------------------------------------");
	  System.out.println(map);
	  System.out.println(map.get("키1"));
	  System.out.println("--------------------------------------------------------------");
	  
//	  (삭제)
	  map.remove("키2");
	  System.out.println(map);
	  
//	  1. (map이 가진 모든 키들을 **배열** 형태로 반환)
	  System.out.println(map.keySet());
//	  2. (map이 가진 모든 값들을 **배열** 형태로 반환)
	  System.out.println(map.values());
	  
	  System.out.println("--------------------------------------------------------------");
//	  위의 두 메서드 for문 돌리는법
	  for(String key: map.keySet()) {
		  System.out.println("Key: "+ key +", value:" +map.get(key));
//		  													get(a) a의 키를 가진애를 조회한다. 
//		map.get(키값)  -> 키를 가진 값을 조회
		  
      System.out.println("--------------------------------------------------------------");
//		map.value()  -> value값을 조회한다. 
		for(Integer value: map.values()) {
			System.out.println(value);
		}
	  }
	 
	  
  }
}
