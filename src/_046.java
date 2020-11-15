import java.util.Scanner;

public class _046 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        int[] a = new int[n];
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

        bubbleSort(a);

        out = new StringBuilder();
        out.append("[");
        for (int i = 0; i < n; i++) {
            out.append(a[i] + (i == n - 1 ? "" : " ,"));
        }
        out.append("]");
        System.out.println(out);

        scanner.close();
    }

    private static void bubbleSort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int t = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = t;
                }
            }
        }
    }
}
