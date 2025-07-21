import java.util.Scanner;
public class DayFive05 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        int a[]=new int[num];

        for(int i=0;i<a.length;i++){
            a[i]=scan.nextInt();
        }
        SecondLarge(a);

        

    }
    public static void SecondLarge(int a[]){
        int p=0,vp=0;
        for(int i=0;i<a.length;i++){
            if(a[i]>p){
                vp=p;
                p=a[i];
            }
            else if(a[i]>vp){
                vp=a[i];
            }

        }
        System.out.println(vp);
    }
    
}
