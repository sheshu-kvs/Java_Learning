/*In this we are Using the Multithreading in the java 
 * we can create the multithreading using the Extending the Thread and Implement the Runnable Interface
 * as of now we are using extending the thread class..In this we are creating the multiple threads,
 * Here the Thread scheduler will decide which which thread should execute..
 * in this we are creating the instance of the res rfefence to the thread(Thread t1=new res("pasts"))
 * and one thing here we are extending the thread class and overriding the run method. an we do not call
 * ======Note=======
 * if we calll the run method mainly there is no new thread to be created, it works like the regular methods,
 * creation of the thread. in this multi threading cannot be achived..
 * 
 * using the start() here we can achieve the mt that is the  new thread to be created it executes tasks the independtly
 * (set of the instructions which are executing independtly..)(Here JVM can create the new Thread.)
 * 
 * 
 * consider an example like the using the run() i am rest owner i only need to take the order that is the 
 * cake i am only need to make that cake  i only deleiver the cake to the customer.. 
 * 
 * if we using the start() method i am owner i sholud one person that is the thread the thread (is need
 * to make the cake deliver tha tcake to the customer) here the set of the instruction which are
 * independtly.. that is set of the instructions executing concurently..
 */

class res extends Thread{
    private String item;

    res(String item){
        this.item=item;
    }
     
       @Override
    public void run(){
        System.out.println(item+" Is being Preparing "+ Thread.currentThread().getName());
    }
}

public class Multi01 {
    public static void main(String[] args) {
        res r1=new res("Pasta");
        res r2=new res("Gulab Jaman");
        res r3=new res("Zilebi");
        res r4=new res("Pastry");


        r1.run();
        r2.run();
        r3.run();
        r4.run();

      

        // Thread t1=new Thread(r1);
        // Thread t2=new Thread(r2);
        // Thread t3=new Thread(r3);
        // Thread t4=new Thread(r4);


        // Thread t1=new res("Pasta");
        // Thread t2=new res("Gulab Jaman");
        // Thread t3=new res("Zilebi");
        // Thread t4=new res("Pastry");



        // System.out.println(" ");
        // t1.start();
        // t2.start();
        // t3.start();
        // t4.start();



        
    }
    
}
