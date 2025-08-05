// ===FileWriter===

// A filewriter are used to create the file if does not exist and also writes the file

// for example whenever you created the file and content also present if i need add new content means the old content will lost and update the new value 

// we are using in the filewriter (fileobject,true)


// import java.io.File;
// import java.io.FileWriter;


// public class files1234{
// public static void main(String[] args){
	// try{
		// File f1=new File("C:\\Users\\vijitha\\Desktop\\files\\file.txt");
	    // FileWriter fw=new FileWriter(f1,true);
	    // fw.write("Hlo How are You!!\n");
	    // fw.write("Good morining\n");
	    // fw.write("Keep Smiling..\n");
	    // fw.write("Namaste..\n");
		// fw.write("Namaskara..\n");
	    
		// System.out.println("File Created Succesfully.. and Content also written");
		// fw.write("Sheshadri kumar");
		// fw.close();
	// }
	// catch(Exception e){
	// System.out.println(e.getMessage());
	// }
// }
// }


// ===FileReader===
// to create the object of the file reader we get the exception that is the FileNotFoundException exception. to read the filereader
// it is used the read the from the character class 
// we are using the read():method to read the files.
// System.out.println(fR.read()); it will return ascii value of the first character.. if we want to display the character means explixit 
// type cast (char)
// read() this method will return the integer if it returns -1 means there is no characters present in the file
// if we want to display all the data in the file we need to use the while loop untill the given condition is false which means -1(there is know
// character in the file)..
// Debug work like this value!=-1 means enter the loop then print the data again we are storing the value in c;





// import java.io.File;
// import java.io.FileReader;
// import java.io.IOException;
// import java.io.FileNotFoundException;



// public class files1234{
// public static void main(String[] args){ 
	// try{
	// File f1=new File("C:\\Users\\vijitha\\Desktop\\files\\file.txt");
	// FileReader fR=new FileReader(f1);
	// int c=fR.read();
	// while(c!=-1){
		// System.out.print((char)c);
		// c=fR.read();
	// }
	// }catch(FileNotFoundException fe){
		// System.out.println(fe.getMessage());
	// }
	// catch(IOException ie){
		// System.out.println(ie.getMessage());
	// }
// }
// }


// ===read the data in the one file write the data in the another file using the file reader and the filewriter===


// import java.io.File;
// import java.io.FileWriter;
// import java.io.FileReader;
// import java.io.FileNotFoundException;
// import java.io.IOException;
// public class files1234{
// public static void main(String[] args){ 

// try{
// File f1=new File("C:\\Users\\vijitha\\Desktop\\files\\file.txt");
// File f2=new File("C:\\Users\\vijitha\\Desktop\\files\\file1.txt");
// FileReader fr=new FileReader(f1);
// FileWriter fw=new FileWriter(f2);


// int c=fr.read();
// while(c!=-1){
	// fw.write(c);
	// c=fr.read();
// }
// fw.close();
	// System.out.println("Wrote Successfully in the Another File..");
// }
// catch(FileNotFoundException fe){
	// System.out.println(fe.getMessage());
// }
// catch(IOException e1){
	// System.out.println(e1.getMessage());
// }
// }
// }


// =====using the FileReader it is not efficient for the readaing the large files so to to overcome this we are using the BufferedReader ===
// in this we are using the readLine()  method it is used to read the entire line if the no value present in  the test it will return the Null


 
// import java.io.FileNotFoundException;
// import java.io.IOException;
// import java.io.File;
// import java.io.FileReader;
// import java.io.BufferedReader;
// public class files1234{
// public static void main(String[] args){ 
// try{
	// File fll=new File("C:\\Users\\vijitha\\Desktop\\files\\BR.txt");
	// FileReader fr=new FileReader(fll);
	// BufferedReader br=new BufferedReader(fr);
	// System.out.println(br.readLine());
	// System.out.println(br.readLine());
	// System.out.println(br.readLine());
	// System.out.println(br.readLine());
	// System.out.println(br.readLine());
// }
// catch(FileNotFoundException fe){
	// System.out.println(fe.getMessage());
// }
// catch(IOException ie){
	// System.out.println(ie.getMessage());
// }
// }
// }


// in the above code we are using the multiple readline to avoid this we can implement the another program.



 
// import java.io.FileNotFoundException;
// import java.io.IOException;
// import java.io.File;
// import java.io.FileReader;
// import java.io.BufferedReader;
// public class files1234{
// public static void main(String[] args){ 
// try{
	// File fll=new File("C:\\Users\\vijitha\\Desktop\\files\\BR.txt");
	// FileReader fr=new FileReader(fll);
	// BufferedReader br=new BufferedReader(fr);
	// String line=br.readLine();
	
	// while(line !=null){
		// System.out.println(line);
		// line=br.readLine();
	// }

// }
// catch(FileNotFoundException fe){
	// System.out.println(fe.getMessage());
// }
// catch(IOException ie){
	// System.out.println(ie.getMessage());
// }
// }
// }


// ====BufferedWriter==== Important Note::whenever writing the file you need to close the file using the close()..

import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class files1234{
public static void main(String[] args){ 
try{
	File f1=new File("C:\\Users\\vijitha\\Desktop\\files\\BR.txt");
    FileWriter fw=new FileWriter(f1);
    BufferedWriter bw=new BufferedWriter(fw);
    bw.write("New file to be added.");
    bw.write("New file to be added.");
    bw.write("New file to be added.");
	bw.close();
}
catch(Exception e){
	System.out.println(e.getMessage());
}
}
}