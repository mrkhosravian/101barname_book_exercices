import java.util.Scanner;

public class _025 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        System.out.println(n == (int) Math.pow(2, log2(n)) ? "Yes" : "No");
        scanner.close();
    }

    public static int log2(int n) {
        return (int) (Math.log(n) / Math.log(2));
    }
}
