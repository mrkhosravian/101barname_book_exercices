import java.util.Scanner;

public class _021 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String ans = new _021().solve(n);
        System.out.println(ans);
        scanner.close();
    }

    private String solve(int n) {
        _017 isPrimeSolver = new _017();
        while (n > 0) {
            if (!isPrimeSolver.solve(n % 10)) {
                return "It's not a cutable number";
            }
            n /= 10;
        }
        return "It's a cutable number";
    }
}
