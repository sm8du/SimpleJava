
public class dog extends Animal {
	// adding extends :: OBJECT-> Animal --> Dog
	public dog(){
		super(15); // calling Animal constructor
		System.out.println("A dog has been created!");
	}
	public void bark() {
		System.out.println("The dog is barking!");
	}
	public void run(){
		System.out.println("A dog is running!");
	}
}
