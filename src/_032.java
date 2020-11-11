import java.util.Scanner;

public class _032 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            StringBuilder row = new StringBuilder();
            for (int j = 1; j <= n; j++) {

                if (i == 1 || i == n / 2 + 1|| i == n || (j == 1 && i <= n / 2) || (j == n && i >= n / 2 + 1)) {
                    row.append("s");
                } else {
                    row.append(" ");
                }

            }
            System.out.println(row);
        }
        scanner.close();
    }
}
