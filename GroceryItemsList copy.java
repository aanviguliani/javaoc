/**
 * This class invokes methods from Grocery Item
 * and creates 2 array lists based on shelf life
 * and displays the array lists
 * @author Aanvi Guliani
 * @version 1.0
 */

import java.util.*;
import java.util.Random;

public class GroceryItemsList 
{
	public static void main (String [] args)
	{
		ArrayList<GroceryItem> groceryitem1 = new ArrayList<GroceryItem>();
		
		ArrayList<GroceryItem> groceryitem2 = new ArrayList<GroceryItem>();
		
		int shelfLife = 0;
		int itemCode = 1;
		//long rnSeed = 0;
		
		//Repeat for 50 items
		
		for (int i = 0 ; i < 50; i++)
		{
			// creates a Random object
		 	Random rnGenerator = new Random();  
			
			// next int in range 0 to 30
			shelfLife = rnGenerator.nextInt(30) + 1; 
			
			//System.out.println(shelfLife);
			
			//itemCode starts at 1
			itemCode = i + 1;
			
			if (shelfLife > 7)
			{
				GroceryItem  g1 = new GroceryItem(itemCode, shelfLife);
				groceryitem1.add(g1);
			}
			else
			{
				GroceryItem  g2 = new GroceryItem(itemCode, shelfLife);
				groceryitem2.add(g2);
			}
		}   //end of for 50 items
		
		//print grocery list 1
		System.out.println("Items with shelf life greater than 7 years:");
		for(int j = 0; j < groceryitem1.size(); j++)
		{
			GroceryItem  g = groceryitem1.get(j);
			
			System.out.println(
					"Item Code: " + g.getItemCode() + "\t" + 
					"Shelf Life: "  + g.getShelfLife()
					);
		}
		System.out.println();
		
		//print grocery list 2
				System.out.println("Items with shelf life less than 7 years:");
				
				
		for(int j = 0; j < groceryitem2.size(); j++)
		{
			GroceryItem  g2 = groceryitem2.get(j);
			System.out.println(
						"Item Code: " + g2.getItemCode() + "\t" + 
						"Shelf Life: "  + g2.getShelfLife()
						);
		}
				System.out.println();
	}
}
	