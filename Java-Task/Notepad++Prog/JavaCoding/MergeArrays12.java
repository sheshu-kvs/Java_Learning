import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MergeArrays12 {
    public static void main(String[] args) {
        int a1[]={3,5,6,7};
        int a2[]={4,5,6,7};
        int n1=a1.length;
        int n2=a2.length;
        int res[]=new int[n1+n2];
        int i=0,j=0,k=0;
        while(i<n1 && j<n2){
            if(a1[i]<=a2[j]){
                res[k++]=a1[i++];
            }
            else{
                res[k++]=a2[j++];
            }
        }

        while(i<n1){
            res[k++]=a1[i++];
        }
        while(j<n2){
            res[k++]=a2[j++];
        }
        System.out.println("Meged Array:"+Arrays.toString(res));
        // int m=0;
    //     int count=1;
    //    for(int m=0;m<res.length-1;m++){
    //    if(res[m]==res[m+1]){
    //     count++;
    //    }  
    //    else{
    //     if(count>1){
    //         System.out.println(res[m]);            
    //     }
    //     count=1;
    //    } 
       
    
    // }
    
    // if(count>1){
    //     System.out.println(res[res.length-1]);
    //    }
      


        
    }
}
