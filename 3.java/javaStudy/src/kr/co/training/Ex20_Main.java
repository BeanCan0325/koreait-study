package kr.co.training;

public class Ex20_Main {

	public static void main(String[] args) {

		Ex20_Animal bear1 = new Ex20_Animal();
//		getter setter 사용시
//		- 객체 생성 후에도 자유롭게 데이터 변경 가능
//		- 필요한 필드만 setter로 값을 넣을 수가 있음
//		- ^ 초기값 이후에 값을 변경 할 필요가 없다면 setter 안만들면됨 
		
		bear1.setName("곰1");
		bear1.setAge(1);
		
		bear1.eat();
		System.out.println(bear1.getName() + ","+bear1.getAge());

		
//		생성자로만 필드를 초기화 하는 경우
//		- 데이터가 불변(객체 생성 후 값이 변하지 않음)
//		 -getter,setter안바꾼다면. 
		Ex20_Animal bear2 = new Ex20_Animal("곰2",7);
		bear2.eat();
		System.out.println(bear2.getName() + ","+bear2.getAge());
//		==============================================
		
		
		Ex20_2_BookInfo bookInfo = new Ex20_2_BookInfo();
		bookInfo.setBookCount(100);

		Ex20_2_Book book = new Ex20_2_Book(); // 도서관 정보 객체 
		book.borrowBook(bookInfo, 3);
		
		book.returnBook(bookInfo, 1);
		
		book.showBookCount(bookInfo);
		
//		=========================================
		
		Ex20_3_MemberInfo kim1 = new Ex20_3_MemberInfo("김학생",17,"떡잎마을",true);
		Ex20_3_MemberInfo park1 = new Ex20_3_MemberInfo("박학생",31,"박잎마을",false);
		
//		======================================
		
		
		Ex20_3_Member mem = new Ex20_3_Member();
		mem.introduce(kim1);
		mem.introduce(park1);
		
		mem.run(kim1);
		mem.run(park1);
		System.out.println("===============================");
		
//		===============================
		Ex21_3_Cat cat1 = new Ex21_3_Cat("냥)까미",3);
		cat1.eat();
		cat1.sleep();
		cat1.nyangPunch();
		
		Ex21_3_Dog dog1 = new Ex21_3_Dog("멍)하루",12);
		dog1.eat();
		dog1.sleep();
		dog1.wagTail();
	
		
	}

}
