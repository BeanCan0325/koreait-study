package kr.co.training;

public class Ex21_3_Animal {

	String name;
	int age;
	
	Ex21_3_Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void eat() {
		System.out.printf("🍘 %s(%d살)이(가) 먹습니다. \n",name,age);
	}
	
	public void sleep() {
		System.out.printf("😴 %s(%d살)이(가) 잠을 잡니다. \n",name, age);
	}
	
	@Override
	public String toString() {
		return "이름: "+this.name +"나이: "+age;
	}
}
