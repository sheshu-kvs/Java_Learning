package JavaCoding;

public class CopytheArrayEle {
    public static void main(String[] args) {
        int a[]={10,20,30,40};
        int b[]=new int[4];
        for(int i=0;i<a.length;i++){
            b[i]=a[i];
        }
        System.out.println("The Copied Array:");
        for(int i=0;i<b.length;i++){
            System.out.println(b[i]);
        }
    }
    
}
