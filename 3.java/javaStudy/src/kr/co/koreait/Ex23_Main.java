package kr.co.koreait;

import java.util.ArrayList;

public class Ex23_Main {
	public static void main(String[] args) {
		
		 Ex22_1_Samsong ss = new Ex22_1_Samsong();
		 ss.powerOn();
		 ss.powerOff();
		 
		System.out.println("=============================");
		
		Ex22_2_Dog dog1 = new Ex22_2_Dog();
		dog1.makeSound();
		
		ArrayList<Ex22_2_Dog> dList = new ArrayList<>();
		dList.add(dog1);
		dList.add(new Ex22_2_Dog());
		
		
		System.out.println(dList.get(0));
		dList.get(0).makeSound();
		dList.get(1).makeSound();
	}

}
