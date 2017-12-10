/**
 * This program tests the Counter and CounterConsoleMenu class
 * @author Aanvi Guliani
 * @version 1.0
 */

public class CounterTest 
{
	public static void main(String [] args)
	{
		//Create CounterConsoleMenu Object
		CounterConsoleMenu menu = new CounterConsoleMenu();
	
		//Display the options for input and read users input
	    menu.AskUserInput();
	    
	    //Perform the action based on user input
	    menu.performAction();
	    
	    //Dispaly the new value of the counter
	    menu.displayOutput();
		
		
	}
}
