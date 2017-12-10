/**
 * This program uses bubble sorting to sort an array of integers
 * The effeciency of Bubble Sort is O(n2) because inner loop does O(n) work on each iteration
 * and the outer loop runs for O(n) iterations
 * @author Aanvi Guliani
 * @version 1.0
 */

public class BubbleSort
{
	public static void sortArray(int[] numArray) 
	{
       //Find the length of the array
	    int n = numArray.length;
	    int temp = 0;

	    for (int i = 0; i < n; i++) 
	    {
	        for (int j = 1; j < (n - i); j++) 
	        {

	            if (numArray[j - 1] > numArray[j]) 
	            {
	            	//swapping the variables
	                temp = numArray[j - 1];
	                numArray[j - 1] = numArray[j];
	                numArray[j] = temp;
	            }

	        }
	    }
	}

	   public void printArray(int[] x) 
	   {
	      for(int i=0; i<x.length; i++)
	        System.out.print(x[i] + " ");
	   }

	   public static void main(String[] args) {
	      // TestBubbleSort
		   BubbleSort b = new BubbleSort();
	      int[] num = {5,4,3,2,1};
	      System.out.println("The original array is: ");
	      b.printArray(num); 
	      b.sortArray(num);
	      System.out.println("");
	      System.out.println("The sorted array is: ");
	      b.printArray(num);   
	   }
}