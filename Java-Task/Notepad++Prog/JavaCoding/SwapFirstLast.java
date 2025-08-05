package JavaCoding;

public class SwapFirstLast {
    public static void main(String[] args) {
       
        int a[]={10,20,40,60};
         int last=a[a.length-1];
            int temp=a[0];
            a[0]=a[a.length-1];
            a[a.length-1]=temp;
          


        
        System.out.println("After swapping the Array Elements like first index and the LastIndex");
        // for(int i=0;i<a.length;i++){
        //     System.out.println(a[i]);
        // }
        for(int a2:a){
            System.out.println(a2);
        }
    }
    
}
