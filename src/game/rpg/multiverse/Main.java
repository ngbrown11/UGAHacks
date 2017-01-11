package game.rpg.multiverse;

public class Main {

	/*public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		Random random = new Random();
		DamageCalcs battle = new DamageCalcs();
		boolean areCharactersEqual;
		System.out.println("Hello, and welcome to the Mutliverse!");
		String s = "";
		System.out.println("Please enter the number corresponding to your preferred fighter.");
		s += "1. Mario" + "\n" + "2. Link" + "\n" + "3. Deadpool" + "\n" + "4. Thomas Edison";
		System.out.println(s);
		int choice = keyboard.nextInt();
		Stats character = new Stats(choice);
		System.out.println("Here are " + character.getName() + "'s stats.");
		System.out.println(character.displayInfo());
		
		System.out.println("Would you like to fight a random enemy? Y/N");
		String answer = keyboard.next();
		
		Stats enemy = new Stats(0);
		do{
		if (answer.equalsIgnoreCase("y")){
			
			int rand = random.nextInt(5);
			while (rand == 0 || rand == choice){
				rand = random.nextInt(5);
			}
			enemy = new Stats(rand);
		} else {
			System.out.println("Alright. Here are your choices. Enter the number corresponding to your choice.");
			System.out.println(s);
			int chose = keyboard.nextInt();
			enemy = new Stats(chose);
		}
		
			areCharactersEqual = character.getName().equals(enemy.getName());
			if(areCharactersEqual){
				System.out.println("You cannot make two of the same character fight each other. Please make another selection.");
			}
			
		}while(areCharactersEqual);
		
		System.out.println("Here are " + enemy.getName() + "'s stats.");
		System.out.println(enemy.displayInfo());
		
		System.out.println("BEGIN");
		while (4 == 4){
			System.out.println(" ");
			System.out.println("Choose your move.");
			System.out.println(character.getMoves());
			int move = keyboard.nextInt();
			
			character.decDefense(character, enemy);
			Stats.incTurn();
			
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
					break;
				} else {
					System.out.println("It did " + battle.getMoveDamage(enemy, character) + " points of damage.");
					System.out.println(character.getName() + " has " + character.getCurHealth() + " points left");
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
					System.out.println(character.getName() + " has " + character.getCurHealth() + " points left");
				}
				
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
			}
		}*/
}