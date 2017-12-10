/**
 * This program randomly selects and displays 10 shapes in random colors in random positions
 * @author Aanvi Guliani
 * @version 1.0
 */

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class RandomShapes extends JPanel
{
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		
		//create for loop to iterate 10 times
		for (int j = 1; j<= 10; j++)
		{
			//randomize shape
			int shape = 0;
			shape = 1 + (int)(2 * Math.random() );
			
			//randomize size and position
			int posx = 0;
			int posy = 0;
			int length = 0;
			int width = 0;
			posx = 1 + (int)(230 * Math.random() );
			posy = 1 + (int)(250 * Math.random() );
			length = 1 + (int)(250 * Math.random() );
			width = 1 + (int)(250 * Math.random() );
			
			//randomize color
			int r1 = 0; 
			int g1 = 0;
			int b1 = 0;
			r1 = 1 + (int)(255 * Math.random() );
			g1 = 1 + (int)(255 * Math.random() );
			b1 = 1 + (int)(255 * Math.random() );
			
			if (shape == 1)
			{
				g.setColor(new Color (r1, g1, b1) );
				g.fillOval(posx,posy, length, width);
			}
			else
			{
				g.setColor(new Color (r1, g1, b1) );
				g.fillRect(posx,posy, length, width);
			}
		}
	}
	public static void main(String [] args)
	{
		RandomShapes panel = new RandomShapes();
		JFrame application = new JFrame();
		
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(panel);
		application.setSize(230, 250);
		application.setVisible(true);
		
	}	
		
}
