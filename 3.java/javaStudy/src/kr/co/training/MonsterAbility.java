package kr.co.training;

public class MonsterAbility {

	private double damage = 5;
	private double hp = 100;

//	---
	void setDamage(int inDamage) {
		damage = -inDamage;
	}

	double getDamage() {
		return damage;
	}
//---

	void setHp(double inHp) {
		hp += inHp;
	}

	double getHp() {
		return hp;
	}

//	---
	public void decreaseHp(double amount) {
		hp -= amount;
		if (hp > 0)
			hp = 0;
	}

//---
	public void attack(CharacterAbility ability) {
		System.out.println("-------------------");
		System.out.println("몬스터가 공격했습니다!");

		ability.decreaseHp(damage);

		System.out.println("캐릭터가 " + damage + "의 피해를 입었습니다.");
		System.out.println("현재 캐릭터 체력: " + ability.getHp());

	}
//	---
}