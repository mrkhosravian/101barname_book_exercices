import java.util.Scanner;

public class _009 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        int fact = n;
        for (int i = 2; i < n; i++) {
            fact *= i;    
        }
        System.out.println("fact : " + fact);
        scanner.close();
    }
}
