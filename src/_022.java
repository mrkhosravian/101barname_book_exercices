import java.util.Scanner;

public class _022 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String ans = new _022().solve(n);
        System.out.println(ans);
        scanner.close();
    }

    // Emirp
    private String solve(int n) {
        _017 isPrimeSolver = new _017();
        if (isPrimeSolver.solve(n) && isPrimeSolver.solve(reverse(n))) {
            return "It's a Emirp number";
        }
        return "It's not a Emirp number";
    }

    private int reverse(int n) {
        int reversed = 0;
        while (n > 0) {
            int t = n % 10;
            reversed = reversed * 10 + t;
            n /= 10;
        }
        return reversed;
    }
}
