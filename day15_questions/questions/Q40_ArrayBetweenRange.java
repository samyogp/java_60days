package day15_questions.questions;
// Q40: Array of 30 integers, display those between 16 and 47 [BIM 2016]
public class Q40_ArrayBetweenRange {

     public static void main(String[] args) {
        int[] arr = new int[30];
        // Filling array with some values for demo
        for (int i = 0; i < 30; i++) {
            arr[i] = i * 3 + 5; // values: 5, 8, 11, 14, 17, 20 ...
        }

        System.out.println("Numbers between 16 and 47:");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 16 && arr[i] <= 47) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
