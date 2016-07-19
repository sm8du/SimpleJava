import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JWindow;

public class ScreenShot {

		public static void main(String[] arg) throws Exception {
		    Dimension screenDim = Toolkit.getDefaultToolkit().getScreenSize();
		    Robot robot = new Robot();


		    BufferedImage img = robot.createScreenCapture(new Rectangle(0, 0, (int) screenDim.getWidth(),
		        (int) screenDim.getHeight()));

		    JWindow window = new JWindow(new JFrame());
		    window.getContentPane().setLayout(new BorderLayout());
		    window.getContentPane().add(BorderLayout.CENTER, new JLabel(new ImageIcon(img)));
		    window.pack();
		    window.setVisible(true);
	}

}
