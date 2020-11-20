import java.util.Arrays;
import java.util.Scanner;

public class _057 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt(), k = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = scanner.nextInt();

        Arrays.sort(a);
        
        int l = 0, r = n - 1;
        boolean found = false;
        while (r >= l && !found) {
            int i = (r + l) / 2;
            if (a[i] == k)
                found = true;
            else if (a[i] < k)
                l = i + 1;
            else
                r = i - 1;
        }
        System.out.println(found);
        scanner.close();
    }
}
