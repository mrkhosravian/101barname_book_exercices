import java.util.Scanner;

public class _005 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int a = scanner.nextInt(), b = scanner.nextInt(), c = scanner.nextInt();
        if (a + b > c && a + c > b && b + c > a) {
            if (a == b && b == c) {
                System.out.println("Equileteral Triangle");
            } else if ((a == b) || (b == c) || (a == c)) {
                System.out.println("Isosceles Triangle");
            } else if ((a * a == b * b + c * c) || (c * c == b * b + a * a) || (b * b == a * a + c * c)) {
                System.out.println("Rectangular Triangle");
            } else {
                System.out.println("Other Triangle");
            }
        } else {
            System.out.println("Can't make a triangle");
        }
        scanner.close();
    }
}
