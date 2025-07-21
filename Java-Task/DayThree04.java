
import java.util.Scanner;

public class DayThree04 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the First Number");
        int a = scan.nextInt();
        System.out.println("Enter the Second Number");
        int b = scan.nextInt();
        System.out.println("Enter the Third Number");
        int c = scan.nextInt();
        large(a, b, c);

    }

    public static void large(int a, int b, int c) {
        if (a > b && a > c) {
            System.out.println("Num1 is the Largest..");
        } else if (b > a && b > c) {
            System.out.println("Num2 is the Largest..");
        } else {
            System.out.println("Num3 is the Largest..");
        }
    }
}
