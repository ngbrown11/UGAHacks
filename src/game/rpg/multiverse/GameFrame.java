package game.rpg.multiverse;

import game.rpg.multiverse.scenes.BattleScreen;
import game.rpg.multiverse.scenes.StartScreen;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;

public class GameFrame extends Application {
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage stage) throws Exception {
		
		//Create the app layout and add the properties		
		Group root = new Group();
		StartScreen startScene = new StartScreen(root, 400, 250);
		startScene.initialize(root);
		
		/*BattleScreen battleScene = new BattleScreen(root, 400, 250);
		battleScene.initialize(root);*/
		
		stage.setTitle("Multiverse Battleground");
		stage.setScene(startScene);
		stage.show();
		
		//Button1 event actions
		/*btn1.setOnAction(new EventHandler<ActionEvent>() {

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
		});*/
		
	}
}
