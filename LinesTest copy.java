
	import javax.swing.JFrame;
	 
	public class LinesTest {
	    public static void main (String [] args) {
	    	
	        Lines panel = new Lines(); // create a panel that contains our drawing
	        
	        JFrame application = new JFrame(); // create a new frame to hold the panel
	        application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE ); // exit frame when closed
	        application.add( panel ); // add the panel to the frame
	        application.setSize( 300, 300 ); // set the size of the frame
	        application.setVisible( true ); // make the frame visible
	    }
	}

