package JavaCoding.RealProbelmsonHashes1;

public interface Code3 {
    public static void main(String[] args) {
        int a[]={7,1,5,3,6,4};
        int minPricxe=a[0];
      
        int maxprofit=0;
        for(int i=0;i<a.length;i++){
            
            if(a[i]<minPricxe){
                minPricxe=a[i];
               
            }
           int  profit=a[i]-minPricxe;
            if(profit>maxprofit){
            maxprofit=profit;
        }
        }
       
        System.out.println(" ");
        System.out.println(maxprofit);
    }
    
}
