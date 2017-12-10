/**
 * This program prompts the user to enter the number of asterisks they'd like in the first line
 * then the program will display lines of asterisks and in each line there will be one less asterisk 
 * @author Aanvi Guliani
 * @version 1.0
 */
import java.util.Scanner;

public class Unit4Lab2 
{
	public static void main (String [] args)
	{
		//Promt user to input max # asterisks
		System.out.print("How many asterisks would you like in the first line?");
		Scanner inputast = new Scanner(System.in);
		int maxast = inputast.nextInt();
		//System.out.println(maxast);
		// Outer loop for number lines
		for (int i=maxast; i>= 1; i--)
		{
			// Inner loop for printing number of asterisks
			for (int j=1; j <= i; j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		
	}
}
