import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Frames {


	private static void Frame() {
		JFrame  frame  = new JFrame("Swing"); // Creates frame object 
		frame.setVisible(true); // The frame is naturally invisible
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // You need this to insure the Frame Closes
	
		// Set the x, y, width and height properties
	    frame.setBounds(100, 100, 300, 200); 
	    // Get the reference of  the   content  pane
	    Container contentPane = frame.getContentPane();
	    // Create a  JButton 
	    JButton okButton   = new JButton("OK");
	    JButton closeButton  = new JButton("Close");
	    closeButton.addActionListener(e -> System.exit(0));
	    // Add  a Component to contentPane 
	    contentPane.add(okButton);
	    frame.getRootPane().setDefaultButton(okButton);
	    contentPane.add(closeButton);
	    
	   
	}


	public static void main(String[] args) {
		Frame();
		
	}

}
