import java.awt.Component;

import javax.swing.JFrame;

public class DrawPanel 
{
	public static void main(String [] args)
	{
		JFrame application = new JFrame();
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Component panel = null;
		Component add = application.add(panel);
		application.setSize(250, 250);
		application.setVisible(true);
		
	}
}
