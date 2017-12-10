import javafx.application.*;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;

public class Unit15TestProgram extends Application
{	
	private CheckBox checkBox;
	
	public void start(Stage myStage)
	{
		myStage.setTitle("TestProgram");
		FlowPane rootNode = new FlowPane();
		rootNode.setVgap(5);
		rootNode.setAlignment(Pos.CENTER);
		Scene myScene = new Scene(rootNode,300,200);
		
		//create controls
		checkBox = new CheckBox("checky check.");
		
		
		myStage.setScene(myScene);
		myStage.show();
		
	}
	
	public static void main(String [] args)
	{
		launch(args);
	}
	
	
}