import java.util.Random;
import java.util.Scanner;

public class _059 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        Random rand = new Random();
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = rand.nextInt() % 100;
            }
        }

        long acc = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j += 2) {
                acc += matrix[i][j];
            }
        }
        System.out.println(acc);
        scanner.close();
    }
}
