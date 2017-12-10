
import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.event.*;
import javafx.geometry.HPos;
import javafx.geometry.Insets;

public class SimpleCalculator extends Application
{
	private Label firstValueLabel;
	private Label secondValueLabel;
	private TextField f1;
	private TextField f2;
	private TextField f3;
	private Label sumLabel;
	private Button calcButton;
	
	public void start(Stage myStage)
	{
		myStage.setTitle("Simple Calculator");
		GridPane rootNode = new GridPane();
		rootNode.setPadding(new Insets(30));
		rootNode.setHgap(5);
		rootNode.setVgap(5);
		Scene myScene = new Scene(rootNode,350,200);
		
		firstValueLabel = new Label("First Value: ");
		TextField f1 = new TextField();
		
		
		
		secondValueLabel = new Label("Second Value");
		TextField f2 = new TextField();
		
		
		sumLabel = new Label("Sum is: ");
		TextField f3 = new TextField();
		f3.setEditable(false);
		Button calcButton = new Button("Calculate");
		
		rootNode.add(firstValueLabel, 0, 0);
		rootNode.add(f1, 1, 0);
		rootNode.add(secondValueLabel, 0, 1);
		rootNode.add(f2, 1, 1);
		rootNode.add(sumLabel, 0, 2);
		rootNode.add(f3, 1, 2);
		rootNode.add(calcButton, 1, 3);
		rootNode.setHalignment(calcButton, HPos.RIGHT);
		
		//System.out.println("value1 = " + value1);
		/*
		Integer value1 = Integer.valueOf(firstValueLabel.getText());
        Integer value2 = Integer.valueOf(secondValueLabel.getText());
        Integer r = value1 + value2;
        
        
        String result = Integer.toString(r);
		
		//button handling
        calcButton.setOnAction(e -> 
        {
  //          sumLabel.setText(result);
        });
		
		*/
		
		
		//create an event for handler objects
		CalcButtonHandler calcHandler = new CalcButtonHandler();
		
		//Register an Event Handler
		calcButton.setOnAction(calcHandler);
		
		
		myStage.setScene(myScene);
		myStage.show();
	}
	
	class CalcButtonHandler implements EventHandler<ActionEvent>
	{
		public void handle(ActionEvent e)
		{
			
			System.out.println("before value1");
			System.out.println("get Text " + f1.getText());
			int value1 = Integer.parseInt(f1.getText());
			System.out.println("after value1");
		//	int value2 = Integer.parseInt(f2.getText());
			
		//	System.out.println("here " + firstValueLabel.getText());
			//Integer value1 = Integer.valueOf(firstValueLabel.getText());
			//int value1 = Integer.parseInt(f1.getText());
			
		//	System.out.println("after value1");
	      //  int value2 = Integer.valueOf(secondValueLabel.getText());
	      //  int val2 = Integer.parseInt(value2);
	        System.out.println("after value2");
	        
	    //    Integer r = value1 + value2;
	     
	  //      String result = Integer.toString(r);
	  //      sumLabel.setText(result);
			
		}
	}
	public static void main(String [] args)
	{
		launch(args);
	}
}
