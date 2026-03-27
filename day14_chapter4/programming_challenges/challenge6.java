package day14_chapter4.programming_challenges;

import java.util.Scanner;

public class challenge6 {

    // create a program to calculate compound interest.
    // Compound interest = p(1 + R / 100)t

    public static void main(String[] args) {
       
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter principle of CI p: ");
        int p = input.nextInt();

        System.out.println("Enter Rate of CI R: ");
        int r = input.nextInt();
        System.out.println("Enter Time of CI t: ");
        int t = input.nextInt();

      double A = p * Math.pow((1 + r / 100), t);
      double CI = A - p;


        System.out.println("Compound interest is: " + CI);
        input.close();

    }
    
}
