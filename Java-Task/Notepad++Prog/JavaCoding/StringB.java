package JavaCoding;

// ===reverse(),append,length();

import java.util.Scanner;
public class StringB {
    public static void main(String[] args) {
     Scanner scan=new Scanner(System.in);
     StringBuffer sb=new StringBuffer();
     String str="Alex,james,werin,phorin";
     String str2="Alex";
     String str3="Elon";
     sb.append("Alex,james,werin,phorin");
    //  sb.append("Dev");
    //  sb.append("Elon");
    //  sb.append("Musk");
    //  for(int i=0;i<sb.length();i++){
        // System.out.println(sb+" ");
    //  }

    // Spliting the String 
       String sp[]=str.split(",");
       for(int i=0;i<sp.length;i++){
        System.out.println(sp[i]);
       }

    //    Spliting the StringBuffer
    // first we need to convert the stringBuffer to the toString();
    String convertedtoTheString=sb.toString();
    String s1[]=convertedtoTheString.split(",");
  for(int i=0;i<s1.length;i++){
    System.out.println(s1[i]);
  }
//   sb.reverse();
  System.out.println(sb);
  System.out.println("Length of the String Buffer"+sb.length());
//   sb.trimToSize();


    }
    
}
