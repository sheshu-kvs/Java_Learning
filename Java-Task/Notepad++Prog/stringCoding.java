<<<<<<< HEAD
import java.util.*;
public class stringCoding{
public static void main(String[] args){

// String str="madam";
// String t="";
// for(int i=str.length()-1;i>=0;i--){
// char ch=str.charAt(i);
// t=t+ch;
// }
// if(t.equals(str)){
	// System.out.println("Palindrome");
// }
// else{
	// System.out.println("Not palindrome..");
// }

// String str="Hello";
// int countVowel=0;
// int countConson=0;

// for(int i=0;i<str.length();i++){
	// if(Character.charAt(i)){
		// char ch=str.charAt(i);
	// if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
		// countVowel++;
	// }
	// else{
		// countConson++;
	// }
// }
// System.out.println(countVowel);
// System.out.println(countConson);

// String str1="listen";
// String str2="silent";


// ==removing the duplicates from the array==


// String str="programming";
// Set<Character> s1=new LinkedHashSet<>();
// for(char ch:str.toCharArray()){
	// s1.add(ch);
// }


// for(Character c1:s1){
	// System.out.println(c1);
// }
// StringBuilder results=new StringBuilder();
// for(Character a1:s1){
	// results.append(a1);
// }

// System.out.println(results.toString());



// "listen", "silent"

String s1="listen";
String s2="silent";

// if(s1.length()!=s2.length()){
	// return false;
// }
// char[]a1=s1.toCharArray();
// char[]a2=s1.toCharArray();

// Arrays.sort(a1);
// Arrays.sort(a2);


// System.out.println(Arrays.equals(a1,a2));






// =====  public static Character firstNonRepeatingChar(String str) {
    // for (int i = 0; i < str.length(); i++) {
        // char currentChar = str.charAt(i);
        // if (str.indexOf(currentChar) == str.lastIndexOf(currentChar)) {
            // return currentChar;
        // }
    // }
    // return null;
// }===

// String str="swiss";
// int count=0;
// for(int i=0;i<str.length()-1;i++){

	// if(str.charAt(i)!=str.charAt(i+1)){
	// count++;
	// }
	// else{
		// System.out.println(str.charAt(i));
// }


// }
// The indexOf() method in Java is part of the String class and is used to
 // find the first occurrence of a specified character or substring within a given string. 

// for(int i=0;i<str.length();i++){
	// char ch=str.charAt(i);
	// System.out.println(str.indexOf(ch));
	// if(str.indexOf(ch)==str.lastIndexOf(ch)){
		// System.out.println(ch);
	// }
// }
// System.out.println(null);


// ==no of words==
// int count=1;
// String str21="Java is Fun";
// for(int i=0;i<str21.length();i++){
	// char ch=str21.charAt(i);
	// if(ch == ' '){
		// count++;
	// }
// }

// System.out.println(count);


 // 8. Check if String Contains Only Digits
// Problem: Verify if a string contains only digits.

// Input: "12345" → Output: true  
// Input: "123a5" → Output: false
// String s1124="123a5";
// for(int i=0;i<s1124.length();i++){
// char ch=str.charAt(i);
// if(!Character.isDigit(ch)){
	// System.out.println("true");
// }
// }
// System.out.println("false");


 // 9. Convert String to Title Case
// Problem: Convert the first character of each word to uppercase.

// Input: "java is cool"
// Output: "Java Is Cool"



// public static String toTitleCase(String str) {
  
    
    // String[] words = str.split(" ");
    // StringBuilder result = new StringBuilder();
    
    // for (String word : words) {
        // if (!word.isEmpty()) {
            // result.append(Character.toUpperCase(word.charAt(0));
        // }
    // }
    
    // return result.toString().trim();
// }



}
}

=======
import java.util.*;
public class stringCoding{
public static void main(String[] args){

// String str="madam";
// String t="";
// for(int i=str.length()-1;i>=0;i--){
// char ch=str.charAt(i);
// t=t+ch;
// }
// if(t.equals(str)){
	// System.out.println("Palindrome");
// }
// else{
	// System.out.println("Not palindrome..");
// }

// String str="Hello";
// int countVowel=0;
// int countConson=0;

// for(int i=0;i<str.length();i++){
	// if(Character.charAt(i)){
		// char ch=str.charAt(i);
	// if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
		// countVowel++;
	// }
	// else{
		// countConson++;
	// }
// }
// System.out.println(countVowel);
// System.out.println(countConson);

// String str1="listen";
// String str2="silent";


// ==removing the duplicates from the array==


// String str="programming";
// Set<Character> s1=new LinkedHashSet<>();
// for(char ch:str.toCharArray()){
	// s1.add(ch);
// }


// for(Character c1:s1){
	// System.out.println(c1);
// }
// StringBuilder results=new StringBuilder();
// for(Character a1:s1){
	// results.append(a1);
// }

// System.out.println(results.toString());



// "listen", "silent"

String s1="listen";
String s2="silent";

// if(s1.length()!=s2.length()){
	// return false;
// }
// char[]a1=s1.toCharArray();
// char[]a2=s1.toCharArray();

// Arrays.sort(a1);
// Arrays.sort(a2);


// System.out.println(Arrays.equals(a1,a2));






// =====  public static Character firstNonRepeatingChar(String str) {
    // for (int i = 0; i < str.length(); i++) {
        // char currentChar = str.charAt(i);
        // if (str.indexOf(currentChar) == str.lastIndexOf(currentChar)) {
            // return currentChar;
        // }
    // }
    // return null;
// }===

String str="swiss";
// int count=0;
// for(int i=0;i<str.length()-1;i++){

	// if(str.charAt(i)!=str.charAt(i+1)){
	// count++;
	// }
	// else{
		// System.out.println(str.charAt(i));
// }


// }
// The indexOf() method in Java is part of the String class and is used to
 // find the first occurrence of a specified character or substring within a given string. 

// for(int i=0;i<str.length();i++){
	// char ch=str.charAt(i);
	// System.out.println(str.indexOf(ch));
	// if(str.indexOf(ch)==str.lastIndexOf(ch)){
		// System.out.println(ch);
	// }
// }
// System.out.println(null);


// ==no of words==
// int count=1;
// String str21="Java is Fun";
// for(int i=0;i<str21.length();i++){
	// char ch=str21.charAt(i);
	// if(ch == ' '){
		// count++;
	// }
// }

// System.out.println(count);


 // 8. Check if String Contains Only Digits
// Problem: Verify if a string contains only digits.

// Input: "12345" → Output: true  
// Input: "123a5" → Output: false
// String s1124="123a5";
// for(int i=0;i<s1124.length();i++){
// char ch=str.charAt(i);
// if(!Character.isDigit(ch)){
	// System.out.println("true");
// }
// }
// System.out.println("false");


 // 9. Convert String to Title Case
// Problem: Convert the first character of each word to uppercase.

// Input: "java is cool"
// Output: "Java Is Cool"



// public static String toTitleCase(String str) {
  
    
    // String[] words = str.split(" ");
    // StringBuilder result = new StringBuilder();
    
    // for (String word : words) {
        // if (!word.isEmpty()) {
            // result.append(Character.toUpperCase(word.charAt(0));
        // }
    // }
    
    // return result.toString().trim();
// }



}
}

>>>>>>> 267a5287697fe999dcdd6a027af024e6adcb68e8
