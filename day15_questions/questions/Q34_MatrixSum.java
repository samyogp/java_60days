package day15_questions.questions;
// Q34: Print sum of all elements of a matrix m x n
public class Q34_MatrixSum  {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int sum = 0;
        System.out.println("Matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
                sum = sum + matrix[i][j];
            }
            System.out.println();
        }
        System.out.println("Sum of all elements: " + sum);
    }
    
}
