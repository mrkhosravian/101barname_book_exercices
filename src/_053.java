import java.util.Scanner;

public class _053 {
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

        System.out.println("Mid is : " + a[a.length / 2]);

        scanner.close();
    }
}
