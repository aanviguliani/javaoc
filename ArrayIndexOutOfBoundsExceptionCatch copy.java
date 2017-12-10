/**

 * This class catch ArrayIndexOutOfBoundsException

 * @author Aanvi Guliani

 * @version 1.0

 */

public class ArrayIndexOutOfBoundsExceptionCatch {

public static void main (String[] args)

    {  



int n=4; 

int[]A= new int [0];

  

try

{

for(int i=0; i<n; i++)

{


System.out.println(A[i]);

}


}

catch (ArrayIndexOutOfBoundsException e)

{

System.out.println("You are trying to go beyond the index of the Array");

}

    }

}