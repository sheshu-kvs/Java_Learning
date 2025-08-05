import java.util.*;
public class prac29 {
    public static void main(String[] args){
        // int num=123;
        // int num=30000;
        // sumof(num);
        // seconds(num);
        // int num=80000;

        // num(num);
        // usdConver(num);
        // Taxcollector(num);
        int a[]={12,1,2,3,3,4,4,4,5,10};
        remove(a);

    }
    public static void sumof(int num){
        int val=0;
        while(num>0){
            int rem=num%10;
            val=val+rem;
            num=num/10;
         }
         System.out.println("\n"+val);
    }
    public static void seconds(int num){
        System.out.println("Seconds:"+num/60);
    }
    public static void num(int num) {
        if(num>0){
            System.out.println(num+"Positive..");

        }
        else{
        System.out.println(num+"Negative..");

        }
        
    }
    // public static void usdConver(int num){
    //     double usdActul=83.3;
    //     double total=usdActul*num;
    //     System.out.printf("%.1f"+ftotal);
    // }
    public static void Taxcollector(int num){
        int val=num;
        if(num>50000){
            num=num*10/100;
            System.out.println(num+val);
        }
        else{
            System.out.println(num);
        }
    }
    public static void remove(int a[]){
        Set<Integer> s1=new LinkedHashSet<>();

        for(int a1:a){
            s1.add(a1);
        }
        for(int val:s1){
            System.out.print(val);
        }
        
    }
}
