/**
 * This program displays a bullseye of random alternating colors
 * @author Aanvi Guliani
 * @version 1.0
 */

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class DrawBullsEye extends JPanel
{
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		//initialize variables
		int r1 = 0; 						//first set of alternating colors
		int g1 = 0;
		int b1 = 0;
		int r2 = 0; 						//second set of alternating colors
		int g2 = 0;
		int b2 = 0;
		
		//randomize colors
		r1 = 1 + (int)(255 * Math.random() ); //randomize first set
		g1 = 1 + (int)(255 * Math.random() );
		b1 = 1 + (int)(255 * Math.random() );
		r2 = 1 + (int)(255 * Math.random() ); //randomize second set
		g2 = 1 + (int)(255 * Math.random() );
		b2 = 1 + (int)(255 * Math.random() );
		
		//draw outer circle
		g.setColor(new Color (r1, g1, b1) );
		g.fillOval(10, 10, 200, 200);
		
		
		//draw second circle
		g.setColor(new Color (r2, g2, b2) );
		g.fillOval(30, 30, 160, 160);
		
		
		//draw third circle
		g.setColor(new Color (r1, g1, b1) );
		g.fillOval(50, 50, 120, 120);
		
		
		//draw fourth circle
		g.setColor(new Color (r2, g2, b2) );
		g.fillOval(70,70, 80, 80);
		
		
		//draw fifth circle
		g.setColor(new Color (r1, g1, b1) );
		g.fillOval(90, 90, 40, 40);
		

	}
	
	
	

	public static void main(String [] args)
	{
		DrawBullsEye panel = new DrawBullsEye();
		JFrame application = new JFrame();
		
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(panel);
		application.setSize(230, 250);
		application.setVisible(true);
	}
}
