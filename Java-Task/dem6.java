
import java.util.Scanner;

public class dem6 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        for (int i = 0; i <= num; i++) {
            if ((i == 6 || i == 7 || i == 8)) {
                continue;
            } else {
                System.out.print(i + " ");
            }
        }
    }

}
