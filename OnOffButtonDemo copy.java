import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.event.*;

public class OnOffButtonDemo extends Application
{
	public void init()
	{
		
	}
	
	public void start(Stage myStage)
	{
		
		Button onButton = new Button("On");
		Button offButton = new Button("Off");
		
		//create event handler objects
		OnButtonHandler onHandler = new OnButtonHandler;
	}
}
