package day14_chapter4.SecondChallenge;

// Challenge15: Calculate the sum of first N numbers entered by the user
import java.util.Scanner;

public class challenge11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers do you want to sum?");
        int n = input.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; i++) { // Loop from 1 to n
            System.out.println("Enter number " + i + ":");
            int num = input.nextInt();
            sum += num; // Add number to sum
        }

        System.out.println("The total sum is: " + sum);
        input.close();
    }
}