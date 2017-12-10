import java.util.Scanner;

public class TestRectangle 
{
	public static void main(String [] args)
	{
		//create Rectangle object
		Rectangle r = new Rectangle();
	
		//prompt user to enter desired length and width
		Scanner input = new Scanner(System.in);
		System.out.println("Enter length of rectangle: ");
		int l = input.nextInt();
		
		//if else construct to make sure length is between 1 and 30
	if(l>30 || l<1)
	{
			System.out.println("ERROR: Length must be an integer between 1 and 30");
	}
		
	else
	{
		System.out.println("Enter width of rectangle: ");
		int w = input.nextInt();
		
		//if else construct to make sure width is between 1 and 30
	if(w>30 || w<1)
	{
		System.out.println("ERROR: Length must be an integer between 1 and 30");
	}
		
	else
	{
		
		//prompt user to enter character to create rectangle
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter character to create rectangle: ");
		char c = reader.next().charAt(0);
		
		//set length and width
		r.setLength(l);
		r.setWidth(w);
		
		//Create for loop to create rectangle
		for(int i = 0; i<(l);i++)
		{
			System.out.println();
			
			for(int j = 0; j<(w); j++)
			{
				System.out.print(c);
			}
		}
		
		System.out.println();
		
		//Display info about rectangle
		System.out.println("Rectangle is displayed above");
		System.out.println();
		System.out.println("Length of rectangle is: " + r.getLength() );
		System.out.println("Width of rectangle is: " + r.getWidth() );
		System.out.println("Perimeter of rectangle is: " + r.calculatePerimeter() );
		System.out.println("Area of rectangle is: " + r.calculateArea() );
	}
	}
	}
}
