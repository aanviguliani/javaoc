import java.util.Scanner;

public class Unit5Activity1Num5 
{
	public static void main (String [] args)
	{
		//prompt user to input two numbers x and y
		Scanner inputx = new Scanner (System.in);
		System.out.println("Enter a value for x: ");
		double x = inputx.nextDouble();
		
		Scanner inputy = new Scanner (System.in);
		System.out.println("Enter a value for y: ");
		double y = inputy.nextDouble();
		
		//calculate x/y
		double z = x / y;
		double round1 = Math.floor(z * (Math.pow(10, 1)) + 0.5) / (Math.pow(10, 1));
		double round2 = Math.floor(z * (Math.pow(10, 2)) + 0.5) / (Math.pow(10, 2));
		double round3 = Math.floor(z * (Math.pow(10, 3)) + 0.5) / (Math.pow(10, 3));
		
		
		//Display x/y rounded to different decimal values
		System.out.println("x/y rounded to one decimal place is: " + round1 );
		System.out.println("x/y rounded to two decimal places is: " + round2 );
		System.out.println("x/y rounded to three decimal places is: " + round3 );
		
	}
}
