package JavaCoding.RealProbelmsonHashes1;
import java.util.*;
public class DuplicatesHash {

    // here in each subject wh enrolled more thean two timesss.
    public static void main(String[] args) {
        List<Map<String,String>> files=List.of(
            Map.of("name","Alice","subject","Math"),
            Map.of("name","Bod","subject","Math"),
            Map.of("name","Charlie","subject","science"),
            Map.of("name","David","subject","science"),
            Map.of("name","Eve","subject","English")

        );

        Map<String,List<String>> map=new HashMap<>();



        for(Map<String,String> m1:files){
            String name=m1.get("name");
            String sub=m1.get("subject");
            if(map.containsKey(sub)){
                map.get(sub).add(name);

            }
            else{
                List<String> l1=new ArrayList<>();
                l1.add(name);
                map.put(sub,l1);
            }
        }


        for(Map.Entry<String,List<String>> val:map.entrySet()){
         String sub=val.getKey();
         List<String> names=val.getValue();
        //  if(sub.size()>2){
        //     System.out.println(" ");
        //     System.out.println(names);

        //  }
        if(names.size()>1){
             System.out.println(val.getKey()+":"+val.getValue());

        }
       
        

        }
    }
    
}
