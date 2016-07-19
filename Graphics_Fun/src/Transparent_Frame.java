import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;


public class Transparent_Frame extends JFrame {

	public Transparent_Frame() {
		 	super();
		    JButton closeButton = new JButton("Close");
		    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		    this.setUndecorated(true);
		    this.setOpacity(0.80f);
		    this.setSize(200, 200);
		    this.setLocationRelativeTo(null);
		    this.add(closeButton, BorderLayout.SOUTH);
		    closeButton.addActionListener(e -> System.exit(0));
		   
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
		      Transparent_Frame frame = new Transparent_Frame();
		      frame.setVisible(true);
		      
		});

	}

}
