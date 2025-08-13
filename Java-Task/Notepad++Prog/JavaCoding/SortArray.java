package JavaCoding;
import java.util.*;

public class SortArray {
    public static void main(String[] args) {
        int a[]={10,2,11,1,5,3};
        // Arrays.sort(a);
        // for(int a112:a){
        //     System.out.println(a112);
        // }
             sort123(a);
              System.out.println("Ascending");
             for(int i=0;i<a.length;i++){
                System.out.println(a[i]);
             }
          System.out.println("Descending");
           for(int i=a.length-1;i>=0;i--){
                System.out.println(a[i]);
             }
       
        

        // for(int i=0;i<a.length;i++){
        //     System.out.println(a[i]);
        // }

    }
    public static void sort123(int a[]){
        int n =a.length;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<n-i-1;j++){
                if(a[j]>a[j+1]){
                int temp=a[j];
                a[j]=a[j+1];
                a[j+1]=temp;
                }
            }
        }

    }
    
}
