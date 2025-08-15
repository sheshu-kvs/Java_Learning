/* using the runnable Interface.*/

class amy{
    void disp(){
        System.out.println("this is the amy method");
    }
}

class dev extends amy implements Runnable{
    public void run(){
        // disp();
 System.out.println(Thread.currentThread().getName()+" doing the work");
    }
}

public class Multi02 {
    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            dev d=new dev();
            Thread ts=new Thread(d);
            ts.start();
        //     try{
                
        //         Thread.sleep(3000);
        //     }
        //     catch(Exception e){
        //         System.out.println(e.getMessage());
        // }
            }
        }
        
    }
    
// }
