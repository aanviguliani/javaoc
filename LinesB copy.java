//Exercise 4.1b - Lines fanning From All Corners
//This Program Draws Lines fanning From All Corners of a JFrame
 
import java.awt.Graphics;
import javax.swing.JPanel;
 
public class LinesB extends JPanel {
    public void paintComponent(Graphics g) {
 
        int width = getWidth();
        int height = getHeight();
        int x, y;
        int loopCount = 1;
        int xCount = 1;
        int yCount = 1;
      
        super.paintComponent(g);
      
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
 
        //fan out from top right corner
 
        loopCount = xCount = yCount = 1;
 
        g.drawLine(width, 0, width, height);
 
        while (loopCount < 15) {
            g.drawLine(width, 0, width - x * xCount, height - y * yCount);
            ++loopCount;
            ++xCount;
            ++yCount;
        }
 
        //fan out from bottom left corner
 
        loopCount = xCount = yCount = 1;
 
        g.drawLine(0, height, width, height);
 
        while (loopCount < 15) {
            g.drawLine(0, height, width - x * xCount, height - y * yCount);
            ++loopCount;
            ++xCount;
            ++yCount;
        }
 
        //fan out from bottom right corner
 
        loopCount = xCount = yCount = 1;
 
        g.drawLine(width, height, 0, height);
      
        while (loopCount < 15) {
            g.drawLine(width, height, x * xCount, height - y * yCount);
            ++loopCount;
            ++xCount;
            ++yCount;
        }
 
    } // end method paintComponent
} //end class
