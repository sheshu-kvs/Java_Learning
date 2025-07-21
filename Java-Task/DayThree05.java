
import java.util.Scanner;

public class DayThree05 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        facor(num);

    }

    public static void facor(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                // System.out.println("The factorial of the Number:" + i);
                count++;
            }
        }
        if (count == 2) {
            System.out.println("Entered Number is the Prime.");
        } else {
            System.out.println("Entered Number is Not a prime Number.");
        }
    }

}
