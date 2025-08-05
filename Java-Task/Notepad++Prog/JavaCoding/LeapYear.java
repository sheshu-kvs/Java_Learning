package JavaCoding;
import java.util.Scanner;

public class LeapYear {
    /**
     * 
     */

    public static void main(String[] args){
       Scanner scan= new Scanner(System.in);
       System.out.println("Enter the Number");
       int n=scan.nextInt();
       if((n%4==0)&&(n%400==0)||(n%100!=0)){
        System.out.println("Entereed year was the leap Year..");
       }
       else{
                System.out.println("Entereed year was not  the leap Year..");
       }


//  ||(n%100!=0)||(n%400==0)
       
       
       
       
       
       




       
       
       

        
    }
    
}
