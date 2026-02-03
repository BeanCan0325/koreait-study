package kr.co.training;

public class Ex21_3_CharacterAbility {
//			필드
//				- 힘(Str), 민첩(dex), 지력(knowledge),
//				레벨(Level 초기값:1)
//				Exp,100이 될경우 레벨1증가, 경험치 0
//				hp, 초기값 100, 레벨업을 해도 회복 x
//				mp, 초기값 100, 레벨업을 해도 회복 x
//				- 모든 필드의 접근제어자는 private
//				- 각 필드에 대한 getter/setter 작성
//	 - 현재 능력치를 모두 확인 할 수 있는 toString() 오버라이딩 작성
//	  	- toString 은 문자열 반환
//		- public void toString() { return "문자열"}
		private int str;
		private int dex;
		private int knowledge;
		
		private int level =1;
		private int exp = 0;
		private int hp = 100;
		private int mp = 100;
		
//		---
		void setStr(int setting) {
			str = setting;
		}
		int getStr() {
			return str;
		}
//		---
		void setDex(int setting) {
			dex = setting;
		}
		int getDex() {
			return dex;
		}
//		--- 
		void setKnowledge(int setting) {
			knowledge = setting;
		}
		int getKnowledge() {
			return knowledge;
		}
//		---
		void expUp(int amount) {
			exp += amount;
			levelUp();
		}
//		---
		void damage(int hp, int mp) {
			
			if(this.hp < hp) {
				System.out.println("==🩻체력이 부족합니다.==");
			}else if (this.mp - mp == 0) {
				System.out.println("==🩻마력이 부족합니다.==");
			} else {
			this.hp -= hp;
			this.mp -= mp;
			}
		}
//		--- 
		void levelUp() {
			while(exp >=100) {
				level ++;
				exp -= 100;
				System.out.println("==🎉레벨업!🎉==");
				
				this.knowledge ++;
				this.dex ++;
				this.str ++;
				
				System.out.println("레벨업을 하여 능력치가 상승되었습니다.");
				System.out.printf("str: %d \ndex: %d \nknowledge: %d \n",str,dex,knowledge);
			} 
		}
//		---
		@Override
		public String toString() {
			/**
			 * 현재 능력치 조회 가능
			 */
			String output = 
					"===============\n"+
					"dex: "+dex+"\n"+
					"str: "+str+"\n"+
					"knleg: "+knowledge +"\n"+
					"exp: "+exp+"\n"+
					"level: "+level+"\n"+
					"hp: "+hp+"\n"+
					"mp: "+mp+"\n"+
					"================\n";
//			return		String.format() 이거 있음 
			
		return output;
		}
}
