package JavaCoding;
import java.util.Scanner;
// Swap two numbers without using a third variable
public class SwapNumber {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Number");
        int a=scan.nextInt();
        System.out.println("Enter the Number");
        int b=scan.nextInt();
        // int temp=a;
        // a=b;
        // b=temp;

        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("Value of A"+a);
        System.out.println("Value of B"+b);


    }
    
}
