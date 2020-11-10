import java.util.Scanner;

public class _002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter x:");
        int x = scanner.nextInt();
        System.out.println("please enter y:");
        int y = scanner.nextInt();


        int t = x;
        x = y;
        y = t;
        System.out.println("new x is : " + x);
        System.out.println("new y is : " + y);
        scanner.close();
    }
}
