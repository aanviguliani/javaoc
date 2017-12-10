/**
 * This program creates methods associated with a print job
 * @author Aanvi Guliani
 * @version 1.0
 */
public class Job 
{
	private int jobID;
	private int printTime;
	
	public Job()
	{
		jobID = 0;
		printTime = 0;
	}
	
	public Job(int j, int p)
	{
		jobID = j;
		printTime = p;
	}
	
	public void setJobID(int j)
	{
		jobID = j;
	}
	
	public void setprintTime(int p)
	{
		printTime = p;
	}
	
	public int getJobID()
	{
		return jobID;
	}
	
	public int getPrintTime()
	{
		return printTime;
	}
	
}
