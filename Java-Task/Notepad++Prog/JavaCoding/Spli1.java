import java.util.Arrays;

// in the split what happend means wherever the we are taking the string then split(method) 
// wherever we want to cut the data..String if the data is space we amke it as the string using the split
// like the str="hell java why i a"===>str.split(" "); it will make wherever the spce is there split to the string comma,sepparted..
// str="hell java why, i a" str.split(",") where the comma is there sepparete string for that hell java  why, i am
public class Spli1 {
    public static void main(String[] args) {
        String str="./*eello world@-12!";
        // for(int i=0;i<s1.length;i++){
        //     System.out.println(s1[i]);
        // }
        // System.out.println(str.replaceFirst("H","h"));
        // System.out.println(str.replace("[aeiou]", "*"));

        // ====vowels to *====
//  String lowercase=str.toLowerCase();
//  String t="";
//  for(int i=0;i<lowercase.length();i++){
//     char ch=lowercase.charAt(i);
//     if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
//         t=t+"*";
//     }
//     else{
//         t=t+ch;
//     }
//  }
//  System.out.println(" ");
//  System.out.println(t);
   // System.out.println(Arrays.toString(s1));

//    ===To print the special characters in the string==
//   for(int i=0;i<str.length();i++){
//     char ch=str.charAt(i);
//     if(!Character.isLetterOrDigit(ch)){
//         System.out.println(ch);
//     }
//   }

// for(int i=0;i<str.length();i++){
//     char ch=str.charAt(i);
//     if(ch==' '){
//        System.out.println();
//     }
// }

// int count=0;
// String []s2=str.split(" ");
// for(int i=0;i<s2.length;i++){
// count++;
// }
// System.out.println(" ");
// System.out.println(count);
// System.out.println(" "+count);
// ===empty==

String[] s2=str.split(" ");

for(String s33:s2){
    if(!s33.isEmpty()){
        // System.out.println(s33.charAt(0));
        String data=String.valueOf(s33.charAt(0));
        System.out.println(data.toUpperCase());

    }

}
 }  
}
