package JavaCoding;


import java.util.Scanner;
public class MultiDimensional {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a[][][]=new int[2][3][5];

       
        // for(int i=0;i<2;i++){
        //     for(int j=0;j<3;j++){
        //         for(int k=0;k<5;k++){
        //             System.out.println("Enter the school  "+(i+1)+" Details and the Class room "+(j+1)+ " Details of the Students Age  "+(k+1));
        //             a[i][j][k]=scan.nextInt();
        //         }
        //         System.out.println();
        //     }
        //     System.out.println();
        // }

        // System.out.println("Students data in the Schools, classes, and the ClassRooms:");
        // for(int i=0;i<2;i++){
        //     for(int j=0;j<3;j++){
        //         for(int k=0;k<5;k++){
        //             System.out.print(a[i][j][k]+" ");
        //         }
        //         System.out.println();
        //     }
        //     System.out.println();
        // }

         int a3[][][]={
            {
                {10,20,30,40},
                {50,60,70,80},
                {90,100,150,200}},{
                    {40,50,60,70},
                    {80,40,50,72},
                    {42,54,64,78}
                }
        };

        for(int i=0;i<a3.length;i++){
           
            for(int j=0;j<a3[i].length;j++){
                for(int k=0;k<a3[i][j].length;k++){
                    System.out.print(" "+a3[i][j][k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
        
    }
    
}
