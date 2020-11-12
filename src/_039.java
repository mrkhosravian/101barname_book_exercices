import java.util.Scanner;

public class _039 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += (i + 2)/((float)i * (i + 1));
        }
        System.out.println(sum);
        scanner.close();
    }
}
