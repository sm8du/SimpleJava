
public abstract class Animal {
	public int age;
	public Animal(int age){
		System.out.println("An animal has been created!");
	}
	public abstract void eat();

	public void sleep(){
		System.out.println("An animal is sleeping...zzzz");
	}
	public static void main(String[] args) {
		
	
	Dog d = new Dog();
	Cat c = new Cat();
	d.eat();
	c.eat();
	d.sleep();
	c.sleep();
	
	//Casting
	Object dog = new Dog();
	Dog realDog = (Dog) dog;	}

}
