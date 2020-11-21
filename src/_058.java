import java.util.Arrays;
import java.util.Scanner;

public class _058 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        init
        final int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = scanner.nextInt();

//        Insertion Sort
        for (int i = 1; i < n; i++) {
            int key = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > key) {
                a[j+1] = a[j];
                j--;
            }
            a[j + 1] = key;
        }

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(a));

        scanner.close();
    }
}
