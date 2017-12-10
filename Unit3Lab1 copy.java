/**
 * This program prompts the user to enter the three sides of the triangle
 * and then displays whether it is an invalid triangle, equilateral, isosceles, or scalene triangle
 * @author Aanvi Guliani
 * @version 1.0
 */

import java.util.Scanner;

public class Unit3Lab1 
{
	public static void main( String [] args )
	{
		// Declare variables
		float side1 = 0;
		float side2 = 0;
		float side3 = 0;
		
		 // Use a Scanner to input integer values
	    Scanner input = new Scanner( System.in );
	    System.out.println( "\n\n" );
	    System.out.print( "Enter 3 sides of the triangle separated by a blank space: " );
	    
	    side1 = input.nextFloat();     // Input first value
	    side2 = input.nextFloat();     // Input second value
	    side3 = input.nextFloat();     // Input third value
	    
	    //Test to find out if triangle is valid
	    if (side1<=0 || side2<=0 || side3<=0)
	    {
	    	System.out.println("This is not a valid triangle");
	    }
	    
	    //Test to find out if triangle is equilateral
	    else if (side1==side2 && side2==side3) 
	    {
	    	System.out.println("This is an equilateral triangle");
	    }
	    
	    //Test to find out if triangle is isosceles
	    else if (side1==side2 || side2==side3 || side3==side1)
	    {
	    	System.out.println("This is an isosceles triangle");
	    }
	    	
	    //Test to find out if triangle is scalene
	    else 
	    {
	    	System.out.println("This is a scalene triangle");
	    }
	
	
	
	}
	
	
}
