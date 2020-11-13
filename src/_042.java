import java.util.Scanner;

public class _042 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt(), x = scanner.nextInt();
        double sum = 0;
        for (int i = 1; i <= 2 * n - 1; i += 2) {
            int fact = 1;
            int pow = 1;
            for (int j = 1; j <= i; j++) {
                pow *= x;
                fact *= i;
            }
            sum += pow / ((float) fact);
        }
        System.out.println(sum);
        scanner.close();
    }
}
