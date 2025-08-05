import java.util.*;
public class WhilExample {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Number...");
        int num=scan.nextInt();
        // while(num<11){
        //     System.out.println(num);
        //     num++;
        // }
        // do{
        //     System.out.println(num);
        //     num++;

        // }while(num<11);
        boolean found=true;
        while(num!=10){
            if(num!=10){
                System.out.println("Enter the valid phone num");
                continue;
            }
            else{
                System.out.println("valid");
            }
            
        }
    }
    
}
