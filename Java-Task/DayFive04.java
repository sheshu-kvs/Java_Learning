import java.util.Scanner;
public class DayFive04 {
 public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    int num=scan.nextInt();
    int a[]=new int[num];
    for(int i=0;i<a.length;i++){
        a[i]=scan.nextInt();
    }
    large(a);

 }
 public static void large(int a[]){
    int max=Integer.MAX_VALUE;
    for(int i=0;i<a.length;i++){
        l
        if(a[i]<max){
            max=a[i];
        }
    }
    System.out.println(max);

 }

    
}
