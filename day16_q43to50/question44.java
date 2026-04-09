package day16_q43to50;

import java.util.Scanner;
// Q44: 10 integers, find product of numbers less than 5 [BIM 2021 Makeup]
public class question44 {

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int product = 1;
        boolean found = false;

        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            if (arr[i] < 5) {
                product = product * arr[i];
                found = true;
            }
        }

        if (found) {
            System.out.println("Product of numbers less than 5: " + product);
        } else {
            System.out.println("No number less than 5 found.");
        }
    }
    
}
