package JavaCoding;
// in the Inhertency constructors are not participated...
// Static members are also not participatte

/*Methods in the Inhertency
 * Inherited Method.
 *Overrided Method.
 *Specialized Method.
 *==Inhertited==
 *An inherited method is the where child class methods are inherited method from the  parent method..
 *An Overridden method is the where child class inherit from the parent method changing the method 
 *body is known as the overrided method..
 *Specialized method is the where child class is only having that methods  parent class is not having.. 
 */
class A1{
    int a;
    public A1(int a){
        this.a=a;
    }
     void dis(){
           System.out.println("Single Level Inhertency");
    }


}
class B1 extends A1{
   super(A1);
    
}
public class CodeInhertency {
    public static void main(String[] args) {
        A1 a1=new A1();
        B1 b1=new B1();
        b1.dis();
    }
}
