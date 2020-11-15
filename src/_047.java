import java.util.Scanner;

public class _047 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        int[][] a = new int[n][n];
        int[][] b = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                b[i][j] = scanner.nextInt();
            }
        }
        StringBuilder out = new StringBuilder();
        out.append("***** Added *****").append("\n");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                out.append(a[i][j] + b[i][j]).append("\t");
            }
            out.append("\n");
        }
        out.append("*****************").append("\n");
        System.out.println(out);

        scanner.close();
    }
}
