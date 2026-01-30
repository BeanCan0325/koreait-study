package kr.co.koreait;

public class Ex13_2_Person {

	String name;
	int age;
	
//(실습)	이름, 나이 입력받고 "안녕하세요. 제 이름은 000, 나이는 00살 입니다." 출력
	public void introduce(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.printf("안녕하세요. 제 이름은 %s 입니다. 제 나이는 %d 입니다.\n",name,age);
	}
	
//(실습)	sayAge() 메서드 생성
//	- 매개변수로 나이를 받은 후
//	- 나이를 반환: "ㅇㅇ살입니다."
	public Integer sayAge(int age) {
		this.age = age;
		System.out.printf("%d살 입니다. \n",age);
		return age;
		
	}
	
	
	
}
