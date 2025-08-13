package JavaCoding;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.*;

public class MergeArrays {
    public static void main(String[] args) {
        int a1[]={1,2,3,4,5};
        int a2[]={5,5,6,11,56};
        int special[]={8,9,12,6,8};
        int duArray[]={2,1,3,1,1,3,5,1};
        int empty[]=new int[special.length];
        int merge123[]=new int[a1.length+a2.length];
        System.out.println(merge123.length);

        System.arraycopy(a1,0,merge123,0,a1.length);
        System.arraycopy(a2,0,merge123,a1.length,a2.length);
        System.out.println("Array 1 "+Arrays.toString(a1));
        System.out.println("Array 2"+Arrays.toString(a2));
        System.out.println("Merged Arrays"+Arrays.toString(merge123));



        for(int i=0;i<special.length;i++){
            empty[i]=special[i];
        }
        System.out.println(Arrays.toString(empty));


        HashSet<Integer> h1=new LinkedHashSet<>();
        for(int s1:duArray){
            h1.add(s1);
        }

        for(int h:h1){
            System.out.println(h);
        }
    }
}