package kr.co.training;

public class Ex21_3_Cat extends Ex21_3_Animal{
	
	Ex21_3_Cat(String name, int age){
		super(name,age);
	}
	public void nyangPunch(){
		System.out.printf("%s이(가) 냥펀치👊를 날립니다.\n",super.name);
	}

}
