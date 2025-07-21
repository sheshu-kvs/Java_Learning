
import java.util.Scanner;

public class DayThree02 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number");
        int num = scan.nextInt();
        check(num);

    }

    public static void check(int num) {
        if (num % 2 == 0) {
            System.out.println("you Entered Even Number is:" + num);
        } else {
            System.out.println("you Entered Odd Number is:" + num);
        }
    }
}
