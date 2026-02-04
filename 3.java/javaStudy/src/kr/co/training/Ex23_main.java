package kr.co.training;

public class Ex23_main {
	public static void main(String[] args) {
		
		Ex23_1_Farm farm1 = new Ex23_1_Farm();
		Ex23_1_Pig pig1 = new Ex23_1_Pig();
		Ex23_1_Cow cow1 = new Ex23_1_Cow();
		
		
		farm1.sound(pig1);
		farm1.sound(cow1);
//	1. Farm 객체생성
//	2. Pig 객체생성
//	3. cow객체 생성
//	4. Farm의 sound() 메서드 호출
//	 - 2번 호출하여 각각 Pig. Cow 객체를 인자로 넘겨주세요.
		
//		---------------------------------
//		우유사고 만약에 아보카도 있으면 6개사와 
		System.out.println("=================================");
		
		Ex23_2_SuperMarket market = new Ex23_2_SuperMarket();
		
		Ex23_2_HasAvocado c1 = new Ex23_2_HasAvocado();
		market.goSuperMarket(c1);
		System.out.println("구입한 우유 개수: "+market.getMilkCount());
		
		Ex23_2_NoAvocado c2 = new Ex23_2_NoAvocado();
		market.goSuperMarket(c2);
		System.out.println("구입한 우유 개수: "+market.getMilkCount());
	}
}
