import java.util.Scanner;

public class _033 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            StringBuilder row = new StringBuilder();
            for (int j = 1; j <= n / 2; j++) {
                if (i >= j && i <= n - j)
                    row.append("@");
                else
                    row.append(" ");
            }
            StringBuilder reversed = new StringBuilder(row).reverse();
            System.out.println(row.append(reversed));
        }
        scanner.close();
    }
}
