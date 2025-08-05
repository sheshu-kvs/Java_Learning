package JavaCoding;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        if(ArmstrongNumber(num)){
            System.out.println("Entered Number is the Armstrong Number..");

        }
        else{
            System.out.println("Entered Number is not the armstrong Number..");
        }
       
    }
    public static int  countNum(int num){
         int count=0; 
        while(num!=0){
            int rem=num%10;
            count++;
            num=num/10;
        }
        return count;

       }
       public static boolean  ArmstrongNumber(int num){
        int digits=countNum(num);
        int original=num;
        int sum=0;
        while(num>0){
            int lastDigit=num%10;
            sum+=Math.pow(lastDigit,digits);
            num=num/10;

        }
        return sum==original;
       }
    
}
