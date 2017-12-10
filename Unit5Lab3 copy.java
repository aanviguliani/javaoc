/**
 * This program prompts a user to input three values and displays the max and min of the three values
 * @author Aanvi Guliani
 * @version 1.0
 */

import java.util.Scanner;

public class Unit5Lab3 
{
	public static void main( String [] args )
	{
		//prompt user to enter month and year
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a value for x: ");
		double x = input.nextDouble();
		System.out.println("Enter a value for y: ");
		double y = input.nextDouble();
		System.out.println("Enter a value for z: ");
		double z = input.nextDouble();
		
		double minvalue = minimum(x,y,z);
		System.out.println("The minimum value is: " + minvalue);
		
		double maxvalue = maximum(x,y,z);
		System.out.println("The maximum value is: " + maxvalue);
		
	}
	
	public static double minimum(double x, double y, double z)
	{
		double minval = 0;
		double min1 = 0;
		double min2 = 0;
		min1 = Math.min(x, y);
		min2 = Math.min(y, z);
		minval = Math.min(min1, min2);
		
		return minval;
	}
	
	public static double maximum (double x, double y, double z)
	{
		double maxval = 0;
		double max1 = 0;
		double max2 = 0;
		max1 = Math.max(x, y);
		max2 = Math.max(y, z);
		maxval = Math.max(max1, max2);
		
		return maxval;
		
	}
}
