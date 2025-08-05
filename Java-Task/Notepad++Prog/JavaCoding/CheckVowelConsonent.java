package JavaCoding;

public class CheckVowelConsonent {
    public static void main(String[] args){

        String str="Hello, world12345";
        String lowercase=str.toLowerCase();
        // String trim1=str.trim();

        // System.out.println("\n"+trim1);
        int Vcount=0;
        int Ccount=0;
        for(int i=0;i<lowercase.length();i++){
            char ch=lowercase.charAt(i); 
        if(Character.isLetter(ch)){
         if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            Vcount++;
         }
         else{
            Ccount++;

         }
        
        } 
       
        
    }
   System.out.println("Vowels:"+Vcount);
    System.out.println("Cons:"+Ccount);

    }
    
}
