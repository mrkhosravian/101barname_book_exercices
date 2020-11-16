import java.util.Scanner;

public class _048 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        Integer[] a = new Integer[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        StringBuilder out = new StringBuilder();
        out.append("[");
        for (int i = 0; i < n; i++) {
            out.append(a[i] + (i == n - 1 ? "" : " ,"));
        }
        out.append("]");
        System.out.println(out);


        for (int i = 0; i < a.length; i++) {
            if (a[i] == null) continue;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] == a[i]) {
                    a[j] = null;
                }
            }
        }

        out = new StringBuilder();
        out.append("[");
        for (int i = 0; i < n; i++) {
            if(a[i] == null) continue;
            out.append(a[i] + (i == n - 1 ? "" : " ,"));
        }
        out.append("]");
        System.out.println(out);

        scanner.close();
    }
}
