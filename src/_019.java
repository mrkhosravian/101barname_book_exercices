import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class _019 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        new _019().solve(n);
        scanner.close();
    }

    private void solve(int max) {
        _017 isPrimeSolver = new _017();
        List<Integer> primes = IntStream.range(2, Integer.MAX_VALUE)
            .filter(n -> isPrimeSolver.solve(n))
            .limit(max)
            .boxed()
            .collect(Collectors.toList());

        System.out.println(primes);
    }
}
