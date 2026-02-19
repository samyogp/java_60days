package day07_tutorial.coadingbyprashantsir;

// a variable is a container that holds data that can be changed during the execution of a program. It has a name, a type, and a value. We can use variables to store and manipulate data in our programs.
public class Variables {
    public static void main(String[] args) {
        int myNumber = 865;
        int YourNumber;

        System.out.println("YourNumber is: " + myNumber); 

      //  System.out.println("YourNumber is: " + YourNumber); // this will give an error because we have not initialized the variable yet
    
        YourNumber = 500;
        System.out.println("YourNumber is: " + YourNumber);

     //  we can also change the value of a variable
        float myFloat = 3.0f;
        boolean isVegetarian = true;
        System.out.println("isVegeterian: " + isVegetarian);


    }


}