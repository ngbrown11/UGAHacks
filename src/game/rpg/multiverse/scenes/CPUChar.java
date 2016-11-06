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

public class CPUChar extends Scene {

	public CPUChar(Parent root, double width, double height) {
		super(root, width, height);
		this.setFill(Color.DIMGREY);
	}
	
	public static Stats p2;
	
	public void initialize(Group root) {
		
		//Create the variables for the scene
		final Text text = new Text(100, 120, "Do you want a random opponent?");
		Button yes = new Button("Yes");
		Button no = new Button("No");
		yes.setLayoutX(200);		//Set location
		yes.setLayoutY(150);
		yes.setPadding(new Insets(10));
		no.setLayoutX(325);		//Set location
		no.setLayoutY(150);
		no.setPadding(new Insets(10));
		
		//Edit the main text
		text.setFont(Font.font("Calibri", 32));
		text.setFill(Color.CRIMSON);
		text.setEffect(new DropShadow());
		
		root.getChildren().add(text);
		root.getChildren().add(yes);
		root.getChildren().add(no);
		
		yes.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg1) {
				
				//Randomize CPU
				int cpu = (int)(Math.random() * 4) + 1;
				p2 = new Stats(cpu);
				
				//Make sure the CPU is different than the user
				while(p2.getName() == PickChar.p1.getName()) {
					cpu = (int)(Math.random() * 4) + 1;
					p2 = new Stats(cpu);
				}
				
				Alert info = new Alert(AlertType.INFORMATION, "Here are " + p2.getName() + "'s stats:\n\n"
						+ p2.displayInfo());
				info.setTitle("Stats");
				info.setHeaderText(null);
				info.showAndWait();
				
				AnchorPane rootFight = new AnchorPane();
				BattleScreen battleScene = new BattleScreen(rootFight, 600, 350);
				battleScene.initialize(rootFight, PickChar.p1, p2);
				
				GameFrame.theStage.setScene(battleScene);
			}
		});
		no.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg1) {
				Group rootNext = new Group();
				RandChar randCharScene = new RandChar(rootNext, 600, 300);
				randCharScene.initialize(rootNext);
				
				GameFrame.theStage.setScene(randCharScene);
			}
		});
	}
}
