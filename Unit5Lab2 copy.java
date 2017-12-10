/**
 * This program prompts a user to enter a month and a year and then displays the calendar for the respective month and year
 * @author Aanvi Guliani
 * @version 1.0
 */


import java.util.Scanner;

public class Unit5Lab2 
{
	public static void main (String [] args)
	{
		//prompt user to enter month and year
		Scanner input = new Scanner(System.in);
		System.out.println("Enter month (1-12): ");
		int m = input.nextInt();
		System.out.println("Enter year (e.g 2012): ");
		int y = input.nextInt();
		
		printMonthCalendar(m,y);
		
		
		
	}
	
	//method to display calendar
	public static void printMonthCalendar( int m, int y )
	{
		printMonthHeader(m,y);
		printMonthBody(m,y);
	}
	
	//method to display header info
	public static void printMonthHeader( int m, int y ) 
	{
		String month = "";
		month = getMonthName(m);
		
		System.out.println("\t" + month + "\t" + y);
		System.out.println("----------------------------");
		System.out.println("Sun Mon Tues Wed Thu Fri Sat" );
	}
	
	//method to display days in calendar associated w days of week
	public static void printMonthBody( int m, int y)
	{
		int d = getNumDaysinMonth(m,y);
		int startday = getStartDay(m,d-1,y);
		int i = 0;
	    for (i = 0; i < startday; i++)
	      System.out.print("    ");

	    for (i = 1; i <= d; i++) {
	      if (i < 10)
	        System.out.print("   " + i);
	      else
	        System.out.print("  " + i);

	      if ((i + startday) % 7 == 0)
	        System.out.println();
	    }

	    System.out.println();
		
	}
	
	//method to return name of month for specified number
	public static String getMonthName(int m)
	{
		String monthname = "";
		if (m==1)
			monthname = "January";
		else if (m==2)
			monthname = "February";
		else if (m==3)
			monthname = "March";
		else if (m==4)
			monthname = "April";
		else if (m==5)
			monthname = "May";
		else if (m==6)
			monthname = "June";
		else if (m==7)
			monthname = "July";
		else if (m==8)
			monthname = "August";
		else if (m==9)
			monthname = "September";
		else if (m==10)
			monthname = "October";
		else if (m==11)
			monthname = "November";
		else
			monthname = "December";
			
		return monthname;
	
	}
	
	//returns day of week number
	public static int getStartDay( int m, int d, int y )
	  {
	    // Adjust month number & year to fit Zeller's numbering system
	    if ( m < 3 ) 
	    {
	      m = m + 12;
	      y = y - 1;
	    }
	    
	    int k = y % 100;      // Calculate year within century
	    int j = y / 100;      // Calculate century term
	    int h = 0;            // Day number of first day in month 'm'
	    
	    h = ( d + ( 13 * ( m + 1 ) / 5 ) + k + ( k / 4 ) + ( j / 4 ) + ( 5 * j ) ) % 7;
	    
	    // Convert Zeller's value to ISO value (1 = Mon, ... , 7 = Sun )
	    int dayNum = ( ( h + 5 ) % 7 ) + 1;     
	    
	    return dayNum;
	  }
	
	//returns number of days in specified month/year
	public static int getNumDaysinMonth( int m, int y)
	{
		boolean leapyear = false;
		leapyear = isLeapYear(y);
		int numdays;
		if (m==1 || m==3 || m==5 || m==7 || m==8 || m==10 || m==12)
			numdays = 31;
		else if(m==2 && leapyear == true)	
			numdays = 29;
		else if (m==2 && leapyear == false)
			numdays = 28;
		else
			numdays = 30;
		
		return numdays;
			
	}
	
	//method that returns true if specified year is leap year
	public static boolean isLeapYear(int y)
	{
		boolean leap;
		double remain = y % 4;
		
		if (remain==0)
			leap = true;
		else
			leap = false;
		
		return leap;
			
	}
	
	
	
	
}
