import java.util.Scanner;

public class _013 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        int y = 1, z = 1;
        while (y < n) {
            int t = z;
            z += y;
            y = t;
        }
        System.out.println(y == n ? "Yes it'a fibonacci number." : "No.");
        scanner.close();
    }
}
