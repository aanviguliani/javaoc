import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;

public class MyFirstFXApplication extends Application
{
	public void start(Stage myStage)
	{
		myStage.setTitle("My First Java FX App");
		FlowPane rootNode = new FlowPane();
		Scene myScene = new Scene(rootNode, 300, 200);
		Label myLabel = new Label("This is a label");
		Button myButton = new Button("button");
		myButton.setText("new button");
		
		rootNode.getChildren().addAll(myLabel,myButton);
		//rootNode.add(myLabel);
		myStage.setScene(myScene);
		myStage.show();
		
	}
	
	public static void main(String [] args)
	{
		launch(args);
	}
	
	
}
