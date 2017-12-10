/**
 * This program extends the abstract class Account
 * and creates methods specific to the checking account
 * @author Aanvi Guliani
 * @version 1.0
 */

import java.util.Scanner;

public class CheckingAccount extends Account
{

	//class members
	private double overdraftLimit;
	private double balanceAfter;
	
	//constructor
	public CheckingAccount()
	{
		this.overdraftLimit = 0;
		this.balanceAfter = 0;
	}
	
	//constructor
	public CheckingAccount(int a, double b, double i, Date date, double o)
	{
		super(a,b,i,date);
		this.overdraftLimit = o;
	}
	
	public void setOverdraft(double o)
	{
		overdraftLimit = o;
	}
	
	public double getOverdraft()
	{
		return overdraftLimit;
	}
	
	public void withdrawFunds(double w)
	{
		
		if (w <= getOverdraft() && w <getBalance())
		{
			double balance = getBalance() - w;
			setBalance(balance);
		}
		
		else if (w > getBalance())
		{
			System.out.println("ERROR: Withdrawal amount exceeds balance.");
		}
		else
		{
			System.out.println("ERROR: Withdrawal amount exceeds overdraft.");
		}
	
	}
	
	public void depositFunds(double d)
	{

		double balance = getBalance() + d;
		setBalance(balance);
		
	}
	
	
	
	
	
}
