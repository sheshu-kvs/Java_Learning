/*Inhertency is the accquring the properties and the behavoiurs from the one class to the another class
 * 
 */
class A {

    public void show() {
        System.out.println("The Class A is showing");
    }

    void disp() {
        System.out.println("The Class A is Displaying..");
    }
}

class B extends A {

    public void show() {
        System.out.println("the class b is displaying");
    }

}

public class DayThreeInhertency08 {

    public static void main(String[] args) {
        B b = new B();
        b.show();
        b.disp();

    }
}
