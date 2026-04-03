package day14_chapter4.SecondChallenge;


// Challenge17: Calculate the factorial of a number entered by the user
import java.util.Scanner;

public class challenge13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to calculate factorial:");
        int num = input.nextInt();

        int factorial = 1;
        for (int i = 1; i <= num; i++) { // Multiply numbers from 1 to num
            factorial *= i;
        }

        System.out.println("Factorial of " + num + " is " + factorial);
        input.close();
    }
}
