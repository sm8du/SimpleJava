import java.awt.BorderLayout;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
	
public class URL_Frame {

	public static void Frame() {
		JFrame  frame  = new JFrame("URL_Frame");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	    frame.setSize(200, 200);
	    frame.setLocationRelativeTo(null);
	   
	    JTextField field = new JTextField(20);
	    frame.add(field, BorderLayout.NORTH);
	   
	    JButton closeButton = new JButton("Close");
	    frame.add(closeButton, BorderLayout.SOUTH);
	    closeButton.addActionListener(e -> System.exit(0));
	    
	    JButton URLButton = new JButton("Go to URL");
	    frame.add(URLButton, BorderLayout.CENTER);
	    URLButton.addActionListener(e -> URL_go(field.getText()));	
	    
	   
	    frame.pack();
	    		
	}
		
	public static void URL_go(String string){
		 try {
		      URI uri = new URI("http://"+string);
		      Desktop desktop = null;
		      if (Desktop.isDesktopSupported()) {
		        desktop = Desktop.getDesktop();
		      }

		      if (desktop != null)
		        desktop.browse(uri);
		    } catch (IOException ioe) {
		      ioe.printStackTrace();
		    } catch (URISyntaxException use) {
		      use.printStackTrace();
		    }
		
	} 
	
		public static void main(String[] a) {
		Frame();
		
	}

}



