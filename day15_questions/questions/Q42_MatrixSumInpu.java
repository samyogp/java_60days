package day15_questions.questions;

import java.util.Scanner;
// Q42: Enter elements in matrix m x n, display sum [BIM 2018]
public class Q42_MatrixSumInpu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int m = sc.nextInt();
        System.out.print("Enter columns: ");
        int n = sc.nextInt();

        int[][] matrix = new int[m][n];
        int sum = 0;

        System.out.println("Enter elements:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
                sum = sum + matrix[i][j];
            }
        }
      // Display the matrix 
        System.out.println("Matrix entered:");
        for (int[] row : matrix) { for (int v : row) System.out.print(v + "\t"); System.out.println(); }
        System.out.println("Sum of all elements: " + sum);
    }
    
}
