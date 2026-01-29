package kr.co.training;

import java.util.Scanner;

public class Ex03_Array {
 public static void main(String[] args) {
	 //1. 5만큼의 길이를 가진 배열 arrString
	 //2. 위에서 생성한 배열을 아래의 값으로 초기화
//	 -> "A","B","CD","E","FG"
	 //3. 배열의 요소를 1개씩 꺼내서 꺼낸 요소가 "CD"일 경우 출력 후 반복문을 종료하세요.
	 
	 // -------------------------------
	 // 1. 사용자에게 입력받은 점수를 보관할 source 배열 생성(크기 4)
	 // [0] 국어점수 [1] 영어점수 [2] 수학점수 [3] 과학점수
	 // 2. 사용자로부터 국,영,수,과 점수 입력받고 알맞은 배열의 위치에 할당
	 // 3. 배열에 있는 값의 합계 점수와 평균점수 출력
 
 
	 String arrString[] = {"A","B","CD","E","FG"};
	 System.out.println(arrString[1]);
	 
	 for( int i = 0; i<arrString.length; i++) {
		 System.out.println("현재값:"+arrString[i]);
		 if(arrString[i] == "CD") {  //"CD.equals(arrString[i]) 
			 //내가한건 주소비교로 돼서 되는거 
			 break;
		 }
	 }
	 
	 Scanner sc = new Scanner(System.in);
	 int sub[] = new int[4]; 
	 
	 System.out.println("==국영수과 순서대로 점수 입력===");
	 int sum = 0;
	 for( int i= 0; i < sub.length; i++) {
	 sub[i] = sc.nextInt();
	 sum += sub[i];
	 }
	 System.out.println("입력완료");
	 System.out.println("점수 국:"+sub[0]+" 영:"+sub[1]+" 수:"+sub[2]+" 과:"+sub[3]);
	 System.out.println("평균: "+(sum/sub.length));
	 
 
 }
 
}
