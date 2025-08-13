package JavaCoding;

/*there are two important concepts in the java local chaining and the constructor chaining
 *======Local chaining ==
 * it is the calling the constructor with in the same class using this(method) it can declare the first line
 *  of the constrctor.. developer only should provide..
 * ======Constructor Chaining====
 * it is used to the calling the constructor one class to the another class By default JVM only provide..
 * using the super(method)
 *
 * 
 * 
 * 
 * 
 * 
 * 
  */

class Test1 {
    int a;
    int b;

    public Test1() {
        this(500,600);
        a = 100;
        b = 200;
    }

    public Test1(int a, int b) {
        this.a = a;
        this.b = b;
    }
}

class Test2 extends Test1 {
    int x;
    int y;

    public Test2() {
        super();
        x = 100;
        y = 200;

    }

    public Test2(int x, int y) {
        // super(300,400);
        this();
        this.x = x;
        this.y = y;

    }

    void disp() {
        System.out.println(" ");
        System.out.println("=====The values in the both the class constructor=====");
        System.out.println(a);
        System.out.println(b);
        System.out.println(x);
        System.out.println(y);
    }
}

public class ConsChain {
    public static void main(String[] args) {
        Test2 t1 = new Test2(300,400);
        t1.disp();


    }
}
