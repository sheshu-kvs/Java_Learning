import java.util.Scanner;
public class DaySix01{
public static void main(String[] args){
int a[]={1,2,3,4,5};

rever(a);
}
public static void rever(int a[]){
for(int i=a.length-1;i>=0;i--){
System.out.println(a[i]);
}
}
}