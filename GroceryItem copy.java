/**
 * This class creates a class Grocery Items
 * and creates methods to set and get item code and shelf life
 * @author Aanvi Guliani
 * @version 1.0
 */
public class GroceryItem {
   private int itemcode;
   private int shelflife;
   
   //constructor
   GroceryItem ()
   {
	   itemcode = 0;
	   shelflife = 0;
   }
   
   //constructor
   GroceryItem (int icode, int slife)
   {
	   itemcode = icode;
	   shelflife = slife;
   }
   
   //set method for item code
   public void setItemCode (int slife)
   {
	   shelflife = slife;
   }
   
   //set method for shelf life
   public void setShelfLife (int slife)
   {
	   shelflife = slife;
   }
   
 //get method for item code
   public int getItemCode()
   {
	   return itemcode;
   }
   
 //get method for shelf life
   public int getShelfLife()
   {
	   return shelflife;
   }
   
   
   
}
