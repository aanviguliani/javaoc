/**
 * This program prompts the user to enter integers in the range 1 to 50 and counts the occurrences of each integer
 * @author Aanvi Guliani
 * @version 1.0
 */


import java.util.Scanner;


public class Unit6Lab1 

{

	public static void main( String [] args)

	{

		//Create Scanner System
		Scanner input = new Scanner(System.in);

		//ask user how many integers they would like to enter
		System.out.print("How many integers would you like to enter? ");
		int numenter = input.nextInt();

		//declare array
		int num [] = new int [numenter];
		

		int j = 0;
		while ( j < numenter )
		{
			
			System.out.println("Enter an integer between 1 and 50 ");
			int value = input.nextInt();
			num[j] = value;

			j++;

         }

		//Print Original array
		System.out.println("Original array is : ");
		
		System.out.print("{ ");
		for (int i = 0; i < numenter; i++)
		{
			System.out.print( num [i] + " ");
		}
		System.out.print("}");
		
		//count occurences
		int [] count = new int[100];
		int temp = 0;
		
		System.out.println();
		
		for(int i = 0; i < num.length; i++)
		{             
			temp = num[i];             
			count[temp]++;         
		}   
		
		for(int i=1; i < count.length; i++)
		{          
			if(count[i] > 0 && count[i] == 1)
			{          
				System.out.println(i + " occurs " + count[i] + " times");          
			}         
			
	
			else if(count[i] >=2)
			{             
				System.out.println(i + " occurs " + count[i] + " times");         
			}
		}
		




}

}