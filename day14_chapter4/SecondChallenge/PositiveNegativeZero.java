package day14_chapter4.SecondChallenge;

import java.util.Scanner;

public class PositiveNegativeZero {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to a Number checker");
        System.out.println("please enter a number");
        int number = input.nextInt();

        if (number > 0) {
            System.out.println("the number is positive");
        } else if (number < 0) {
            System.out.println("the number is negative");
        } else {
            System.out.println("the number is zero");
            input.close();
        }
        }       
     }

