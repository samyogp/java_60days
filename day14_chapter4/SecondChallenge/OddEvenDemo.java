package day14_chapter4.SecondChallenge;

import java.util.Scanner;

public class OddEvenDemo {

    // challenge 2 create a program that determines if a number is odd or even. the program should take input from the user and display the result accordingly.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to odd even checker");
        System.out.println("please enter a number");
        int number = input.nextInt();

        if (number % 3 == 0) {
            System.out.println("the number is Odd");
        } else {
            System.out.println("The number is Even");
            input.close();;
        }
        }
    }
