package JavaCoding2;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        isArmstrong(num);
    }

    public static int CountNum(int num){
       
       int count=0;
        while (num>0) {
        int rem=num%10;
        count++;
        num=num/10;
       }
       System.out.println(count);
       return count;
       
    }

    public static void  isArmstrong(int num){
        int digits=CountNum(num);
        int realval=num;
        
        int sum=0;
        while(num>0){
            int lastDigit=num%10;
            sum+=Math.pow(lastDigit,digits);
            num=num/10;
        }
        System.out.println(sum);
           if(realval==sum){
            System.out.println("IsArm");
           }
           else{
            System.out.println("IsnotAram");
           }



    }
    
}
