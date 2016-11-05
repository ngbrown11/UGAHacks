package game.rpg.multiverse;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.*;
import javafx.event.*;

import javafx.scene.effect.DropShadow;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class GameFrame extends Application {
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage window) throws Exception {
		
		//Create the variables for the scene
		final Text text = new Text(60, 120, "Multiverse Battleground");
		Button btn1 = new Button("Start");
		btn1.setLayoutX(175);		//Set location
		btn1.setLayoutY(150);
		Button btn2 = new Button("Select");
		btn2.setLayoutX(175);		//Set location
		btn2.setLayoutY(150);
		
		//Edit the main text
		text.setFont(Font.font("Calibri", 30));
		text.setFill(Color.WHITE);
		text.setEffect(new DropShadow());

		//Create the app layout and add the properties		
		Group root = new Group();
		Scene sceneStart = new Scene(root, 400, 250, Color.DODGERBLUE);
		root.getChildren().add(text);
		root.getChildren().add(btn1);
		
		window.setTitle("Testing JavaFX 2.0");
		window.setScene(sceneStart);
		window.show();
		
		//Button1 event actions
		btn1.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg1) {
				root.getChildren().remove(btn1);
				text.setText("Pick your character");
				text.setLayoutX(20);
				text.setLayoutY(-80);
				root.getChildren().add(btn2);
				btn2.setLayoutY(200);
			}
		});
		
		//Button2 event actions
		btn2.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg1) {
				Platform.exit();
			}
		});
		
	}
}
