/**
 * This program creates a variety of static methods for arrays
 * @author Aanvi Guliani
 * @version 1.0
 */

public class ArrayTools 
{
	
	public static char minimum( char array[] )
	{
		char minimum = 10000;
		int minascii = 1000000000;
		int asciival = 0;
		
		for (int i = 0; i < array.length; i++)
		{
			asciival = (int) array[i];
			if (asciival < minascii)
			{
				minascii = asciival;
				minimum = array[i];
			}
		}
		
		return minimum;
		
	}
	
	public static int minimum( int array[] )
	{
		int minimum = 1000000000;
		for (int i = 0; i < array.length; i++)
		{
			if (array[i]<minimum)
			{
				minimum = array[i];
			}
		}
		return minimum;
	}

	public static double minimum( double array[] )
	{
		double minimum = 1000000000;
		for (int i = 0; i < array.length; i++)
		{
			if (array[i]<minimum)
			{
				minimum = array[i];
			}
		}
		return minimum;
	}
	
	public static char maximum( char array[] )
	{
		char maximum = 0;
		int maxascii = 0;
		int asciival = 0;
		
		for (int i = 0; i < array.length; i++)
		{
			asciival = (int) array[i];
			if (asciival > maxascii)
			{
				maxascii = asciival;
				maximum = array[i];
			}
		}
		return maximum;
	}
	
	public static double maximum( double array [] )
	{
		double maximum = 0;
		for (int i = 0; i < array.length; i++)
		{
			if (array[i]>maximum)
			{
				maximum = array[i];
			}
		}
		return maximum;
	}

	public static int maximum( int array [] )
	{
		int maximum = 0;
		for (int i = 0; i < array.length; i++)
		{
			if (array[i]>maximum)
			{
				maximum = array[i];
			}
		}
		return maximum;
	}

	public static int minimumAt( char array[] )
	{
		char minimum = 10000;
		int minascii = 1000000000;
		int asciival = 0;
		int minimumAt = 0;
		
		for (int i = 0; i < array.length; i++)
		{
			asciival = (int) array[i];
			if (asciival < minascii)
			{
				minascii = asciival;
				minimum = array[i];
				minimumAt = i;
			}
		}
		
		return minimumAt;
	}

	public static int minimumAt( int array[] )
	{
		int minimumAt = 0;
		int minimum = 1000000000;
		for (int i = 0; i < array.length; i++)
		{
			if (array[i]<minimum)
			{
				minimum = array[i];
				minimumAt = i;
			}
		}
		return minimumAt;
	}
	
	public static int minimumAt( double array[] )
	{
		int minimumAt = 0;
		double minimum = 1000000000;
		for (int i = 0; i < array.length; i++)
		{
			if (array[i]<minimum)
			{
				minimum = array[i];
				minimumAt = i;
			}
		}
		return (int) minimumAt;
	}

	public static int maximumAt( char array[] )
	{
		
		char maximum = 0;
		int maxascii = 0;
		int asciival = 0;
		int maximumAt = 0;
		
		for (int i = 0; i < array.length; i++)
		{
			asciival = (int) array[i];
			if (asciival > maxascii)
			{
				maxascii = asciival;
				maximum = array[i];
				maximumAt = i;
			}
		}
		return maximumAt;
	}

	public static int maximumAt( int array[] )
	{
		int maximumAt = 0;
		int maximum = 0;
		for (int i = 0; i < array.length; i++)
		{
			if (array[i]>maximum)
			{
				maximum = array[i];
				maximumAt = i;
			}
		}
		return maximumAt;
	}
	
	public static int maximumAt( double array[] )
	{
		int maximumAt = 0;
		double maximum = 0;
		for (int i = 0; i < array.length; i++)
		{
			if (array[i]>maximum)
			{
				maximum = array[i];
				maximumAt = i;
			}
		}
		return (int) maximumAt;
	}
	
	public static double average( int array[] )
	{
		double average = 0;
		int sum = 0;
		for (int i = 0; i< array.length; i++)
		{
			sum = array[i] + sum;
		}
		average = (double) sum/array.length;
		return average;
	}
	
	public static double average( double array[] )
	{
		double average = 0;
		double sum = 0;
		for (int i = 0; i< array.length; i++)
		{
			sum = array[i] + sum;
		}
		average = sum/array.length;
		return average;
	}

}
