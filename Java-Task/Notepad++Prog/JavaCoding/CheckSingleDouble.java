package JavaCoding;

import java.util.Scanner;

public class CheckSingleDouble {
     public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        if(n>=0 && n<10){
            System.out.println("Single Digit..");
        }
        else if(n>=11 && n<=99){
            System.out.println("Double Digits..");
        }
        else if(n>=100 && n<=999){
            System.out.println("Thrible Digits..");
        }
      


    }
    
}
