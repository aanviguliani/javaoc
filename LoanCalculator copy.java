import javafx.application.*;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;

public class LoanCalculator extends Application
{
	private Label myLabel;
	
	public void start(Stage myStage)
	{
		//create GridPane and set properties
		GridPane rootNode = new GridPane();
		rootNode.setPadding(new Insets(30));
		rootNode.setHgap(5);
		rootNode.setVgap(5);
				
		myStage.setTitle("Loan Calculator");
		Scene myScene = new Scene(rootNode,400,250);
			
		//place nodes in pane
		rootNode.add(new Label("Annual Interest Rate"), 0, 0);
		rootNode.add(new TextField(), 1, 0);
				
		rootNode.add(new Label("Number of Years"), 0, 1);
		rootNode.add(new TextField(), 1, 1);
				
		rootNode.add(new Label("Loan Amount"), 0, 2);
		rootNode.add(new TextField(), 1, 2);
				
		rootNode.add(new Label("Monthly Payment"), 0, 3);
		rootNode.add(new TextField(), 1, 3);
				
		rootNode.add(new Label("Total Payment"), 0, 4);
		rootNode.add(new TextField(), 1, 4);
				
		Button aButton = new Button("Calculate");
		rootNode.add(aButton, 1, 5);
		rootNode.setHalignment(aButton, HPos.RIGHT);
		//rootNode.setAlignment(aButton, Pos.RIGHT);
		//rootNode.setAlignment(aButton,Hpos.RIGHT);
		
				
		myStage.setScene(myScene);
		myStage.show();

	}
	
	public static void main(String [] args)
	{
		launch(args);
	}
	
}
