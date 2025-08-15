package JavaCoding;
// here in this isempty() are used to the return the whether the String length is the 0
public class TitleCase {
    public static void main(String[] args) {
        String str="hello world java is fun";
        String s1[]=str.split(" ");
        StringBuilder sb=new StringBuilder();
        for(String w1:s1){
            if(w1.isEmpty()){
             sb.append(" ");
            }
            char firstchar=Character.toUpperCase(w1.charAt(0));
            String remainingchars=w1.substring(1);
            sb.append(firstchar).append(remainingchars).append(" ");
        }
        System.out.println(sb.toString());
        
    }
}
