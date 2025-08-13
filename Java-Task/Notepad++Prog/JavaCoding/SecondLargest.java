package JavaCoding;


public class SecondLargest {
    public static void main(String[] args) {
        int a[]={10,2,11,1,5,3};
        secondLarge(a);
        secondMin(a);

    }
    public static void secondLarge(int a[]){
          int pre=Integer.MIN_VALUE,vice=Integer.MIN_VALUE;        
        for(int i=0;i<a.length;i++){
            if(a[i]>pre){
                vice=pre;
                pre=a[i];
            }
            else if(a[i]>vice){
                vice=a[i];
            }

        }
        System.out.println("Second Largest:"+vice);
    }

      public static void secondMin(int a[]){
          int pre=Integer.MAX_VALUE,vice=Integer.MAX_VALUE;        
        for(int i=0;i<a.length;i++){
            if(a[i]<pre){
                vice=pre;
                pre=a[i];
            }
            else if(a[i]<vice){
                vice=a[i];
            }

        }
        System.out.println("Second Smallest:"+vice);
    }
    
}
