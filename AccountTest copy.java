/**
 * This program creates checking account and savings account objects
 * invokes their methods to display account information
 * and asks user to withdraw and deposit funds into accounts
 * @author Aanvi Guliani
 * @version 1.0
 */


import java.util.*;

public class AccountTest 
{
	public static void main( String [] args )
	{
		//create checking account
		Date checkdate = new Date();
		CheckingAccount checkacc = new CheckingAccount();
		
		//Display basic account info
		System.out.println("Checking Account Information");
		
		//set basic checking account info
		checkacc.setAccountNumber(123456789);
		checkacc.setBalance(12345);
		checkacc.setOverdraft(1000);
		checkacc.setInterestRate(.08);
		checkdate.setDate(1, 2, 2003);
		
		System.out.println("Account Number: " + checkacc.getAccountNumber());
		System.out.println("Balance: $" + checkacc.getBalance());
		System.out.println("Date Created :" + checkdate.getDate());
		System.out.println("Annual Interest Rate: " + checkacc.getInterestRate());
		System.out.println("Overdraft Limit: $" + checkacc.getOverdraft());
		
		
		
		//create savings account
		SavingsAccount saveacc = new SavingsAccount();
		Date savedate = new Date();
		
		//Display basic account info
		
		System.out.println();
			
		//set basic checking account info
		saveacc.setAccountNumber(987654321);
		saveacc.setBalance(12345);
		saveacc.setInterestRate(.08);
		savedate.setDate(2, 1, 2006);
				
		System.out.println("Savings Account Information");
		System.out.println("Account Number: " + saveacc.getAccountNumber());
		System.out.println("Balance: $" + saveacc.getBalance());
		System.out.println("Date Created :" + savedate.getDate());
		System.out.println("Annual Interest Rate: " + saveacc.getInterestRate());
		System.out.println();
		
		
		
		
		//make deposit 1 checking
		Scanner input = new Scanner(System.in);
		System.out.println("Withdrawal/Deposit for checking account.");
		System.out.println("Enter deposit amount. ");
		double dep1amtcheck = input.nextDouble();
		
		checkacc.depositFunds(dep1amtcheck);
		System.out.println("Deposit 1 successful. New balance is: " + checkacc.getBalance());
		System.out.println();
		
		
		//make withdrawal 1 check
		System.out.println("Enter withdrawal amount. ");
		double with1amtcheck = input.nextDouble();
		
		checkacc.withdrawFunds(with1amtcheck);
		if(with1amtcheck<=checkacc.getOverdraft() && with1amtcheck <= checkacc.getBalance())
		{
		System.out.println("Withdrawal 1 successful. New balance is: " + checkacc.getBalance());
		}
		System.out.println();
		
		//make deposit 2 check
		System.out.println("Enter deposit amount. ");
		double dep2amtcheck = input.nextDouble();
		
		checkacc.depositFunds(dep2amtcheck);
		System.out.println("Deposit 2 successful. New balance is: " + checkacc.getBalance());
		System.out.println();
		
		
		//make withdrawal 2 check
		System.out.println("Enter withdrawal amount. ");
		double with2amtcheck = input.nextDouble();
		
		checkacc.withdrawFunds(with2amtcheck);
		if(with2amtcheck <= checkacc.getOverdraft() && with2amtcheck <=checkacc.getBalance())
		{
		System.out.println("Withdrawal 2 successful. New balance is: " + checkacc.getBalance());
		}
		
		System.out.println();
		System.out.println();
		
		//make dep1 save
		System.out.println("Deposit/Withdrawal Savings Account");
		System.out.println("Enter deposit amount. ");
		double dep1amtsave = input.nextDouble();
	
		saveacc.depositFunds(dep1amtsave);
		System.out.println("Deposit 1 successful. New balance is: " + saveacc.getBalance());
		System.out.println();
		
		//make with1 save
		System.out.println("Enter withdrawal amount. ");
		double with1amtsave = input.nextDouble();
		
		saveacc.withdrawFunds(with1amtsave);
		if(with1amtsave <= saveacc.getBalance())
		{
		System.out.println("Withdrawal 1 successful. New balance is: " + saveacc.getBalance());
		}
		System.out.println();
		
		//make dep2 save
		System.out.println("Deposit/Withdrawal Savings Account");
		System.out.println("Enter deposit amount. ");
		double dep2amtsave = input.nextDouble();
			
		saveacc.depositFunds(dep2amtsave);
		System.out.println("Deposit 2 successful. New balance is: " + saveacc.getBalance());
		System.out.println();
				
		//make with1 save
		System.out.println("Enter withdrawal amount. ");
		double with2amtsave = input.nextDouble();
			
		saveacc.withdrawFunds(with2amtsave);
		if(with2amtsave <= saveacc.getBalance())
		{
		System.out.println("Withdrawal 2 successful. New balance is: " + saveacc.getBalance());
		}
		System.out.println();
		
		
		
		
		
		
		
		
	}
}
