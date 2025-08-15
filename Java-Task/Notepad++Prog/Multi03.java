import java.util.Scanner;

class myThread1 extends Thread{
    public void run(){
       System.out.println(" myThread Class1 ");
       int count=0;
       for(int i=0;i<20;i++){
        System.out.println(currentThread().getName()+" is printing with the count "+count);
        count++;
        try{
            sleep(5000);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
       }
    }
}
class myThread2 extends Thread{
    public void run(){
       System.out.println(" myThread Class2 ");
       int count=0;
       for(int i=0;i<20;i++){
        System.out.println(currentThread().getName()+" Thread is printing with the count "+count);
        count++;
        try{
            sleep(6000);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
       }
    }
}
class myThread3 extends Thread{
    public void run(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Num1");
        int num1=scan.nextInt();
        System.out.println("Enter the Num2");
        int num2=scan.nextInt();

        System.out.println("The Sum of the Two Numbers: "+(num1+num2));
    }
}

public class Multi03 {
    public static void main(String[] args) {
        // class 1
        myThread1 m1=new myThread1();
        // class 2
        myThread2 m2=new myThread2();
        // class 3
        myThread3 m3=new myThread3();

        // here we are setting the name of the  thread we are using the setName() method..
        m1.setName("Class 1");
        
        m2.setName("Class 2");
        
        m3.setName("Class 3");
        
        // then we are calling the start()
        // start thread with the 1..
        m1.start();
        m1.getPriority();

        // this the join method are used to the mainly used to thread 
        // 20 need to complete untill it wont start the new thread... 
        // try {
        //     m1.join();
        // } catch (InterruptedException e) {
        //     e.printStackTrace();
        // }
        // start thread with the 2..
        m2.start();

        m3.start();
    }
    
}
