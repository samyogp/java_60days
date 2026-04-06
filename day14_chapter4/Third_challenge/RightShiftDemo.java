package day14_chapter4.Third_challenge;

import java.util.Scanner;

public class RightShiftDemo {
    public static void main(String[] args) {
        
    

      Scanner input = new Scanner(System.in);
        System.out.println("Welcome to showcase of Bitwise complement operator");
        System.out.println("please enter your number");
        int num1 = input.nextInt();

        int result = num1 >> 1;

        System.out.println("Your result is: " + result);

    }



    
}

    

