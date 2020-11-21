import java.util.Arrays;
import java.util.Scanner;

public class _056 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        int[] a = new int[n];
        int[] reversed = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        for (int i = 0; i < reversed.length; i++) {
            reversed[i] = a[n - i - 1];
        }
        System.out.println(Arrays.toString(reversed));
        scanner.close();
    }
}
