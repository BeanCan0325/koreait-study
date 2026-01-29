package kr.co.koreait;

import java.util.Scanner;

public class Ex06_While {

	public static void main(String[] args) {
//			while문 
//			- 조건식으로 구성됨
//			
			int cnt=0;
			
			while(cnt <5) {
				System.out.println("현재 cnt값: "+ cnt);
				cnt++;//언젠가 조건식이 나오도록해줘야함 
			}//영원히 반복되면 무한루프 
			
			//while 합계
			int sum = 0;
			int count = 1;
			
			// 1-10까지의 합계
			
			while(count <= 10 ) {
				for(int i = 1; i <11; i++ ) {
					sum += i;
					count++;
				}
			}System.out.println(sum);
			
			
			Scanner sc = new Scanner(System.in);
			System.out.print("0입력시 종료: ");
			int inputExit = sc.nextInt();
			while(inputExit != 0) {
				System.out.print("0을 입력하쇼: ");
				inputExit = sc.nextInt();
			}
			
			int num;
			
			//do -> 최초한번은 무조건 작용한다. 
			
			do {
				System.out.println("0 입력: ");
				num = sc.nextInt();
			} while(num !=0);
			
			//while 조건 -> 코드실행
			//do-while문 -> 코드 실행(do) -> 조건 검사 
			
			
	}

}
