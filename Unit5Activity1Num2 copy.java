/**
 * This program prompts user to enter an angle in degrees and converts it to radians
 * then it displays the sine, cosine, and tangent of that angle
 * @author Aanvi Guliani
 * @version 1.0
 */

import java.util.Scanner;
public class Unit5Activity1Num2
{
	public static void main (String [] args)
	{
		//Prompt user to input angle in degrees
		Scanner input = new Scanner (System.in);
		System.out.println();
		System.out.println("Enter an angle in degrees: ");
		double deg = input.nextInt();
		
		//convert angle measure to radians
		double rad = Math.toRadians(deg);
		
		System.out.println();
		System.out.println(deg +" degrees is " + rad + " radians");
		

		
		//Display sin, cos, and tan of degree input
		System.out.println("sin " + deg + " = " + Math.sin(rad));
		System.out.println("cos " + deg + " = " + Math.cos(rad));		
		System.out.println("tan " + deg + " = " + Math.tan(rad));		
				
	}
}
