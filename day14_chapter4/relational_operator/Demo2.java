package day14_chapter4.relational_operator;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Driving License Portal");
        System.out.print("Please enter your age: ");

        int age = input.nextInt();

        if (age >= 18) {
            System.out.println("Congratulations! You are eligible for a driving license.");
        } else {
            System.out.println("Sorry, you are not eligible for a driving license.");
        }

        input.close();
    }
}