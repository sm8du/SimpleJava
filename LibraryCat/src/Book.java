
public class Book {
	// Properties
	String title;
	int pageCount;
	int ISBN;
	boolean isCheckedOut;// checked in or out
	int dayCheckedOut = -1;
	
	//Book Constructor 
	public Book(String bookTitle, int bookPageCount, int bookISBN){
		this.title = bookTitle;
		this.pageCount=bookPageCount;
		this.ISBN = bookISBN;
		this.isCheckedOut = false;
	}
	// Getters
	public String getTitle(){
		return this.title;
	}
	public int getPageCount(){
		return this.pageCount;
	}
	public int getISBN(){
		return this.ISBN;
}
	public  boolean getIsCheckedOut(){
		return this.isCheckedOut;
	}
	public int getDayCheckedOut(){
		return this.dayCheckedOut;
	}
	
	//Setters
	
	public void setIsCheckedOut(boolean isCheckedOut, int currentDayCheckedOut){
		this.isCheckedOut = isCheckedOut;
		setDayCheckedOut(currentDayCheckedOut);
	}
	
	private void setDayCheckedOut(int day){
		this.dayCheckedOut = day;
	}
}
