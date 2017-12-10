/**
 * This program implements the interfaces specific to vehicles
 * @author Aanvi Guliani
 * @version 1.0
 */

public class Vehicle implements Drawable,Rotatable,Resizable,Sounds
{
	private int age;
	private String name;
	
	public void draw()
	{
		System.out.println("Drawing a Vehicle");
	}

	public void rotate()
	{
		System.out.println("Rotating a Vehicle");
	}

	public void resize()
	{
		System.out.println("Resizing a Vehicle");
	}
	
	public void playSound()
	{
		System.out.println("Playing sound for a Vehicle");
	}
	
	public void setName(String n)
	{
		name = n;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setAge(int a)
	{
		age = a;
	}
	
	public int getAge()
	{
		return age;
	}
	
	
	
}
