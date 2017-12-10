//Exercise 4.1b - Lines fanning From All Corners Class Test
//This Program Tests Class LinesB
 /*
import javax.swing.JFrame;
 
public class LinesBTest {
    public static void main (String [] args) {
    	
    	LinesB panel = new LinesB();
        
        JFrame application = new JFrame();
        application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        application.add( panel );
        application.setSize( 300, 300 );
        application.setVisible( true );
    }
}

*/
import javax.swing.JFrame;
	 
	public class LinesBTest {
	    public static void main (String [] args) {
	    	
	        LinesB panel = new LinesB(); // create a panel that contains our drawing
	        
	        JFrame application = new JFrame(); // create a new frame to hold the panel
	        application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE ); // exit frame when closed
	        application.add( panel ); // add the panel to the frame
	        application.setSize( 300, 300 ); // set the size of the frame
	        application.setVisible( true ); // make the frame visible
	    }
	}