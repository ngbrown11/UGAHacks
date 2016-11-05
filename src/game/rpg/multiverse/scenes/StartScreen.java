package game.rpg.multiverse.scenes;

import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.control.Button;
import javafx.scene.effect.DropShadow;
import game.rpg.multiverse.GameFrame;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class StartScreen extends Scene {
	
	public StartScreen(Parent root, double width, double height) {
		super(root, width, height);		
		this.setFill(Color.DODGERBLUE);
	}
	
	public void initialize(Group root) {
		
		//Create the variables for the scene
		final Text text = new Text(60, 120, "Multiverse Battleground");
		Button start = new Button("Start");
		start.setLayoutX(175);		//Set location
		start.setLayoutY(150);
		
		//Edit the main text
		text.setFont(Font.font("Calibri", 30));
		text.setFill(Color.WHITE);
		text.setEffect(new DropShadow());
		
		root.getChildren().add(text);
		root.getChildren().add(start);
		
		start.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg1) {
				Group rootNext = new Group();
				PickChar pickCharScene = new PickChar(rootNext, 400, 250);
				pickCharScene.initialize(rootNext);
				
				GameFrame.theStage.setScene(pickCharScene);
			}
		});
		
	}
	
}
