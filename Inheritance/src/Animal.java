
public class Animal {
	public int age;
	
	public Animal(int age){
		System.out.println("An animal has been created!");
	}
	
	public void eat(){
		System.out.println("An animal is eating");
	}
	
	public static void main(String[] args) {
		
	Animal a = new Animal(5);
	dog d = new dog();
	Cat c = new Cat();
	d.bark();
	c.meow();
	d.eat();
	d.run();
	}

}
