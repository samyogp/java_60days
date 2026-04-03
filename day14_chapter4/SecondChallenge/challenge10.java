package day14_chapter4.SecondChallenge;

// Challenge14: Check if a letter entered by user is a vowel or consonant
import java.util.Scanner;

public class challenge10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a single letter:");
        char ch = input.next().charAt(0); // Read the first character

        // Convert to lowercase for easy comparison
        ch = Character.toLowerCase(ch);

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println(ch + " is a vowel");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println(ch + " is a consonant");
        } else {
            System.out.println("Invalid input");
        }

        input.close();
    }
}