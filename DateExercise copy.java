/**
 * This program tests the Date class
 * @author Aanvi Guliani
 * @version 1.0
 */

import javax.swing.*;
import java.util.InputMismatchException;

public class DateExercise {

	public static void main(String [] args)
	{
		//create date object
		Date d = new Date();
		
		boolean validinput = true;
		
		//prompt user for month inputs
		int m = 0;
	    do 
	    {
	    	try
		    {
				m = Input.getInt("Enter a month as an integer (1-12)");
				
				//if month is not between 1 and 12
				//show user a message 
				//and ask for input again
				if  (m <= 0 || m > 12)
				{
					//display info
					JOptionPane.showMessageDialog( null,"The month is not valid" );
					validinput = false;
				}
				else
				{
					validinput = true;
				}
		    }
		    catch(InputMismatchException inputMismatchException)
		    {
		    	JOptionPane.showMessageDialog( null,"You must enter a month from 1 - 12" );
		    	validinput = false; //ask user for input again
		    }
	    	catch(NumberFormatException numberFormatException)
		    {
		    	JOptionPane.showMessageDialog( null,"You must enter a month from 1 - 12" );
		    	validinput = false; ///ask user for input again
		    }
	    } while (validinput == false);
		
			d.setMonth(m);
		
		//initilize validinput again after month is set
		validinput = true;
		
		//prompt user for day input
		int day = 0;
		
		do 
	    {
	    	try
		    {
				day = Input.getInt("Enter a day (1-31)");
				
				//if day is not between 1 and 31
				//show user a message 
				//and ask for input again
				if  (day <= 0 || day > 31)
				{
					//display info
					JOptionPane.showMessageDialog( null,"The day is not valid" );
					validinput = false;
				}
				else
				{
					validinput = true;
				}
		    }
		    catch(InputMismatchException inputMismatchException)
		    {
		    	JOptionPane.showMessageDialog( null,"You must enter a day from 1 - 31" );
		    	validinput = false; //ask user for input again
		    }
			catch(NumberFormatException numberFormatException)
		    {
		    	JOptionPane.showMessageDialog( null,"You must enter a day from 1 - 31" );
		    	validinput = false; ///ask user for input again
		    }
		} while (validinput == false);
		
		d.setDay(day);
		
		//initilize validinput again after month is set
		validinput = true;
		
		//prompt user for year input
		int year = 0;
		
		do 
	    {
			try
			{
				year = Input.getInt("Enter a year (e.g 2017)");
			}
			catch(InputMismatchException inputMismatchException)
		    {
		    	JOptionPane.showMessageDialog( null,"You must enter a day from 1 - 31" );
		    	validinput = false; //ask user for input again
		    }
			catch(NumberFormatException numberFormatException)
		    {
		    	JOptionPane.showMessageDialog( null,"You must enter a day from 1 - 31" );
		    	validinput = false; ///ask user for input again
		    }
		} while (validinput == false);
	
		d.setYear(year);
		
		//display info
		JOptionPane.showMessageDialog( null,"The date is: " + d.getDate());
	
	}
}