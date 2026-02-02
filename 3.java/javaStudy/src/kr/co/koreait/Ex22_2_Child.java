package kr.co.koreait;

public class Ex22_2_Child extends Ex22_1_Parent{

	Ex22_2_Child(){
		super();
		System.out.println("자식 생성자입니다.");
	}
	
	public void childInfo() {
		System.out.println("자식 클래스의 childInfo() 입니다.");
	}
}
