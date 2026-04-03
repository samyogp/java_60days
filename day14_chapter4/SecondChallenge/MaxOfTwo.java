package day14_chapter4.SecondChallenge;

import java.util.Scanner;

public class MaxOfTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a = input.nextInt();
        System.out.println("Enter second number:");
        int b = input.nextInt();

        if (a > b) {
            System.out.println(a + " is larger");
        } else if (b > a) {
            System.out.println(b + " is larger");
        } else {
            System.out.println("Both numbers are equal");
        }

        input.close();
    }
}