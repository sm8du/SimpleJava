
public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int[] c = new int[5];
			System.out.println("Element 6 at index 5 = " + c[5]);
			
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Exception thrown "+ e);
		}
		
		finally{ // do this no matter what happens 
			System.out.println("Finally Finished try-catch");
	}

}
}
