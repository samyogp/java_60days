package day14_chapter4.Third_challenge;

import java.util.Scanner;

public class BitwiseComplement {
    public static void main(String[] args) {
       // create a program that shows bitwise compliment of a number.

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to showcase of Not/Compliment operator");
        System.out.println("please enter your number");
        int num = input.nextInt();

        int result = ~num; 

        System.out.println("Your result is: " + result);

    }



    
}
