package kr.co.koreait;

public class Ex25_Class2 {
	public static void main(String[] args) {
//		<정적 중첩클래스 생성방법>
//		OuterClass.InnerClass inner = new OuterClass.InnerClass();
//		inner.print();
		
//		<비정적 중첩 클래스 생성 방법>
//		1. 바깥 클래스 객체 생성 먼저
//		OuterClass outer = new OuterClass();
		
//		2. 안쪽(inner)클래스 객체 생성
//		OuterClass.InnerClass inner = outer.new InnerClass();
//		inner.print();
//		----------------------------
		Ex25_1_Calculator cal = new Ex25_1_Calculator(3,4);
		Ex25_1_Calculator.Calc cal2 = cal.new Calc();
		System.out.println(cal2.add());
		
//		익명 내부 클래스 : 딱 여기서만 사용할 익명 내부 클래스 만든거임. 객체 생성 한게 아니고.
		Animal animal = new Animal() {
		@Override 
		public void sound() {
			System.out.println("소리를 냅니다.");
		}
	};
	
//	람다식, 람다 표현식
	Animal animal2 = () -> System.out.println("멍멍");
		
	}
}

interface Animal {
	void sound();
}

class OuterClass {
	private static int staticNum = 10;
	private int instanceNum = 20;

//	static class InnerClass{  : 정적 중첩 클래스
	class InnerClass { // 비정적 중첩 클래스
		public void print() {
			System.out.println(staticNum);
			System.out.println(instanceNum);
		}
	}
}
