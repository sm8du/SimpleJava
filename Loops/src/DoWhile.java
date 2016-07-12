
public class DoWhile {

	 //The difference between do-while and while is that do-while evaluates 
	 //its expression at the bottom of the loop instead of the top. Therefore, the statements within the do 
	 //block are always executed at least once, as shown in the following DoWhileDemo program:
	
	public static void main(String[] args){
	        int count = 12;
	        do {
	            System.out.println("Count is: " + count);
	            count++;
	        } while (count < 11);
	    }

}
