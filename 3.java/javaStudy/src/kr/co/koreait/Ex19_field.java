package kr.co.koreait;

public class Ex19_field {
	public static void main(String[] args) {
		
////	필드 = 멤버변수
////	 클래스 레벨의 변수를 의미
//	int num2 = 20;
//	
//	Ex19_1_Car car = new Ex19_1_Car();
//	car.wheel = 5;
//	System.out.println(car.speed);
//	System.out.println(car.wheel);
//
//	Ex19_1_Car sonata = new Ex19_1_Car();
//	sonata.speed = 140;
//	sonata.wheel = 7;
//	System.out.println(sonata.speed);
//	System.out.println(sonata.wheel);
//	
//	
////	======================
	Ex19_2_Person jjangGu 
	= new Ex19_2_Person("신짱구",5,"떡잎마을","010-1111-1111");
		jjangGu.introduce();
		
	Ex19_2_Person nawng 
	= new Ex19_2_Person("최냥냥",18);
		nawng.introduce();
//	jjangGu.name = "김짱구";
//	jjangGu.age =5;
//	jjangGu.addr="일본";
//	jjangGu.phone="010-1111-2222";
//	jjangGu.introduce();
		
//	
		System.out.println(Ex19_2_Person.HOBBY);
		
//		Ex19_2_Person.introduce();
	
	
	
}

}
