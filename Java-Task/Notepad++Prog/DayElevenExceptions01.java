<<<<<<< HEAD
// Exception:
// An Exception it occurs during the execution of the java programmes it is called the Exception..
// The process of avoiding the abrupt termination and the loss of the data in the programme is called as the Exception Handling..
// which means the code also the exception object sends to the Runtime System(rts) the RuntimeSystem(rts) check the user defined 
// Exception Handler if it is there the Exception can be handled otherwise it throws the Exception.

// there are two types of the error
// ->Syntax error:it occurs during the complie time of the programmes
// Example:System.ou.println("complile time error");//with ou
// An Exception:: is the occurs during the faulty inputs...
// To Handle the Exception we use the try catch one try has the many catch it is not a probelm..

// ->Exceptions.
// when a user enter the a=10,and b=0 ser can find the Exception called as the / zero Exception or also ArithmeticException
// when a user enters the wrong input means the user can encounter the InputMismatchException 

// public class DayElevenExceptions01{
	// public  static void main(String[] args){
		  // Scanner scan=new Scanner(System.in);
		  // try{
			  // Scanner scan=new Scanner(System.in);
			  // System.out.println("Enter the a Number");
			  // int a=scan.nextInt();
			  // System.out.println("Enter the a Number");
			  // int b=scan.nextInt();
			  // int c=a/b;
			  // System.out.println("The Division of the Two Values:"+c);
		  // }
		  // catch(ArithmeticException e1){
			  // System.out.println("Divison by zero Exception");
		  // }
		  // catch(InputMismatchException e2){
			  // System.out.println("Input Mistmatch Exception");
		  // } 
		  // catch(Exception e){
		  // System.out.println(e);
		  // }
	// }
// }



// --->
// ArrayIndedxOutOfBoundsException
		  // try{
			  // String a=null;
			  // System.out.println(a.length());
		  // int []a1={1,2};
			  // System.out.println(a1[3]);
			  
		  // }
		  // catch(NullPointerException e){
			  // System.out.println(e.getMessage());
		  // }
		  // catch(ArrayIndexOutOfBoundsException e1){
			  // System.out.println(e1.getMessage());
		  // }



// import java.util.Scanner;
// import java.util.InputMismatchException;
// import java.util.NullPointerException;
// InputMismatchException

import java.util.Scanner;
public class DayElevenExceptions01{
	public  static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		// NegativeArraySizeException
		// an array can be the negative size to handle this we are using the try catch
    try{
			int n=-1;
		int a[]=new int[n];
		for(int i=0;i<a.length;i++){
			a[i]=scan.nextInt();
		}	
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
		  
}
catch(Exception e){
	System.out.println(e);
}
 }
=======
// Exception:
// An Exception it occurs during the execution of the java programmes it is called the Exception..
// The process of avoiding the abrupt termination and the loss of the data in the programme is called as the Exception Handling..
// which means the code also the exception object sends to the Runtime System(rts) the RuntimeSystem(rts) check the user defined 
// Exception Handler if it is there the Exception can be handled otherwise it throws the Exception.

// there are two types of the error
// ->Syntax error:it occurs during the complie time of the programmes
// Example:System.ou.println("complile time error");//with ou
// An Exception:: is the occurs during the faulty inputs...
// To Handle the Exception we use the try catch one try has the many catch it is not a probelm..

// ->Exceptions.
// when a user enter the a=10,and b=0 ser can find the Exception called as the / zero Exception or also ArithmeticException
// when a user enters the wrong input means the user can encounter the InputMismatchException 

// public class DayElevenExceptions01{
	// public  static void main(String[] args){
		  // Scanner scan=new Scanner(System.in);
		  // try{
			  // Scanner scan=new Scanner(System.in);
			  // System.out.println("Enter the a Number");
			  // int a=scan.nextInt();
			  // System.out.println("Enter the a Number");
			  // int b=scan.nextInt();
			  // int c=a/b;
			  // System.out.println("The Division of the Two Values:"+c);
		  // }
		  // catch(ArithmeticException e1){
			  // System.out.println("Divison by zero Exception");
		  // }
		  // catch(InputMismatchException e2){
			  // System.out.println("Input Mistmatch Exception");
		  // } 
		  // catch(Exception e){
		  // System.out.println(e);
		  // }
	// }
// }



// --->
// ArrayIndedxOutOfBoundsException
		  // try{
			  // String a=null;
			  // System.out.println(a.length());
		  // int []a1={1,2};
			  // System.out.println(a1[3]);
			  
		  // }
		  // catch(NullPointerException e){
			  // System.out.println(e.getMessage());
		  // }
		  // catch(ArrayIndexOutOfBoundsException e1){
			  // System.out.println(e1.getMessage());
		  // }



// import java.util.Scanner;
// import java.util.InputMismatchException;
// import java.util.NullPointerException;
// InputMismatchException

import java.util.Scanner;
public class DayElevenExceptions01{
	public  static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		// NegativeArraySizeException
		// an array can be the negative size to handle this we are using the try catch
    try{
			int n=-1;
		int a[]=new int[n];
		for(int i=0;i<a.length;i++){
			a[i]=scan.nextInt();
		}	
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
		  
}
catch(Exception e){
	System.out.println(e);
}
 }
>>>>>>> c8e296b81ff23e9186dd3b26826c22fa73d7a054
}