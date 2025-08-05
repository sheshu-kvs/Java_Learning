package JavaCoding;

public class RemoveSpaces {

    // this trim() method are remove the whitespace from the trailing and the leading whitespace..
    // to remove the spcae including the space in the string..

    public static void main(String[] args) {
        String str=" Hello world   ";
        String originalStr=str.replaceAll("\\s","");
        System.out.println("\n"+str);
        System.out.println("\n"+str.trim());
        System.out.println("\n"+originalStr);

    }
    
}
