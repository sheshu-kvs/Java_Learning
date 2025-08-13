public class FirstUpper {
    public static void main(String[] args) {
        String str="zeniva12345";
        String t="";
        // char [] ch=str.toCharArray();
        // String s1=String.valueOf(ch[0]).toUpperCase();
        // for(int i=1;i<str.length();i++){
        //     char ch12=str.charAt(i);
        //     t=t+ch12;
            
        // }
        // System.out.println(" ");
        // System.out.println(s1+t);
        int count=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(Character.isDigit(ch)){
                // System.out.println(ch);
                count++;
            }
        }
        System.out.println(" ");
        System.out.println(count);
    }
    
}
