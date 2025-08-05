package JavaCoding;

public  class CheckNumInString {
public static void main(String[] args) {
    String str="Hello123@12!_=-";
    for(int i=0;i<str.length();i++){
        char ch=str.charAt(i);
      if(!Character.isLetterOrDigit(ch)){
        System.out.println("\n"+ch);
      }
    }
}
    
}