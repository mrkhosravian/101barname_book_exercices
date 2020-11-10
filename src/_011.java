import java.util.Scanner;

public class _011 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        int pos = 0;
        int neg = 0;
        int zero = 0;
        int even = 0;
        for (int i = 0; i < n; i++) {
            int t = scanner.nextInt();
            if (t % 2 == 0) {
                even++;
            }

            if (t > 0) {
                pos++;
            } else if (t == 0) {
                zero++;
            } else {
                neg++;
            }
        }
        System.out.println("pos : " + pos + "\nnegatives : " + neg + "\nzeros : " + zero + "\nevens : " + even + "\nodds: "
                + (n - even));
        scanner.close();
    }
}
