/**
 * This class throws ClassCastException
 * @author Aanvi Guliani
 * @version 1.0
 */

public class ClassCastExceptionThrown {

	public static void main (String[] args)

    { 
		Object strObject = new String();
		Integer i = (Integer) strObject;
    }

}