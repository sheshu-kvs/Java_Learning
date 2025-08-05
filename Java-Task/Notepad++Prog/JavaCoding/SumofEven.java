package JavaCoding;

public class SumofEven {
    public static void main(String[] args) {
        int a[]={2,4,5};
        int sum=0;
        int pr=1;
        // for(int i=0;i<a.length;i++){
        //     if(a[i]%2==0){
        //         // System.out.println("Even Elements:"+a[i]);
        //         sum=sum+a[i];
        //     }
        // }
        // System.out.println("Sum of the Even Elements:"+sum);

        // ===Sum of the Odd Elements===

        // for(int i=0;i<a.length;i++){
        //     if(a[i]%2!=0){
        //         // System.out.println(a[i]);
        //         sum=sum+a[i];
        //     }
        // }
        // System.out.println("Sum of the Odd elements:"+sum);
       for(int i=0;i<a.length;i++){
        pr=pr*a[i];

       }
       System.out.println("Product of the Array Elements:"+pr);
    }
    
}
