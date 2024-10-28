// Abstract class
abstract class Animal {
    // Abstract method (does not have a body)
    public abstract void makeSound();

    // Regular method
    public void sleep() {
        System.out.println("Zzz...");
    }
}

// Dog class inherits from Animal
class Dog extends Animal {
    // Implement the abstract method
    public void makeSound() {
        System.out.println("Bark");
    }
}

// Cat class inherits from Animal
class Cat extends Animal {
    // Implement the abstract method
    public void makeSound() {
        System.out.println("Meow");
    }
}

// Main class to test
public class Abstractioin {
    public static void main(String[] args) {
        Animal myDog = new Dog(); // Create a Dog object
        Animal myCat = new Cat(); // Create a Cat object

        myDog.makeSound();  // Outputs: Bark
        myCat.makeSound();  // Outputs: Meow

        myDog.sleep();      // Outputs: Zzz...
        myCat.sleep();      // Outputs: Zzz...
    }
}