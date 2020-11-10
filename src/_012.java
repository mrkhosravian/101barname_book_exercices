import java.util.Scanner;

public class _012 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        int y = 1, z = 1;
        for (int i = 0; i < n; i++) {
            System.out.println(y);
            int t = z;
            z += y;
            y = t;
        }
        scanner.close();
    }
}
