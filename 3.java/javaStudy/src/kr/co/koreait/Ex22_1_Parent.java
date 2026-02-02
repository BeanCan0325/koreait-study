package kr.co.koreait;

public class Ex22_1_Parent {
	
	String name;
	
	Ex22_1_Parent(){
		System.out.println("부모생성자 입니다.");
	}
	
	public void info() {
		System.out.println("부모클래스의 "+name+"입니다.");
	}

}
