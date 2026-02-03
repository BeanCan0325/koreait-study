package kr.co.training;

public class Ex21_2_Warlord extends Ex21_2_Character {
//	Charater 클래스를 상속받습니다.

// -------------------------------------
//	객체 생성시 힘50, 민첩10, 지력10, 레벨 1로 생성
//		- 부모 생성자를 호출하세요.
	Ex21_2_Warlord(String username, int str, int dex, int knowledge) {
		super(username);
		super.setStr(str);
		super.setDex(dex);
		super.setKnowledge(knowledge);
	}

//	---
//	attack 메서드 생성
//		- "둔기를 휘두릅니다." 출력
	void attack() {
		System.out.printf("%s이(가) 🤺무기를 휘두릅니다.\n",getUsername());
		System.out.println("🗡️🗡️🗡️🗡️🗡️🗡️🗡️");
		System.out.println("경험치(EXP)가 증가합니다. +2");
		super.addExp(2);
		
	}

//	levelUP() 메서드 생성
//		- "레벨업을 하여 힘이 5 증가합니다."
//	 	- " 현재레벨: 00, 힘:00" 출력
//		- 현재 레벨을 1증가시키고, 힘을 5증가시킵니다.
	
//	==============================================================

}
