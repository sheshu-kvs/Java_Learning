package RealProbelmsonHashes1;

class Test1{
    int x,y;
    public Test1(){
        this(600,700);
        x=100;
        y=200;
    }
    public Test1(int x,int y){
        super();
        this.x=x;
        this.y=y;
    }

}
class Test2 extends Test1{
    int a,b;
    public Test2(){
        this(900,600);
        a=300;
        b=400;
    }

    public Test2(int a,int b){
        super();
    this.a=a;
    this.b=b;
    }

    public void disp(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(a);
        System.out.println(b);
    }
}

public class ConstructorChaining {
    public static void main(String[] args) {
        Test2 t2=new Test2();
        t2.disp();
        
    }
    
}
