import java.util.Arrays;
import java.util.Scanner;
import static java.lang.Math.*;

public class _054 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[scanner.nextInt()];
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }
        Arrays.sort(a);

        int maxCnt = 1;
        int currCnt = 1;
        int lastItem = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] == lastItem)
                currCnt++;
            else {
                lastItem = a[i];
                maxCnt = max(maxCnt, currCnt);
                currCnt = 1;
            }
        }

        System.out.println(maxCnt);

        scanner.close();
    }
}
