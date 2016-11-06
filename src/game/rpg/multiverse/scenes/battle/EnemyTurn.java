package game.rpg.multiverse.scenes.battle;

import game.rpg.multiverse.Stats;
import game.rpg.multiverse.scenes.battle.BattleScreen;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;

public class EnemyTurn extends BattleScreen {

	public EnemyTurn(Parent root, double width, double height) {
		super(root, width, height);
		this.setFill(Color.DIMGREY);
	}
	
	public void initialize(AnchorPane root1, Stats p2) {
		
		//Enemy buttons
		Button btn5 = new Button();
		Button btn6 = new Button();
		Button btn7 = new Button();
		Button btn8 = new Button();
		HBox hbox = new HBox(5, btn5, btn6, btn7, btn8);
		
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
		
		//root3 = root1;
		scene3 = new BattleScreen(root1, 600, 250);
		root1.getChildren().add(hbox);
		AnchorPane.setLeftAnchor(hbox, 10d);
		AnchorPane.setBottomAnchor(hbox, 10d);
	}
}
