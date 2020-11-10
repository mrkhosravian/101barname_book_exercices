import java.util.Scanner;

public class _008 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        // int[] a = new int[n];
        int acc = 0;
        for (int i = 0; i < n; i++) {
            acc += scanner.nextInt();
        }
        System.out.println("Average number is : " + (double) acc / n);
        scanner.close();
    }
}
