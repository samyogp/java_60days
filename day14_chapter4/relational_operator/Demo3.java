package day14_chapter4.Relational_operator;

import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       
       System.out.println("Welcome to the ticket discount Calculator");
       System.out.println("Please enter your age: ");
       int age = input.nextInt();
        System.out.println("Are you a female? (True/false");
        boolean isFemale = input.nextBoolean();

        if (age <  5) {
            System.out.println("You got 75% discount");
        } else if (isFemale) {
            System.out.println("you got 50% discount");
        } else if (age > 60  && !isFemale) {
            System.out.println("you got 25% discount");
        } else {
            System.out.println("you got no Discount");

        }

        }
        }
    

