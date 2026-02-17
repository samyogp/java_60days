package day12_polymorphism.RunTimePolymorphism;

// Parent class
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class 1
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

// Child class 2
class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

   
public class RunTimePOlymorphismDemo {

     public static void main(String[] args) {
        Animal a; // reference of type Animal

        // Runtime decides which method to call
        a = new Dog();
        a.sound();  // Output: Dog barks

        a = new Cat();
        a.sound();  // Output: Cat meows

        a = new Animal();
        a.sound();  // Output

    
}
}
