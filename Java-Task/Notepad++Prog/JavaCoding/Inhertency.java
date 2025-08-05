package JavaCoding;


// the static methods can be the called the directly using the class name..
// inside the static methods we cannot access  instance varibles if we want 
// to access means we can keep that variable  has the static..


class A{
       static int a=120;
       static  int b=10;
       static  int c=a+b;
    

    static void add(){
        System.out.println("The Addition of the Two Numbers "+c);
    }

    
}
class B extends A{
    static void add(){
        System.out.println("The Sum of the two values is the ");
    }

}


public class Inhertency {
    public static void main(String[] args) {
    B b1=new B();
    System.out.println(" Hello ");  
    b1.add(); 
    A a1=new B();
    A.add();

    // the Static methods cannot be overriden it can be inherited in the Inhertency..
    }
    
}
