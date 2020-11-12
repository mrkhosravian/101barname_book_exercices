import java.util.Scanner;

public class _037 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            StringBuilder row = new StringBuilder();
            for (int j = 1; j <= n - i; j++) {
                row.append(" ");
            }
            
            for (int j = 1; j <= i; j++) {
                row.append(j);
            }
            for (int j = i - 1; j >= 1; j--) {
                row.append(j);
            }

            for (int j = 1; j <= n - i; j++) {
                row.append(" ");
            }
            System.out.println(row);
        }
        scanner.close();
    }
}
