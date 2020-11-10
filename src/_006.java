import java.util.Scanner;

public class _006 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int grade = scanner.nextInt();
        char score;
        if (grade > 20) {
            score = 'w';
        } else if (grade >= 17) {
            score = 'A';
        } else if (grade >= 14) {
            score = 'B';
        } else if (grade >= 11) {
            score = 'C';
        } else if (grade >= 10) {
            score = 'D';
        } else if (grade >= 0) {
            score = 'F';
        } else {
            score = 'w';
        }

        switch (score) {
            case 'A':
                System.out.println("Excelent");
                break;
            case 'B':
            case 'C':
                System.out.println("Well done");
                break;
            case 'D':
                System.out.println("You passed");

                break;
            case 'F':
                System.out.println("Try better again");
                break;
            default:
                System.out.println("WRONG INPUT!!!");
                break;
        }
        scanner.close();
    }
}
