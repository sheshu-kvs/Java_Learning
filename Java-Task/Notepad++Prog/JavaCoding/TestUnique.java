package JavaCoding;
import java.util.*;

public class TestUnique {
    public static void main(String[] args) {
        int a[]={1,2,3,1,2,
            3,4,5};
        HashSet<Integer> h1=new HashSet<>();
        HashSet<Integer> h2=new HashSet<>();
        ArrayList<Integer> h3=new ArrayList<>();
repeating(a);
        for(int a23:a){
            if(h1.contains(a23)){
                h2.add(a23);
            }
            else{
                h1.add(a23);
            }
        }
        // for(int h23:h1){
        //     System.out.println(h23);
        // }
        for(int a23:a){
            if(!h2.contains(a23)){
                h3.add(a23);
            }
        }
        int unique[]=new int[h3.size()];
        for(int i=0;i<h3.size();i++){
            unique[i]=h3.get(i);
        }

        System.out.println("Array with the unique"+Arrays.toString(unique));
    }

    public static void repeating(int a[]){
        HashSet<Integer> h1=new HashSet<>();
        HashSet<Integer> h2=new HashSet<>();
        ArrayList<Integer> h3=new ArrayList<>();
        for(int a23:a){
            if(h1.contains(a23) &&(!h2.contains(a23))){
                h1.add(a23);

            }
        }

    }
    
}
