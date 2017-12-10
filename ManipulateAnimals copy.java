/**
 * This program creats an array of vehicle and animal objects to model their characteristics
 * @author Aanvi Guliani
 * @version 1.0
 */
public class ManipulateAnimals 
{
	public static void main( String [] args )
	{
		
		//create arrays for each interface
		Drawable [] drawableObjects = {new Animal(), new Vehicle(), new Animal(), new Vehicle()};
		Rotatable [] rotatableObjects = {new Animal(), new Vehicle(), new Animal(), new Vehicle()};
		Resizable [] resizableObjects = {new Animal(), new Vehicle(), new Animal(), new Vehicle()};
		Sounds [] audibleObjects = {new Animal(), new Vehicle(), new Animal(), new Vehicle()};
		
		
		//display drawable info
		for (int i = 0; i<drawableObjects.length; i++)
		{
			drawableObjects[i].draw();
		}
		
		System.out.println();
		
		//display rotatable info
		for (int i = 0; i<rotatableObjects.length; i++)
		{
			rotatableObjects[i].rotate();
		}
		
		System.out.println();
		
		//display resizable info
		for (int i = 0; i<resizableObjects.length; i++)
		{
			resizableObjects[i].resize();
		}
		
		System.out.println();
		
		//display audible info
		for (int i = 0; i<audibleObjects.length; i++)
		{
			audibleObjects[i].playSound();
		}
		
		
		
		
		
	}
}
