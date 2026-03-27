package day14_chapter4.programming_challenges;
// Create a program to calculate simple interest.
// simple interest = (P * T * R / 100)t

import java.util.Scanner;

public class Challenge5 {
    public static void main(String[] args) {
        int SI;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter principal P: ");
        int p = input.nextInt();

        System.out.println("Enter time T: ");
        int t = input.nextInt();

        System.out.println("Enter rate R: ");
        int r = input.nextInt();

        SI = (p * t * r) / 100;
        System.out.println("Simple interest is: " + SI);
        input.close(); 
        
    }
    
}
