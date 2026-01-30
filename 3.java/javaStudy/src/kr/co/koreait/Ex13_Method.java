package kr.co.koreait;

public class Ex13_Method {
	public static void main(String[] args) {
		// [메서드]
		// - 정의된 동작이나 기능을 수행

//		2.(객체생성) =인스턴스화 
//		- 코드를 메모리에 올리는 과정
//		- 클래스명 변수명 = new 클래스명();
		Ex13_Method m = new Ex13_Method();
//      - 객체 생성화 
//		m.printHello("안녕 나는 홍길동");
//		String result2 = m.printHello("안녕 나는 홍길동");

		Ex13_1_Calc calc = new Ex13_1_Calc();
//		         ▲던지는 애들  **인자** 
//				-> 메서드에서 받는애들 **매개변수**
//		calc.add(3,4);
//		calc.add(11,22);
//		calc.add(33,4);
//		-> void(return이 없을때)

		int result1 = calc.add(5, 3);
		int[] numbers = { 100, 200, 300, 400 };
		calc.sub(numbers);

//		-> int (return이 있을 때) 

//		(1/30수업)
//		(실습)
		Ex13_2_Person ps = new Ex13_2_Person();
		ps.introduce("이소정", 100);
		ps.sayAge(101);

	// 1. (메서드 생성)
	// public 반환타입 메서드명(자료형, 매개변수명){}
//	   반환타입 종류: void, int, String, int[], ArrayList<> , ...
//	   void : 반환 타입 없음(return없음) 
//	public String printHello(String str) {
//		System.out.println(str);
//		return "잘 출력됨";
//	}

	Ex13_1_Calc cal = new Ex13_1_Calc();
//	int res = cal.sub(0, 0, 0)

//	주석의 종류 
//		>	"/** + enter" => 이 메서드에 대한 설명을 남길 수 있음
//			**
	/**
	 * @param printHello
	 *
	 */
//(실습)
	Ex13_3_BankAccount ba = new Ex13_3_BankAccount();
	ba.deposit(3000);
	ba.withdraw(20);
	
	System.out.println(ba.checkBalance());

	
	
	}
}
