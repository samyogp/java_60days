 package day13_Abstraction;



abstract class Animal {

    // Abstract method (does not have a body)
    abstract void makeSound();

    // Normal method
    void sleep() {
        System.out.println("Animal is sleeping...");
    }
}

class Dog extends Animal {

    // Providing implementation of abstract method
    void makeSound() {
        System.out.println("Dog says: Woof Woof");
    }
}

public class AbstractionExample {
    public static void main(String[] args) {

        Animal myDog = new Dog();   // Upcasting
        myDog.makeSound();          // Calls Dog's method
        myDog.sleep();              // Calls Animal's method
    }
}