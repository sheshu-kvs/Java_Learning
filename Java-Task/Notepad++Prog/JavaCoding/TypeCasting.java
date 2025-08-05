package JavaCoding;
class car{
    int a;
    float b;

}
public class TypeCasting {
    // int a=23;
    // float b=9034.3948f;
    // long l=87542145654146453l;
    double a=1232435.34565645;
    float b=(float)a;
    long c=(long)b;
    int d=(int)c;

    public static void main(String[] args) {
        // byte a=-129;
        // short b=32767;
        // short c=-32768;
        // // byte can be ranged from the -128 to 127
        // // short ranges from the -32768 to the 32767
        // System.out.println(a++);
           TypeCasting t1=new TypeCasting();
        //    System.out.println("\n"+t1.a);        
        //    System.out.println("\n"+t1.b);   
        // car c=new car();
        // c.a=124;
        // c.b=124.34f;
        // System.out.println("\n"+c.a);
        // System.out.println("\n"+c.b);
        // car c2=new car();
        //  c2=c;
        //  c2.a=908234098;
        //  c2.b=348.24f;
        //  System.out.println(c2.a);
        //  System.out.println(c2.b);

        //  pass by value : passing one variable to the another variable..
        // pass by reference: when two reference variables reffering the same object. in the above i have wrriten the code..
        System.out.println("\nDouble:"+t1.a);
        System.out.println("Float:"+t1.b);
        System.out.println("Long:"+t1.c);
        System.out.println("Int:"+t1.c);
    
    }
}
