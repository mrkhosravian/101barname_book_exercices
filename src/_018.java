import java.util.Arrays;
import java.util.Scanner;

public class _018 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        new _018().solve(n);
        scanner.close();
    }

    // The Sieve of Eratosthenes
    private void solve(int max) {
        boolean[] primes = new boolean[max + 1];
        Arrays.fill(primes, true);
        for (int p = 2; p * p <= max; p++) {
            if (primes[p]) {
                for (int i = p * p; i <= max; i += p) {
                    primes[i] = false;
                }
            }
        }

        StringBuilder out = new StringBuilder();
        for (int i = 2; i < primes.length; i++) {
            if (primes[i]) {
                out.append(i).append(" ");
            }
        }
        System.out.println(out);
    }
}
