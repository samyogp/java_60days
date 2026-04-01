package day14_chapter4.if_else_uses;

import java.util.Scanner;

public class iflearning {
    

    public static void main(String[] args) {
//         int number = 10;
//         if (number > 0) {
//             System.out.println("The number is positive.");
//         } else if (number < 0) {
//             System.out.println("The number is negative.");
//         } else {
//             System.out.println("The number is zero.");
//         }
//     }

 // user can input number and check if positive or negative or Zero);

Scanner scanner = new Scanner(System.in);
System.out.print("Enter a number: ");
int number = scanner.nextInt();

if (number > 0) {
    System.out.println("The number is positive.");
} else if (number < 0) {
    System.out.println("The number is negative.");
} else {
    System.out.println("The number is zero.");
    scanner.close();

}
}
}
