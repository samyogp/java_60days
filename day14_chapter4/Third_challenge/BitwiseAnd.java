package day14_chapter4.Third_challenge;

import java.util.Scanner;

public class BitwiseAnd {
    

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int first = input.nextInt();
        System.out.println("enter the second number: ");
        int second = input.nextInt();

        int result = first & second;
        System.out.println("the result of " + first + " & " + second + " is: " + result);
        

    }
    
}
