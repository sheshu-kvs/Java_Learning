public class StringExampl {
    public static void main(String[] args){
        String str="Sheshu@gmail.com12345!!!!!!";


        // validateEmail(str);
        System.out.println(validateEmail(str));
    }
    public static boolean validateEmail(String str){
        for(int i=0;i<str.length();i++){
        char ch=str.charAt(i);
        if((!Character.isLetterOrDigit(ch))&&(!Character.isDigit(ch))){
            return true;
        }
       }
       return false;

    }
     
        
    }
    

