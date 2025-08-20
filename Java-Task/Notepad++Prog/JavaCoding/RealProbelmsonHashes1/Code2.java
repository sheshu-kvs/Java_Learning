package JavaCoding.RealProbelmsonHashes1;
import java.util.*;

public class Code2 {
    public static void main(String[] args) {
        List<Map<String,Object>> files=List.of(
            Map.of("name","Alice","math",80,"science",75,"english",90),
            Map.of("name","Bob","math",60,"science",70,"english",90),
            Map.of("name", "Charlie", "math", 85, "science", 95, "english",100)
        );


        // Map<String,List<String>> map=new HashMap<>();
        double mathSum=0,scienceSum=0,englishSum=0;        
        for(Map<String,Object> f1:files){
            mathSum+=(int)f1.get("math");
            scienceSum+=(int)f1.get("science");
            englishSum+=(int)f1.get("english");
        }
        
        System.out.println("Getting the Average of the Students:");

        int num=files.size();
        System.out.println(num);
        double mathAvg=mathSum/num;
        double ScienceAvg=scienceSum/num;
        double englishAvg=englishSum/num;
        System.out.println("Average of the Maths"+(mathSum/num));
        System.out.println("Average of the Science"+(scienceSum/num));
        System.out.println("Average of the English%2"+(englishSum/num));



        for(Map<String,Object> f1:files){
                int Math=(int)f1.get("math");
                int Science=(int)f1.get("science");
                int English=(int)f1.get("english");


                if(Math>mathAvg && Science>ScienceAvg && English>englishAvg){
                    System.out.println("Names"+f1.get("name"));
                }
        }

    }
    
}
