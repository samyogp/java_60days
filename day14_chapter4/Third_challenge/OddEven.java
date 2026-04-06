package day14_chapter4.Third_challenge;

import java.util.Scanner;

public class OddEven {

    // odd even bitwise operator.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to odd even calculator");
        System.out.println("please enter your number: ");
        int num = input.nextInt();

        if ((num & 1) == 0) {
            System.out.println(num + " is an even number.");
        } else {
            System.out.println(num + " is an odd number.");
        }
    }
    
}
