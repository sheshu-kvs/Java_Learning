package JavaCoding2;

import java.util.Scanner;

public class CheckNum {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        if(num==0){
            System.out.println("Number is Zero");
        }
        else if(num>0){
            System.out.println("Num is Positive");
        }
        else if(num<0){
            System.out.println("Negative Num");
        }
    }
    
}
