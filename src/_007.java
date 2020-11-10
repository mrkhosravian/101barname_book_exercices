import java.util.Scanner;

public class _007 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        // int[] a = new int[n];
        int max = scanner.nextInt();
        for (int i = 1; i < n; i++) {
            int t = scanner.nextInt();
            if (t > max) {
                max = t;
            }
        }
        System.out.println("Maximum input was :" + max);
        scanner.close();
    }
}
