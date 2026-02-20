package day07_tutorial.coadingbyprashantsir;

// A variable is a container that holds data that can be changed during
// the execution of a program. It has a name, a type, and a value.

public class Variables {

    public static void main(String[] args) {
        //variable Declaration and Initialization.

        int myNumber = 865;
        int yourNumber;

        

        System.out.println("myNumber is: " + myNumber);

        // yourNumber cannot be used before initialization
        yourNumber = 500;
        System.out.println("yourNumber is: " + yourNumber);

        int yourNumber2 = 1000;
        System.out.println("yourNumber2 is: " + yourNumber2);

        // Changing the value of a variable
        myNumber = 900;
        System.out.println("Updated myNumber is: " + myNumber);

        // Different types of variables

        float myFloat = 3.0f;   // 'f' is required for float
        System.out.println("myFloat is: " + myFloat);

        // boolean variable

        boolean isVegetarian = true;
        System.out.println("isVegetarian: " + isVegetarian);

        String Wishes = "Good Morning";
        System.out.println("morning Wishes: " + Wishes);

        // char example 
        char myCharacter = 's';
        System.out.println("myCharacter is: " + myCharacter);
    }
}