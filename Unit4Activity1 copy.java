/**
 * This program prompts a user to enter the number of questions they'd like for a simple multiplication quiz
 * then they answer the quiz and the program lets them know whether they are correct
 * after the quiz is complete, the program displays the user's score and time elapsed
 * @author Aanvi Guliani
 * @version 1.0
 */

import java.util.Scanner;

public class Unit4Activity1 
{
	public static void main( String [] args )
	{
		//prompt the user to enter number of questions
		System.out.print("What is number of questions you would like to answer?");
		Scanner inputq = new Scanner(System.in);
		int numquestions = inputq.nextInt();
		
		//Other variables used throughout program
		int totalscore = 0;
		float percentscore = 0;
		float fractionscore = 0;
		long starttime = System.currentTimeMillis();
		for (int curr = 1; curr <= numquestions;  curr++){
			
			// Generate 2 random numbers that will be multiplied
			 int number1 = (int) ( Math.random() * 10 );
			 int number2 = (int) ( Math.random() * 10 );
			 
			 // Prompt user to input answer
			 System.out.print( "What is " + number1 + " * " + number2 + "? " );
			 Scanner input = new Scanner( System.in );
			 int answer = input.nextInt();
	
			 // Grade the answer
			 if ( ( number1 * number2 ) == answer ) 
			 {
			 //System.out.println( "Congratulations...you are correct!" );
			 totalscore++;
			 }
			 else
			 {
				System.out.println("Sorry, the correct answer is " + (number1*number2));
			 }
			 
		}
		//Calculate percentage score
		percentscore = (float) ((totalscore * 100) / numquestions);
				
		 //Print percent score
		 System.out.println( "Your score is:" + percentscore + "%");
		 
		 //Calculate and display time elapsed
		 long endtime = System.currentTimeMillis();
		 float elapsetime = (float) ((endtime-starttime)/1000);
		 System.out.println("Total elapsed time is " + elapsetime + " seconds");
		
		
	}
}
