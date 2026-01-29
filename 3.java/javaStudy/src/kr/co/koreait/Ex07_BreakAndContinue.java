package kr.co.koreait;

import java.security.SecureRandom;
import java.util.*;

public class Ex07_BreakAndContinue {

	public static void main(String[] args) {

		
		// continue : 반복문의 처음으로 되돌아가는 예약어
		int count = 0;
		
//		while(count<10) {
//			System.out.println(count);
//			
//			if(count == 5) {
//				continue;
//			}
//			count++;
//		}
		
		for(int i = 0; i<10; i++) {
			
			if(i%2 == 0) {
			System.out.println("i는 짝수입니다!");
			continue;
			}System.out.println("i는 홀수입니다.@");
			}
		
		System.out.println("====================================");
		
		//Break문 
		// -반복문 종료
			for(int i = 0; i<10; i++) {
			
			if(i%2 == 0) {
			System.out.println("i는 짝수입니다!");
			break;
			}System.out.println("i는 홀수입니다.@");
		}
			
		// 숫자 맞추기
//			랜덤숫자 출력 메서드
//			(1) Random rd = new Random;
//			    rd.nextInt(45)+1;
//			(2)
//			int magicNum =(int) (Math.random() * 30 )+1; //30까지 출력을 하겠다. 
//			//  				0.0(random 기본이 double 0.0 ~1.0 ==> 0.0~30.0 0.0~31.0(30까지))
//			System.out.println(magicNum);
//
//			
//			Scanner sc =new Scanner(System.in);
//			boolean isMatch = false;  // 정답 유무
//			
//			for(int i =1; i <=10; i++) {
//				System.out.print("숫자를 입력하세요: ");
//				int guess = sc.nextInt();
//				
//				if(guess == magicNum) {
//					System.out.println(i+"번째 맞춤");
//					isMatch = true;
//					break;
//				} else if(guess > magicNum) {
//					System.out.println("맞춰야하는 숫자 작음");
//				} else if(guess <magicNum) {
//					System.out.println("맞춰야하는 숫자 큼");
//				}
//				
//				if(!isMatch) {
//					System.out.println("✖️숫자를 맞추지 못함✖️");					
//					System.out.println("=============================");					
//				}
//				
//			}
				
			 SecureRandom srd = new SecureRandom();
			 System.out.println(srd);					
				
			
		//-----
	}

}
