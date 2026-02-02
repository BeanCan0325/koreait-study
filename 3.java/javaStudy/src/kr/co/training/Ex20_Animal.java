package kr.co.training;

public class Ex20_Animal {
// private 인스턴스 변수 name, age선언
	
	private String name;
	private int age =0;
	
//	<기본생성자 작성>
//		- 매개변수 하나도 없는 생성자
//		- {}
	
	public Ex20_Animal(){
		
	}
	
//	<매개변수 2개를 받는 생성자>
//		- name,age를 매개변수로 받아 인스턴스 변수에 할당하세요
	
	public Ex20_Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
//	eat() 메서드
//		- 나이가 0~1살이면 "이름(나이)가 분유를 먹는 중입니다.
//		- 나이가 2살 이상이면"이름(나이)가 사료를 먹는 중입니다.
	public void eat() {
		if (age <= 1) {
			System.out.printf("%s(%d살)가 분유를 먹는 중입니다. \n",name,age);
		} else {
			System.out.printf("%s(%d살)가 사료를 먹는 중입니다. \n",name,age);			
		}
	}
	
//	인스턴스 변수에 대한 getter/setter 작성하세요
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return this.age;
	}
	
	
}
