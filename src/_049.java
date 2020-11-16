import java.util.Scanner;

public class _049 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = (int) (Math.random() * 100);
        }
        StringBuilder out = new StringBuilder();
        out.append("[");
        for (int i = 0; i < n; i++) {
            out.append(a[i] + (i == n - 1 ? "" : " ,"));
        }
        out.append("]");
        System.out.println(out);
        scanner.close();
    }
}
