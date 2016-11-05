package game.rpg.multiverse;

import java.util.Scanner;
import java.util.Random;


public class Main {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		Random random = new Random();
		DamageCalcs battle = new DamageCalcs();
		
		System.out.println("Hello, and welcome to the Mutliverse!");
		String s = "";
		System.out.println("Please enter the number corresponding to your preferred fighter.");
		s += "1. Mario" + "\n" + "2. Link" + "\n" + "3. Deadpool" + "\n" + "4. Thomas Edison";
		System.out.println(s);
		int choice = keyboard.nextInt();
		Stats character = new Stats(choice);
		System.out.println("Here are your character's stats.");
		System.out.println(character.displayInfo());
		
		System.out.println("Would you like to fight a random enemy? Y/N");
		String answer = keyboard.next();
		
		Stats enemy = new Stats(0);
		if (answer.equalsIgnoreCase("y")){
			
			int rand = random.nextInt(5);
			while (rand == 0){
				rand = random.nextInt(5);
			}
			enemy = new Stats(rand);
		} else {
			System.out.println("Alright. Here are your choices. Enter the number corresponding to your choice.");
			System.out.println(s);
			int chose = keyboard.nextInt();
			enemy = new Stats(chose);
		}
		System.out.println("Here are your enemy's stats.");
		System.out.println(enemy.displayInfo());
		
		System.out.println("BEGIN");
		while (4 == 4){
			System.out.println(" ");
			System.out.println("Choose your move.");
			System.out.println(character.getMoves());
			int move = keyboard.nextInt();
			
			if(character.getSpeed() > enemy.getSpeed()){
				battle.turnDamage(character, enemy);
				System.out.println(character.getName() + " used " + character.getMove(move));
				if (enemy.getCurHealth() <= 0){
					System.out.println("It did " + battle.getMoveDamage(character, enemy) + " points of damage.");
					System.out.println(character.getName() + " has won!");
					break;
				} else {
					System.out.println("It did " + battle.getMoveDamage(character, enemy) + " points of damage.");
					System.out.println(enemy.getName() + " has " + enemy.getCurHealth() + " points left");
				}
				
				battle.turnDamage(enemy, character);
				int rand2 = random.nextInt(5);
				while (rand2 == 0){
					rand2 = random.nextInt(5);
				}
				
				System.out.println(enemy.getName() + " used " + enemy.getMove(rand2));
				if (character.getCurHealth() <= 0){
					System.out.println("It did " + battle.getMoveDamage(enemy, character) + " points of damage.");
					System.out.println(enemy.getName() + " has won!");
				} else {
					System.out.println("It did " + battle.getMoveDamage(enemy, character) + " points of damage.");
					System.out.println(character.getName() + " has " + character.getCurHealth() + " left");
				}
			} else if (character.getSpeed() < enemy.getSpeed()){
				
				battle.turnDamage(enemy, character);
				int rand2 = random.nextInt(5);
				while (rand2 == 0){
					rand2 = random.nextInt(5);
				}
				
				System.out.println(enemy.getName() + " used " + enemy.getMove(rand2));
				if (character.getCurHealth() <= 0){
					System.out.println("It did " + battle.getMoveDamage(enemy, character) + " points of damage.");
					System.out.println(enemy.getName() + " has won!");
					break;
				} else {
					System.out.println("It did " + battle.getMoveDamage(enemy, character) + " points of damage.");
					System.out.println(enemy.getName() + " has " + enemy.getCurHealth() + " left");
				}
				
				battle.turnDamage(character, enemy);
				System.out.println(character.getName() + " used " + character.getMove(move));
				if (enemy.getCurHealth() <= 0){
					System.out.println("It did " + battle.getMoveDamage(character, enemy) + " points of damage.");
					System.out.println(character.getName() + " has won!");
					break;
				} else {
					System.out.println("It did " + battle.getMoveDamage(character, enemy) + " points of damage.");
					System.out.println(character.getName() + " has " + character.getCurHealth() + " left");
				}
			}
		}
	}
}


//DamageCalcs Class

class DamageCalcs {
	
	public void turnDamage(Stats p1, Stats p2){
		
		/*If you are faster*/
		if (p1.getSpeed() > p2.getSpeed()){
			int calc = p1.getAttack() - p2.getDefense();
			if (calc > 0){
				int health = p2.getCurHealth() - calc;
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


//Stats 

class Stats {

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
