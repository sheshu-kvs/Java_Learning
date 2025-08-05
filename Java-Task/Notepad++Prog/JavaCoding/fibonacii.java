package JavaCoding;

public class fibonacii {
    public static void main(String[] args) {
        int num=7;
        fibo(num);
        for(int i=0;i<num;i++){
            System.out.println(fibo(i));
        }
    }
    public static int fibo(int num){
        if(num==0){
            return 0;
        }
        else if(num==1){ 
            return 1;
        }
        return fibo(num-1)+fibo(num-2);
    }
    
}
