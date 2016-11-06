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

public class RandChar extends Scene {

	public RandChar(Parent root, double width, double height) {
		super(root, width, height);
		this.setFill(Color.BEIGE);
	}
	
	public void initialize(Group root) {
		
		//Create the variables for the scene
		final Text text = new Text(180, 40, "Pick CPU character");
		Canvas canvas = new Canvas(600, 190);
		GraphicsContext gc = canvas.getGraphicsContext2D();
		
		//Create image variables for characters
		Image mario = new Image("mario.jpg");
		gc.drawImage(mario, 40, 60);
		Image link = new Image("link.jpg");
		gc.drawImage(link, (40+130), 60);
		Image deadpool = new Image("deadpool.jpg");
		gc.drawImage(deadpool, (40+130+130), 60);
		Image thomas = new Image("thomasEd.jpg");
		gc.drawImage(thomas, (40+130+130+130), 60);
		
		//Create button variables for scene
		Button select1 = new Button("Select");
		select1.setLayoutX(75);		//Set location
		select1.setLayoutY(200);
		Button select2 = new Button("Select");
		select2.setLayoutX(200);		//Set location
		select2.setLayoutY(200);
		Button select3 = new Button("Select");
		select3.setLayoutX(325);		//Set location
		select3.setLayoutY(200);
		Button select4 = new Button("Select");
		select4.setLayoutX(450);		//Set location
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
		root.getChildren().add(canvas);
		
		select1.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg1) {
				AnchorPane rootNext = new AnchorPane();
				
				Stats p2 = new Stats(1);
				System.out.println("CPU is Mario");
				
				//ADD THE VARIABLE FOR THE INT TO BE INPUT IN THE STATS CONSTRUCTOR
				
				BattleScreen battleScene = new BattleScreen(rootNext, 600, 250);
				battleScene.initialize(rootNext, PickChar.p1, p2);
				
				GameFrame.theStage.setScene(battleScene);
			}
		});
		select2.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg1) {
				AnchorPane rootNext = new AnchorPane();
				
				Stats p2 = new Stats(2);
				System.out.println("CPU is Link");
				
				//ADD THE VARIABLE FOR THE INT TO BE INPUT IN THE STATS CONSTRUCTOR
				
				BattleScreen battleScene = new BattleScreen(rootNext, 600, 250);
				battleScene.initialize(rootNext, PickChar.p1, p2);
				
				GameFrame.theStage.setScene(battleScene);
			}
		});
		select3.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg1) {
				AnchorPane rootNext = new AnchorPane();
				
				Stats p2 = new Stats(1);
				System.out.println("CPU is Deadpool");
				
				//ADD THE VARIABLE FOR THE INT TO BE INPUT IN THE STATS CONSTRUCTOR
				
				BattleScreen battleScene = new BattleScreen(rootNext, 600, 250);
				battleScene.initialize(rootNext, PickChar.p1, p2);
				
				GameFrame.theStage.setScene(battleScene);
			}
		});
		select4.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg1) {
				AnchorPane rootNext = new AnchorPane();
				
				Stats p2 = new Stats(1);
				System.out.println("CPU is Thomas Edison");
				
				//ADD THE VARIABLE FOR THE INT TO BE INPUT IN THE STATS CONSTRUCTOR
				
				BattleScreen battleScene = new BattleScreen(rootNext, 600, 250);
				battleScene.initialize(rootNext, PickChar.p1, p2);
				
				GameFrame.theStage.setScene(battleScene);
			}
		});
	}
}