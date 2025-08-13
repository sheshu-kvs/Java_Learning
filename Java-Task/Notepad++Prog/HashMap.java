import java.util.*;
public class HashMap {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> lh=new LinkedHashMap<>();
        lh.put(1,"apple");
        lh.put(2,"banana");
        lh.put(3,"Orange");
        lh.put(4,"Mango");
        lh.put(5,"Mango");
        lh.put(6,"Mango");
        lh.put(7,"Mango");
        lh.put(8,"Mango");
        lh.put(9,"Mango");
        

        // lh.entrySet();
        // for(Map.Entry<Integer,String> entrys:lh.entrySet()){
        //     System.out.println(entrys.getKey()+":"+entrys.getValue());

        // }



        for(Map.Entry<Integer,String>entrys:lh.entrySet()){
            System.out.println(entrys.getValue());

        }

    }
    
}
