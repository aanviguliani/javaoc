
public class NullPointerExceptionCatch 
{
	public static void main(String[] args)
    {
        Object1 obj = null;
       try
       {
        obj.getObject();
       }
       catch(NullPointerException e)
       {
    	   System.out.println("Null Pointer Exception caught.");
       }
        
    }
}
