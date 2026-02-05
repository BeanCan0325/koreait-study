package kr.co.training;

import java.util.Scanner;

public class Game {
	public static void main(String[] args) {
		startGame();
	}
	
	public static void startGame() {
		Scanner sc = new Scanner(System.in);
		Warlord wl = new Warlord();
		MonsterAbility monster = new MonsterAbility();
		
		wl.setMonster(monster);
		
		wl.attack();
	}

}
