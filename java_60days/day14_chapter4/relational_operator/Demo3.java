package java_60days.day14_chapter4.relational_operator;

import java.util.Scanner;

public class Demo3 {

    // eligible for marriage or not using if and else statement.
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Welcome to the marriage eligiblity checker!");
       System.out.println("please enter your name: ");
       String name = input.nextLine();
       System.out.println("please enter your age: ");
        int age = input.nextInt();

        if (age >= 18) {
            System.out.println("congratulations " + name + "! you are eligible for marriage.");
        } else {
            System.out.println("sorry " + name + " you are not eligible for marriage.");
            input.close();
        }
        }
        }
