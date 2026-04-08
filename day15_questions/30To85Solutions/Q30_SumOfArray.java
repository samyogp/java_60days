package day15_questions.30To85Solutions;

import java.util.*;
import java.io.*;

// ============================================================
// Q30: Print sum of elements of an array
// ============================================================
class Q30_SumOfArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Array elements: " + Arrays.toString(arr));
        System.out.println("Sum of all elements: " + sum);
    }
}