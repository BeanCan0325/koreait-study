package kr.co.training;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex04_ArrayList {

	public static void main(String[] args) {
//    Q1. 6의 배수만 리스트에 추가하세요
//			- 리스트 이름: q1
//			- 들어가는 값들의 타입은 숫자
//			- 1~200 사이의 6의 배수만 리스트 q1에 추가
		ArrayList<Integer> q1 = new ArrayList<>();
		
		for (int i = 1; i < 201;  i++) {

			if (i%6 == 0) {
				q1.add(i);
			} 
		} System.out.println(q1);
		
		// 오답이었던 부분
//		◉ if(q1.get(i)%6 == 0)
		
//		Q2. 학생정보를 저장하기 위한 ArrayList를 생성하세요
//		- 프로그램을 아래와 같은 메뉴를 사용자로부터 입력받으셈
//		   > "1. 학생 추가"
//		   > "2. 학생 목록 조회"
//		   > "3. 프로그램 종료"
//		   > "메뉴 입력: "
//		 - 1번 입력 시 사용자로부터 학생의 이름을 입력 받고 ArrayList에 추가
//		 - 2번 입력 시 ArrayList에 저장된 모든 학생의 이름 출력
//		 - 3번 입력 시 "프로그램을 종료합니다." 출력 후 종료
//		 - 위의 프로그램은 사용자가 종료를 선택할 때 까지 반복
//		 - 리스트 이름 : student
		
		ArrayList<String> student = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		String name;
		int input;
		
		while(true) {
			
			System.out.println("=======번호입력=========");
			System.out.println("1. 학생추가");
			System.out.println("2. 학생 목록 조회");
			System.out.println("3. 프로그램 종료");
			System.out.print("번호 입력:");

			input = sc.nextInt();
			sc.nextLine();
			
				switch (input) {
				case 1 : 
					System.out.print("학생이름 입력:");
					name = sc.nextLine();
					student.add(name);
					break;
//					<버퍼>
//					: 잠깐동안만 저장하는 공간 
//					: 버퍼 -> nextInt()
//					: 위 sc.nextInt 에서 \n 이 남아있어서 한번 빠져나가게 해야함
				
				case 2:
					System.out.println(student);
					break;
					
				case 3:
					System.out.println("프로그램 종료");
					return;
					
			default: 
				System.out.println("잘못된 번호입니다.");
				}
// 			Crtl + shift + F :들여쓰기
				
	
				
			
		}
		
	}
	

		
	}

}
