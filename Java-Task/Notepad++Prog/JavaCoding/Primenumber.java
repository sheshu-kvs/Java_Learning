package JavaCoding;
import java.util.Scanner;
public class Primenumber {
    public static void main(String[] args) {
        // Scanner scan=new Scanner(System.in);
        // int num=scan.nextInt();
        System.out.println("\nPrime Numbers:");
        int sum=0;
        for(int i=0;i<100;i++){
            if(prime123(i)){
                // System.out.println(i);
                sum=sum+i;
            }
        }
        System.out.println("sum of the Prime Numbers:"+sum);
    }

    /*Prime Method 1 */
    // public static void prime123(int n){
    //     int count=0;
    //     for(int i=1;i<=n;i++){
    //         if(n%i==0){
    //             count++;
    //         }
    //     }
    // if(count==2){
    //     System.out.println("Entered Number is the Prime Number..");
    // }
    // else{
    //     System.out.println("Entered Number is not the Prime Number");
    // }
    // }
    public static boolean prime123(int n){
        if(n<=1){
            return false;
        }
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
