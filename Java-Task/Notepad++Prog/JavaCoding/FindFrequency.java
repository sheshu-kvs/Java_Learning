package JavaCoding;

public class FindFrequency {
    public static void main(String[] args) {
        int a[]={1,2,3,3,4,5,5,5};
        int count=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==2){
               count++;
            }
        }
        System.out.println("\n"+count);
    }
    
}
