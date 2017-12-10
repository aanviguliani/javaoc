import javax.swing.JOptionPane;

public class MemoryCounterConsoleMenu extends MemoryCounter
{
	private MemoryCounter aMemCounter;
	private int ActionType = 0;
	
	//constructor
	public MemoryCounterConsoleMenu()
	{
		aMemCounter = new MemoryCounter(0,0);
		this.ActionType = 0;
	}
	
	//constructor
	public MemoryCounterConsoleMenu(int m,int c, int action)
	{
		aMemCounter = new MemoryCounter(m,c); //counter set to m
		
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
    public void setMemCounter(int m)
    {
    	aMemCounter.setMemCount(m);
    }
    
    //Getter for Counter
    public int getMemCounter()
    {
    	return aMemCounter.getMemCount();
    	
    }
    
  //Setter for Counter
    public void setCounter(int c)
    {
    	aMemCounter.setCount(c);
    }
    
    //Getter for Counter
    public int getCounter()
    {
    	return aMemCounter.getCount();
    	
    }

  //Method AskUserInput
    public void AskUserInput()
    {
    	//int ActionType;
    	int countval = Integer.parseInt(
    			JOptionPane.showInputDialog( " Enter Count Value: "));
    	int mem = Integer.parseInt(	
    	JOptionPane.showInputDialog("Enter Memory Value: "));
    	
    	setMemCounter(mem);
    	setCounter(countval);
    	
    	
    	//    aMemoryCounter
    	
    	int uActionType = Integer.parseInt(
    			JOptionPane.showInputDialog( 
    					  " 1.Increment Count\n "
    					+ "2.Decrement Count\n "
    					+ "3.Reset Memory \n "
    					+ "4.Reset Count \n "
    					+ "5.Show Current Counts \n "
    					+ "6.Show current Memory \n "
    					+ "7.Add Counter to Memory\n "
    					+ "8.Exit"));
    	
    	setActionType(uActionType);
    	
    }
    
    //Method to Perform Operation based on user input
    public void performAction()
    {

           //Perform Operation based on user input
            if (ActionType == 1)
            {
            	//JOptionPane.showMessageDialog( null,"Incrementing Counter");
            	aMemCounter.incrementCount();
            }

            if (ActionType == 2)
            {
            	aMemCounter.decrementCount();
            }

            if (ActionType == 3)
            {
                    aMemCounter.resetMemCount();
            }

            if (ActionType == 4)
            {
                    aMemCounter.resetCount();

            }
            
            //If user Types 5 (Exit), do the same thing as 4 (show the current Value)
            if (ActionType == 5)
            {
                    aMemCounter.getCount();

            }
            
            if(ActionType==6)
            {
            	aMemCounter.getMemCount();
            }
    
            if(ActionType == 7)
            {
            	
            	int newmemcount = aMemCounter.addCountToMem();
            }
    
          //If user wants to Exit do the same thing as 4 (show the current Value)
            if(ActionType == 8)
            {
            	aMemCounter.getCount();

            }
    
    }   
    public void displayOutput()
    {
     
    	JOptionPane.showMessageDialog( null,"New Value of the counter is " + getCounter());
    	JOptionPane.showMessageDialog( null,"New Value of the Memory is " + getMemCounter());
    }   
    	

}
