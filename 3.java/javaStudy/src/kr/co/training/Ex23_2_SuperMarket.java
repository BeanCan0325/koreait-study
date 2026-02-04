package kr.co.training;

public class Ex23_2_SuperMarket {

	private int milkCount;
	
	public void goSuperMarket(Ex23_2_AvocadoCondition ac) {
		boolean answer	= ac.hasAvocado();
		
		if(answer) { // (answer == true) 일 필요는 없다
			milkCount = 6;
		}else {
			milkCount =1;
		}
	}	

		public int getMilkCount() {
			return milkCount;
		}

	
}

