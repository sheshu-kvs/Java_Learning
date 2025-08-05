

// int a[]={21,12,1,3,4,21,4,3};
	// Arrays.sort(a);

	// int count=1;
	// for(int i=0;i<a.length-1;i++){
		// if(a[i]==a[i+1]){
		// count++;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         
		// }
		// else{
			// System.out.println(a[i]+":"+count);
			// count=1;
		// }
	// }
	// System.out.println(a[a.length-1]+":"+count);


// ===nof the Caracters in the array==
// import java.util.*;
// import java.util.Map; // Imports the Map interface
// import java.util.Map.Entry; 
// public class PracString{
// public static void main(String[] args){
	// String str="mississippi";
	// LinkedHashMap<Character,Integer> s1=new LinkedHashMap<Character,Integer>();
	// for(int i=0;i<str.length();i++){
		// char ch=str.charAt(i);
		// if(s1.containsKey(ch)){
			// int c=s1.get(ch);
			// s1.put(ch,c+1);
		// }
		// else{
			// s1.put(ch,1);
		// }
	// }
	// String t="";
// Import statement required: import java.util.Map.Entry;
// Set<Entry<Character,Integer>> entrys=s1.entrySet(); // Or use Map.Entry
// for(Entry<Character,Integer> e:entrys){ // Or use Map.Entry
    // t=t+e.getKey()+e.getValue();
// }
// System.out.println(t);
// }
// }



// ===using the loops and the condidtions====
import java.util.Arrays;
public class PracString{
	public static void main(String[] args){
		
String str="banana";
char[]ch=str.toCharArray();
Arrays.sort(ch);
int count=1;
System.out.println("Original String:"+str);
for(int i=0;i<ch.length-1;i++){
	if(ch[i]==ch[i+1]){
		count++;
	}
	else{
		System.out.println(ch[i]+" : "+count);
		count=1;
	}
}
System.out.println(ch[ch.length-1]+" : "+count);
}
}