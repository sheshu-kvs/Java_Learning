


// to deal with the files we need to create import the package java.io with the file class like :import java.io.File;
// before the creating the file we get the IO Exception to handle that exception we are using the try catch this exception because if incase file doesnot exit means..
// to add the file object with in the try catch()....
// ====Create the File===


// public class DayTwelve01{
	// public static void main(String[] args){
	// try{
	// File f1=new File("file1.txt");
	// if(f1.createNewFile()){
		// System.out.println("File can be created.."+f1.getName());
		
	// }
	// else{
		// System.out.println("The File Exits...");
		// System.out.println(f1.getAbsolutePath());
		// System.out.println(f1.canRead());
		// System.out.println(f1.canWrite());
		// System.out.println(f1.length());
		// for(int i=0;i<f1.length();i++){
		// System.out.println(f1.charAt(i));
		// }
	// }
	// }
	// catch(Exception e){
     // System.out.println(e);
	// }
	
	// ====Write a file===
	
	// import java.io.FileWriter;
	// public class DayTwelve01{
	// public static void main(String[] args){
		
		// try{
			// FileWriter f1=new FileWriter("file1.txt");
			// f1.write("Hlo How are you...May I know your GoodName...");
			// f1.close();
			// System.out.println("Successfully wrote the File...");
		// }
		// catch(Exception e){
			// System.out.println(e.getMessage());
			
		// }
// }
// }
	
	
	// === Read a File ===
	
// import java.io.File;
// import java.util.Scanner;
// public class DayTwelve01{
	// public static void main(String[] args){
		
		// try{
			// File f1=new File("file1.txt");
			// Scanner s1=new Scanner(f1);
			// while(s1.hasNextLine()){
			// String data=s1.nextLine();
			// System.out.println(data);
			// }
			// s1.close();
		// }
		
		// catch(Exception e){
			// System.out.println(e.getMessage());
			
		// }
// }
// }


// === To delete a File===


// import java.io.File;
// import java.util.Scanner;
// public class DayTwelve01{
	// public static void main(String[] args){
		
		// try{
			// File f1=new File("file1.txt");
			// if(f1.delete()){
				// System.out.println("File Deleted Successfully!!");
			// }
			// else{
				// System.out.println("No file exists!! Tq");
			// }
			
		// }
		
		// catch(Exception e){
			// System.out.println(e.getMessage());
			
		// }
// }
// }


// import java.io.File;

// public class DayTwelve01{
	// public static void main(String[] args){
		// try{
			// File f1=new File("C:\\Users\\vijitha\\Desktop\\demo1");
			// boolean created=f1.mkdirs();
			// mkdirs:inside the directory created the another folder
			// if(created){
						// System.out.println("Directory was created the Succesfully!!!");
			// }else{
				// System.out.println("Soory it is not created");
				// }
		// }
		// catch(Exception e){
			// System.out.println(e.getMessage());
		// }
		
	// }
// }

// ===TASKS==

// import java.io.File;

// public class DayTwelve01{
	// public static void main(String[] args){
		// try{
			// File f1=new File("test.txt");
			// if(f1.createNewFile()){
				// System.out.println("File Created Succesfully!!");
				
			// }
			// else{
				// System.out.println("Sorry File Exists!!");
			// }
			
		// }
		// catch(Exception e){
		// }
	// }
// }


// ===write a file===



// import java.io.File;
// import java.io.FileWriter;
// public class DayTwelve01{
	// public static void main(String[] args){
		
		// try{
			
			// FileWriter fw=new FileWriter("poem.txt");
			// fw.write("Roses are red!!");
			// fw.write("Violets are Blue!!");
			// fw.write("Java is Fun!!");
			// fw.write("you are!!");
			// System.out.println("File wrote Succesfully!!");
			// fw.close();
		// }
		// catch(Exception e){
			// System.out.println(e);
		// }
	// }
// }


// import java.io.File;
// import java.util.Scanner;

// public class DayTwelve01{
	// public static void main(String[] args){
		// try{
			// File f1=new File("poem.txt");
			// Scanner scan=new Scanner(f1);
		// while(scan.hasNextLine()){
			// String data=scan.nextLine();
			// System.out.println(data);
		// }
		// scan.close();
		// }
		// catch(Exception e){
			// System.out.println(e.getMessage());
		// }
	// }
// }

// =+++FileReader++====
// used to read the file

import java.io.FileReader;
public class DayTwelve01{
	public static void main(String[] args){
		try{
			FileReader FR=new FileReader("file.txt");
			int ch;
			while((ch=FR.read()!=-1)){
				System.out.println((char)FR																					);
			}
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		
	}
}


// ===BufferedReader==
// It is efficient for the Reading the Data it wraps up FileReader

// import java.io.FileReader;
// import java.io.BufferedReader;
// public class DayTwelve01{
	// public static void main(String[] args){
		// BufferedReader br=new BufferedReader(new FileReader("file.text"));
		// String line;
		// while((line=br.readLine())!null){
			
			// System.out.println(l);
		// }
	
	// }
// }