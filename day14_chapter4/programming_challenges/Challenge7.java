package day14_chapter4.programming_challenges;

import java.util.Scanner;

public class Challenge7 {
// create a program to print fahrenheit to celsius
// degree C = (degree f - 32)*5/9

public static void main(String[] args) {

    Scanner input  = new Scanner(System.in);
    System.out.println("Enter fahrenheit f: ");
    int f = input.nextInt();
    
   double c = (f - 32) * 5.0 / 9;
    System.out.println("Temperature in celsius: " + c);
    input.close();

}

    
}
