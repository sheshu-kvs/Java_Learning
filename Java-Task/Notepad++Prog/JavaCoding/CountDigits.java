package JavaCoding;

import java.util.*;
public class CountDigits {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        // int num=scan.nextInt();
        int count=0;        
        // While
        // while(num>0){
        //     int rem=num%10;
        //     count++;
        //     num=num/10;
        // }
        // System.out.println(count);
int num=123;
        for(int i=0;i<num;i++){
            // int rem=num(i)%10;
            count++;
            num=num/10;
        }

    }
    
}
