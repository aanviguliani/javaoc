
public class MemoryCounterTest 
{
	public static void main(String [] args)
	{
		//Create CounterConsoleMenu Object
		MemoryCounterConsoleMenu menu = new MemoryCounterConsoleMenu();
	
		//Display the options for input and read users input
	    menu.AskUserInput();
	    
	    //Perform the action based on user input
	    menu.performAction();
	    
	    //Dispaly the new value of the counter
	    menu.displayOutput();
		
		
	}
}
