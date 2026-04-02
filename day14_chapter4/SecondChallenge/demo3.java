package day14_chapter4.SecondChallenge;

import java.util.Scanner;

public class demo3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to the greatest number checker");
        System.out.println("Please enter the first number");
        int num1 = input.nextInt();
        System.out.println("please enter the second number");
        int num2 = input.nextInt();
        System.out.println("please enter the third number");
        int num3 = input.nextInt();

        if (num1 >= num2 && num1 >= num3) {
            System.out.println("the greatest number is: " + num1);
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println("the greatest number is: " + num2);
        } else {
            System.out.println("the greatest number is: " + num3);
             input.close();
        }
        }
    }
