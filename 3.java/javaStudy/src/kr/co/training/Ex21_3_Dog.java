package kr.co.training;

public class Ex21_3_Dog extends Ex21_3_Animal{
	Ex21_3_Dog(String name, int age){
		super(name,age);
	}
	public void wagTail(){
		System.out.printf("%s이(가) 꼬리🐕를 흔듭니다.\n",super.name);
	}

}
