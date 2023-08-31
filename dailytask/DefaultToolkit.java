package dailytask;

import java.awt.Dimension;
import java.awt.Toolkit;

public class DefaultToolkit {
         public static void main(String[] args) {
        	 Toolkit toolkit = Toolkit.getDefaultToolkit();

             // Get the size of the screen.
             Dimension screenSize = toolkit.getScreenSize();

             // Print the size of the screen.
             System.out.println("The screen size is " + screenSize);
		}
}
