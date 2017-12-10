/**
 *  The program prompts the user to enter a series of 10 integers and then determines and displays the largest and smallest
 * values entered using a do while loop
 * @author Aanvi Guliani
 * @version 1.0
 */

import java.util.Scanner;

public class Unit4Lab3C 
{
	public static void main (String [] args)
	{
		
		//Variables that will be used throughout program
		int n = 10;
		
		int counter = 1;
		
		int largest = 0;
		
		int smallest = 0;
		
		
		do
			//for ( counter = 1; counter <= n; counter ++)
		{
			//Prompt user to input an integer
			System.out.println("Enter an integer : ");
			Scanner input = new Scanner(System.in);
			int number = input.nextInt();
			
			if (number > largest)
			{ 
				largest = number;
			}
			else if (number < smallest)
			{
				smallest = number;
			}
		
			counter ++;
		}
		while ( counter <= n );
		
		//Display largest and smallest numbers
		System.out.println("The max number is : " + largest);
		
		System.out.println("The min number is : " + smallest);
	}
		
}
