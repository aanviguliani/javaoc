/**
 * This program implements the Date class
 * @author Aanvi Guliani
 * @version 1.0
 */


public class Date 
{
	private int month;
	private int day;
	private int year;
	
	public Date()
	{
		this.month = 0;
		this.day = 0;
		this.year = 0;
	}
	
	public Date(int m, int d, int y)
	{
		this.month = m;
		this.day = d;
		this.year = y;
	}
	
	public void setDate(int m, int d, int y)
	{
		this.month = m;
		this.day = d;
		this.year = y;
	}
	
	public void setMonth(int m)
	{
		month = m;
	}
	
	public int getMonth()
	{
		return month;
	}
	
	public void setDay(int d)
	{
		day = d;
	}
	
	public int getDay()
	{
		return day;
	}
	
	public void setYear(int y)
	{
		year = y;
	}
	
	public int getYear()
	{
		return year;
	}

	public String getDate()
	{
		return month + "/" + day + "/" + year;
	}


}