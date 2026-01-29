package kr.co.koreait;

import java.util.Random;
import java.util.Scanner;

public class Ex05_for {

	public static void main(String[] args) {
		
		// [for문]
		// - 조기식, 조건식, 증감식으로 구성
		// - 반복할 횟수를 미리 알고 있을 경우에 사용
		
//		for (int i = 0; i <= 100; i++) {
//			System.out.println("i의값: "+i);
//		}
		
		//문자열.length ->해당 문자열의 길이를 반환
		String subject ="python";
		for(int i =0; i <= subject.length(); i++) {
			System.out.println("subject for문의 i값: "+ i);
		}
		
		for (int i = 3; i>0; i--) {
			System.out.println("i를 1씩 뺴는 for문의 i 값: "+ i);
		}
		
		//사용자가 입력한 횟수만큼 반복하는 for문
		Scanner sc = new Scanner(System.in);
		System.out.print("반복할 횟수:");
		int count = sc.nextInt();
		for( int i =1; i <= count; i++) { // i +=2 ; 이렇게 하면 2씩더해짐
			System.out.println(i+"번째 반복중");
		}
		
		//로또번호 생성
		Random rd =new Random();
		for(int i =0; i <6; i++) {
			int num = rd.nextInt(45)+1; //0-44까지 +1 : 1부터 45까지
			System.out.print(num+"");
		}
		
		for(int i =0; i<3; i++) {
			System.out.println("바깥 for문 i : " + i);
			
			  for (int j=0; j<5; j++) {
				  System.out.println("j: "+j);
			  }
		}

	}

}
