package day15_questions.questions;
// Q36: Find sum of two matrices
public class Q36_MatrixAddition {

public static void main(String[] args) {
        int[][] A = {{1, 2, 3}, {4, 5, 6}};
        int[][] B = {{7, 8, 9}, {10, 11, 12}};
        int[][] C = new int[2][3];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }

        System.out.println("Matrix A:");
        for (int[] row : A) { for (int v : row) System.out.print(v + "\t"); System.out.println(); }

        System.out.println("Matrix B:");
        for (int[] row : B) { for (int v : row) System.out.print(v + "\t"); System.out.println(); }

        System.out.println("Sum (A + B):");
        for (int[] row : C) { for (int v : row) System.out.print(v + "\t"); System.out.println(); }
    }

    
}
