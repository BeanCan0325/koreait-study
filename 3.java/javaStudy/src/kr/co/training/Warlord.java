package kr.co.training;

public class Warlord implements Character{
	
	private CharacterAbility ability;
	private MonsterAbility monster;

	public Warlord() {
		ability = new CharacterAbility(30,17,10); 
	}
	
	void setMonster(MonsterAbility monster) {
		this.monster = monster;
	}

	@Override
	public void attack() {
		double attackAmount = ability.getStr()* 1.3; 
		if(ability.getMp() < 6) {
			System.out.println("---------------------");
			System.out.println("마력이 부족해서 공격할 수 없다.");
		} else if(monster.getHp() <= 0) { 
			System.out.println("---------------------");
			System.out.println("몬스터 사냥을 성공하셨습니다.");
			ability.expUp(13);
		}else {
			monster.setHp(monster.getHp() - attackAmount);
			System.out.println("---------------------");
			System.out.printf("몬스터가  \"%f\"만큼의 피해를 입었습니다!",attackAmount);
			System.out.println("캐릭터의 마력이 6만큼 깎입니다.");
			ability.setMp(6);
			System.out.printf("현재마력: %d",ability.getMp());
		}
	}

	@Override
	public void strSkill() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dexSkill() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void knowledgeSkill() {
		// TODO Auto-generated method stub
		
	}
	
}
