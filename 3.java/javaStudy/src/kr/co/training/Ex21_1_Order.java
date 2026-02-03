package kr.co.training;

public class Ex21_1_Order {
// 		number, amount, status 필드를 가집니다.
//		-접근제어자: private
//		-number, status는 문자열, amount는 실수형

	private String number;
	private String status;
	private double amount;

//	-----------------------------------------
//		필드 3개에 대한 getter/setter
//	 	- amount 필드에 setter에서 주문 금액이 100.0미만일경우
//			"유효사지 않은 금액입니다." 출력
//		- 동일하게 amount 필드의 setter에서 주문 금액이 100.0 이상인경우
//		 	"주문번호: 000, 주문금액: 000, 주문상태: 000"

	public void setNumber(String number) {
		this.number = number;
	}

	public String getNumber() {
		return number;
	}

//		--
	public void setStatus(String status) {
		this.status = status;
	}

	public String getStatus() {
		return status;
	}

//		--
	public void setAmount(double amount) {

		if (amount < 100.0) {
			System.out.println("유효하지 않은 금액입니다.");
			this.amount = 0;
		} else if (amount >= 100.0) {
			System.out.printf("주문번호: %s, 주문금액: %f ,주문상태: %s \n", this.number, amount, this.status);
			this.amount = amount;
		}
	}

	public double getAmount() {
		return amount;
	}

}
