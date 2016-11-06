package game.rpg.multiverse.scenes;

import javafx.scene.Scene;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.Group;
import javafx.scene.layout.AnchorPane;
import javafx.scene.Parent;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.image.Image;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.effect.DropShadow;
import game.rpg.multiverse.GameFrame;
import game.rpg.multiverse.Stats;
import game.rpg.multiverse.scenes.battle.BattleScreen;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;

public class Player2Char extends Scene {

	public Player2Char(Parent root, double width, double height) {
		super(root, width, height);
		this.setFill(Color.DIMGREY);
	}
	
	//public static Stats p2;
	
	public void initialize(Group root, Stats p1) {
		
		//Create the variables for the scene
		final Text text = new Text(80, 120, "Do you want a random character for Player 2?");
		Button yes = new Button("Yes");
		Button no = new Button("No");
		yes.setLayoutX(250);		//Set location
		yes.setLayoutY(150);
		yes.setPadding(new Insets(10));
		no.setLayoutX(400);		//Set location
		no.setLayoutY(150);
		no.setPadding(new Insets(10));
		
		//Edit the main text
		text.setFont(Font.font("Calibri", 28));
		text.setFill(Color.CRIMSON);
		text.setEffect(new DropShadow());
		
		root.getChildren().add(text);
		root.getChildren().add(yes);
		root.getChildren().add(no);
		
		yes.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg1) {
				
				//Randomize Char
				int player = (int)(Math.random() * 4) + 1;
				Stats p2 = new Stats(player);
				
				//Make sure the CPU is different than the user
				if(p2.getName() == p1.getName() && player < 4) {
					player += 1;
					p2 = new Stats(player);
				}
				else {
					player -= 1;
					p2 = new Stats(player);
				}
				
				Alert info = new Alert(AlertType.INFORMATION, "Here are " + p2.getName() + "'s stats:\n\n"
						+ p2.displayInfo());
				info.setTitle("Stats");
				info.setHeaderText(null);
				info.showAndWait();
				
				AnchorPane rootFight = new AnchorPane();
				BattleScreen battleScene = new BattleScreen(rootFight, 600, 350);
				battleScene.initialize(rootFight, p1, p2);
				
				GameFrame.theStage.setScene(battleScene);
			}
		});
		no.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg1) {
				Group rootNext = new Group();
				RandChar randCharScene = new RandChar(rootNext, 600, 300);
				randCharScene.initialize(rootNext, p1);
				
				GameFrame.theStage.setScene(randCharScene);
			}
		});
	}
}
