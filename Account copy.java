/**
 * This program creates an abstract class account
 * @author Aanvi Guliani
 * @version 1.0
 */


public abstract class Account 
{
	//define class members
	private int accountNumber;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;
	
	
	//constructor
	public Account()
	{
		this.accountNumber = 0;
		this.balance = 0;
		this.annualInterestRate = 0;
		this.dateCreated = null;
	}
	
	//constructor
	public Account(int a, double b, double i, Date date)
	{
		this.accountNumber = a;
		this.balance = b;
		this.annualInterestRate = i;
		this.dateCreated = date;
	}
	
	//method to set account number
	public void setAccountNumber(int a)
	{
		accountNumber = a;
	}
	
	//method to get account number
	public int getAccountNumber()
	{
		return accountNumber;
	}
	
	//method to set balance
	public void setBalance(double b)
	{
		balance = b;
	}
	
	//method to get balance
	public double getBalance()
	{
		return balance;
	}
	
	//method to set interest rate
	public void setInterestRate(double i)
	{
		annualInterestRate = i;
	}
	
	//method to get interest rate
	public double getInterestRate()
	{
		return annualInterestRate;
	}
	
	//method to get date created
	public Date getDateCreated()
	{
		
		return dateCreated;
	}
	
	//abstract methods
	public abstract void withdrawFunds(double w);
	
	public abstract void depositFunds(double d);
	
	
}
