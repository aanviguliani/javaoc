import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.event.*;

public class OnOffButtonHandling extends OnOffButtonDemo
{
	Label myResponse = new Label("Push a button");
	
	public void start(Stage myStage)
	{
		
	}
	
	class OnButtonHandler implements EventHandler<ActionEvent>
	{
		public void handle(ActionEvent e)
		{
			myResponse.setText("On button pushed");
		}
	}
	
	class OffButtonHandler implements EventHandler<ActionEvent>
	{
		public void handle(ActionEvent e)
		{
			myResponse.setText("Off button pushed");
		}
	}
}
