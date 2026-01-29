package kr.co.koreait;
import java.util.Scanner;

public class EX04_switch {

	public static void main(String[] args) {
		
		// Switch 문
		// - 특정 변수의 값이 일치하면(==) 코드를 실행하는 조건문
		int num = 2;
		
		switch(num) {
			case 1: 
				System.out.println("num은 1입니다.");
				break;
			case 2: 
				System.out.println("num은 2입니다.");
				break;
			default:
				System.out.println("1,2다 아님");
				
		}
		
		String name ="김탣탣";
		
		switch (name) {
		case "홍길동": 
			System.out.println("홍길동님 어서옵셔");
			break;
		case "김탣탣" :
			System.out.println("김탣탣님 어서욥쇼");
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("=========메뉴선택======");

		int input = sc.nextInt();
		
		switch (input) {
		case 1: System.out.println("1.아아");
		break;
		case 2: System.out.println("2.카페라떼");
		break;
		case 3: System.out.println("3.스무디");
		break;
		}
		
		System.out.print("요일입력");
		int day = sc.nextInt();
		
		switch (day) {
		case 1: 
			System.out.println("평일");
		}
		
int month = sc.nextInt();
		
		switch(month){
			case 1 :
			case 2 :
				   System.out.println("겨울");  break; 
			case 3 :
			case 4 :
			case 5 :
				   System.out.println("봄"); break;
			case 6 :  
			case 7 :
			case 8 :
				   System.out.println("여름"); break;
			case 9 :
			case 10:
			case 11:System.out.println("가을"); break;
			case 12:
		}
		

	}

}
