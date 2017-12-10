import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.event.*;


public class CalculatorButtonHandling 
{
	Label myResponse = new Label();
	
	public void start(Stage myStage)
	{
		
	}
	
	class calculateButton implements EventHandler<ActionEvent>
	{
		public void handle(ActionEvent e)
		{
			myResponse.setText("On button pushed");
		}
	}
}
