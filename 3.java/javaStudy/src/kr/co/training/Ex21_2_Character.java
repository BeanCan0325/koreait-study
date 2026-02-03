package kr.co.training;

public class Ex21_2_Character {

	Ex21_2_Character(String username) {
		this.username = username;
	}

//		힘(str), 민첩(dex), 지력(knowledge), 레벨(level) 필드를 가집니다.
//			- 모두 정수형
//			- 접근제어자 : private
	private String username;
	private int str;
	private int dex;
	private int knowledge;
	private int level = 1;
	private int exp =0 ;

//		-----------------------------------------
//		walk 메서드를 가집니다.
//		  - "캐릭터가 한걸음 움직입니다." 출력
//		stop 메서드를 가집니다.
//		  - "캐릭터가 멈춥니다." 출력
	void walk() {
		System.out.printf("🚶‍➡️🚶‍♀️‍➡️🚶‍♂️‍➡️%s이(가) 한걸음 움직입니다.\n", username);
		System.out.println("경험치(EXP)가 증가합니다. +1");
		exp++;
		levelUp();
	}

//		---
	void stop() {
		System.out.printf("%s이(가) 멈춥니다.\n", username);
	}

//		---
	 private void levelUp() {
		 while(exp >= 5) {
			 exp -= 5;
			 level++;
			System.out.printf("==========레벨업! 현재레벨 %d ==============\n", level);
		}
	}

	 void addExp(int amount) {
		exp += amount;
		levelUp();
	}

//	--------------------------------------------------------
//		힘과 체력 필드에 대한 getter/setter
	public void setUsername(String username) {
		this.username = username;
	}

	public String getUsername() {
		return username;
	}

//		---
	public void setStr(int strangth) {
		this.str = strangth;
	}

	public int getStr() {
		return str;
	}

//		---
	public void setDex(int dex) {
		this.dex = dex;
	}

	public int getDex() {
		return dex;
	}

//		---
	public void setKnowledge(int knowledge) {
		this.knowledge = knowledge;
	}

	public int getKnowledge() {
		return knowledge;
	}

//		----
	public int getLevel() {
		System.out.printf("🪄현재레벨은: '%d' 입니다.", level);
		System.out.println("=======능력치========");
		System.out.printf("힘: %d \n민첩: %d \n지식: %d \n", str, dex, knowledge);
		return level;
	}

	public int getExp() {
		return exp;
	}

}
