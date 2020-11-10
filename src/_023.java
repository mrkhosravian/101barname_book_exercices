import java.util.Scanner;

public class _023 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String ans = new _023().solve(n, (int) log2(n + 1));
        System.out.println(ans);
        scanner.close();
    }

    private String solve(int number, int n) {
        _017 isPrimeSolver = new _017();
        return isPrimeSolver.solve(number) && isPrimeSolver.solve(n) ? "It's a mersenne number"
                : "It's not a mersenne number";
    }

    public static int log2(int N) {

        // calculate log2 N indirectly
        // using log() method
        int result = (int) (Math.log(N) / Math.log(2));

        return result;
    }

}
