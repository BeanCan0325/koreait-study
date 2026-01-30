package kr.co.koreait;

public class Ex19_2_Person {
//	필드 선언만
//	이름,나이,주소(addr),핸드폰번호(phone)
	
//	introduce 메서드 - 출력만
//	- "이름: 000"
//	- "나이: 000"
//	- "주소:000"
//	-" 핸드폰 번호:00"
	
//	(쭈의)필드는 초기화를 따로 할수 없다. 
	String name;
	int age;
	String addr;
	String phone;
	
	final static String HOBBY = "잠자기";
	
//	public Ex19_2_Person(String name, int age, String addr,String phone) { 
//		this.name = name;
//		this.age = age;
//		this.addr = addr;
//		this.phone = phone;
//	}
	
	Ex19_2_Person(String name, int age){
		this.addr = "지구";
		this.age = age;
		this.phone = "아직없다";
		this.name = name;
	}
	
	Ex19_2_Person(String inputName, int inputAge, String inputAddr, String inputPhone)
	{ System.out.println("생성자호출");
	 this.name =inputName;
	 this.age = inputAge;
	 this.addr = inputAddr;
	 this.phone = inputPhone;
	}
//	클래스 변수명 = new 생성자();
	
	
	
	public void introduce() {
		System.out.println("이름 :" + name);
		System.out.println("나이 :" + age);
		System.out.println("주소 :" + addr);
		System.out.println("핸드폰번호 :" + phone);
	}

}
