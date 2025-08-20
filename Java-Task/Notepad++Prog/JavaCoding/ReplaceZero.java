public class ReplaceZero {
    public static void main(String[] args) {
        int a1[]={4,-1,5,-1,8};
        for(int i=0;i<a1.length;i++){
            if(a1[i]==-1){
                a1[i]=0;
            }
            else{
                System.out.println(a1[i]);
            }
        }


        // System.out.println("Printing the values");
        // for(int i=0;i<a1.length;i++){
        //     System.out.println(a1[i]);
        // }
    }
    
}
