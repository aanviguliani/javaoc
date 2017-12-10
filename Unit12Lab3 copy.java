/**
 * This class uses one of the Map classes to implement a contact list
 * The program should prompt the user for the name of the file where the information is stored, 
 * and allow the user to add a contact from the list, 
 * delete a contact from the list, 
 * and display the entire contact list.
 * @author Aanvi Guliani
 * @version 1.0
 */

import java.util.*;
import java.io.*;

public class Unit12Lab3 {
	public static void main (String[] args)
	{
		//Read contents of a file
		String file;
	    Scanner scan = new Scanner(System.in);
	    Scanner string = new Scanner(System.in);
	    
	   
	    System.out.print("Enter File Name to read (with extension e.g file.txt) : ");
	    file = scan.nextLine();
	    

	    //String filePath = "/Users/aanvi/Desktop/MapTestFile.txt";
	   
	    
	    //Create a HashMap of Contacts
	  	HashMap<Integer, ContactInfo > contacts = new HashMap<Integer, ContactInfo >();
	  	
	  		 try	
	         {
			    //read file
			    BufferedReader reader = new BufferedReader(new FileReader(file));
			
			    int i = 0;
			    ContactInfo[] c1 = new ContactInfo[10];
			    while ((file = reader.readLine()) != null)
			    {
			        String[] parts = file.split(":", 4);
			        
			            int id = Integer.parseInt( parts[0]);
			            String name = parts[1];
			            String phone = parts[2];
			            String email = parts[3];
			          //  System.out.println("Id " + id);
			          //  System.out.println("Name "  + name);
			          //  System.out.println("Phone " + phone);
			          //  System.out.println("Email " + email);
			            
			            c1[i] = new ContactInfo (id, name, phone, email);
			            
			            contacts.put(c1[i].getid(), c1[i]);
			            i++;
			    } //end of while
		        reader.close();
		        
				/*
				ContactInfo c1 = new ContactInfo (100, "John Doe", "000-000-0011", "jd@yahoo.com");
				ContactInfo c2 = new ContactInfo (101, "Jay Doe", "000-000-0012", "jd1@yahoo.com");
				ContactInfo c3 = new ContactInfo (102, "Abi Doe", "000-000-0013", "ad@yahoo.com");
				ContactInfo c4 = new ContactInfo (103, "Scott Doe", "000-000-0014", "sd@yahoo.com");
				ContactInfo c5 = new ContactInfo (104, "Charles Doe", "000-000-0015", "cd@yahoo.com");
					
				contacts.put(c1.getid(), c1);
				contacts.put(c2.getid(), c2);
				contacts.put(c3.getid(), c3);
				contacts.put(c4.getid(), c4);
				contacts.put(c5.getid(), c5);
				*/
	    
				System.out.println("Initial Hash Map from File " );
				
		        
				for (Map.Entry contact : contacts.entrySet())
				{
					
				    ContactInfo c = contacts.get(contact.getKey());
				    
					System.out.println(c.getid() + " : " +
				                       c.getname() + " : " +
							           c.getphone() + " : " +
				                       c.getemail() );
				
				}
				
				//Add a contact in the Map
				 ContactInfo c6 = new ContactInfo (105, "New Doe", "000-000-0016", "nd@yahoo.com");

				 contacts.put ( c6.getid(), c6);	
				
		       System.out.println("Hash Map After addition...");
				
				
				for (Map.Entry contact : contacts.entrySet())
				{
					
				    ContactInfo c = contacts.get(contact.getKey());
				    
				    
					System.out.println(c.getid() + " : " +
				                       c.getname() + " : " +
							           c.getphone() + " : " +
				                       c.getemail() );
				}
				
				//Delete a contact in the Map
				contacts.remove(c6.getid());
				
				System.out.println("Hash Map After deletion... New Doe");
				
				for (Map.Entry contact : contacts.entrySet())
				{
					
				    ContactInfo c = contacts.get(contact.getKey());
				    
				    
					System.out.println(c.getid() + " : " +
				                       c.getname() + " : " +
							           c.getphone() + " : " +
				                       c.getemail() );
				}//end of for
	         } //end of try
	  		 catch(IOException ex)
		     {
		         System.out.println("Error reading file named '" + file + "'");
		     }
	         
	}

}
