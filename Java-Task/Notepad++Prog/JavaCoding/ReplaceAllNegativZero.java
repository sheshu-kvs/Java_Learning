package JavaCoding;

public class ReplaceAllNegativZero {
    public static void main(String[] args) {
        int a[]={10,-1,30,-1,-1};
        for(int i=0;i<a.length;i++){
            if(a[i]==-1){
                a[i]=0;
            }
        }
        System.out.println("the Array Elements are the");
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
    
}
