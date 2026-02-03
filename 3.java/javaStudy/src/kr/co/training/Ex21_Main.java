package kr.co.training;

public class Ex21_Main {
	public static void main(String[] args) {
		
//		--------------------------------------------
//		 주문 번호(number), 주문금액(amount), 주문상태(status)
//		  ex) "ORDER3" , 120.5, "결제완료"
//		Ex21_1_Order order = new Ex21_1_Order();
//		order.setNumber("ORDER1");
//		order.setStatus("주문중...");
//		order.setAmount(120.5);
//		
//		System.out.println(order.getAmount());
//		System.out.println(order.getNumber());
//		System.out.println(order.getStatus());
//		--------------------------------------------
		
//		System.out.println("=======================");
//		Ex21_2_Warlord wl =
//				new Ex21_2_Warlord("마포구불주먹",50,10,10);
//		
//		wl.attack();
//		wl.attack();
//		wl.attack();
//		wl.walk();
//		wl.walk();
//		wl.walk();
//		wl.stop();
//		wl.attack();
//		wl.attack();
//		wl.attack();
//		wl.walk();
//		wl.walk();
//		wl.walk();
//		wl.stop();
		
		System.out.println("====================================");
		Ex21_3_Sorceress sor1 = new Ex21_3_Sorceress(10,3,35);
		sor1.attack();
		sor1.skill();
		sor1.walk();
		sor1.stop();
		
		sor1.attack();
		sor1.attack();
		sor1.attack();
		sor1.attack();
		
		System.out.println(sor.toString());
	}

}
