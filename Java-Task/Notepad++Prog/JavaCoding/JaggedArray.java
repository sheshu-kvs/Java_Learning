import java.util.Scanner;

public class JaggedArray {
    // 2 Classrooms 3 Student for first class 5 students for the second class 
    public static void main(String[] args) {
        // =[2][3]
    // int a[][]={
    //     {21,91,31},
    //     {22,34,13,34,14}
    // };


    //  for(int i=0;i<2;i++){
    //     for(int j=0;j<a[i].length;j++){
    //         System.out.println(a[i]);
    //     }
    // }


    Scanner scan=new Scanner(System.in);
    int a[][]=new int[3][3];

    int n=a.length;

    a[0][0]=10;
    a[0][1]=20;
    a[0][2]=30;
    a[1][0]=40;
    a[1][1]=50;
    a[1][2]=60;
    a[2][0]=70;
    a[2][1]=80;
    a[2][2]=90;


    System.out.print(" "+a[0][0]);
    System.out.print(" "+a[0][1]);
    System.out.print(" "+a[0][2]);
    System.out.println(" ");
    System.out.print(" "+a[1][0]);
    System.out.print(" "+a[1][1]);
    System.out.print(" "+a[1][2]);
     System.out.println(" ");
    System.out.print(" "+a[2][0]);
    System.out.print(" "+a[2][1]);
    System.out.print(" "+a[2][2]);



    // for(int i=0;i<n;i++){
    //     for(int j=0;j<n;j++){
    //         System.out.print(a);
    //     }
    // }
  


    }
}
