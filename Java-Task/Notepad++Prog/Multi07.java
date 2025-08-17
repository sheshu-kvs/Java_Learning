// here we are using the Synchronized keyword each in a thread only one thread can access 
// to stop the race conditions


// class BankAccount {
//     int balanace=1000;


//     public  void   withdraw(int amount){
//         System.out.println("--------------------------------");
//         if(balanace>=amount){
            
//             balanace-=amount;
//             System.out.println(Thread.currentThread().getName()+" Withdrawn Succesfully!! and The Remaining Balance "+balanace);
//         }
//         else{
//             System.out.println(Thread.currentThread().getName()+" Not Sufficient Balance!!");
//         }
//     }

// }

class School{
    // here the bathroom is the synchronized only one resource can exceute after another resource will start.. 

    public synchronized void bathroom(){
       try{
        System.out.println(Thread.currentThread().getName() +" Entered the Bathroom");
        Thread.sleep(5000);
        System.out.println(Thread.currentThread().getName()+" Completed Came out of the Bathroom");
        Thread.sleep(5000);

       }
       catch(Exception e1){
        e1.printStackTrace();
       }
    }

}





public class Multi07 {
    public static void main(String[] args) {
        // BankAccount b1=new BankAccount();
        // ?here we are using the Runnble interfsce to c


        // Runnable user1=new Runnable(){
        //     public void run(){
        //         b1.withdraw(500);
        //     }

        // };
        
        // Runnable user2=new Runnable(){
        //     public void run(){
        //         b1.withdraw(600);
        //     }
        // };

        // Thread t1=new Thread(user1);
        // Thread t2=new Thread(user2);

        // t1.setName("User 1");
        // t2.setName("User 2");

        // Thread t1=new Thread(()->
        //     b1.withdraw(500),"User1"
        // );
        // Thread t2=new Thread(()->
        // b1.withdraw(600),"User2");

        // t1.start();
        // t2.start();

        School s1=new School();

        Thread t1=new Thread( ()->
        s1.bathroom(),"Boy");

        Thread t2=new Thread( ()->
            s1.bathroom(),"Female"
        );
      
        Thread t3=new Thread( () ->
        s1.bathroom(),"Others");


        t1.start();
        t2.start();
        t3.start();




        
    }
    
}
