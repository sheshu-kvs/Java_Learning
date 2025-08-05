package JavaCoding;

public class FiboWithoutRecursion {
    public static void main(String[] args) {
int num[]={-1,-2,-23};
large(num);
}
public static void large(int a[]){
int max=Integer.MIN_VALUE;
for(int i=0;i<a.length;i++){
if(a[i]>max){
max=a[i];
}
}
System.out.println(max);

}
}

        // System.out.println("");
    
