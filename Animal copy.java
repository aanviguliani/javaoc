/**
 * This program implements the interfaces specific to animals
 * @author Aanvi Guliani
 * @version 1.0
 */


public class Animal implements Drawable,Rotatable,Resizable,Sounds
{
	private String name;
	
	
	public void draw()
	{
		System.out.println("Drawing an Animal");
	}

	public void rotate()
	{
		System.out.println("Rotating an Animal");
	}

	public void resize()
	{
		System.out.println("Resizing an Animal");
	}
	
	public void playSound()
	{
		System.out.println("Playing sound for an Animal");
	}

	public void setName(String n)
	{
		name = n;
	}

	public String getName()
	{
		return name;
	}
	
	

}
