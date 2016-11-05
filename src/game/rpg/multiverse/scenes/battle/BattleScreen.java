package game.rpg.multiverse.scenes.battle;

import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.control.Button;
import javafx.scene.effect.DropShadow;
import javafx.event.ActionEvent;
import javafx.application.Application;
import javafx.stage.Stage;
import game.rpg.multiverse.DamageCalcs;
import game.rpg.multiverse.GameFrame;
import game.rpg.multiverse.Stats;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.control.Label;

public class BattleScreen extends Scene {
	
	public BattleScreen(Parent root, double width, double height) {
		super(root, width, height);
		this.setFill(Color.DIMGREY);
	}
	
	DamageCalcs battle = new DamageCalcs();
	//private Stats p1 = new Stats(1);
	private Stats p2 = new Stats(3);
	Stage window = GameFrame.theStage;
	Scene scene1, scene2, scene3, scene4;
	
	//Character buttons
	Button btn1 = new Button();
	Button btn2 = new Button();
	Button btn3 = new Button();
	Button btn4 = new Button();
	//Enemy buttons
	Button btn5 = new Button();
	Button btn6 = new Button();
	Button btn7 = new Button();
	Button btn8 = new Button();
			
	public void initialize(AnchorPane root1, AnchorPane root2, Stats p1) {
		
		//AnchorPane root3 = new AnchorPane();
		//AnchorPane root4 = new AnchorPane();
		
		if(p1.getSpeed() > p2.getSpeed()) {
			CharacterTurn p1Scene = new CharacterTurn(root1, 600, 250);
			p1Scene.initialize(root1, p1);
			window.setScene(p1Scene);
		}
		else if(p1.getSpeed() < p2.getSpeed()) {
			EnemyTurn p2Scene = new EnemyTurn(root2, 600, 250);
			p2Scene.initialize(root2, p2);
			window.setScene(p2Scene);
		}
		
		//Character buttons
		Button btn1 = new Button();
		Button btn2 = new Button();
		Button btn3 = new Button();
		Button btn4 = new Button();
		//Enemy buttons
		Button btn5 = new Button();
		Button btn6 = new Button();
		Button btn7 = new Button();
		Button btn8 = new Button();
		
		//HBox hbox3 = new HBox(5, btn1, btn2, btn3, btn4);	//Contain the buttons on the page
		//HBox hbox4 = new HBox(5, btn5, btn6, btn7, btn8);

		
		btn1.setText(p1.getMove(1));
		btn1.setOnAction(e -> {
			System.out.println(p1.getName() + " used " + p1.getMove(1));
			AnchorPane rootNext = new AnchorPane();
			CharacterTurn p1Scene = new CharacterTurn(rootNext, 600, 250);
			p1Scene.initialize(rootNext, p1);
			window.setScene(p1Scene);
		});
		
		btn2.setText(p1.getMove(2));
		btn2.setOnAction(e -> {
			System.out.println(p1.getName() + " used " + p1.getMove(2));
			AnchorPane rootNext = new AnchorPane();
			CharacterTurn p1Scene = new CharacterTurn(rootNext, 600, 250);
			p1Scene.initialize(rootNext, p1);
			window.setScene(p1Scene);
		});
		
		btn3.setText(p1.getMove(3));
		btn3.setOnAction(e -> {
			System.out.println(p1.getName() + " used " + p1.getMove(3));
			AnchorPane rootNext = new AnchorPane();
			CharacterTurn p1Scene = new CharacterTurn(rootNext, 600, 250);
			p1Scene.initialize(rootNext, p1);
			window.setScene(p1Scene);
		});
		
		btn4.setText(p1.getMove(4));
		btn4.setOnAction(e -> {
			System.out.println(p1.getName() + " used " + p1.getMove(4));
			AnchorPane rootNext = new AnchorPane();
			CharacterTurn p1Scene = new CharacterTurn(rootNext, 600, 250);
			p1Scene.initialize(rootNext, p1);
			window.setScene(p1Scene);
		});
		
		/*//root4 = root2;
		scene4 = new BattleScreen(root2, 600, 250);
		root2.getChildren().addAll(hbox4);
		AnchorPane.setLeftAnchor(hbox4, 10d);
		AnchorPane.setBottomAnchor(hbox4, 10d);*/
		
		btn5.setText(p2.getMove(1));
		btn5.setOnAction(e -> {
			System.out.println(p2.getName() + " used " + p2.getMove(1));
			AnchorPane rootNext = new AnchorPane();
			EnemyTurn p2Scene = new EnemyTurn(rootNext, 600, 250);
			p2Scene.initialize(rootNext, p2);
			window.setScene(p2Scene);
		});
		
		btn6.setText(p2.getMove(2));
		btn6.setOnAction(e -> { 
			System.out.println(p2.getName() + " used " + p2.getMove(2));
			AnchorPane rootNext = new AnchorPane();
			EnemyTurn p2Scene = new EnemyTurn(rootNext, 600, 250);
			p2Scene.initialize(rootNext, p2);
			window.setScene(p2Scene);
		});
		
		btn7.setText(p2.getMove(3));
		btn7.setOnAction(e -> {
			System.out.println(p2.getName() + " used " + p2.getMove(3));
			AnchorPane rootNext = new AnchorPane();
			EnemyTurn p2Scene = new EnemyTurn(rootNext, 600, 250);
			p2Scene.initialize(rootNext, p2);
			window.setScene(p2Scene);
		});
		
		btn8.setText(p2.getMove(4));
		btn8.setOnAction(e -> {
			System.out.println(p2.getName() + " used " + p2.getMove(4));
			AnchorPane rootNext = new AnchorPane();
			EnemyTurn p2Scene = new EnemyTurn(rootNext, 600, 250);
			p2Scene.initialize(rootNext, p2);
			window.setScene(p2Scene);
		});
		
		/*//root3 = root1;
		scene3 = new BattleScreen(root1, 600, 250);
		root1.getChildren().addAll(hbox3);
		AnchorPane.setLeftAnchor(hbox3, 10d);
		AnchorPane.setBottomAnchor(hbox3, 10d);*/
	}
	
}
