/**
 * This program prompts user to input a dollar value and converts it to the amount of dollars, quarters, dimes, nickels, and pennies
 * @author Aanvi Guliani
 * @version 1.0
 */

import java.util.Scanner;


public class Unit2Lab2 
{
	public static void main ( String [] args )
	{
		//Declare all variables that will be used in the program
		double money = 0.00;			//dollar value that user input
		int dollar = 0;					// number of dollars
		double x = 0; 					//Decimal amount for number of quarters
		int quarter = 0;				// True number of quarters
		int dimes = 0;					//Number of dimes
		double remainmoney = 0;			//Amount of money left after dollars and quarters were taken out
		double remainnickels = 0;		//Amount of money left after dollars, quarters, and dimes were taken out
		int nickels = 0;				//Number of nickels
		double remainpennies = 0;		//Amount of pennies left after dollars, quarters, dimes, and nickels were taken out
		int pennies = 0;				//Amount of pennies
		
		//Prompt user for input
		Scanner input = new Scanner( System.in );
		System.out.println();
		System.out.print("Enter monetary amount in dollars and cents, such as 15.98: ");
		money = input.nextDouble ();
		
		//Calculate number of dollars
		dollar = (int) money;
		System.out.println("Number of dollars: " + dollar);
		
		//Calculate number of quarters
		x = (money - dollar)/ 0.25;
		quarter = (int) x;
		System.out.println("Numbe of quarters: " + quarter);
		
		//Calculate Number of dimes
		remainmoney = (money - dollar) % 0.25;
		dimes = (int)(remainmoney/0.10);
		System.out.println("Number of dimes: " + dimes);
		
		//Calculate number of nickels
		remainnickels = (remainmoney % 0.10);
		nickels = (int) (remainnickels / 0.05 );
		System.out.println("Number of nickels: " + nickels);
		
		//Calculate number of pennies
		remainpennies = (remainnickels - (nickels / 20));
		pennies = (int)(remainpennies / 0.01);
		System.out.println("Number of pennies: " + pennies);
	}
}
