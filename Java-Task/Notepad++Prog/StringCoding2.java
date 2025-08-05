import java.util.*;

public class StringCoding2 {
    public static void main(String[] args) {
    String str="swiss";
    String str1="sheshu289372933104";
    String str2="Aoubcdkdfjksdfjksdf";
    String vowels="AEIOUaeiou";
    String lowercase=str2.toLowerCase();
    System.out.println(str2.toLowerCase());
    

    // for(int i=0;i<str.length();i++){
    //     char ch=str.charAt(i);
    //     // System.out.println("\n"+str.indexOf(ch));
    //     // System.out.print(" "+str.lastIndexOf(ch));

    //     if(str.indexOf(ch)==str.lastIndexOf(ch)){
    //         System.out.println("\n"+ch);
    //         return; 
    //     }
    // }
    // for(int i=0;i<str1.length();i++){
    //     char ch=str1.charAt(i);
    //     if(Character.isDigit(ch)){
    //         System.out.println(ch);
    //     } 
    // }
    int vowelcount=0;
for(int i=0;i<lowercase.length();i++){
    char ch=lowercase.charAt(i);
    if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
        vowelcount++;
    }
}
System.out.println(vowelcount);
    }
    
}
