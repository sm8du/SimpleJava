import java.awt.Color;
import java.awt.Dimension;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;


public class OS_Type {

	public static void main(String[] args) throws Exception {
		String name = "os.name";
		String version ="os.version";
		String arch = "os.arch";
		String user = "user.name";
		
		System.out.println("OS: " + System.getProperty(name));
		System.out.println("Version: " + System.getProperty(version));
		System.out.println("Arch: " + System.getProperty(arch));
		System.out.println("Current User: " + System.getProperty(user));
	
		
		//Screen Color Test 
		Robot robot = new Robot();
		Color color = robot.getPixelColor(20,20);
		
		System.out.println("Red : "+ color.getRed());
		System.out.println("Blue : "+ color.getBlue());
		System.out.println("Green : "+ color.getGreen());
		//Screen Size
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		System.out.println(dim);
		// SUMULATE
		robot.keyPress(KeyEvent.VK_R);
		robot.keyRelease(KeyEvent.VK_R);
		
		robot.mouseMove(1100,500 );
		robot.mousePress(InputEvent.BUTTON1_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_MASK);
		Thread.sleep(50);
		robot.mousePress(InputEvent.BUTTON1_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_MASK);
	}

}
