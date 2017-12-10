

	import java.awt.Graphics;

	import javax.swing.JPanel;
	 
	public class Lines extends JPanel{
	    public void paintComponent(Graphics g) {
	 
	        int width = getWidth(); // total width
	        int height = getHeight(); // total height
	        int x, y;
	        int loopCount = 1;
	        int xCount = 1;
	        int yCount = 1;
	 
	        super.paintComponent(g); // call paintComponent to ensure the panel displays correctly
	         
	        x = width / 15;
	        y = height / 15;
	 
	        //fan out from top left corner
	 
	        g.drawLine(0, 0, 0, height);
	 
	        while (loopCount < 15) {
	            g.drawLine(0, 0, x * xCount, height - y * yCount);
	            ++loopCount;
	            ++xCount;
	            ++yCount;
	        }
	 
	    } // end method paintComponent
	}//end class


