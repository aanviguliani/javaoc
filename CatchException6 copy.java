/**
 * This program throws the divide by zero exception and
 * gives user repeated tries for entering a nonzero divisor
 * @author Aanvi Guliani
 * @version 1.0
 */

import java.util.Scanner;

public class CatchException6 
{
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println();
		try
		{
			System.out.println("Enter an divisor: ");
			int divisor = input.nextInt();
			int z = divide(10,divisor);
			System.out.println("Result of division = " + z);
		}
		catch(DivideByZeroException e)
		{
			try
			{
				int n = 0;
				do
				{
				    System.out.println("Denominator must be nonzero. Please reenter divisor : ");

					 n = input.nextInt();
				
					
				}
				while (n==0);
				int z = divide(10,n);
				System.out.println("Result of division = " + z);
				
			}
			catch (DivideByZeroException ex)
			{
				System.out.println("Your chances are over ");
			}
		}

	}
	
	public static int divide( int x, int y) throws DivideByZeroException
	{
		int result = 0;
		try
		{
			result = x/y;
		}
		catch(ArithmeticException e)
		{
			throw new DivideByZeroException(y);
		}
		return result;
	}
}
