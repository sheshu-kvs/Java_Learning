package JavaCoding;

import java.util.Scanner;

public class AvgArray {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        int a[]=new int[num];
        for(int i=0;i<a.length;i++){
            a[i]=scan.nextInt();
        }
        avg(a);
    }
    public static void avg(int a[]){
        int n=a.length;
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum=sum+a[i];
        }

        System.out.println("Sum:"+sum);
        System.out.println("Average of the Elements:"+(sum/n));
    }
    
}
