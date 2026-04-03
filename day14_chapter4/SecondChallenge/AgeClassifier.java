package day14_chapter4.SecondChallenge;

import java.util.Scanner;

public class AgeClassifier {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = input.nextInt();

        if (age >= 65) {
            System.out.println("You are a senior citizen");
        } else if (age >= 20) {
            System.out.println("You are an adult");
        } else if (age >= 13) {
            System.out.println("You are a teenager");
        } else if (age >= 0) {
            System.out.println("You are a child");
        } else {
            System.out.println("Invalid age");
        }

        input.close();
    }
}