package JavaCoding;

/*Method Overloading
*an Method Overloading is the process of the creating the multiple methods with the 
same name the Number of the parameters to be the Different,or type of the parameters to be the different..
this is also known as the early binding and the static binding..becase complier will decide which 
method should execute before the compiling..
 */  
class Airthmatics{
    void add(int a,int b){
        System.out.println("\nAdddition of the Two Numbers: "+(a+b));
    }
    void add(int a,int b,int c){
        System.out.println("Addi tion of the three Numbers "+(a+b+c));
    }
    void add(float a,int b){
System.out.println("Adddition of the Two Numbers: "+(a+b));

    }
    void add(int a,float b){
System.out.println("Adddition of the Two Numbers: "+(a+b));
    }
}
public class MethodOver {
    public static void main(String[] args) {
        Airthmatics a1=new Airthmatics();
        a1.add(10,30);
        a1.add(20, 23, 10);
        a1.add(10.0f, 20);
        a1.add(40, 50.0f);
    }
}
