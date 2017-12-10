/**
 * This program creates a divide by zero exception
 * @author Aanvi Guliani
 * @version 1.0
 */


public class DivideByZeroException extends Exception
{
	private int denom;
	
	public DivideByZeroException()
	{
		
	}
	
	public DivideByZeroException(String e)
	{
		
	}
	
	public DivideByZeroException(int d)
	{
		super("Div by zero");
		denom = d;
	}
	
	public int getDenominator()
	{
		return denom;
	}
}
