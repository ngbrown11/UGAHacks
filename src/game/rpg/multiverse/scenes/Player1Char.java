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

public class Player1Char extends Scene {
	
	public Player1Char(Parent root, double width, double height) {
		super(root, width, height);
		this.setFill(Color.DIMGREY);
	}
	
	public static Stats p1;
	
	public void initialize(Group root) {
		
		//Create the variables for the scene
		final Text text = new Text(80, 120, "Do you want a random character for Player 1?");
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
				p1 = new Stats(player);
				
				Alert info = new Alert(AlertType.INFORMATION, "Here are " + p1.getName() + "'s stats:\n\n"
						+ p1.displayInfo());
				info.setTitle("Stats");
				info.setHeaderText(null);
				info.showAndWait();
				
				Group rootNext = new Group();
				Player2Char p2PickScene = new Player2Char(rootNext, 700, 250);
				p2PickScene.initialize(rootNext, p1);
				
				GameFrame.theStage.setScene(p2PickScene);
			}
		});
		no.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg1) {
				Group rootNext = new Group();
				PickChar pickCharScene = new PickChar(rootNext, 600, 300);
				pickCharScene.initialize(rootNext);
				
				GameFrame.theStage.setScene(pickCharScene);
			}
		});
	}
}
