package JavaCoding;

import java.util.HashMap;
import java.util.Map;
/*
 *  String str="preeehemoerpwreedsssss";
        HashMap<Character,Integer> mapval=new HashMap<>();


        // for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(mapval.containsKey(ch)){
                int c=mapval.get(ch);
                mapval.put(ch,c+1);

            }
            else{
                mapval.put(ch,1);
            }
        }


        for(Map.Entry<Character,Integer> val:mapval.entrySet()){
          System.out.println(val.getKey()+ ":" +val.getValue());
        }
 */

public class PrintheOccurance {
    public static void main(String[] args) {
        int num=1233312311;
        // String s1=String.valueOf(num);
        String s1="12321323143243324325341122213412341234213412341239999991010101010101100110";
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s1.length();i++){
            char ch=s1.charAt(i);
            if(map.containsKey(ch)){
                int c=map.get(ch);
                map.put(ch,c+1);
            }
            else{
                map.put(ch, 1);
            }
        }

        System.out.println(" ");
        for( Map.Entry<Character,Integer> val:map.entrySet()){
            System.out.println(val.getKey()+ ":"+ val.getValue());
        }

    }
}