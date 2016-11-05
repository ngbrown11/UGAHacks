package game.rpg.multiverse;

public class Stats {
	
	/*Attributes*/
	
	public int curHealth = 100;
	private int attack, defense, speed, health = 100;
	private String name, move1, move2, move3, move4;
	
	/*Constructor*/
	
	public Stats(int x){
		if (x == 1){
			name = "Mario";
			attack = 20;
			defense = 20;
			speed = 20;
			move1 = "Get";
			move2 = "Wrecked";
			move3 = "Fckin";
			move4 = "Newb";
		}
		else if (x == 2){
			name = "Link";
			attack = 15;
			defense  = 15;
			speed = 30;
			move1 = "Pottery Abuse";
			move2 = "Rupee Toss";
			move3 = "Army of Chickens";
			move4 = "Triangle Bitch";
		}
		else if (x == 3){
			name = "Deadpool";
			attack = 35;
			defense = 15;
			speed = 40;
			move1 = "Excessive Enchilada";
			move2 = "4th wall smack-down";
			move3 = "Zamboni!!!";
			move4 = "Sweet, Sweet Slicing";
		}
		else if (x == 4){
			name = "Thomas Edison";
			attack = 35;
			defense = 30;
			speed = 15;
			move1 = "Killer Kite";
			move2 = "Shocking Conclusion";
			move3 = "Founding Father Fussing";
			move4 = "";
		}
	}
	
	/*Actions*/
	
	public int getAttack(){
		return attack;
	}
	public int getDefense(){
		return defense;
	}
	public int getSpeed(){
		return speed;
	}
	public int getCurHealth(){
		return curHealth;
	}
	public void setCurHealth(int x){
		this.curHealth = x;
	}
	public String getName(){
		return name;
	}
	public String getMoves(){
		String s = "";
		s += "1." + this.getMove(1) + " 2." + this.getMove(2) + " 3." + this.getMove(3) + " 4." + this.getMove(4);
		return s;
	}
	public String displayInfo(){
		String s = "";
		s += "Name: " + name + "\n";
		s += "Attack: " + attack + "\n" + "Defense: " + defense + "\n";
		s += "Speed: " + speed + "\n" + "Health: " + health + "\n";
		return s;
	}
	public String getMove(int x){
		String move = "";
		if (x == 1){
			move = move1;
		} else if (x == 2){
			move = move2;
		} else if (x == 3){
			move = move3;
		} else if (x == 4){
			move = move4;
		}
		return move;
	}
}
