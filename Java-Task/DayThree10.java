
import java.util.Scanner;

public class DayThree10 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = scan.nextInt();
        }

        actual(n, a);
    }

    public static void actual(int n, int a[]) {
        int excepted = n * (n + 1) / 2;
        int actual = 0;
        for (int i1 : a) {
            actual += i1;
        }
        System.out.print(excepted - actual);
    }
}
