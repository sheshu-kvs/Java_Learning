 package JavaCoding.RealProbelmsonHashes1;

import java.util.Arrays;

class RotateArray90 {

//  [[1,2,3],
//  [4,5,6],
//  [7,8,9]]

// [[7,4,1],
//  [8,5,2],
//  [9,6,3]]


    public static void main(String[] args) {
        int a1[][]={
            {1,2,3,2},
            {4,5,6,2},
            {7,8,9,3},
            {7,8,9,3}
        };
         int n=a1.length;
         reverse90(a1);
             // Print rotated array by the 90 deg
        //   for (int[] row : a1) {
        //     for (int num : row) {
        //         System.out.print(num + " ");
        //     }
        //     System.out.println();
        // }
        for(int i=0;i<n;i++){
            for(int j=0;j<a1[i].length;j++){
                System.out.print(a1[i][j]+" ");
            }
            System.out.println(" ");
        }
    }

public static void reverse90(int a1[][]){
        int n=a1.length;

        for(int i=0;i<n;i++){
            for(int j=i;j<a1[i].length;j++){
                int temp=a1[i][j];
                a1[i][j]=a1[j][i];
                a1[j][i]=temp;
            }
            System.out.println(" ");
        }
    
        // reverese the each row with the 1st value and the lasat value..

        for(int i=0;i<n;i++){
            for(int j=0;j<n/2;j++){
                int temp=a1[i][j];
                a1[i][j]=a1[i][n-1-j];
                a1[i][n-1-j]=temp;
            }
        }
    }
       
}