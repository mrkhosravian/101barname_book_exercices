import java.util.Scanner;

public class _040 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            int fact = 1;
            for (int j = 2; j <= i - 1; j++) {
                fact *= i;
            }
            sum += 1 / ((float) fact);
        }
        System.out.println(sum);
        scanner.close();
    }
}
