
public class Rectangle 
{
	//intialize variables
		private int width;
		private int length;
		
		public void setWidth(int w)
		{
			width = w;
		}

		public void setLength(int h)
		{
			length = h;
		}

		public int getWidth()
		{
			return width;
		}
		
		public int getLength()
		{
			return length;
		}
		
		public int calculatePerimeter()
		{
			int p = 2 * (width + length);
			return p;
		}
		
		public int calculateArea()
		{
			int a = width * length;
			return a;
		}
}
