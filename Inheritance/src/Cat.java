
public class Cat extends Animal {
	
	public Cat(){
		super(7); //The subclass makes an explicit call to the superclass' parameterized constructor
		System.out.println("A cat has been created!");
		
	}
	public void eat(){
		System.out.println("A cat is eating!");
	}
	public void meow(){
		System.out.println("The cat is meowing!");
	}
}
