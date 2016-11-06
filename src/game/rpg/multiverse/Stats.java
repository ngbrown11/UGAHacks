package game.rpg.multiverse;

import java.util.Random;

public class Stats {

	/*Attributes*/
	
	public int curHealth = 100;
	private int attack, defense, speed, health = 100;
	private static int turn;
	private String name, move1, move2, move3, move4;
	public String key;
	
	/*Constructor*/
	
	public Stats(int x){
		if (x == 1){
			name = "Mario";
			attack = 20;
			defense = 20;
			speed = 20;
			move1 = "Fireball";
			move2 = "Cape";
			move3 = "F.L.U.D.D.";
			move4 = "Goomba Stomp";
			key = "mario.jpg";
		}
		else if (x == 2){
			name = "Link";
			attack = 18;
			defense  = 22;
			speed = 15;
			move1 = "Pottery Abuse";
			move2 = "Rupee Toss";
			move3 = "Army of Chickens";
			move4 = "Triangle Bitch";
			key = "link.jpg";
		}
		else if (x == 3){
			name = "Deadpool";
			attack = 20;
			defense = 18;
			speed = 30;
			move1 = "Excessive Enchilada";
			move2 = "4th wall smack-down";
			move3 = "Zamboni!!!";
			move4 = "Sweet, Sweet Slicing";
			key = "deadpool.jpg";
		}
		else if (x == 4){
			name = "Thomas Edison";
			attack = 24;
			defense = 16;
			speed = 10;
			move1 = "Killer Kite";
			move2 = "Shocking Conclusion";
			move3 = "Founding Father Fussing";
			move4 = "Incandescent Bolt";
			key = "thomasEd.jpg";
		}
	}
	
	/*Actions*/
	public static void incTurn(){
		turn++;
	}
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
	
	public void decDefense(Stats character, Stats enemy){
		incTurn();
		Random random = new Random();
		if(turn != 0){
		character.defense -= random.nextInt(5);
		enemy.defense -= random.nextInt(5);
		}
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
		//s += "Name: " + name + "\n";
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
	
	public String getKey() {
		
		return key;
	}

}