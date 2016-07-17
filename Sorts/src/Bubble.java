
public class Bubble {

	  public static void bubbleSort(int[] intArray) {
		    int out, in;
		    for (out = intArray.length - 1; out > 0; out--) {
		      for (in = 0; in < out; in++) {
		        if (intArray[in] > intArray[in + 1]) {
		          swap(intArray, in, in + 1);
		        }
		      }
		    }
		  }

		  private static void swap(int[] intArray, int one, int two) {
		    int temp = intArray[one];
		    intArray[one] = intArray[two];
		    intArray[two] = temp;
		  }
		

	public static void main(String[] args) {
		
		int[] intAry = new int[] { 9, 8, 3, 1, 7, 4, 2, 5, 6 };
		
		    for (int i : intAry) {
		      System.out.print(i);
		    }
		    System.out.println();
		    bubbleSort(intAry);

		    for (int i : intAry) {
		      System.out.print(i);
		    }
		    
	}

}
