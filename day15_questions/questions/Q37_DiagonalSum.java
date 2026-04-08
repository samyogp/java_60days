package day15_questions.questions;

public class Q37_DiagonalSum {
// Q37: Print sum of diagonal elements of a matrix
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int mainDiagSum = 0;
        int antiDiagSum = 0;
        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            mainDiagSum = mainDiagSum + matrix[i][i];
            antiDiagSum = antiDiagSum + matrix[i][n - 1 - i];
        }

        System.out.println("Matrix:");
        for (int[] row : matrix) { for (int v : row) System.out.print(v + "\t"); System.out.println(); }
        System.out.println("Main diagonal sum: " + mainDiagSum);
        System.out.println("Anti-diagonal sum: " + antiDiagSum);
    }
    
}
