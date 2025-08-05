/*===============Java================= 
It is owned by the Oracle it was introduced by the sunMicrosystems now presently owned by the oracle
in the 1995
founder of the Java is the James Gosling..
->Java is the most popular language.
->Java is the simple and the OOp 
->Java is used for the webapplication,desktop application, android application, also used in the Game developement..
->it execute the programmes like this like where compilation done in the one operating sysatem exceution done in the another OS..
->Portablility:like compliation done in the one phase execution done in the another phase..
->Architecture Neutrablility: like it has the Any Os Equipped with the Jvm can execute the Java Programs..
->::::The Execution of the Java Programs Like this happens====
->like hll(code) that gives the Java Compiler the complier converts the ByteCode/Intermiediate Language then JVM(Java Virtual machine).
->Jvm will convert the Byte code to the Machine Level code..
->To run the Java Programs Like this Happens
->First we need to the save the java file in the notepad. then navigat the command prompt where you saved the Javafile
->type the Commands like this:
->javac Main.java//here the jaava compiler will compile the java programes if there is know errors means the code to be exceuted.
->Java Main //then run the java programme..


->Computer:: A computer is the electronic device it is used to perform the task based on the instructions.
there are the four important parts of the omputer that is the ram,microprocessor, harddisk,Gpu(Graphic processing unit)..

microprocessor is the brain of the computer it is made up of the semiconductor technology it used to make computer operate the 
Efficiently..consists of the transistors this transitors is the npn transistor and the pnp transistor..

*/ 
/*public static void main(String[] args)

public  it is visibility like JVM can be called to the main method..
static the main not requires the creating the object. it can be used inside the class.
void this method does not have the return type.because the main method will not return anything..
String[] args this are the command line arguments(arrayofStrings)  this arguments can be passed to the runtime
when the programmes to be executed..  


TypeCasting 
->That converts the datatype from the one datatype to th another datatype..
->Implicit:converting the smaller datatype to the larger datatype(It can be the automatically done by the JVM)..
->Explicit::converting the larger datatype to the smaller.
byte(1byte)->short(2bytes)->int(4)->long(8)->float(4)->double(8).
      char(2).

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
/*
 *An array is the datastructure that allows the mutiple values in the single variable
*/