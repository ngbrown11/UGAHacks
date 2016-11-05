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
import javafx.scene.control.Button;
import javafx.scene.effect.DropShadow;
import game.rpg.multiverse.GameFrame;
import game.rpg.multiverse.Stats;
import game.rpg.multiverse.scenes.battle.BattleScreen;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class CPUChar extends Scene {

	public CPUChar(Parent root, double width, double height) {
		super(root, width, height);
		this.setFill(Color.DIMGREY);
	}
	
	public void initialize(Group root) {
		
		//Create the variables for the scene
		final Text text = new Text(140, 120, "Do you want a random opponent?");
		Button yes = new Button("Yes");
		Button no = new Button("No");
		yes.setLayoutX(200);		//Set location
		yes.setLayoutY(150);
		no.setLayoutX(325);		//Set location
		no.setLayoutY(150);
		
		//Edit the main text
		text.setFont(Font.font("Calibri", 26));
		text.setFill(Color.CRIMSON);
		text.setEffect(new DropShadow());
		
		root.getChildren().add(text);
		root.getChildren().add(yes);
		root.getChildren().add(no);
		
		yes.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg1) {
				Group rootNext = new Group();
				PickChar pickCharScene = new PickChar(rootNext, 600, 250);
				pickCharScene.initialize(rootNext);
				
				GameFrame.theStage.setScene(pickCharScene);
			}
		});
		no.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg1) {
				Group rootNext = new Group();
				PickChar pickCharScene = new PickChar(rootNext, 600, 250);
				pickCharScene.initialize(rootNext);
				
				GameFrame.theStage.setScene(pickCharScene);
			}
		});
	}
}
