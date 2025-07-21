import java.util.*;

/* private  static void Even1(int num){
          if(num%2==0){
            System.out.println("entered number is the even"+num);
        }
        else{
            System.out.println("Entered number is the odd"+num);
        }
   

  public static void fact1(int num){
        int fact=1;
      for(int i=1;i<=num;i++){
       fact=fact*i;
      }
      System.out.println("The Factorial of the Number is the:"+fact);
    }

    } */
public class dem3 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Number..");
        int num=scan.nextInt();
        rever(num);

      

    }
    public static void rever(int num){
      int rev=0;
      while(num>0){
        int rem=num%10;
        rev=rev*10+rem;
        num=num/10;
        }
     System.out.println(rev);
        
    }

  
}
