interface Os{
     void boot();
    void shutdown();
}
class Windows implements Os{
    
    public void boot(){
        System.out.println("Ya the Windows System is Booting Up..");
    }
    public void shutdown(){
        System.out.println("after the Updattion the System to Shutdown..");
    }

}
class Linux implements Os{
     public void boot(){
        System.out.println("Ya the Linux System is Booting Up..");
    }
    public void shutdown(){
        System.out.println("after the Updattion the Linux System to Shutdown..");
    }

}
class Mac implements Os{

    public void boot(){
        System.out.println("Ya the Mac System is Booting Up..");
    }
    public void shutdown(){
        System.out.println("after the Updattion the Mac System to Shutdown..");
    }

}







public class Inter {

     public static void main(String[] args) {
       
        Windows w1=new Windows();
        Linux l1=new Linux();
        Mac m1=new Mac();
        

        w1.boot();
        w1.shutdown();

        l1.boot();
        l1.shutdown();

        m1.boot();
        m1.shutdown();

        // Os os1=new Windows();
        // Os os2=new Linux();
        // Os os3=new Mac();

        // os1.boot();
        // os1.shutdown();
   
        // os1.boot();
        // os2.shutdown();
        
        // os3.boot();
        // os3.shutdown();





        
     }

}