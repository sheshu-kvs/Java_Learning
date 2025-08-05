package JavaCoding;
import java.util.Arrays;
public class UniqueArray {
    public static void main(String[] args) {
        int a[]={1,2,3,1,2,3,4,1,1,2,5};
    //  System.out.println(unique(a));
    //   duplicates(a);
    //     notduplicates(a);
    System.out.print("The Array Elements:");
    
    for(int i=0;i<a.length-1;i++){
        System.out.print(a[i]+" ");
    }

    for(int i=0;i<a.length-1;i++){
        System.out.println("\nDuplicates:");
        myunderstanding(a);
        break;
    }
//   System.out.print(a);
  for(int i=0;i<a.length-1;i++){
    System.out.println("NotDuplicates:");
       myunderstandingpur(a);
         break;
    }

      

      








    }
    
public static void myunderstanding(int a[]){
    Arrays.sort(a);
    int count=1;
    for(int i=0;i<a.length-1;i++){
        if(a[i]==a[i+1]){
            // System.out.println(a[i]+" ");
            count++;
        }
        else{
            System.out.println(a[i]+" ");
            count=1;
        }
      
    }
    // System.out.println(a[a.length-1]);
}
public static void myunderstandingpur(int a[]){
    Arrays.sort(a);
    int count=1;
    for(int i=0;i<a.length-1;i++){
        if(a[i]==a[i+1]){
            // System.out.println("Unique"+a[i]+" ");
            count++;
        }
        else{
            if(count==1){
                System.out.println(a[i]);
            }
            count=1;
        }
    }
    if(count==1){
        System.out.println(a[a.length-1]);

    }
    
}
}
