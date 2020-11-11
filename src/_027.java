import java.util.Scanner;

public class _027 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        StringBuilder twoBase = new StringBuilder();
        if ((n & 1) == 1) { // it's odd
            while (n != 0) {
                twoBase.append(n % 2);
                n >>= 1;
            }
            System.out.println(twoBase.reverse());
        } else {
            System.out.println("It's not an odd number");
        }
        scanner.close();
    }
}
