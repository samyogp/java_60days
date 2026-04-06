package day14_chapter4.Third_challenge;

import java.util.Scanner;

public class BitwiseXor {
    // create a program that shows bitwise XOP of two numbers.

    public static void main(String[] args) {
        // create a program that shows bitwise XOR of two numbers.
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number:");
        // Read the first number from user input
        int first = input.nextInt();
        System.out.println("enter the second number: ");
        int second = input.nextInt();

        int result = first ^ second; // Perform bitwise XOR operation
        System.out.println("the result of " + first + " ^ " + second + " is: " + result);


    }
    
}
