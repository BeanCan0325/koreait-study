package kr.co.koreait;

public class Ex23_polyM {

	public static void main(String[] args) {

		Ex23_1_Parent parent = new Ex23_1_Parent();
		parent.printHello();
		
		Ex23_1_Child child = new Ex23_1_Child();
		child.displayHello();
		
//		클래스 타입변환 : 자식=> 부모타입으로
		Ex23_1_Parent p = new Ex23_1_Child();
//		Q: 메소드를 몇 개 쓸수 있는가?
		p.printHello();
//		^ 부모클래스에 있는 변수와 메소드만 사용 가능하다.
//		  	근데 그러면 왜 이렇게 씀? 
		
		Ex23_2_Calendar calendar = new Ex23_2_DeskCalendar("빨강", 8);
		calendar.info();
		calendar.hanging();
//		calendar.onTheDesk();
		
		
		Ex23_1_Parent pp = child; 
		// 자식타입을 부모타입으로 변경을 한거.
		
		System.out.println("====================================");
		
		Ex23_3_ComputerRoom cr = new Ex23_3_ComputerRoom();
		cr.cp1 = new Ex23_3_Samsong();
		cr.cp2 = new Ex23_3_LZ();
		cr.cp3 = new Ex23_3_Samsong();
		
		cr.allPowerOn();
		
//		public void selectPowerOn(Ex23_3_Samsong samsong) {
//			samsong.powerOn();
//		}
//		
	
		
		
		
	}

}
