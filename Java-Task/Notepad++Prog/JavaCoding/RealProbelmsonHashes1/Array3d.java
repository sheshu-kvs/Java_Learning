package RealProbelmsonHashes1;

import java.util.Scanner;

public class Array3d {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the rows");
        int row=scan.nextInt();
        System.out.println("Enter the Columns");
        int column=scan.nextInt();
        int a1[][]=new int[row][column];
        int n=a1.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<a1[i].length;j++){
                // System.out.print("row "+i+"Column "+j);
                System.out.println();
                a1[i][j]=scan.nextInt();
            }
            System.out.println(" ");
        }
        System.out.println("Printing the Each Values in the Array:");
         for(int i=0;i<n;i++){
            for(int j=0;j<a1[i].length;j++){
                System.out.print(" "+a1[i][j]);
                // a1[i][j]=scan.nextInt();
            }
            System.out.println(" ");
        }
    }
}
