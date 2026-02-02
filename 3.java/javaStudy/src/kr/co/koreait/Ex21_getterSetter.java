package kr.co.koreait;

public class Ex21_getterSetter {

	public static void main(String[] args) {
			Ex21_1_Person kim = new Ex21_1_Person();
			
			kim.setAge(10);
			System.out.println(kim.getAge());
			
			kim.setName("kim");
			System.out.println(kim.getName());
			
			kim.setAge(33);
			System.out.println(kim.getAge());

			kim.setAddr("떡잎마을");
			System.out.println(kim.getAddr());
			
			kim.setIsStudent(false);
			System.out.println(kim.getIsStudent());
	}

}
