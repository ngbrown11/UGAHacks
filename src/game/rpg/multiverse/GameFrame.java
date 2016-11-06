package game.rpg.multiverse;

import game.rpg.multiverse.scenes.StartScreen;
import game.rpg.multiverse.scenes.battle.BattleScreen;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class GameFrame extends Application {
	
	public static Stage theStage;
	private StartScreen startScene;
	private BattleScreen battleScene;
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage stage) throws Exception {
		
		//Create the app layout and add the properties	
		theStage = stage;
		Group root = new Group();
		startScene = new StartScreen(root, 600, 250);
		startScene.initialize(root);
		
		stage.setTitle("Multiverse Battleground");
		stage.setScene(startScene);
		
		Alert hello = new Alert(AlertType.CONFIRMATION, "Hello, and welcome to the Mutliverse!\n\n"
				+ "The place where universes collide");
		hello.setTitle("MULTIVERSE BATTLEGROUND");
		hello.show();
		
		stage.show();
		
	}
}
