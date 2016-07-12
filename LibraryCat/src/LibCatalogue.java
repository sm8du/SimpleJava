import java.util.HashMap;
import java.util.Map;

public class LibCatalogue {
	
	Map <String, Book> bookCollection = new HashMap<String, Book();
	int currentDay =0; 
	int lenghtOfCheckoutPeriod = 7;
	double staticLateFee = 0.50;
	double varPerLateDay = 1.00;
	
	public LibCatalouge(Map<String,Book()> collection){
		 this.bookCollection = collection;
	}
	public LibCatalogue(Map<String, Book> collection, int lenghtOfCheckoutPeriod, 
			double staticLateFee, double varPerLateDay ){
			this.bookCollection = collection;
			this.lenghtOfCheckoutPeriod = lenghtOfCheckoutPeriod;
			this.staticLateFee = staticLateFee;
			this.varPerLateDay = varPerLateDay;
	}
	
	public int getCurrentDay(){
		return this.currentDay;
	}
	public Map<String,Book> getBookCollection(){
		return this.bookCollection;
	}
	public Book getBook(String bookTitle){
		return getBookCollection().get(bookTitle);
		
	}
	public int getLengthofCheckoutPeriod(){
		return this.lenghtOfCheckoutPeriod;
	}
	public double getStaticLateFee() {
		return this.staticLateFee;
	}
	
	public double getVarPerLateDay(){
		return this.varPerLateDay;
	}
	
	//Setters
	
	public void nextDay(){
		currentDay++;
	}
	public void setDay(int day){
		currentDay = day;
	}
	
	// INSTANCE METHODS
	
	public void checkOutBook(String title){
		Book book = getBook(title);
		if (book.getIsCheckedOut()){
			sorry(book);
			}
		else {
			book.setIsCheckedOut(true, currentDay);
			System.out.println("You just checked out "+ title + ". "
					+ "it is due on "+ (getCurrentDay() + getLengthofCheckoutPeriod() + "."));
		}
		
	}
	
	public void returnBook(String title){
		Book book = getBook(title);
		int daysLate = currentDay - (book.getDayCheckedOut() + getLengthofCheckoutPeriod());
		
		if (daysLate > 0){
			System.out.println("You owe the library $" + (getStaticLateFee() + daysLate*getVarPerLateDay()) + " because"
					+ "your book is " + daysLate+ "days overdue.");
			
		}
		book.setIsCheckedOut(false, -1);
	}
	
	public void sorry(Book book){
		System.out.println("Sorry, "+ book.getTitle() + " is already checked out."
				+ "It should be back on day "+ (book.getDayCheckedOut() +getLengthofCheckoutPeriod())+ ".");
	}
	
	
	public static void main(String[] args) {
		Map<String, Book> bookCollection = new HashMap<String,Book()>;
		Book harry = new Book("Harry Potter", 2323, 9999999);
		bookCollection.put("Harry Potter", harry);
		LibCatalouge lib = new LibCatalouge(bookCollection);
		
	}

}
