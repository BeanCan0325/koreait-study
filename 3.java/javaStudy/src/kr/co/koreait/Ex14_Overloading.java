package kr.co.koreait;

public class Ex14_Overloading {
	public static void main(String[] args) {

		
//	(개념)
//		[오버로딩]
//				: 같은 메서드 이름을 사용하지만 매개변수의 타입(자료형)과 위치가 다른 방식
//				: vs 오버라이딩??
		
//	(실습)	
		Ex14_Overloading ol = new Ex14_Overloading();
//     - 오버로딩예시
		ol.introduce("냥냥냥");
		ol.introduce("뱡뱡뱡",13);
		ol.introduce(13);
		ol.introduce(13,"뱡뱡뱡");// 이것도 오버로딩
		
		
	}
	
	public void introduce(String name) {
		System.out.printf("안녕하세요 제 이름은 %s 입니다.\n",name);
	}
	public void introduce(int age) {
		System.out.printf("안녕하세요 제 나이는 %d 입니다.\n",age);
	}
	
	public void introduce(String name, int age) {
		System.out.printf("이름: %s , 나이: %d \n",name,age);
	}
	public void introduce(int age, String name) {
		System.out.printf("이름: %s , 나이: %d \n",name,age);
	}
}
