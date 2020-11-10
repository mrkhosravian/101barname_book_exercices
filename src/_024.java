import java.util.Scanner;

public class _024 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int a = scanner.nextInt(), b = scanner.nextInt();
        System.out.println("GCD ( Greatest Common Divisor ) is : " + gcd(a, b));
        System.out.println("LCM‌ ( Least Common Multiple ) is : " + lcm(a, b));
        scanner.close();
    }

    public static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }

    public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }
}
