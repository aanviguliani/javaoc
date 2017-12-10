public class Percentage {



  private final int value;



  //Percentage constructor

  //A percentage value must be between 0 and 100 inclusive.

  public Percentage(int value) 

  {

   

  if (value < 0 || value > 100) 

  {

  throw new IllegalArgumentException(Integer.toString(value));

      }

    this.value = value;

  }



  public int getValue() 

  {

    return value;

  }


}