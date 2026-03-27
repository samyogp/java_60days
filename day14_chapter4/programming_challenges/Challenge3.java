package day14_chapter4.programming_challenges;

import java.util.Scanner;

public class Challenge3 {

    // create a program to calculate perimeter of a rectangle 
    // (Perimeter of rectangle ABCD = A+B+C+D)

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter length: ");
        int length = input.nextInt();

        System.out.println("Enter breadth: ");
        int breadth = input.nextInt();

        int perimeter = 2 * (length + breadth);

        System.out.println("perimeter of rectangle: " + perimeter);

        input.close();
    }
    
}
