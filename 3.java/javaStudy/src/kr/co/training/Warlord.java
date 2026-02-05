package kr.co.training;

public class Warlord implements Character{
	
	private CharacterAbility ability;
	private MonsterAbility monster;

//	--- 생성자
	public Warlord() {
		ability = new CharacterAbility(30,17,10); 
	}
	
	public void setMonstser(MonsterAbility monster) {
		this.monster = monster;
	}
	
	public CharacterAbility getAbility() {
		return ability;
	}
	

	@Override
	public void attack() {
		
		if (monster == null) {
			System.out.println("------------------");
			System.out.println("공격할 몬스터가 없습니다.");
			return;
		}
		
		
		if(ability.getMp() < 6) {
			System.out.println("---------------------");
			System.out.println("마력이 부족해서 공격할 수 없습니다.");
			return;
		}	
			
		double damage = ability.getStr()* 1.3; 
		monster.decreaseHp(damage);
		System.out.println("----------------------");
		System.out.println("몬스터가 " + (int)damage + "의 피해를 입었습니다.");
		
		ability.decreaseMp(6);
		System.out.println("현재 마력: "+ability.getMp());

//		--- 몬스터 처치
		
		 if(monster.getHp() <= 0) { 
			System.out.println("---------------------");
			System.out.println("몬스터 사냥을 성공하셨습니다.");
			ability.addExp(13);
			return;
			}
		 
// --- 몬스터 반격
		 	
		 	monster.attack(ability);
		 
//	--- 캐릭터 사망	 	
		 	if (ability.)
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
