package kr.co.training;

public class CharacterAbility {
	
	private int level = 1;
	private int str;
	private int dex;
	private int know;
	
	private int hp = 100;
	private int mp = 100;
	
	int hpPortionCount = 10;
	int mpPortionCount = 10;
		
	private int exp =0;
	private int unusedStatus =0;
	
	
//	--- 생성자
	
	public CharacterAbility() {
		this.str = 0;
		this.dex = 0;
		this.know = 0;
	}
	public CharacterAbility(int str, int dex, int know) {
		this.str = str;
		this.dex = dex;
		this.know = know;
	}
//	--- getter
	int getMp() {return this.mp;}
	int getHp() {return this.hp;}
	int getStr() {return this.str;}
	int getDex() {return this.dex;}
	int getKnow() {return this.know;}
	
	
//	--- setter
	void setMp(int amount) {
		this.mp -= amount;
		
	}
	
//	--- 감소메서드
	
	public void decreaseHp(double amount) {
		hp -= amount;
		if (hp <0) hp = 0;
	}
	
	public void decreaseMp(int amount) {
		mp -= amount;
		if (mp < 0) mp = 0;
	}
	
//	--- 증가 메서드
	void addExp(int amount) {
		if (exp >= 100) { exp -= 100; levelUp();}
		else {exp += amount;}
	}

	void levelUp() {level ++;unusedStatus +=5;}
	
//	---
	void usePotion(int useHpPortion, int useMpPortion ) {
		
		if(hpPortionCount != 0) {
			System.out.println("------------------");
			System.out.println("hp포션사용");
			hpPortionCount -= useHpPortion;
			hp = 100;
		} else if(mpPortionCount != 0) {		
			System.out.println("------------------");
			System.out.println("mp포션사용");
			mpPortionCount -= useMpPortion;
			mp = 100;
		} else {
			System.out.println("------------------");
			System.out.println("포션의 개수가 부족합니다.");
		}
	}
//---
	

}
