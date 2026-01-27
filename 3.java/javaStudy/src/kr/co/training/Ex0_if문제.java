package kr.co.training;
import java.util.Scanner;

public class Ex0_if문제 {

	public static void main(String[] args) {

//Q1.
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		if(score >= 60) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
		System.out.println("점수: "+ score);
		
//Q2.
		int num1 = sc.nextInt();
		if (num1%2 == 0) {
			System.out.println("짝수입니다.");
		}else if(num1%2 == 1 ) {
			System.out.println("홀수입니다.");
		}else {
			System.out.println("0입니다.");
		}

//Q3. 
		int age = sc.nextInt();
		if(age >= 20) {
			System.out.println("성인");
		}else {
			System.out.println("미성년");
		}
		
//Q4.
		String password = sc.next();
		System.out.println(password.equals("1234")? "로그인 성공" : "로그인 실패");

//Q7. 
		int age = sc.nextInt();
		if(age <= 12) {
			System.out.println("3000원");
		} else if(age >= 18 ) {
			System.out.println("5000원");
		}else {
			System.out.println("10,000원");
		}
		
//Q8.
		String id = sc.next();
		String pwd = sc.next();
		
		System.out.println(id.equals("admin") && pwd.equals("1234") ? "관리자 로그인 성공": "입력다시");
		
//Q9. 
		int grade = sc.nextInt();
		System.out.print("출석여부(t/f 입력):");
		String attendence = sc.next();
		
		if (attendence.equals("t") && grade>= 90) {
			System.out.println("A");
		} else if (attendence.equals("t")&& grade >= 80) {
		System.out.println("B");
		} else if (attendence.equals("t")&& grade >= 70) {
		System.out.println("C");
		} else  {
			System.out.println("F");
		}
			
	
//Q10 
		int month = sc.nextInt();
		
		switch(month){
			case 1 :
			   System.out.println("겨울");
			  break;
			case 2 :
				   System.out.println("겨울");  break; 
			case 3 :
				   System.out.println("봄");	   break;
			case 4 :
				   System.out.println("봄"); break;
			case 5 :
				   System.out.println("봄"); break;
			case 6 :
				   System.out.println("여름"); break;
			case 7 :
				   System.out.println("여름"); break;
			case 8 :
				   System.out.println("여름"); break;
		}
		
		
		
		
		//----
	}

}
