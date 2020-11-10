import java.util.Scanner;

public class _017 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        boolean ans = new _017().solve(n);
        System.out.println(ans ? "It's a prime number" : "It's not a prime numbe");
        scanner.close();
    }

    public boolean solve(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
