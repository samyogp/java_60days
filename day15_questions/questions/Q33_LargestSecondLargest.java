package day15_questions.questions;

import java.util.Arrays;
// Q33: Print largest and second largest number from array
public class Q33_LargestSecondLargest {
    public static void main(String[] args) {
        int[] arr = {15, 45, 8, 72, 36, 91, 50};
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }

        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Largest number: " + largest);
        System.out.println("Second largest number: " + secondLargest);
    }
    
}
