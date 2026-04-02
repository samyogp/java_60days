package day14_chapter4.SecondChallenge;

import java.util.Scanner;

public class ThreeNumberGreatest {
    // create a program that determines the greatest of the three numbers.
    public static void main(String[] args) {
//         int num1 = 10;
//         int num2 = 20;
//         int num3 = 15;

//         if (num1 >= num2 && num1 >= num3) {
//             System.out.println("The greatest number is: " + num1);
//         } else if (num2 >= num1 && num2 >= num3) {
//             System.out.println("The greatest number is: " + num2);
//         } else {
//             System.out.println("The greatest number is: " + num3);
//         }
//     }
    
// }
// when user can input the value and finds the greatest numbers from 3 numbers.

        Scanner input = new Scanner(System.in);
        System.out.println("welcome to greatest number checker");
        System.out.println("please enter the first number");
        int num1 = input.nextInt();
        System.out.println("please enter the second number");
        int num2 = input.nextInt();
        System.out.println("please enter the third number");
        int num3 = input.nextInt();

        if (num1 >= num2 && num1 >= num3) {
            System.out.println("The greatest number is: " + num1);
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println("The greatest number is: " + num2);
        } else {
            System.out.println("The greatest number is: " + num3);
            input.close();
        }
    }
}
