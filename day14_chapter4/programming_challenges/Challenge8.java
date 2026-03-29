package day14_chapter4.programming_challenges;

import java.util.Scanner;

public class Challenge8 {

    // floating point numbers product showing float multiplication

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("we are doing float multiplication \n");
        System.out.println("please enter first decimal number: ");
        double first = input.nextDouble();
        System.out.println("Now please enter second number: ");
        double second = input.nextDouble();

        double mul = first * second;
        System.out.println("\n Result is: " + mul);
        input.close();
    }

    
}
