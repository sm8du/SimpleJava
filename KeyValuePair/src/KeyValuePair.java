
import java.util.*;
import java.io.*;

// An object that maps keys to values. 
// A map cannot contain duplicate keys; each key can map to at most one value.
class KeyValuePair{
    public static void main(String []argh){
    	Map<String,Integer> myMap; // declare a String to String map
    	myMap = new HashMap<String,Integer>(); // initialize it as a new String to String HashMap
    	
    	
    	Scanner in = new Scanner(System.in);
    	System.out.println("Enter how many items you want on the shopping list(1-10): ");
    	int n = in.nextInt();
        
        
        for(int i = 0; i < n; i++){
        	System.out.println("Item: ");
        	String item = in.next();
            System.out.println("How much/many?: ");
        	Integer amount = in.nextInt();
        	myMap.put(item,amount);
            
        }
        in.close();
        System.out.println(myMap.keySet());
    }
}

