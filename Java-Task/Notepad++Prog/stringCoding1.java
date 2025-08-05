// public class stringCoding1{
// public static void main(String[] args){
	
	
// String str="Hello world";

// System.out.println(str.indexOf('l'));  //it return the position of the index and the first occurance of the character in the given String..
// System.out.println(str.indexOf('o',5));//it starts from the 5 th index then find the first occurance of the character
// System.out.println(str.lastIndexOf('d'));

// indexOf and the lastIndexOf()

// String str="swiss";
	// System.out.println("Original String:"+str);
// for(int i=0;i<str.length();i++){
	// char ch=str.charAt(i);	
	// System.out.print("IndexOcccurance:"+str.indexOf(ch)+" ");
	// System.out.println("LastIndexOcccurance:"+str.lastIndexOf(ch));
// }





// indexOf::returns the first occurance of the given character in the String and it is used to find the posistion of the Index...
// lastIndexOf::returns the last occurance of the given charactter in the String
// for(int i=0;i<str.length();i++){
	// char ch=str.charAt(i);
	// System.out.print(str.indexOf(ch)+" ");
	// System.out.println();

	// System.out.print(str.lastIndexOf(ch)+" ");
	
// }



// public class stringCoding1{
// public static void main(String[] args){
	// String str="swiss";
	// String data=repe(str);
	// System.out.println(data);
// }
// public static String repe(String str){
		// for(int i=0;i<str.length();i++){
		// char ch=str.charAt(i);
		// if(str.indexOf(ch)==str.lastIndexOf(ch)){
			// return "First Non repeating character:"+ch;
		// }
		
	// }
	// return null;
	
public class stringCoding1{
public static void main(String[] args){
	String str="swiss";
	for(int i=0;i<str.length();i++)
	{
		char ch=str.charAt(i);
		if(str.indexOf(ch)!=str.lastIndexOf(ch)){
			System.out.println(ch);
		}
		// else{
			// System.out.println(ch);
		// }
	}
	
}

}