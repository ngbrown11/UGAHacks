package game.rpg.multiverse;

import game.rpg.multiverse.scenes.PickChar;
import game.rpg.multiverse.scenes.Player1Char;
import game.rpg.multiverse.scenes.battle.BattleScreen;

public class DamageCalcs {
	
	public static void turnDamageE(Stats p1, Stats p2){
		
		/*If the cpu is attacking*/
		int calc = p2.getAttack() - p1.getDefense();
		if (calc > 0){
			int health = p1.getCurHealth() - calc;
			p1.setCurHealth(health);
		}
		else {
			p1.setCurHealth(p1.getCurHealth());
		}
	
	}
	public static void turnDamageC(Stats p1, Stats p2){
		
		/*If the user is attacking*/
		int calc = p1.getAttack() - p2.getDefense();
		if (calc > 0){
			int health = p2.getCurHealth() - calc;
			p2.setCurHealth(health);
		}
		else {
			p2.setCurHealth(p2.getCurHealth());
		}
	}
	
	public static int getMoveDamageC(Stats p1, Stats p2){
		
		int damage = 0;
		
		int calc = p1.getAttack() - p2.getDefense();
		if (calc > 0)
			damage = calc;
		
		else 
			damage = 0;
		
		return damage;
	}
	
	public static int getMoveDamageE(Stats p1, Stats p2) {
		int damage = 0;
		
		int calc = p2.getAttack() - p1.getDefense();
		if (calc > 0)
			damage = calc;
		
		else 
			damage = 0;
		
		return damage;
	}
}