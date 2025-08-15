package JavaCoding;

public class FirstChartoUpper {
    public static void main(String[] args) {
        String str="hello world  java";
        String []s1=str.split(" ");
       
        StringBuilder sb=new StringBuilder();
         for(String words:s1){
            if(words.isEmpty()){
                sb.append(" ");
                continue;
            }
               char firstChar=Character.toUpperCase(words.charAt(0));
               String remainingchars=words.substring(1);
               sb.append(firstChar).append(remainingchars).append(" "); 
         }
         System.out.println(" ");
         System.out.println(sb.toString().trim());
   
    }
}
