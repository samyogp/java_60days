package day07_tutorial.coadingbyprashantsir;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        // creating an object of Scanner class to take user input from the console.
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter Your Name:");
        String name = input.nextLine();
        System.out.println("Hello " + name + " What are you doing there...!" );
        System.out.println(name + " , Also tell me about your age:");
        int age = input.nextInt();
        System.out.println("Wow " + name + " you are " + age + " years old ..!");
        // scanner closed
         input.close();


    }
    
}
