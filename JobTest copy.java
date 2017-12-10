/**
 * This program invokes methods from job
 * and creates a linked list
 * @author Aanvi Guliani
 * @version 1.0
 */

import java.util.*;
import java.util.Random;

public class JobTest 
{
	public static void main(String [] args)
	{
	//create linked list
	LinkedList<Job> job = new LinkedList<Job>();
	
	//randomize linked list
	int printTime = 0;
	int jobID = 1;
	
	int userinput = 1;
	
	
	//ask user to input
	Scanner input = new Scanner(System.in);
	
	
	//Repeat this until user wants to quit
	do 
	{
		System.out.println("Type 1 to add a job. Type 2 to display jobs.");
		userinput = input.nextInt();
		Job job1 = new Job(jobID, printTime);
		job.add(job1);
		jobID++;
		
		//create random object
		Random rnGenerator = new Random();
		printTime = rnGenerator.nextInt(1000) + 10;
	}
	while (userinput == 1);
	

	//if user inputs 2, display this information
	if (userinput==2)
	{
		
		
		System.out.println("Print Jobs:");
		for(int k = 0; k < job.size(); k++)
		{
			Job j = job.get(k);
			System.out.println("Job ID: " + j.getJobID() + "\t" + "Print Time: " + j.getPrintTime());
			
		}
	}
	

	
	}
}
