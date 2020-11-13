import java.util.Scanner;

public class _043 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        int fact = 1, k_fact = 1, n_k_fact = 0;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        for (int i = 0; i <= n; i++) {
            if (i == 0) {
                k_fact = 1;
                n_k_fact = fact;
            } else {
                n_k_fact /= n - i + 1;
                k_fact *= i;
            }
            if (i != 0)
                System.out.print("+");
            System.out.printf(" %d(a^%d . b^%d) ", fact / (k_fact * n_k_fact), i, n - i);
        }
        scanner.close();
    }
}
