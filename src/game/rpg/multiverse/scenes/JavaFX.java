/*package game.rpg.multiverse.scenes;

import game.rpg.multiverse.DamageCalcs;
import game.rpg.multiverse.Stats;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.control.Label;

public class JavaFX extends Application {
	
	DamageCalcs battle = new DamageCalcs();
	private Stats p1 = new Stats(1);
	private Stats p2 = new Stats(3);
	Stage window;
	Scene scene1, scene2, scene3, scene4;
	
	public static void main(String[] args) {
		launch(args);
	}
	
	public void start(Stage primaryStage){
		
		window = primaryStage;
		
		AnchorPane root3 = new AnchorPane();
		AnchorPane root4 = new AnchorPane();
		
		Button btn1 = new Button();
		Button btn2 = new Button();
		Button btn3 = new Button();
		Button btn4 = new Button();
		
		Button btn5 = new Button();
		Button btn6 = new Button();
		Button btn7 = new Button();
		Button btn8 = new Button();
		
		HBox hbox3 = new HBox(5, btn1, btn2, btn3, btn4);
		HBox hbox4 = new HBox(5, btn5, btn6, btn7, btn8);
		
		btn1.setText(p1.getMove(1));
		btn1.setOnAction(e -> {
			System.out.println(p1.getName() + " used " + p1.getMove(1));
			window.setScene(scene4);
		});
		
		btn2.setText(p1.getMove(2));
		btn2.setOnAction(e -> {
			System.out.println(p1.getName() + " used " + p1.getMove(2));
			window.setScene(scene4);
		});
		
		btn3.setText(p1.getMove(3));
		btn3.setOnAction(e -> {
			System.out.println(p1.getName() + " used " + p1.getMove(3));
			window.setScene(scene4);
		});
		
		btn4.setText(p1.getMove(4));
		btn4.setOnAction(e -> {
			System.out.println(p1.getName() + " used " + p1.getMove(4));
			window.setScene(scene4);
		});
		
		root4.getChildren().addAll(hbox4);
		AnchorPane.setLeftAnchor(hbox4, 10d);
		AnchorPane.setBottomAnchor(hbox4, 10d);
		scene4 = new Scene(root4, 500, 500);
		
		btn5.setText(p2.getMove(1));
		btn5.setOnAction(e -> {
			System.out.println(p2.getName() + " used " + p2.getMove(1));
			window.setScene(scene3);
		});
		
		btn6.setText(p2.getMove(2));
		btn6.setOnAction(e -> { 
			System.out.println(p2.getName() + " used " + p2.getMove(2));
			window.setScene(scene3);
		});
		
		btn7.setText(p2.getMove(3));
		btn7.setOnAction(e -> {
			System.out.println(p2.getName() + " used " + p2.getMove(3));
			window.setScene(scene3);
		});
		
		btn8.setText(p2.getMove(4));
		btn8.setOnAction(e -> {
			System.out.println(p2.getName() + " used " + p2.getMove(4));
			window.setScene(scene3);
		});
		
		root3.getChildren().addAll(hbox3);
		AnchorPane.setLeftAnchor(hbox3, 10d);
		AnchorPane.setBottomAnchor(hbox3, 10d);
		scene3 = new Scene(root3, 500, 500);
		
		primaryStage.setScene(scene3);
		primaryStage.show();
	}
}
*/