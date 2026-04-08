package day15_questions.questions;
// Q38: Multiply two matrices
public class Q38_MatrixMultiplication {
    public static void main(String[] args) {
        int[][] A = {{1, 2}, {3, 4}};
        int[][] B = {{5, 6}, {7, 8}};
        int n = 2;
        int[][] C = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    C[i][j] = C[i][j] + A[i][k] * B[k][j];
                }
            }
        }

        System.out.println("Matrix A:");
        for (int[] row : A) { for (int v : row) System.out.print(v + "\t"); System.out.println(); }
        System.out.println("Matrix B:");
        for (int[] row : B) { for (int v : row) System.out.print(v + "\t"); System.out.println(); }
        System.out.println("Product (A x B):");
        for (int[] row : C) { for (int v : row) System.out.print(v + "\t"); System.out.println(); }
    }
    
}
