import java.util.Scanner;
public class ProgramExerciseUnit5 
{
	public static void main (String [] args)
	{
	Scanner input = new Scanner (System.in);
	System.out.println("enter value for a: ");
	double a = input.nextInt();
	System.out.println("enter value for b: ");
	double b = input.nextInt();
	
	//Initialize variables
	double c = 0; //third value of triangle
	double d = 0; // mediary number to calculate c
	double p = 2; //number to raise a and b to power
	
	//formula to calculate c
	d = Math.pow(a,p) + Math.pow(b,p);
	c = Math.sqrt(d);
	
	//Display C
	System.out.println();
	System.out.println("c =" + (int)c);
	
	}
}
