/**
 * This program overloads a variety of methods from ArrayTools2
 * @author Aanvi Guliani
 * @version 1.0
 */


import java.util.Scanner;

public class ArrayToolsTest2 
{
	public static void main(String [] args)
	{
		
		//prompt user to enter integer values
		Scanner input = new Scanner(System.in);
		
		System.out.print("How many integers would you like to enter? ");
		System.out.println();
		int numenter = input.nextInt();
		int j = 0;
		int a1 [] = new int [numenter];
		int a2 [] = new int [numenter];
		
		//Enter array 1
		while (j < numenter )
		{
			
			System.out.println("Enter an integer for array 1: ");
			int value = input.nextInt();
			
			a1[j] = value;

			j++;

         }
		
		j = 0;
		//Enter array 2
		while (j < numenter )
		{
			
			System.out.println("Enter an integer for array 2: ");
			int value = input.nextInt();
			
			a2[j] = value;

			j++;

         }
		
		
		//perform functions
		
		ArrayTools2 tools = new ArrayTools2();
		
		boolean a;
		a = tools.equals(a1, a2);
		System.out.println("It is " +a + " that the arrays are equal.");
		System.out.println();
		
		System.out.println("Enter a keyword integer to search for in array 1.");
		int key = input.nextInt();
		int location = tools.find(a1, key);
		
		if(location >= 0)
			System.out.println("Found " + key + " at position " + location);
		else
			System.out.println(key + " not found in array.");
		
		
		System.out.println();
		System.out.println("Sorted array: ");
		
		tools.sort(a1);
		for(int value : a1)
			System.out.print(" "+ value);
		
		
		//double values
		//prompt user to enter double values
		System.out.println();		
		System.out.println("How many double values would you like to enter? ");

				int numenter2 = input.nextInt();
				int j2 = 0;
				double num2 [] = new double [numenter2];
				
	
		double a3 [] = new double [numenter2];
		double a4 [] = new double [numenter2];
				
		//Enter array 1
		while (j2 < numenter2 )
			{
					
			System.out.println("Enter a double value for array 1: ");
			double value = input.nextDouble();
					
			a3[j2] = value;

			j2++;

		    }
				
		j2 = 0;
		
		//Enter array 2
		while (j2 < numenter2 )
			{
					
			System.out.println("Enter a double value for array 2: ");
			double value = input.nextDouble();
					
			a4[j2] = value;

			j2++;

		    }	
		
		boolean b;
		b = tools.equals(a3, a4);
		System.out.println("It is " +b + " that the arrays are equal");
		System.out.println();
		
		System.out.println("Enter a keyword double value to search for in array 1: ");
		double key2 = input.nextDouble();
		int location2 = tools.find(a3, key2);
		
		if(location2 >= 0)
			System.out.println("Found " + key2 + " at position " + location2);
		else
			System.out.println(key2 + " not found in array");
		
		
		System.out.println();
		System.out.println("Sorted array: ");
		
		tools.sort(a3);
		for(double value : a3)
			System.out.print(" "+ value);
		
		
		
		//char values
		//prompt user to input char values
				System.out.println();
				System.out.print("How many char values would you like to enter? ");

				int charenter = input.nextInt();
				int j3 = 0;
				char a5 [] = new char [charenter];
				char a6 [] = new char [charenter];
				
				while (j3 < charenter )
				{
					
					System.out.println("Enter an char value for array 1: ");
					Scanner reader = new Scanner(System.in);
					char value3 = reader.next().charAt(0);
					
					a5[j3] = value3;

					j3++;

		         }
				
				j3 = 0;
				
		//enter array 2
				
				while (j3 < charenter )
				{
					
					System.out.println("Enter an char value for array 2: ");
					Scanner reader = new Scanner(System.in);
					char value3 = reader.next().charAt(0);
					
					a6[j3] = value3;

					j3++;

		         }
		
		//perform functions
				boolean c;
				c = tools.equals(a5, a6);
				System.out.println("It is " +c + " that the arrays are equal");
				System.out.println();
				
				System.out.println("Enter a keyword char value to search for in array 1: ");
				Scanner reader2 = new Scanner(System.in);
				char key3 = reader2.next().charAt(0);
				int location3 = tools.find(a5, key3);
				
				if(location3 >= 0)
					System.out.println("Found " + key3 + " at position " + location3);
				else
					System.out.println(key3 + " not found in array");
				
				
				System.out.println();
				System.out.println("Sorted array: ");
				
				tools.sort(a5);
				for(char value : a5)
					System.out.print(" "+ value);
		
	}
}
