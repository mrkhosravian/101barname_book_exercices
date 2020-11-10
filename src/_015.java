import java.util.Scanner;

public class _015 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        int k = n;
        int reversed = 0;
        while (k > 0) {
            int t = k % 10;
            reversed = reversed * 10 + t;
            k /= 10;
        }
        System.out.println(reversed == n ? "Palindrom" : "Not!!!");
        scanner.close();
    }
}
