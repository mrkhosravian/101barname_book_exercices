import java.util.Scanner;

public class _004 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int a = scanner.nextInt(), b = scanner.nextInt(), c = scanner.nextInt();
        int delta = b * b - 4 * a * c;
        if (delta < 0) {
            System.out.println("Rishe No :D");
        } else if (delta == 0) {
            double x = (-b) / 2 * a;
            System.out.println("x = " + x);
        } else {
            double x1 = (-b + Math.sqrt(delta)) / 2 * a;
            double x2 = (-b - Math.sqrt(delta)) / 2 * a;
            System.out.println("x1 = " + x1);
            System.out.println("x1 = " + x2);
        }
        scanner.close();
    }
}
