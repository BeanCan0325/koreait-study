package kr.co.training;

public class Ex23_2_NoAvocado extends Ex23_2_AvocadoCondition{

	@Override
	public boolean hasAvocado() {
		System.out.println("아보카도 없음");
		return super.hasAvocado();
	}
}
