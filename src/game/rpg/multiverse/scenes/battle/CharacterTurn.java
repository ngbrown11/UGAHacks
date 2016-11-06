package game.rpg.multiverse.scenes.battle;

import game.rpg.multiverse.Stats;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;

public class CharacterTurn extends BattleScreen {

	private Object btn1;

	public CharacterTurn(Parent root, double width, double height) {
		super(root, width, height);
		this.setFill(Color.DIMGREY);
	}
	
	public void initialize(AnchorPane root2, Stats p1) {
		
		//Character buttons
		Button btn1 = new Button();
		Button btn2 = new Button();
		Button btn3 = new Button();
		Button btn4 = new Button();
		HBox hbox = new HBox(5, btn1, btn2, btn3, btn4);
		
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
		
		//root4 = root2;
		scene4 = new BattleScreen(root2, 600, 250);
		//root2.getChildren().addAll(hbox);
		root2.getChildren().add(hbox);
		AnchorPane.setLeftAnchor(hbox, 10d);
		AnchorPane.setBottomAnchor(hbox, 10d);
	}
}
