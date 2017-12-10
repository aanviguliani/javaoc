/**
 * This program overloads a variety of methods from ArrayTools
 * @author Aanvi Guliani
 * @version 1.0
 */

import java.util.Scanner;

public class ArrayToolsTest 
{
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("How many integers would you like to enter? ");

		int numenter = input.nextInt();
		int j = 0;
		int num [] = new int [numenter];
		
		while (j < numenter )
		{
			
			System.out.println("Enter an integer ");
			int value = input.nextInt();
			
			num[j] = value;

			j++;

         }
		
		ArrayTools tools = new ArrayTools();
		int minvalue = 0;
		minvalue = tools.minimum(num);
		System.out.println("minval is " + minvalue);
		
		int maxvalue = 0;
		maxvalue = tools.maximum(num);
		System.out.println("maxval is " + maxvalue);
		
		double avgvalue = 0;
		avgvalue = tools.average(num);
		System.out.println("avgval is " +avgvalue);
		
		int minat = 0;
		minat = tools.minimumAt(num);
		System.out.println("min at is " +minat);
		
		int maxat = 0;
		maxat = tools.maximumAt(num);
		System.out.println("max at is "+ maxat);
	
		
		//double values
		
		//prompt user to enter double values
		System.out.print("How many double values would you like to enter? ");

		int numenter2 = input.nextInt();
		int j2 = 0;
		double num2 [] = new double [numenter2];
		
		while (j2 < numenter2 )
		{
			
			System.out.println("Enter an double value ");
			double value2 = input.nextDouble();
			
			num2[j2] = value2;

			j2++;

         }
		
		double maxval2 = 0;
		maxval2 = tools.maximum(num2);
		System.out.println("maxval for double values is " + maxval2);
		
		double minval2 = 0;
		minval2 = tools.minimum(num2);
		System.out.println("min for double value is " +minval2);
		
		double avgval2 = 0;
		avgval2 = tools.average(num2);
		System.out.println("avg for double values is " + avgval2);
		
		double minat2 = 0;
		minat2 = tools.minimumAt(num2);
		System.out.println("min at for double values is " + minat2);
		
		double maxat2 = 0;
		maxat2 = tools.maximumAt(num2);
		System.out.println("max at for double values is " + maxat2);
		
		
		//char values
		
		//prompt user to input char values
		System.out.println();
		System.out.print("How many char values would you like to enter? ");

		int charenter = input.nextInt();
		int j3 = 0;
		char num3 [] = new char [charenter];
		
		while (j3 < charenter )
		{
			
			System.out.println("Enter an char value ");
			Scanner reader = new Scanner(System.in);
			char value3 = reader.next().charAt(0);
			
			num3[j3] = value3;

			j3++;

         }
		
		char minval3 = 0;
		minval3 = tools.minimum(num3);
		System.out.println("The minimum value for this array is " + minval3);
		
		char maxval3 = 0;
		maxval3 = tools.maximum(num3);
		System.out.println("The maximum value for this array is " + maxval3);
		
		int minat3 = 0;
		minat3 = tools.minimumAt(num3);
		System.out.println("The minimum value is at position " +minat3);
		
		int maxat3 = 0;
		maxat3 = tools.maximumAt(num3);
		System.out.println("The maximum value is at position " +maxat3);
		
		
	}
}
