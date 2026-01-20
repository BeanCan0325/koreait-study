package kr.co.koreait.day2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class Ex09_Collection {
    public static void main(String[] args) {
        // [컬렉션]
        //- 동일한 자료형을 묶어서 관리하는 자료구조
        // - 저장 공간의 크기를 동적으로 관리.
        //- 기존배열과 동일한 구조를 가짐( 인덱스사용등)
        // - 크기가 동적으로 관리됨

        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(6);
        intList.add(13);
        intList.add(100);

        intList.add(3,10); //인덱스에 값 추가하는 법
        intList.remove(3); //인덱스 제거
        System.out.println(intList);

        // 다 꺼낼때
        for(int i = 0; i< intList.size(); i++){
            System.out.println(intList.get(i)); //index에 접근할때 index번호 써야함
        }


        //<LinkedList>: 각각의 노드가 데이터와 포인터를 가지고 연결된, 링크된 형식을 가진 자료구조(배열)

        /* 데이터(값) 과 포인터(다음값의 위치)
        탐색 속도가 조금 떨어짐
        ArrayList -> Set 으로 바꾸면 중복제거 -> 정렬다시 -> 바꿈 : 순서도 바꾸고 정렬도 해결
         */

        LinkedList<String> linked = new LinkedList<>();
        linked.add("홍길동");
        linked.add("김철수");
        System.out.println(linked);

        //<hashSet>
        // - 순서를 보장하지 않고 중복을 허용하지 않는 특징을 가진 자료구조
        HashSet<Integer>  hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(2);
        hashSet.add(3);

        System.out.println(hashSet);


        //<hashMap>
        //- key -value 형태를 가진 자료구조
        //- key는 중복 불가
        //- value는 중복허용

        //       key값    value값  //Q key 값이 왜 String이지? -> 반대도 됨
        HashMap<String, Integer> hashMap = new HashMap<>();

        hashMap.put("숫자1", 10);
        hashMap.put("숫자2", 20);
        hashMap.put("숫자2", 20);//키 똑같은거 한번 더 하면 값이 덮어씌워진다.
        hashMap.put("숫자3", 40);
        hashMap.put("숫자4", 50);
        hashMap.remove("숫자2");


        System.out.println(hashMap);
        System.out.println(hashMap.get("숫자2"));
        System.out.println(hashMap.keySet());// 전체 키를 배열 형태로 변환

        //set 도 순서보장하고 싶으면 LinkedHashSet
        // map도 순서보장하고 싶으면 LinkedHashMap

        for(String key: hashMap.keySet()){ //.keySet() -> 키를 배열형태로 내보냄
            //맵요소 접근에 키를 써서. 키만 가져오면되는듯.
            System.out.println("key"+key+ "value: "+ hashMap.get(key));// 값을 내보낼 수 있는거.
            //-> 이렇게 하면 배열의 모든요소 (키 + 값) 다 가져올 수 있다.

        }


        //----
    }
}
