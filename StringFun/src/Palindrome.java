import java.util.Scanner;

public class Palindrome {

	
	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the word: ");
		String n = scan.next();
	    scan.close();
		boolean check = true;
	    int test = n.length() - 1;
	    for (int i = 0; i < n.length(); i++) {
	      if (n.charAt(i) != n.charAt(test - i)) {
	        check = false;
	      }
	    }
	    if (check == true) {
	    	System.out.println("The word is in fact a palindrome!");
	    }
	    else{
	    	System.out.println("The word is not a palindrome!");
	    }

	}

}
