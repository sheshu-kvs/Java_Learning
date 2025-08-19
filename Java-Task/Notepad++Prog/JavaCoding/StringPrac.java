package JavaCoding;
/*This are created in the constant pool without using the new Keyword.
 *  beacuse this are created in the heap segment (constant pool without using the New Keyword).
 * It will return true , both same  values are refering the same object.
 * It will return false, both the values are using the different objects..
 * 
 * For compare the content we are using the .equals() with the different refernces..(Note it should same content)
 * For same it should ignore the case means we should use the .equalIgnoreCase( )
 */

public class StringPrac {
    public static void main(String[] args) {
        String str1="Hello";
        String str2="Hello";
        String str3="Java";
        String str4=new String("Hello");
        String str5=new String("hello");
        String str6="Hello, World";
        System.out.println(" ");


        System.out.println("Different Referces Reffering the same Object: "+(str1==str2));
        System.out.println("Different Referces Reffering the differnt Object: "+(str1==str3));
        System.out.println("Different Referces Reffering  and the  created the New Object and content Should be the Same and valdiates the case: "+(str1.equals(str4)));
        System.out.println("Different Referces Reffering  and the  created the New Object and content Should be the Same,Here ignoring the case: "+(str1.equalsIgnoreCase(str5)));

        /*In the Substring what happend means it will work like that start index, and from the lastindex it should take -1 */
        System.out.println(str6.substring(5));
        System.out.println(str6.substring(5,7));

        /*And also we have the length(method): It will give the total values in the  String,
        if we want the last value means we should take this length-1
         ,chartAt(i) it used to the fecth the each value in the string that converted the char */

         System.out.println(str6.length());
         char ch[]=str6.toCharArray();
         System.out.println(ch[ch.length-1]);

         /*To find the Index of the String we use the indexOf(method) */

         System.out.println("Index of the String: "+str6.indexOf("H"));

         for(int i=0;i<str6.length();i++){
            char ch12=str6.charAt(i);
            System.out.print(ch12+" ");
          System.out.print(str6.indexOf(ch12)+" ");

         }



    }
    
}
