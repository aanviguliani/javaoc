import javax.swing.JOptionPane;

/**
 * This program implements the Counter class
 * @author Aanvi Guliani
 * @version 1.0
 */

public class Counter 
{
	//Members of counter class
	private int count; 
	
	//Constructor
	public Counter()
	{
		
		this.count = 0;
	}
	
	//Constructor
	public Counter(int c)
	{
		this.count = c;
	}
	
	//Increment Count
	public void incrementCount()
	{
		//increment count by 1
		//JOptionPane.showMessageDialog( null,"Incrementing Counter in Counter class");
		count++;
	}
	
	//Decrement Count
	public void decrementCount()
	{
		//decrement count by 1 
		count--;
	}
	
	//Reset the Count
	public void resetCount()
	{
		//sets counter to 0
		count = 0;
	}
	
	//Setter
	public void setCount(int c)
	{
		//sets count
		count = c;
	}
	
	//Getter
	public int getCount()
	{
		//return count
		return count;
	}
}
