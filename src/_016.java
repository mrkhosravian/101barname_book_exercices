import java.util.Scanner;

public class _016 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        int sum = 1;
        for (int i = 2; i <= n / 2; i++) {
            sum += n % i == 0 ? i : 0;
        }
        System.out.println(sum == n ? "It's Complete number" : "Not!!!");
        scanner.close();
    }
}
