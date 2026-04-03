package day14_chapter4.SecondChallenge;

// Challenge16: Calculate simple interest based on principal, rate, and time
import java.util.Scanner;

public class challenge12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter principal amount:");
        double principal = input.nextDouble();
        System.out.println("Enter annual interest rate (in %):");
        double rate = input.nextDouble();
        System.out.println("Enter time in years:");
        double time = input.nextDouble();

        double interest = (principal * rate * time) / 100; // Simple interest formula
        System.out.println("Simple Interest = " + interest);

        input.close();
    }
}