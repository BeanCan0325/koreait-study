package kr.co.koreait;

public class Ex22_Main {

	public static void main(String[] args) {

		
//(개념)
//		[상속]
//		- 다른 클래스가 가지고 있는 필드, 메서드를 상속받아 재사용 하는 것
//		- 선언 방식: class 클래스명 extends 상속받을 클래스명
//		- 자바에서는 단일 상속만 가능(부모는 1개만 가질 수 있음)
//		- 모든 클래스의 최상위 부모클래스는 Object 
		
//		<super()>
//		- 부모클래스의 생성자를 호출
//		- 첫 줄에 다른 생성자를 호출하는 부분이 없다면 컴파일러가 super() 자동 삽입
//			> this() 등이 없다면 (this()도 항상 첫줄)
		
		
		Ex22_2_Child ch = new Ex22_2_Child();
		ch.name = "김부모";
		
		ch.info();
		ch.childInfo();
	}

}
