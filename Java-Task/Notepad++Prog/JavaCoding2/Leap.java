package JavaCoding2;

import java.util.Scanner;

public class Leap {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        if((num%4==0 && num%400==0)||num%100!=0){
            System.out.println("Leap");
        }
        else{
            System.out.println("Not Leap");
        }
    }
    
}
