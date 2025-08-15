package JavaCoding;

public class PrintFirstChar {
    public static void main(String[] args) {
        String str="hello java my world";
        String  ch1222232=reverse(str);
        String rever=String.valueOf(ch1222232);
        System.out.println(" ");
        // System.out.println(ch1222232);
           
        String s2[]=rever.split(" ");
  
        StringBuilder sb=new StringBuilder();
        for(String words:s2){
           if(words.isEmpty()){
            sb.append(" ");
           }
           char ch=words.charAt(0);
        //    words.substring()
            System.out.print(ch);
        }
    }
    private static String reverse(String s){
        String t="";
        for(int i=s.length()-1;i>=0;i--){
            char ch=s.charAt(i);
            // System.out.println(ch);
            t=t+ch;
        }
        return t;
    }
}
