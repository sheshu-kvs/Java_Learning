package JavaCoding;

import java.util.TreeSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String s1="helloworld";
        // HashSet<Character> set=new HashSet<>(); it removes the duplicates and it is not maintain the order
        // LinkedHashSet<Character> set=new LinkedHashSet<>(); it  maintian the order of the data
        TreeSet<Character> set =new TreeSet<>(); //it maintains the insertion order also ascending order..
        for(int i=0;i<s1.length();i++){
            char ch=s1.charAt(i);            
            set.add(ch);
        }
        System.out.println(" ");
        for(Character val:set){
            System.out.print(val+" ");
        }
    }
}
