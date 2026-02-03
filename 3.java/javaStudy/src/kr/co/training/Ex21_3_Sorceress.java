package kr.co.training;

public class Ex21_3_Sorceress extends Ex21_3_Character2 {
//	Character 클래스 상속받음
//	소서리스 객체 생성 시 힘10,민첩,지력35로생성
	
	Ex21_3_Sorceress(){
		setStr(10);
		setDex(3);
		setKnowledge(35);
	}
	
	Ex21_3_Sorceress(int str, int dex, int knowledge){
		super.setStr(str);
		super.setDex(dex);
		super.setKnowledge(knowledge);
	}
//	---
//	attack() 오버라이딩
//		- "지팡이를 휘두룹니다"
//		- 경험치 25증가, 체력 10감소
//		- 체력이 10 미만일 경우 "체력이 부족합니다." 출력
	@Override
	void attack() {
		System.out.println("지팡이를 휘두룹니다.🪄🪄");
		super.damage(10, 0);
		super.expUp(25);
	}
	
//	---
//	skill() 오버라이딩
//		- "아이스 애로우를 사용합니다."
//		- 경험치 37 증가, 마력 23 감소
//		- 마력이 23 미만일 경우 "마력이 부족합니다"
	@Override
	void skill() {
		System.out.println("아이스 애로우를 사용합니다...🧊🪄");
		super.expUp(37);
		super.damage(0, 23);
	}
	
	
//	levelUp() 
//		- "레벨업을 하여 지력이 5 증가합니다."
//		- 지력 5증가 

}
