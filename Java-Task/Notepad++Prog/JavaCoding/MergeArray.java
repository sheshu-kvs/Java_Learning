
import java.util.Arrays;
public class MergeArray {
    public static void main(String[] args) {
        int a1[]={1,2,3,1};
        int a2[]={4,5,6,7};
        int merged[]=new int[a1.length+a2.length];
        System.out.println(" "+merged.length);
        // System.arraycopy(a1, 0, merged, 0, a1.length);
        // System.arraycopy(a2,0,merged,a1.length,a2.length);
        // System.out.println("Merged Arrays:"+Arrays.toString(merged));


        System.arraycopy(a1,0,merged,0,a1.length);
        System.arraycopy(a2,0,merged,a1.length,a2.length);
        System.out.println("Merged Arrays"+Arrays.toString(merged));
  
    }
    
}
