import java.util.Scanner;

public class _003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int x = scanner.nextInt(), y = scanner.nextInt(), z = scanner.nextInt();
        int min = x;
        if (y < min) min = y;
        if (z < min) min = z;
        System.out.println("min is : " + min);
        scanner.close();
    }
}
