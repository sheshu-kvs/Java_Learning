import java.util.*;
public class PhoneValidation {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the hine Numebr");
        String phno=scan.next();
        if(phno.length()==10 && (phno=="6"||phno=="7"||phno=="8"||phno=="9")){
            System.out.println(phno);
        }
        else{
            System.out.println("Please Enter the Validate Numbers");
        }
    }
    
}
