/**
 * This program implements the CounterConsoleMenu class
 * @author Aanvi Guliani
 * @version 1.0
 */

import javax.swing.JOptionPane;
	
public class CounterConsoleMenu
	{
	  
		private Counter aCounter;
        private int ActionType = 0;
         
        //Constructor
        public CounterConsoleMenu()
    	{
    		aCounter = new Counter(0); //counter initialized to 0
    		
    		this.ActionType = 0;
    	
    	}
        
        //Constructor
        public CounterConsoleMenu(int c, int action)
    	{
    		aCounter = new Counter(c); //counter set to c
    		
    		this.ActionType = action;
    	
    	}
        
        
        //Setter ActionType
        public void setActionType(int userinput)
        {
        	ActionType = userinput;
        }
        
        //Getter for ActionType
        public int getActionType()
        {
        	return ActionType;
        }
        
        //Setter for Counter
        public void setCounter(int c)
        {
        	aCounter.setCount(c);
        }
        
        //Getter for Counter
        public int getCounter()
        {
        	return aCounter.getCount();
        }
        
        //Method AskUserInput
        public void AskUserInput()
        {
        	//int ActionType;
        	int ucount = Integer.parseInt(
        			JOptionPane.showInputDialog( " Enter Counter Value: "));
        	
        	setCounter(ucount);
        	
        //	aCounter
        	
        	int uActionType = Integer.parseInt(
        			JOptionPane.showInputDialog( " 1.Increment \n "
        					+ "2.Decrement \n 3.Reset \n "
        					+ "4.Show current count \n 5.Exit"));
        	
        	setActionType(uActionType);
        }
        
        
        //Method to Perform Operation based on user input
        public void performAction()
        {
 
               //Perform Operation based on user input
                if (ActionType == 1)
                {
                        aCounter.incrementCount();
                }
 
                if (ActionType == 2)
                {
                        aCounter.decrementCount();
                }
 
                if (ActionType == 3)
                {
                        aCounter.resetCount();
                }
 
                if (ActionType == 4)
                {
                        aCounter.getCount();
 
                }
                
                //If user Types 5 (Exit), do the same thing as 4 (show the current Value)
                if (ActionType == 5)
                {
                        aCounter.getCount();
 
                }
        }   
        
        public void displayOutput()
        {
 
        	JOptionPane.showMessageDialog( null,"New Value of the counter is " + getCounter());
        }   
       
	
}
