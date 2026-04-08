package day15_questions.questions;
// Q35: Print transpose of matrix
public class Q35_TransposeMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transpose = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        System.out.println("Original Matrix:");
        for (int[] row : matrix) {
            for (int val : row) System.out.print(val + "\t");
            System.out.println();
        }

        System.out.println("Transposed Matrix:");
        for (int[] row : transpose) {
            for (int val : row) System.out.print(val + "\t");
            System.out.println();
        }
    }
}
