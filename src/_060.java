import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class _060 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        Random rand = new Random();
        int[][] A = new int[n][n];
        int[][] B = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                A[i][j] = Math.abs(rand.nextInt()) % 20;
                B[i][j] = Math.abs(rand.nextInt()) % 20;
            }
        }

        System.out.println("***** Matrix A *****");
        printMatrix(A);
        System.out.println();
        System.out.println("***** Matrix B *****");
        printMatrix(B);

        int aWins = 0;
        int bWins = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (A[i][j] > B[i][j]) aWins++;
                else if (A[i][j] < B[i][j]) bWins++;
            }
        }

        System.out.println("\n***** Result *****");
        if (aWins >= n * n / 2)
            System.out.println("Matrix A is bigger than B.");
        else if (bWins >= n * n / 2)
            System.out.println("Matrix B is bigger than A.");
        else if (aWins + bWins == n * n)
            System.out.println("Both are equal.");
        else
            System.out.println("Not comparable.");

        scanner.close();
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}
