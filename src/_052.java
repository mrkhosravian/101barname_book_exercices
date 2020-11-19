import java.util.Scanner;

public class _052 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[scanner.nextInt()];
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }

        int min = a[0];
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max)
                max = a[i];

            if (a[i] < min)
                min = a[i];
        }

        System.out.println("Min : " + min + " Max : " + max);

        scanner.close();
    }
}
