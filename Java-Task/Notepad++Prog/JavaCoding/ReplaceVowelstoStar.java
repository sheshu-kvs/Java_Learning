package JavaCoding;

public class ReplaceVowelstoStar {
    public static void main(String[] args) {
        String str="hello world";
        String t="";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(!(ch =='a'||ch =='e'||ch =='i'||ch =='o'||ch =='u')){
                t=t+"*";
            }
            else{
                t=t+ch;
            }
        }
        System.out.println("Replacing the Vowels with the * ");
        System.out.println("Replacing the Vowels with the * ");
        System.out.println("Replacing the Vowels with the * ");
        System.out.println(t);
    }
}
