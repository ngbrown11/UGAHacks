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

public class PickChar extends Scene {

	public PickChar(Parent root, double width, double height) {
		super(root, width, height);
		this.setFill(Color.BEIGE);
	}
	
	public void initialize(Group root) {
		
		//Create the variables for the scene
		final Text text = new Text(80, 40, "Pick your character");
		
		//Create button variables for scene
		Button select1 = new Button("Select");
		select1.setLayoutX(25);		//Set location
		select1.setLayoutY(200);
		Button select2 = new Button("Select");
		select2.setLayoutX(125);		//Set location
		select2.setLayoutY(200);
		Button select3 = new Button("Select");
		select3.setLayoutX(225);		//Set location
		select3.setLayoutY(200);
		Button select4 = new Button("Select");
		select4.setLayoutX(325);		//Set location
		select4.setLayoutY(200);
		
		//Edit the main text
		text.setFont(Font.font("Calibri", 30));
		text.setFill(Color.CRIMSON);
		text.setEffect(new DropShadow());
		
		//Add to scene
		root.getChildren().add(text);
		root.getChildren().add(select1);
		root.getChildren().add(select2);
		root.getChildren().add(select3);
		root.getChildren().add(select4);
		
		select1.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg1) {
				Group rootNext = new Group();
				
				//ADD THE VARIABLE FOR THE INT TO BE INPUT IN THE STATS CONSTRUCTOR
				
				BattleScreen battleScene = new BattleScreen(rootNext, 400, 250);
				battleScene.initialize(rootNext);
				
				GameFrame.theStage.setScene(battleScene);
			}
		});
		select2.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg1) {
				Group rootNext = new Group();
				
				//ADD THE VARIABLE FOR THE INT TO BE INPUT IN THE STATS CONSTRUCTOR
				
				BattleScreen battleScene = new BattleScreen(rootNext, 400, 250);
				battleScene.initialize(rootNext);
				
				GameFrame.theStage.setScene(battleScene);
			}
		});
		select3.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg1) {
				Group rootNext = new Group();
				
				//ADD THE VARIABLE FOR THE INT TO BE INPUT IN THE STATS CONSTRUCTOR
				
				BattleScreen battleScene = new BattleScreen(rootNext, 400, 250);
				battleScene.initialize(rootNext);
				
				GameFrame.theStage.setScene(battleScene);
			}
		});
		select4.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg1) {
				Group rootNext = new Group();
				
				//ADD THE VARIABLE FOR THE INT TO BE INPUT IN THE STATS CONSTRUCTOR
				
				BattleScreen battleScene = new BattleScreen(rootNext, 400, 250);
				battleScene.initialize(rootNext);
				
				GameFrame.theStage.setScene(battleScene);
			}
		});
	}
}
