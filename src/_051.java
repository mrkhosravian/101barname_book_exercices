import java.util.Scanner;

public class _051 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[scanner.nextInt()];
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }

        // selection sort
        for (int i = 0; i < a.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[min])
                    min = j;
            }

            int t = a[i];
            a[i] = a[min];
            a[min] = t;
        }

        // Print sorted
        StringBuilder out = new StringBuilder();
        out.append("[");
        for (int i = 0; i < a.length; i++) {
            out.append(a[i] + (i == a.length - 1 ? "" : " ,"));
        }
        out.append("]");
        System.out.println(out);

        scanner.close();
    }
}
