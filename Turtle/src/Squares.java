
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import com.lrdev.turtle.Turtle;

public class Squares extends JPanel {

	public Squares() {
		
		// Create a JFrame - a window that will appear on your screen
		JFrame f = new JFrame();
		
		// Tells the program to quit if you close the window
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Puts your drawing into the window (the JFrame)
		f.add(new JScrollPane(this));
		
		// Changes the size of the window on the screen
		f.setSize(600, 600);
		
		// Changes where the window will appear on your screen
		f.setLocation(200, 200);
		
		// Makes the window appear
		f.setVisible(true);
	}
	
	protected void paintComponent(Graphics g) {
		Turtle turtle = new Turtle((Graphics2D) g, getBounds());
		turtle.setHeadingMode(Turtle.DEGREE);
		
		int recursiveDepth = 7;
		int x = -250;
		int y = -250;
		int length = 5;
			turtle.penup();
			turtle.setXY(x,y);
			turtle.pendown();
//	        drawOneSquare(turtle, length);
//		drawSquares(turtle, recursiveDepth-1,length/2, x, y );
//		drawSquares(turtle, recursiveDepth-1,length/2, x + length/2, y );
//		drawSquares(turtle, recursiveDepth-1,length/2, x, y + length/2 );
//		drawSquares(turtle, recursiveDepth-1,length/2, x + length /2, y + length/2 );
	        

		//drawSquares(turtle, recursiveDepth, length, x, y);
	
	//drawLevy(turtle, recursiveDepth, length, x, y);
		hilbert(turtle, recursiveDepth,length,x,y);
		X(turtle, recursiveDepth,length,x,y);
	}
	
	
	
	
	
	private void drawOneSquare(Turtle turtle, int length) {
		//turtle.penup();
		
		turtle.pendown();
		turtle.back(length);
		turtle.right(-90);
		turtle.back(length);
		turtle.right(-90);
		turtle.back(length);
		turtle.right(-90);
		turtle.back(length);
		turtle.right(-90);
		
	}
	

 
public void X(Turtle turtle,int recursiveDepth, int length, int x, int y){
	if (recursiveDepth==0)
		return;
	Y(turtle,recursiveDepth-1,length,x,y);
	turtle.forward(length);
	turtle.left(60);
	X(turtle,recursiveDepth-1,length,x,y);
	turtle.forward(length);
	turtle.left(60);
	Y(turtle,recursiveDepth-1,length,x,y);
	
	
}
public void Y(Turtle turtle,int recursiveDepth, int length, int x, int y){
	if (recursiveDepth==0)
		return;
	X(turtle,recursiveDepth-1,length,x,y);
	turtle.forward(length);
	turtle.right(60);
	Y(turtle,recursiveDepth-1,length,x,y);
	turtle.forward(length);
	turtle.right(60);
	X(turtle,recursiveDepth-1,length,x,y);
	
	
}
	
public void hilbert(Turtle turtle,int recursiveDepth, int length, int x, int y){
    if (recursiveDepth == 0) return;
    
  	turtle.left(90);
    treblih(turtle,recursiveDepth-1,length,x,y);
    turtle.forward(length);
    turtle.right(90);
    hilbert(turtle,recursiveDepth-1,length,x,y);
    turtle.forward(length);
    hilbert(turtle,recursiveDepth-1,length,x,y);
    turtle.right(90);
    turtle.forward(length);
    treblih(turtle,recursiveDepth-1,length,x,y);
    turtle.left(90);
    
    
    
    
}
	
public void treblih(Turtle turtle,int recursiveDepth, int length, int x, int y){
	if (recursiveDepth == 0) return;
    turtle.right(90);
    hilbert(turtle,recursiveDepth-1,length,x,y);
    turtle.forward(length);
    turtle.left(90);
    treblih(turtle,recursiveDepth-1,length,x,y);
    turtle.forward(length);
    treblih(turtle,recursiveDepth-1,length,x,y);
    turtle.left(90);
    turtle.forward(length);
    hilbert(turtle,recursiveDepth-1,length,x,y);
    turtle.right(90);








}
	
	
	private void drawLevy(Turtle turtle, int recursiveDepth, int length, int x, int y) {
		if (recursiveDepth ==0 ){
			turtle.forward(length);
			return;}
		
		//drawLevy(turtle, recursiveDepth-1,length/2, x, y);
		turtle.left(45);
		drawLevy(turtle, recursiveDepth-1,length, x, y);
		turtle.right(45);
		turtle.right(45);
		turtle.changeColor(Color.blue);
		drawLevy(turtle, recursiveDepth-1,length, x, y);
		turtle.changeColor(Color.red);
		turtle.left(45);
		
	}
	
		
		private void drawSquares(Turtle turtle, int recursiveDepth, int length, int x, int y) {
		
		if (recursiveDepth == 0){
			return;
		}
		turtle.penup();
		turtle.setXY(x,y);	
			drawOneSquare(turtle, length);

		turtle.changeColor(Color.MAGENTA);
		drawSquares(turtle, recursiveDepth-1,length/2, x, y);
		turtle.changeColor(Color.blue);
		drawSquares(turtle, recursiveDepth-1,length/2, x - length/2, y);
		turtle.changeColor(Color.red);
		drawSquares(turtle, recursiveDepth-1,length/2, x, y - length/2);
		turtle.changeColor(Color.cyan);
		drawSquares(turtle, recursiveDepth-1,length/2, x - length /2, y - length/2 );
			
		}
	
	public static void main(String[] args) {
		Squares test = new Squares();
		System.out.println("hey baby whats wrong ");
	}

}