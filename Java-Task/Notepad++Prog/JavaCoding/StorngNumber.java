package JavaCoding;
import java.util.*;

public class StorngNumber {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Number");
        int num=scan.nextInt();
        // int sum=0;
        // int fact=1;
        // int rev=1;
        // for(int i=num;i>0;i--){
        // //    fact=fact*i;
        // int rem=num%10;
        // rev=rev*10+rem;
        // num=num/10;
        // }
        int rev=0;
        int fact=1;
        while(num>0){
            int rem =num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        System.out.println(rev);
        // while(num>0){
        //     fact=fact*num;
        //     num--;
        // }
    
        // do{
        //     fact=fact*num;
        //     sum=sum+fact;
        //     num--;
        // }while(num>0);
        // System.out.println("Factorial of the given Number is:"+fact);
        // System.out.println("The Sum of the Factorial is the:"+sum);
    }
    
}
