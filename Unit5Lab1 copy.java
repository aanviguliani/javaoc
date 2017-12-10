/**
 * This program prompts the user to indicate which type of question they want
 * and enter the values to calculate the value based on their chosen question
 * @author Aanvi Guliani
 * @version 1.0
 */

import java.util.Scanner;

public class Unit5Lab1 
{
	public static void main (String [] args)
	{
		//Prompt user to enter which type of question they want
		Scanner input = new Scanner(System.in);
		System.out.println("If you want to calculate a future value of a single sum, type 1 ");
		System.out.println("If you want to calculate a present value of a single sum, type 2 ");
		System.out.println("If you want to calculate a future value of an annuity, type 3 ");
		int ques = input.nextInt();
		
		if (ques == 1)
		{
			Scanner input1 = new Scanner(System.in);
			
			//Prompt user to enter P value
			System.out.println("Enter the current value in your account(P): ");
			double currentval = input.nextDouble();
			
			//Prompt user to enter I value
			System.out.println("Enter periodic interest rate as a decimal (i): ");
			double i = input.nextDouble();
			
			//Prompt user to enter n value
			System.out.println("Enter number of years(N): ");
			double N = input.nextDouble();
			
			//Calculate future value
			double x = 1 + i; //mediary value to clean up formula and make it readable
			double F = currentval * Math.pow(x, N);
			
			//round F
			double round1 = Math.floor(F * (Math.pow(10, 2)) + 0.5) / (Math.pow(10, 2));
			System.out.println("Your future value in the account after " + N + " years is: " + "$" + round1);
			
		}
		
		else if (ques == 2)
		{
			//prompt user to input F value
			Scanner input2 = new Scanner(System.in);
			System.out.println("Enter the future in your account(P): ");
			double F = input.nextDouble();
			
			//prompt user to input I value
			System.out.println("Enter periodic interest rate as a decimal (i): ");
			double i = input.nextDouble();
			
			//Prompt user to enter n value
			System.out.println("Enter number of years(N): ");
			double N = input.nextDouble();
			
			//calculate current value
			double y = 1 + i; //mediary value to clean up formula and make it readable
			double P = F / Math.pow(y, N);
			
			//round P
			double round2 = Math.floor(P * (Math.pow(10, 2)) + 0.5) / (Math.pow(10, 2));
			System.out.println("Your current account value is: " + round2);
			
		}
			
		else
		{
			//prompt user to enter A value
			Scanner input3 = new Scanner(System.in);
			System.out.println("Enter dollar value: ");
			double A = input.nextDouble();
			
			//prompt user to enter I value
			System.out.println("Enter periodic interest rate as a decimal (i): ");
			double i = input.nextDouble();
			
			//prompt user to end N value
			System.out.println("Enter number of years(N): ");
			double N = input.nextDouble();
			
			//calculate F
			double b = 1 + i;						//mediary value
			double z = (Math.pow(b, N) - 1) / i;	//mediary value
			double F = A * z;
			
			//round F
			double round3 = Math.floor(F * (Math.pow(10, 2)) + 0.5) / (Math.pow(10, 2));
			
			//Display F
			System.out.println("Your account value after " + N + " years would be: " + round3);
			
			
		}
		
	}
}
