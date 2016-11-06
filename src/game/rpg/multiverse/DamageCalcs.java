package game.rpg.multiverse;

import game.rpg.multiverse.scenes.PickChar;
import game.rpg.multiverse.scenes.battle.BattleScreen;

public class DamageCalcs {
	
	public static void turnDamageE(Stats p1, Stats p2){
		
		/*If the cpu is attacking*/
		int calc = BattleScreen.p2.getAttack() - PickChar.p1.getDefense();
		if (calc > 0){
			int health = PickChar.p1.getCurHealth() - calc;
			PickChar.p1.setCurHealth(health);
		}
		else {
			PickChar.p1.setCurHealth(p1.getCurHealth());
		}
	
	}
	public static void turnDamageC(Stats p1, Stats p2){
		
		/*If the user is attacking*/
		int calc = PickChar.p1.getAttack() - BattleScreen.p2.getDefense();
		if (calc > 0){
			int health = BattleScreen.p2.getCurHealth() - calc;
			BattleScreen.p2.setCurHealth(health);
		}
		else {
			BattleScreen.p2.setCurHealth(p2.getCurHealth());
		}
	}
	
	public static int getMoveDamageC(Stats p1, Stats p2){
		
		int damage = 0;
		
		int calc = PickChar.p1.getAttack() - BattleScreen.p2.getDefense();
		if (calc > 0)
			damage = calc;
		
		else 
			damage = 0;
		
		return damage;
	}
	
	public static int getMoveDamageE(Stats p1, Stats p2) {
		int damage = 0;
		
		int calc = BattleScreen.p2.getAttack() - PickChar.p1.getDefense();
		if (calc > 0)
			damage = calc;
		
		else 
			damage = 0;
		
		return damage;
	}
}