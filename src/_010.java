import java.util.Scanner;

public class _010 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        int acc = 0;
        for (int i = 7; i <= n; i+= 7) {
            acc += i;
        }
        System.out.println(acc);
        scanner.close();
    }
}
