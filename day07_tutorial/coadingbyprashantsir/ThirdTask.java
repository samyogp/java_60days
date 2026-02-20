package day07_tutorial.coadingbyprashantsir;

import java.util.Scanner;

public class ThirdTask {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to our calculator");
        System.out.print("Please enter first number: ");
        int firstNumber = input.nextInt();
        System.out.println("Now please enter the second number:");
        int secondNumber = input.nextInt();
        int sum = firstNumber + secondNumber;
        System.out.println("The sum of " + firstNumber + " and " + secondNumber + " is: " + sum);

        // subtraction 
        int subtraction = firstNumber - secondNumber;
        System.out.println("The subtraction of " + firstNumber+ " and " + secondNumber+ " is: " + subtraction);
        // multiplication
        int multiplication = firstNumber * secondNumber;
        System.out.println("multiplication of " + firstNumber + " and " + secondNumber + " is: " + multiplication);
        // division
        int division = firstNumber / secondNumber;
        System.out.println("division of " + firstNumber + " and " + secondNumber + " is: " + division);

        // scanner closed
        input.close();
    }
    
}
