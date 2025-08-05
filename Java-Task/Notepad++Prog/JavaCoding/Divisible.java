package JavaCoding;
import java.util.Scanner;

public class Divisible {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Number...");
        int num1=scan.nextInt();
        System.out.println("Enter the Second NUmber...");
        int num2=scan.nextInt();
        for(int i=1;i<=10;i++){
        if(num1%i==0||num2%i==0){
            System.out.println(i);
        }
        }
    }
    
}
