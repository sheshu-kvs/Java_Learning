package JavaCoding;

import java.util.Arrays;

public class SplitArray2 {
    public static void main(String[] args) {
        int a1[]={1,2,3,4,5,6};
        int left[]=new int[a1.length/2];
      
        rightArrays(a1);
        for(int i=0;i<a1.length/2;i++){
            // a1[i];
        }
        for(int i=0;i<left.length;i++){
            left[i]=a1[i];
        }
        System.out.println("Left Arrays"+Arrays.toString(left));

    //    for(int i=a1.length/2;i<a1.length;i++){
    //         rigth[i]=a1[i];
    //     }
    //     System.out.println("Right Arrays"+Arrays.toString(rigth));
    }
    public static void rightArrays(int Right[]){
          int rigthdup[]=new int[Right.length/2];

        // for(int i=Right.length/2;i<Right.length;i++){
        //     System.out.println(" "+Right[i]);
        // }

        for(int i=0;i<rigthdup.length;i++){
            rigthdup[i]=Right[i+(Right.length/2)];
        }
        System.out.println(" Rigth Arrays: "+Arrays.toString(rigthdup));
    }
    
}
