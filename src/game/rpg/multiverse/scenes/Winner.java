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
import game.rpg.multiverse.Stats;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class Winner extends Scene {
	
	public Winner(Parent root, double width, double height) {
		super(root, width, height);
		this.setFill(Color.FORESTGREEN);
	}
	
	public void initialize(Group root, Stats p) throws InterruptedException {
		final Text text;
		
		//Create the variables for the scene
		if(p.getName() == PickChar.p1.getName())
			text = new Text(100, 100, "Winner");
		else
			text = new Text(100, 100, "Loser");
		
		Button play = new Button("Play Again?");
		play.setLayoutX(250);		//Set location
		play.setLayoutY(150);
		
		//Edit the main text
		text.setFont(Font.font("Helvetica", 46));
		text.setFill(Color.WHITE);
		text.setEffect(new DropShadow());
		
		root.getChildren().add(text);
		root.getChildren().add(play);
		
		GameFrame.theStage.setScene(this);
		
		Thread.sleep(1000);
		
		text.setFont(Font.font("Helvetica", 30));
		
		text.setFont(Font.font("Helvetica", 50));
		this.setFill(Color.BLACK);
		
		Thread.sleep(1000);
		
		text.setFont(Font.font("Helvetica", 42));
		this.setFill(Color.DODGERBLUE);
		
	}
	
}
