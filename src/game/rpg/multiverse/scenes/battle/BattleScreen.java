package game.rpg.multiverse.scenes.battle;

import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.application.Platform;
import javafx.stage.Stage;
import javafx.scene.layout.HBox;
import javafx.scene.control.Alert.AlertType;
import java.util.Random;

import game.rpg.multiverse.DamageCalcs;
import game.rpg.multiverse.GameFrame;
import game.rpg.multiverse.Stats;
import game.rpg.multiverse.scenes.PickChar;

public class BattleScreen extends Scene {
	
	public BattleScreen(Parent root, double width, double height) {
		super(root, width, height);
		this.setFill(Color.DIMGREY);
	}
	
	Stage window = GameFrame.theStage;
	/*CharacterTurn p1Scene;
	EnemyTurn p2Scene;*/
	Scene scene1, scene2, scene3, scene4;
	public static Stats p2;
	
	Button btn1;
	Button btn2;
	Button btn3;
	Button btn4;
	Button btn5;
	Button btn6;
	Button btn7;
	Button btn8;
	
	static int turn;
	static Text move = new Text("");
	static Text damage = new Text("");
	static Text health = new Text("");
	Random random = new Random();
	
	public void initialize(AnchorPane root, Stats p1, Stats p2) {
		
		this.p2 = p2;
		final Text moveP1 = new Text(180, 40, "Choose your move");
		Canvas canvas = new Canvas(600, 240);
		GraphicsContext gc = canvas.getGraphicsContext2D();
		
		//Add two fighter images
		Image player = new Image(PickChar.p1.key);
		Image enemy = new Image(p2.key);
		
		gc.drawImage(player, 40, 100);
		gc.drawImage(enemy, (432), 100);
		root.getChildren().add(canvas);
		
		//Create the button variables
		btn1 = new Button();
		btn2 = new Button();
		btn3 = new Button();
		btn4 = new Button();
		HBox hbox1 = new HBox(8, moveP1, btn1, btn2, btn3, btn4);
		btn5 = new Button();
		btn6 = new Button();
		btn7 = new Button();
		btn8 = new Button();
		HBox hbox2 = new HBox(8, btn5, btn6, btn7, btn8);
		//HBox textMove = new HBox(move);
		
		//Player turn
		if(p1.getSpeed() > p2.getSpeed() && (turn % 2 == 0)) {
			
			p1.decDefense(p1, p2);
			turn++;
			//root.getChildren().add(moveP1);
			root.getChildren().add(hbox1);
			root.getChildren().add(move);
			root.getChildren().add(damage);
			root.getChildren().add(health);
			AnchorPane.setRightAnchor(hbox1, 10d);
			AnchorPane.setBottomAnchor(hbox1, 10d);
			AnchorPane.setLeftAnchor(move, 15d);
			AnchorPane.setBottomAnchor(move, 50d);
			AnchorPane.setTopAnchor(damage, 10d);
			AnchorPane.setLeftAnchor(damage, 15d);
			AnchorPane.setTopAnchor(health, 10d);
			AnchorPane.setRightAnchor(health, 10d);
		}
		//CPU turn
		else if(p1.getSpeed() > p2.getSpeed() && (turn % 2 != 0)) {
			
			p1.decDefense(p1, p2);
			turn++;
			root.getChildren().add(hbox2);
			root.getChildren().add(move);
			root.getChildren().add(damage);
			root.getChildren().add(health);
			AnchorPane.setRightAnchor(hbox2, 10d);
			AnchorPane.setBottomAnchor(hbox2, 10d);
			AnchorPane.setLeftAnchor(move, 15d);
			AnchorPane.setBottomAnchor(move, 50d);
			AnchorPane.setTopAnchor(damage, 10d);
			AnchorPane.setLeftAnchor(damage, 15d);
			AnchorPane.setTopAnchor(health, 10d);
			AnchorPane.setRightAnchor(health, 10d);
			int rand = random.nextInt(5);
			while (rand == 0 || rand > 4){
				rand = random.nextInt(5);
			}
			if(rand == 1)
				btn5.fire();
			else if(rand == 2)
				btn6.fire();
			else if(rand == 3)
				btn7.fire();
			else if(rand == 4)
				btn8.fire();
		}
		//CPU turn
		else if(p1.getSpeed() < p2.getSpeed() && (turn % 2 == 0)) {
			
			p1.decDefense(p1, p2);
			turn++;
			root.getChildren().add(hbox2);
			root.getChildren().add(move);
			root.getChildren().add(damage);
			root.getChildren().add(health);
			AnchorPane.setRightAnchor(hbox2, 10d);
			AnchorPane.setBottomAnchor(hbox2, 10d);
			AnchorPane.setLeftAnchor(move, 15d);
			AnchorPane.setBottomAnchor(move, 50d);
			AnchorPane.setTopAnchor(damage, 10d);
			AnchorPane.setLeftAnchor(damage, 15d);
			AnchorPane.setTopAnchor(health, 10d);
			AnchorPane.setRightAnchor(health, 10d);
			int rand = random.nextInt(5);
			while (rand == 0 || rand > 4){
				rand = random.nextInt(5);
			}
			if(rand == 1)
				btn5.fire();
			else if(rand == 2)
				btn6.fire();
			else if(rand == 3)
				btn7.fire();
			else if(rand == 4)
				btn8.fire();
		}
		//Player turn
		else if(p1.getSpeed() < p2.getSpeed() && (turn % 2 != 0)) {
			
			p1.decDefense(p1, p2);
			turn++;
			//root.getChildren().add(moveP1);
			root.getChildren().add(hbox1);
			root.getChildren().add(move);
			root.getChildren().add(damage);
			root.getChildren().add(health);
			AnchorPane.setRightAnchor(hbox1, 10d);
			AnchorPane.setBottomAnchor(hbox1, 10d);
			AnchorPane.setLeftAnchor(move, 15d);
			AnchorPane.setBottomAnchor(move, 50d);
			AnchorPane.setTopAnchor(damage, 10d);
			AnchorPane.setLeftAnchor(damage, 15d);
			AnchorPane.setTopAnchor(health, 10d);
			AnchorPane.setRightAnchor(health, 10d);
		}
		
		
		//HBox hbox3 = new HBox(5, btn1, btn2, btn3, btn4);	//Contain the buttons on the page
		//HBox hbox4 = new HBox(5, btn5, btn6, btn7, btn8);

		//Buttons for user moves
		btn1.setText(p1.getMove(1));
		btn1.setOnAction(e -> {
			move.setText(p1.getName() + " used " + p1.getMove(1));
			damage.setText("It did " + DamageCalcs.getMoveDamageC(PickChar.p1, BattleScreen.p2) + " points of damage.");
			DamageCalcs.turnDamageC(p1, p2);
			health.setText(BattleScreen.p2.getName() + " has " + BattleScreen.p2.getCurHealth() + " points left");
			if (p2.getCurHealth() <= 0){
				
				Alert win = new Alert(AlertType.INFORMATION, "YOU WIN!\n\nCongratulations");
				win.setTitle("MULTIVERSE BATTLEGROUND");
				win.setHeaderText(null);
				win.showAndWait();
				Platform.exit();
			}
			
			AnchorPane rootNext = new AnchorPane();
			BattleScreen p2Scene = new BattleScreen(rootNext, 600, 350);
			p2Scene.initialize(rootNext, PickChar.p1, p2);
			window.setScene(p2Scene);
		});
		
		btn2.setText(p1.getMove(2));
		btn2.setOnAction(e -> {
			move.setText(p1.getName() + " used " + p1.getMove(2));
			damage.setText("It did " + DamageCalcs.getMoveDamageC(PickChar.p1, BattleScreen.p2) + " points of damage.");
			DamageCalcs.turnDamageC(p1, p2);
			health.setText(BattleScreen.p2.getName() + " has " + BattleScreen.p2.getCurHealth() + " points left");
			
			if (p2.getCurHealth() <= 0){
				
				Alert win = new Alert(AlertType.INFORMATION, "YOU WIN!\n\nCongratulations");
				win.setTitle("MULTIVERSE BATTLEGROUND");
				win.setHeaderText(null);
				win.showAndWait();
				Platform.exit();
			}
			
			AnchorPane rootNext = new AnchorPane();
			BattleScreen p2Scene = new BattleScreen(rootNext, 600, 350);
			p2Scene.initialize(rootNext, PickChar.p1, p2);
			window.setScene(p2Scene);
		});
		
		btn3.setText(p1.getMove(3));
		btn3.setOnAction(e -> {
			move.setText(p1.getName() + " used " + p1.getMove(3));
			damage.setText("It did " + DamageCalcs.getMoveDamageC(PickChar.p1, BattleScreen.p2) + " points of damage.");
			DamageCalcs.turnDamageC(p1, p2);
			health.setText(BattleScreen.p2.getName() + " has " + BattleScreen.p2.getCurHealth() + " points left");
			if (p2.getCurHealth() <= 0){
				
				Alert win = new Alert(AlertType.INFORMATION, "YOU WIN!\n\nCongratulations");
				win.setTitle("MULTIVERSE BATTLEGROUND");
				win.setHeaderText(null);
				win.showAndWait();
				Platform.exit();
			}
			
			AnchorPane rootNext = new AnchorPane();
			BattleScreen p2Scene = new BattleScreen(rootNext, 600, 350);
			p2Scene.initialize(rootNext, PickChar.p1, p2);
			window.setScene(p2Scene);
		});
		
		btn4.setText(p1.getMove(4));
		btn4.setOnAction(e -> {
			move.setText(p1.getName() + " used " + p1.getMove(4));
			damage.setText("It did " + DamageCalcs.getMoveDamageC(PickChar.p1, BattleScreen.p2) + " points of damage.");
			DamageCalcs.turnDamageC(p1, p2);
			health.setText(BattleScreen.p2.getName() + " has " + BattleScreen.p2.getCurHealth() + " points left");
			if (p2.getCurHealth() <= 0){
				
				Alert win = new Alert(AlertType.INFORMATION, "YOU WIN!\n\nCongratulations");
				win.setTitle("MULTIVERSE BATTLEGROUND");
				win.setHeaderText(null);
				win.showAndWait();
				Platform.exit();
			}
			
			AnchorPane rootNext = new AnchorPane();
			BattleScreen p2Scene = new BattleScreen(rootNext, 600, 350);
			p2Scene.initialize(rootNext, PickChar.p1, p2);
			window.setScene(p2Scene);
		});
		
		
		//Buttons for CPU moves
		btn5.setText(p2.getMove(1));
		btn5.setOnAction(e -> {
			move.setText(p2.getName() + " used " + p2.getMove(1));
			damage.setText("It did " + DamageCalcs.getMoveDamageE(PickChar.p1, BattleScreen.p2) + " points of damage.");
			DamageCalcs.turnDamageE(p1, p2);
			health.setText(PickChar.p1.getName() + " has " + PickChar.p1.getCurHealth() + " points left");
			if (p1.getCurHealth() <= 0){
				
				Alert lose = new Alert(AlertType.INFORMATION, "YOU LOSE!\n\nSorry, not sorry.");
				lose.setTitle("MULTIVERSE BATTLEGROUND");
				lose.setHeaderText(null);
				lose.showAndWait();
				Platform.exit();
			}
			
			AnchorPane rootNext = new AnchorPane();
			BattleScreen p1Scene = new BattleScreen(rootNext, 600, 350);
			p1Scene.initialize(rootNext, PickChar.p1, p2);
			window.setScene(p1Scene);
		});
		
		btn6.setText(p2.getMove(2));
		btn6.setOnAction(e -> { 
			move.setText(p2.getName() + " used " + p2.getMove(2));
			damage.setText("It did " + DamageCalcs.getMoveDamageE(PickChar.p1, BattleScreen.p2) + " points of damage.");
			DamageCalcs.turnDamageE(p1, p2);
			health.setText(PickChar.p1.getName() + " has " + PickChar.p1.getCurHealth() + " points left");
			if (p1.getCurHealth() <= 0){

				Alert lose = new Alert(AlertType.INFORMATION, "YOU LOSE!\n\nSorry, not sorry.");
				lose.setTitle("MULTIVERSE BATTLEGROUND");
				lose.setHeaderText(null);
				lose.showAndWait();
				Platform.exit();
			}
			
			AnchorPane rootNext = new AnchorPane();
			BattleScreen p1Scene = new BattleScreen(rootNext, 600, 350);
			p1Scene.initialize(rootNext, PickChar.p1, p2);
			window.setScene(p1Scene);
		});
		
		btn7.setText(p2.getMove(3));
		btn7.setOnAction(e -> {
			move.setText(p2.getName() + " used " + p2.getMove(3));
			damage.setText("It did " + DamageCalcs.getMoveDamageE(PickChar.p1, BattleScreen.p2) + " points of damage.");
			DamageCalcs.turnDamageE(p1, p2);
			health.setText(PickChar.p1.getName() + " has " + PickChar.p1.getCurHealth() + " points left");
			if (p1.getCurHealth() <= 0){

				Alert lose = new Alert(AlertType.INFORMATION, "YOU LOSE!\n\nSorry, not sorry.");
				lose.setTitle("MULTIVERSE BATTLEGROUND");
				lose.setHeaderText(null);
				lose.showAndWait();
				Platform.exit();
			}
			
			AnchorPane rootNext = new AnchorPane();
			BattleScreen p1Scene = new BattleScreen(rootNext, 600, 350);
			p1Scene.initialize(rootNext, PickChar.p1, p2);
			window.setScene(p1Scene);
		});
		
		btn8.setText(p2.getMove(4));
		btn8.setOnAction(e -> {
			move.setText(p2.getName() + " used " + p2.getMove(4));
			damage.setText("It did " + DamageCalcs.getMoveDamageE(PickChar.p1, BattleScreen.p2) + " points of damage.");
			DamageCalcs.turnDamageE(p1, p2);
			health.setText(PickChar.p1.getName() + " has " + PickChar.p1.getCurHealth() + " points left");
			if (p1.getCurHealth() <= 0){

				Alert lose = new Alert(AlertType.INFORMATION, "YOU LOSE!\n\nSorry, not sorry.");
				lose.setTitle("MULTIVERSE BATTLEGROUND");
				lose.setHeaderText(null);
				lose.showAndWait();
				Platform.exit();
			}
			
			AnchorPane rootNext = new AnchorPane();
			BattleScreen p1Scene = new BattleScreen(rootNext, 600, 350);
			p1Scene.initialize(rootNext, PickChar.p1, p2);
			window.setScene(p1Scene);
		});
		
	}
	
}
