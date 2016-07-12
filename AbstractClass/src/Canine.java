/** Superclass **/
abstract class Canine{
    // instance variables
    String name;
    String color;
    String gender;
    int age;
    
   
    Canine(String name, String color, int age, char mF){ 
        this.name = name;
        this.color = color;
        this.age = age;
        this.gender = (mF == 'M') ? "Male " : "Female ";
    }
   
    abstract String getBreed(); 
    
    
    void printInfo(){ 
    	// print information about the dog:
        System.out.println(name + " is " + ((age%10 == 8)? "an " : "a ") + age + " year old " 
           + gender + getBreed() + " with a " + color + " coat.");
  
    }
}

//** Subclass of Canine **/
class KleeKai extends Canine{
    KleeKai(String name, String color, int age, char mF){ 
        super(name, color, age, mF); 
    }

    String getBreed(){ // abstract method implementation
        return "Klee Kai";
    }
}

/** Subclass of Canine **/
class SiberianHusky extends Canine{ 
	
    SiberianHusky(String name, String color, int age, char mF){ // Constructor
        super(name, color, age, mF); 
    }
    
    
    String getBreed(){ // abstract method implementation
        return "Siberian Husky";
    }
}




