/**
 * This program prompts user to enter four integer test scores and displays max score, min score, avg, and letter grade
 * @author Aanvi Guliani
 * @version 1.0
 */

import java.util.Scanner;


public class Unit5Lab3Part2 
{
	public static void main( String [] args )
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter score for Test 1");
		int a = input.nextInt();
		System.out.println("Enter score for Test 2");
		int b = input.nextInt();
		System.out.println("Enter score for Test 3");
		int c = input.nextInt();
		System.out.println("Enter score for Test 4");
		int d = input.nextInt();
		
		int minvalue = minimum(a,b,c,d);
		System.out.println("The minimum test score is: " + minvalue);
		
		int maxvalue = maximum(a,b,c,d);
		System.out.println("The maximum test score is: " + maxvalue);
		
		double avgvalue = average(a,b,c,d);
		System.out.println("Your average test score is: " + avgvalue);
		
		String lettergrade = grade( a, b,  c,  d);
		System.out.println("Your letter grade is: " + lettergrade);
		
		
		
	}
	
	public static int minimum(int a, int b, int c, int d)
	{
		//initialize variables
		int minval = 0;
		int min1 = 0;
		int min2 = 0;
		
		//calculate minimum of test scores
		min1 = Math.min(a, b);
		min2 = Math.min(c, d);
		minval = Math.min(min1, min2);
		
		return minval;
	}
	
	public static int maximum(int a, int b, int c, int d)
	{
		//initialize variables
		int maxval = 0;
		int max1 = 0;
		int max2 = 0;
		
		//calculate maximum
		max1 = Math.max(a, b);
		max2 = Math.max(c, d);
		maxval = Math.max(max1, max2);
		
		return maxval;
	}
	
	
	public static double average(int a,int b,int c,int d)
	{
		//initialize variable
		double avgval = 0;
		
		//calculate average
		avgval =(double)(a + b + c + d)/4;
		double roundedavg = Math.floor(avgval * (Math.pow(10, 1)) + 0.5) / (Math.pow(10, 1));
		
		return roundedavg;
	}
	public static String grade(int a,int b, int c, int d)
	{
		//Initialize variables
		
		int avgvalue = (int) average(a,b,c,d);
		String gradeletter = "";
		double avgval =(double)(a + b + c + d)/4;
		double roundedavg = Math.floor(avgval * (Math.pow(10, 1)) + 0.5) / (Math.pow(10, 1));
		
		//calculate grade latter
		if (avgvalue >= 90 )
			gradeletter = "A";
		else if (roundedavg<90 && roundedavg >=80)
			gradeletter = "B";
		else if (roundedavg<80 && roundedavg >=70)
			gradeletter = "C";
		else if (roundedavg<70 && roundedavg >=60)
			gradeletter = "D";
		else
			gradeletter = "F";
		
		return gradeletter;
	}
	
}
