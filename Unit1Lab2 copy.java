
/**
 * This program prompts the user to enter six integers 
 * and then displays the integers in tabular 3 rows by 2 columns format.
 * @author Aanvi Guliani
 * @version 1.0
 */

import java.util.Scanner;
public class Unit1Lab2 
{
  public static void main( String [] args )
  {
    // Define and initialize variables for values to be input
    int v1 = 0;      // First value to be input
    int v2 = 0;      // Second value to be input
    int v3 = 0;      // Third value to be input
    int v4 = 0;      // Fourth value to be input
    int v5 = 0;      // Fifth value to be input
    int v6 = 0;      // Sixth value to be input
    
    //Local Variables to Store Sum
    int v7 = 0;		
    int v8 = 0;
    int v9 = 0;
    
    // Use a Scanner to input integer values
    Scanner input = new Scanner( System.in );
    System.out.println( "\n\n" );
    System.out.print( "Enter 6 integers separated by a blank space:" );
    v1 = input.nextInt();     // Input first value
    v2 = input.nextInt();     // Input second value
    v3 = input.nextInt();     // Input third value
    v4 = input.nextInt();     // Input fourth value
    v5 = input.nextInt();     // Input fifth value
    v6 = input.nextInt();     // Input sixth value
    
    v7 = v1 + v2;			  //Sum of v1 and v2
    v8 = v3 + v4;			  //Sum of v3 and v4
    v9 = v5 + v6;			  //Sum of v5 and v6
    
    // Output using System.out.println()
    System.out.println( "\n\n" );
    System.out.println( "\t" + "Value" + "\t" + "Value" +"\t" + "Total" );
    System.out.println( "\t" + v1 + "\t" + v2 + "\t" + v7 );
    System.out.println( "\t" + v3 + "\t" + v4 + "\t" + v8 );
    System.out.println( "\t" + v5 + "\t" + v6 + "\t" + v9 );
    System.out.println("\t" + "----" + "\t" + "----" + "\t" + "----");
    System.out.println("Total" + "\t" + (v1 + v3 + v5) + "\t" + (v2 + v4 + v6) + "\t" + (v7 + v8 + v9));
    System.out.println( "\n\n" );
  }
}