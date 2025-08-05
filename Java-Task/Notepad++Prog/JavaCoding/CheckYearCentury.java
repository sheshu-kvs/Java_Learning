package JavaCoding;

public class CheckYearCentury {
    public static void main(String[] args) {
        int year=3010;
        if(year%100==0){
            System.out.println("Century is"+year);
        }
        else{
            System.out.println("It is not century");
        }
    }
}
