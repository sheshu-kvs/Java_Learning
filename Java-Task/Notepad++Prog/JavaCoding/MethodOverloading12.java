package JavaCoding;

//Method Overloading: is the Process of creating the multiple methods with the same name 
// number of the parameters to be the different..  
// here the compiler will decide the which method should execute..
class Addition{
    void add(int a,int b,int c){
        System.out.println("The Sum of the Three Values is the "+(a+b+c)); 

    }
    void add(int a,int b){
        System.out.println("The sum of the Two Values "+(a+b));
    }
    void add(int a,float b){
        System.out.println("The sum of the Two Values "+(a+b));
    }
}

public class MethodOverloading12 {
    public static void main(String[] args) {
        Addition a1=new Addition();
        a1.add(10, 12);
        a1.add(23, 10.0f);
        a1.add(20, 30); 
    }  
}
