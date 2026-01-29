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
		String result2 = m.printHello("안녕 나는 홍길동");
		
		Ex13_1_Calc calc = new Ex13_1_Calc();
//		         ▲던지는 애들  **인자** 
//				-> 메서드에서 받는애들 **매개변수**
//		calc.add(3,4);
//		calc.add(11,22);
//		calc.add(33,4);
//		-> void(return이 없을때)
		
		int result1 = calc.add(5, 3);
//		-> int (return이 있을 때) 
		
		

	}

	// 1. (메서드 생성)
	public String printHello(String str) {
		System.out.println(str);
		return "잘 출력됨";
	}
}
