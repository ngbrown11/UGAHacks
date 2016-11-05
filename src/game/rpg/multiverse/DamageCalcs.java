package game.rpg.multiverse;

public class DamageCalcs {
	
	public void turnDamage(Stats p1, Stats p2){
		
		/*If you are faster*/
		if (p1.getSpeed() > p2.getSpeed()){
			int calc = p1.getAttack() - p2.getDefense();
			if (calc > 0){
				int health = p2.getCurHealth() - calc;
				p2.setCurHealth(health);
			} else if(calc == 0) {
				int health = p2.getCurHealth() - 2;
				p2.setCurHealth(health);
			} else {
				p2.setCurHealth(p2.getCurHealth());
			}
			
		}
		
		/*If the enemy is faster*/
		else if (p1.getSpeed() < p2.getSpeed()){
			int calc = p2.getAttack() - p1.getDefense();
			if (calc > 0){
				int health = p1.getCurHealth() - calc;
				p1.setCurHealth(health);
			} else if(calc == 0) {
				int health = p1.getCurHealth() - 2;
				p1.setCurHealth(health);
			} else {
				p1.setCurHealth(p1.getCurHealth());
			}
		}
	}
	
	public int getMoveDamage(Stats p1, Stats p2){
		
		int damage = 0;
		if (p1.getSpeed() > p2.getSpeed()){
			int calc = p1.getAttack() - p2.getDefense();
			if (calc > 0){
				damage = calc;
			} else {
				damage = 0;
			}
		}
		else if (p1.getSpeed() < p2.getSpeed()){
			int calc = p2.getAttack() - p1.getDefense();
			if (calc > 0){
				damage = calc;
			} else {
				damage = 0;
			}
		}
		return damage;
	}
}
