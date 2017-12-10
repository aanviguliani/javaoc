/**
 * This program creates a Palindrome
 * @author Aanvi Guliani
 * @version 1.0
 */
import java.util.Scanner;

public class PalindromeTest {
	
	public static void main(String[] args)
	{
		
		System.out.print("Enter the String : ");
		
		Scanner input = new Scanner(System.in);
		String strinput = input.nextLine();

		//System.out.println("strinput = " + strinput);
		 
		//if a user does not input any caharcter or one character
		 if(strinput.length() <= 1)
		 {
			 System.out.println("Enter 2 or more characters to test for Palindrome");
		 }
		 else
		 {
			//Remove spaces using regular expressions
			String str2 = strinput.replaceAll("\\s+","");
			
			//convert to lower case
			String str3 = str2.toLowerCase();
			
			//remove special characters
			String str4 = str3.replaceAll("[^a-zA-Z0-9]", "");
			
			//System.out.println("Output String is after removing spaces and special charcters: " + str4);
			
			//test Palindrome by calling the function
			boolean testpal = testPalindrome (str4);
			
			//System.out.println("boolean value " + testpal);
			if (testpal)
			{
				System.out.println("Input String is a Palindrome");
			}
			else
				System.out.println("Input String is not a Palindrome");
		 }
		
	}
	
	//Recursive Function
	public static boolean testPalindrome(String iString)
	{
		//Find the length of the input string
		int len = iString.length();
		
		if (len <= 1) {
	        return true;
	    }
		
		//System.out.println(" char at 0 = " + iString.charAt(0));
		//System.out.println(" char at 0 = " + iString.charAt(len - 1));
		//System.out.println(" substr = " + iString.substring(1, len - 1));
		
	    return (iString.charAt(0) == iString.charAt(len - 1)) &&
	           testPalindrome(iString.substring(1, len - 1));
    
	}	
}