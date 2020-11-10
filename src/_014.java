import java.util.Scanner;

public class _014 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int cnt = 1;
        int sum =  n % 10;
        while ((n /= 10) > 0) {
            sum += n % 10;
            cnt++;
        }
        System.out.println("Count is : " + cnt );
        System.out.println("Sum is : " + sum );
        scanner.close();
    }
}
