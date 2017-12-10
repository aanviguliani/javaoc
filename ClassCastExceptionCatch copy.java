public class ClassCastExceptionCatch {

public static void main (String[] args)

  { 

	Object strObject = new String();

	try
	{
		Integer i = (Integer) strObject;
	}

	catch (ClassCastException e)
	{
		System.out.println("Exception ClassCastException caught");
	}

  }

}