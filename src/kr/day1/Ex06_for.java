package kr.co.koreait;

import java.util.Random;
import java.util.Scanner;

public class Ex06_for {

	public static void main(String[] args) {
		
		// <for>
		//  - 초기식, 조건식, 증감식으로 구성됨
		//  - 조건이 만족하지 않을때 까지 반복 실행
		//  - 반복할 횟수를 알고 있는 경우에 사용
		Scanner sc = new Scanner(System.in);
		System.out.print("반복할 횟수를 입력하세요 : ");
		int num = sc.nextInt();
		
		for(int i=1; i<=num; i++) {
			System.out.println("i의 값 : " + i);
		}
		
		
		// 1부터 100까지의 합
		int sum = 0; // 합계를 저장할 변수
		
		for(int i=1; i<=100; i++) {
			sum += i;
			// sum = sum + i
		}
		
		System.out.println(sum);
		
		// Q1. 짝수를 출력하는 프로그램을 작성하시오.
		//  - 범위는 1부터 20까지 입니다.
		//  - 1~20사이의 짝수만 출력합니다.
		int count = 0;
		
		for(int i=1; i<=20; i++) {
			if(i%2 == 0) {
				count++;
				System.out.println(i);
			}
		}
		
		System.out.println("짝수가 등장한 횟수는 " + count);
		
		// Q2. 로또번호 생성기
		Random random = new Random();  // Ctrl + Shift + O
		
		for(int i=0; i<6; i++) {
			int lottoNumber = random.nextInt(45)+1; // 1~45까지 무작위 번호 생성
			System.out.println(lottoNumber);
		}

	}

}
