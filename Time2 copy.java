/**
 * This program implements a Time Class
 * using seconds since midnight
 * @author Aanvi Guliani
 * @version 1.0
 */

public class Time2 
{
	
	//declare class variable
			private int SecondsSince;
		
			//constructor
			public Time2A()
			{
			this.SecondsSince = 0;
			}
		
			//constructor
			public Time2A(int SecondsSince)
			{
			this.SecondsSince = SecondsSince;
			}
		 
			//set hour
		 	public void setHour(int hr)
		    {
		        if(hr<24 && hr>=0)
		             SecondsSince += hr*3600;
				else
		            hr = 0;
			}
		 
		 	//find hour
		    public int getHour()
		    {
				return getTime(SecondsSince,2);
		    }
		 
		    //set minute
		    public void setMinute(int min)
		    {
			
		        if(min<60 && min>=0)
		        SecondsSince += min*60;
		        else
		            min = 0;
			}
		 
		    //find minute
		    public int getMinute()
		    {
		        return getTime(SecondsSince,1);
		    }
		 
		    //set second
		    public void setSecond(int sec)
		    {
		        if(sec<60 && sec>=0)
		        SecondsSince += sec;
		        else
		            sec = 0;
			}
		 
		    //find second
		    public int getSecond()
		    {
		        return getTime(SecondsSince,0);
		    }
		 
		    //set the time
		    public void  setTime(int hr, int min,int  sec)
		    {
		        setHour(hr);
		        setMinute(min);
		        setSecond(sec);   
		    }
		 
		    //display universal time
		   public String printUniversal()
		   {
		      return String.format(
		         "%02d:%02d:%02d" , getHour(), getMinute(), getSecond() );
		   } 
		 
		 
		 //display standard time
		   public String printStandard() {
		      return String.format( "%d:%02d:%02d %s",
		    		  ((getHour() == 0 || getHour() == 12)? 12: getHour()% 12), getMinute(), getSecond(), ( getHour() < 12 ? "AM" : "PM" ));
		   } 
		 
		   //get time based on user's input
			private int getTime(int seconds,int choice)
			{
				int time = 0;	
				switch(choice)
				{
					// seconds
					case 0 :  time = (int)(seconds % 60); break;
					
					// minutes
					case 1 :  time = (int)((seconds/60) % 60); break;
					
					// hours
					case 2 :  time = (int)((seconds/3600) % 24); break;
					
					default: time = (int) seconds;
				}
				
				return time;
					
			}
		 
	 

}
