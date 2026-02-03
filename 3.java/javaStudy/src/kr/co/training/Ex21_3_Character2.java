package kr.co.training;

public class Ex21_3_Character2 extends Ex21_3_CharacterAbility{
	
//	walk() :"캐릭터가 한걸음 걷습니다."
	
	void walk() {
		System.out.println("캐릭터가 한걸음 걷습니다.");
		super.expUp(3);
	}
//	stop() : "캐릭터가 멈춥니다."
	void stop() {
		System.out.println("캐릭터가 멈춥니다.");		
	}
//	attack(): "주먹으로 공격합니다"
	void attack() {
		System.out.println("캐릭터가 주먹으로 공격합니다.");		
	}
//	skill() : "공통 스킬을 사용합니다"
	void skill() {
		System.out.println("캐릭터가 공통 스킬을 사용합니다.");		
	}

}
