package day15_questions.questions;

import java.util.Scanner;

public class DivisibleBy2And3 {
// Q41: Enter numbers in array of size n, display those divisible by 2 and 3 [BIM 2017]
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
      // Display numbers divisible by both 2 
        System.out.println("Numbers divisible by both 2 and 3:");
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0 && arr[i] % 3 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }
    
}
