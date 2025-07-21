
import java.util.Scanner;

public class DayThree03 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the First Number");
        int num1 = scan.nextInt();
        System.out.println("Enter the Second Number");
        int num2 = scan.nextInt();
        swap1(num1, num2);
    }

    public static void swap1(int num1, int num2) {
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("Value1:" + num1);
        System.out.println("Value2:" + num2);

    }

}
