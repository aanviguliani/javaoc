/**
 * This program creates a variety of static methods for arrays
 * @author Aanvi Guliani
 * @version 1.0
 */

import java.util.Arrays;

public class ArrayTools2 
{
	public static boolean equals( char a1[], char a2[])
	{
		boolean a = Arrays.equals(a1, a2);
		return a;
	}
	
	public static boolean equals(int a1[], int a2[])
	{
		boolean b = Arrays.equals(a1, a2);
		return b;
	}

	public static boolean equals(double a1[], double a2[])
	{
		boolean c = Arrays.equals(a1, a2);
		return c;
	}

	public static int find(char array[], char key)
	{
		int location = Arrays.binarySearch(array, key);
		return location;
	 
	}
	
	public static int find (int array[], int key)
	{
		int location = Arrays.binarySearch(array, key);
		return location;
	}
	
	public static int find (double array[], double key)
	{
		int location = Arrays.binarySearch(array,key);
		return location;
	}
	
	public static void sort(char array[])
	{
		Arrays.sort(array);
	}

	public static void sort(int array[])
	{
		Arrays.sort(array);
	}

	public static void sort(double array[])
	{
		Arrays.sort(array);
	}
	
}


