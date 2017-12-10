/**
 * This program extends the abstract class Account
 * and creates methods specific to a savings account
 * @author Aanvi Guliani
 * @version 1.0
 */

import java.util.Scanner;

public class SavingsAccount extends Account
{
	
	//constructor
	public SavingsAccount()
	{
	}
	
	//constructor
	public SavingsAccount(int a, double b, double i, Date date)
	{
		super(a,b,i,date);
		
	}
	
	
	public void withdrawFunds(double w)
	{
		if (w <= getBalance())
		{
			double balance = getBalance() - w;
			setBalance(balance);
		}
		
		else
		{
			System.out.println("ERROR: Withdrawal amount exceeds balance.");
		}
		
	}

	public void depositFunds(double d)
	{
		
	
		double balance = getBalance() + d;
		setBalance(balance);
		
		System.out.println("Deposit 1 in class successful. New balance is: " + balance);
		
	}
	
	
	
	
	
}
