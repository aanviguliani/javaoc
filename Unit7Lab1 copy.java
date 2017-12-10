/**
 * This program reads a file and count lines
 * words, characters and paragraphs based on input provided in arguments
 * @author Aanvi Guliani
 * @version 1.0
 */

import java.util.Scanner;
import java.io.*;

public class Unit7Lab1 
{
    public static void main(String[] args)
    {
        String fname;
        Scanner scan = new Scanner(System.in);
        
        /* enter the name of the file to read */
        System.out.print("Enter File Name to read (with extension e.g file.txt) : ");
        fname = scan.nextLine();
        
        
        /* Read  one line at a time */
        
        String line = null;
        try
        {
            // FileReader reads the text files in the default encoding
            FileReader fileReader = new FileReader(fname);
            
            // always wrap the FileReader in BufferedReader
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            
            //initialize the variables for counts
            int numwords = 0;
            int numlines = 0;
            int numchars = 0;
            int numparagraph = 1;
            
            //initialize the variables to store the type of count to be done
            boolean linecount = false;
            boolean wordcount = false;
            boolean charcount = false;
            boolean paracount = false;
            
            //update the value of variables, based on users arguments
            for (int i=0; i < args.length; i++)
            {
            	System.out.println("argument = " + args[i]);
            	
            	if (args[i].equals("s") )
            	{
            		linecount = true;
            	}
            	
            	if (args[i].equals("w") )
            	{
            		wordcount = true;
            	}
            	
            	if (args[i].equals("c") )
            	{
            		charcount = true;
            	}
            	
            	if (args[i].equals("p") )
            	{
            		paracount = true;
            	}
            	
            	//System.out.println("sentence count " + linecount);
            	//System.out.println("word count " + wordcount);
            	//System.out.println("character count " + charcount);
            	//System.out.println("para count " + paracount);
            }
            
            while((line = bufferedReader.readLine()) != null)
            {
                System.out.println(line);
                
                
                	if (linecount )
                	{
                		//Count numlines (sentence)
                		numlines++;
                	}
                	
                	if (wordcount)
                	{
                		//Count words in this line
                		numwords = numwords + countWords(line);
                	}
                
                	if (paracount)
                	{
                		//Count paragraphs
                		if(line.isEmpty()) 
                		{
                			numparagraph = numparagraph + 1;
                		}
                	}
                	
                	if (charcount)
                	{
                
                		//Count characters
                		numchars = numchars + line.length();
                	}
            }
            
        	//Display number of lines
            if (linecount)
            {

            	System.out.println("Number of lines = " + numlines);
            }
            
            //Display number of characters
            if (charcount)
            {
            	System.out.println("Number of characters = " + numchars);
            }
            
          //Display number of words
            if (wordcount)
            {
            	System.out.println("Number of Words = " + numwords);
            }
            
          //Display number of paragraphs
            if (paracount)
            {
            	System.out.println("Number of Paragraphs = " + numparagraph);
            }
            /* always close the file after use */
            bufferedReader.close();
        }
        catch(IOException ex)
        {
            System.out.println("Error reading file named '" + fname + "'");
        }
    }
    
    public static int countWords(String str)
    {
        int count = 1;
        for(int i=0; i<=str.length()-1; i++)
        {
        	if(str.charAt(i) != ',' || str.charAt(i) !='!')
            {
             
	            if(str.charAt(i) == ' ' && str.charAt(i+1)!=' ')
	            {
	                count++;
	            }
            }
        }
        return count;
    }
}