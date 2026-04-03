package day14_chapter4.SecondChallenge;

// Challenge13: Check if a number entered by user is divisible by 3, 5, both, or neither
import java.util.Scanner;

public class challenge9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = input.nextInt();

        if (num % 3 == 0 && num % 5 == 0) { // Divisible by both 3 and 5
            System.out.println(num + " is divisible by 3 and 5");
        } else if (num % 3 == 0) { // Divisible by 3 only
            System.out.println(num + " is divisible by 3");
        } else if (num % 5 == 0) { // Divisible by 5 only
            System.out.println(num + " is divisible by 5");
        } else { // Not divisible by 3 or 5
            System.out.println(num + " is not divisible by 3 or 5");
        }

        input.close();
    }
}
