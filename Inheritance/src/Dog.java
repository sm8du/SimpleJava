
public class Dog extends Animal {
	// adding extends :: OBJECT-> Animal --> Dog
	public Dog(){
		super(15); // calling Animal constructor
		System.out.println("A dog has been created!");
	}
	
	public void eat(){
		System.out.println("A dog is eating!");
	}
	public void bark() {
		System.out.println("The dog is barking!");
	}
	public void run(){
		System.out.println("A dog is running!");
	}
	public void sleep(){
		System.out.println("A dog is sleeping!");
	}
}
