package kr.co.koreait;

public class Ex13_3_BankAccount {

//(실습)	입금메서드: 메서드명:deposit 매개변수:입금할 금액(amount) 출력형식: "000원을 입금했습니다"
//      출금메서드: 메서드명: withdraw 매개변수: 출금할 금액(amount) 출력형식: "000원을 출금했습니다"
//		계좌잔액 확인 메서드:
//			메서드명: checkBalance/ 매개변수: 없음 / 반환: "현재 잔액을 확인합니다"

	int balance = 0;

	public void deposit(int amount) {
		balance += amount;
		System.out.printf("%d원을 입금했습니다. 잔액:%d \n", amount, balance);
	}

	public void withdraw(int amount) {
		balance -= amount;
		if (balance > 0) {
			System.out.printf("%d원을 출금했습니다. 잔액:%d \n",amount,balance);
		} else {
			System.out.printf("잔액이 부족합니다. 잔액:%d \n", balance);
		}
	}

	public String checkBalance() {
		System.out.printf("잔액조회: %d원 \n", balance);
		return ("현재 잔액 확인함");
	}

}
