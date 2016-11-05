package game.rpg.multiverse.scenes;

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

public class BattleScreen extends Scene {
	
	public BattleScreen(Parent root, double width, double height) {
		super(root, width, height);
		this.setFill(Color.DODGERBLUE);
	}

	public void initialize(Group root) {
		
		//Create button variables for scene
		Button move1 = new Button("A");
		move1.setLayoutX(275);		//Set location
		move1.setLayoutY(200);
		Button move2 = new Button("B");
		move2.setLayoutX(300);		//Set location
		move2.setLayoutY(200);
		Button move3 = new Button("X");
		move3.setLayoutX(325);		//Set location
		move3.setLayoutY(200);
		Button move4 = new Button("Y");
		move4.setLayoutX(350);		//Set location
		move4.setLayoutY(200);
		
		root.getChildren().add(move1);
		root.getChildren().add(move2);
		root.getChildren().add(move3);
		root.getChildren().add(move4);
	}
	
}
