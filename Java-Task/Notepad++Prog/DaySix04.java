/*A string is the Sequence of the character is enclosed with the double quotes.*/

import java.util.Scanner;
public class DaySix04{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
String Name="Hello World!";
System.out.println("Length of the String"+Name.length());
System.out.println("SubString:"+Name.substring(1,2));
System.out.println("SubString:"+Name.substring(1));

comparision of the String

String s1="Alex";
String s2="alex";
String s3="Alex";
String s4=new String("Alex");
System.out.println(s1==s2);
Here == it is used to compare the values and the references 



System.out.println(s1==s3);

System.out.println("Comparing the References:"+(s1==s4));
System.out.println("Comparing the values:"+ s1.equals(s4));

here we can trim the string

String s1="   Alex verin";
System.out.println("Before triming"+s1);
after triming we can display like this
System.out.println("After Triming"+s1.trim());


replace the specified character in the String

System.out.println("Replace the specefied character in the String.."+s1.replace("e","H"));
System.out.println("Replace the specefied character in the String.."+s1.replaceAll("e","Hello"));


Spliting the String 
String s1="apple,orange,salad";
String splited[]=s1.split(",");
for(int i=0;i<splited.length;i++){
	
	System.out.println(splited[i]);
	}

}
}