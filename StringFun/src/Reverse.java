import java.util.Scanner;
import java.util.Stack;

public class Reverse {

	  public static void main(String[] args) {
		   	Scanner scan = new Scanner(System.in);
		   	System.out.println("Enter a setence or word you want in reverse: ");
		   	String input = scan.nextLine();
		   	scan.close();
		    char[] charinput = input.toCharArray();
		    Stack<String> stack = new Stack<String>();
		   
		    
		    for (int i = input.length() - 1; i >= 0; i--) {
		      stack.push(String.valueOf(charinput[i]));
		    }
		    
		    StringBuilder StackPush = new StringBuilder();
		    for (int i = 0; i < stack.size(); i++) {
		      StackPush.append(stack.get(i));  
		    }
		    
		    System.out.println(StackPush.toString());
		  }
		}


