public class IllegalArgumentExceptionCaught {
  public static void main(String[] args) {
    
    
    try
    {
    Percentage percentage = new Percentage(121);
    System.out.println(percentage.getValue());
    }
    catch(IllegalArgumentException e)
    {
    	System.out.println("Exception caught. Argument must be less than 100.");
    }
  }
}