import java.util.Scanner;

class A123{
     static void disp(){
        System.out.println("A is class");
    }
}

class B123 extends A123{
    void disp2(){
        System.out.println("B Class Display");
    }
    static void disp(){
        System.out.println("A Class in B method");
    }
}
    

public class Prac123{
   

   

    public static void main(String[] args) {
        Prac123 p1=new Prac123();
         B123 b1=new B123();
         b1.disp();
         b1.disp2();


    }
    
}
