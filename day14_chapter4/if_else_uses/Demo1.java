package day14_chapter4/if_else_uses/Demo1;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your marks: ");
        int marks = input.nextInt();

        if (marks < 0 || marks > 100) {
            System.out.println("Invalid marks");
        } else if (marks >= 80) {
            System.out.println("Distinction");
        } else if (marks >= 60) {
            System.out.println("First Division");
        } else if (marks >= 50) {
            System.out.println("Second Division");
        } else if (marks >= 40) {
            System.out.println("Third Division");
        } else {
            System.out.println("Fail");
        }

        input.close();
    }
}