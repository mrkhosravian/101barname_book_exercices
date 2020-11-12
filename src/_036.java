import java.util.Scanner;

public class _036 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            StringBuilder row = new StringBuilder();
            for (int j = 1; j <= i; j++) {
                row.append(j).append(" ");
            }
            for (int j = 1; j <= n - 1; j++) {
                row.append(" ");
            }
            System.out.println(row);
        }
        scanner.close();
    }
}
