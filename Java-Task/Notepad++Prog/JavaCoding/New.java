import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class New {
    //     {"name": "a.txt", "hash": "abcd1234"},
    // {"name": "b.txt", "hash": "abcd1234"},
    // {"name": "c.txt", "hash": "efgh5678"},
    // {"name": "d.txt", "hash": "ijkl9101"},
    // {"name": "e.txt", "hash": "efgh5678"}
    public static void main(String[] args) {
        List<Map<String,String>> files=List.of(
            Map.of("name", "a.txt", "hash", "abcd1234"),
            Map.of("name", "b.txt", "hash", "abcd1234"),
            Map.of("name", "c.txt", "hash", "efgh5678"),
            Map.of("name", "d.txt", "hash", "ijkl9101"),
            Map.of("name", "e.txt", "hash", "efgh5678")
        );



        Map<String,List<String>> hashmap=new HashMap<>();

        for(Map<String,String> m1:files){
            String name=m1.get("name");
            String hash=m1.get("hash");
            
          if(hashmap.containsKey(hash)){
            hashmap.get(hash).add(name);

          } 
          else{
            List<String> l1=new ArrayList<>();
            l1.add(name);
            hashmap.put(hash,l1);

          } 

        }


       for(Map.Entry<String,List<String>>entrys: hashmap.entrySet()){
        String hashlabel=entrys.getKey();
        // List<String> files12=entrys.getValue();
        // if(files12.size()>1){
        if(entrys.getValue().size()>1){
            System.out.println(entrys);
        }
       }

    }
}
