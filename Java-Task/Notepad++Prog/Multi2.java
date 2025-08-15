

class Amy {
    public void run123(){
       System.out.println("Hello Java");
    }
}


class enyy extends Amy  implements Runnable {
   
    public void run(){
        System.out.println("This is the Run method Using the Runnable Interface...");
    }    
} 

public class Multi2 {
    public static void main(String[] args) {
        enyy e1=new enyy();
        e1.run123();
        
    }
    
}
