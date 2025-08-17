// here we are using the DemonThread


class Res extends Thread{

    public void run(){
        waiter1 w1=new waiter1();
        waiter2 w2=new waiter2();

        w1.setDaemon(true);
        w1.start();
        w2.setDaemon(true);
        w2.start();

       try{
         System.out.println("Restaurant opened...");
        Thread.sleep(3000);
        System.out.println("Owner Came to the Restaurant");
        Thread.sleep(3000);
        System.out.println("Owner sees all the items prepared");
        Thread.sleep(3000);
        // System.out.println("");
        // Thread.sleep(3000);
        // System.out.println("");
        Thread.sleep(3000);
        System.out.println("Restaurant Closed Tq!!");
       }
       catch(Exception e){
        e.printStackTrace();
       }
    }


}
class waiter1 extends Thread{
     public void run(){
         for( ; ;){
        try { 
        System.out.println("Chef 1 is took the order from the owner..");
        Thread.sleep(3000);
        System.out.println(" Chef 1 Started Preparing...");
        Thread.sleep(5000);
        System.out.println("Chef 1 Prepared the Item Given to the Customer 1..");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    }
}
class waiter2 extends Thread{
     public void run(){
        for( ; ;){

       
        try {
        System.out.println("Chef 2 is took the order from the owner..");
        Thread.sleep(3000);
        System.out.println(" Chef 2 Started Preparing...");
        Thread.sleep(5000);
        System.out.println("Chef 2 Prepared the Item Given to the Customer 2..");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
}



public class Multi06 {
    public static void main(String[] args) {
        Res r1=new Res();
       

        r1.setName("Restaurant");
        // w1.setName("Waiter 1");
        // w2.setName("Waiter 2");

        r1.start();
        // w1.start();
        // w2.start();
        
    }
    
}
