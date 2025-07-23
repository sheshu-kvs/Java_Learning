<<<<<<< HEAD
// To use the CustomException we need to override the custom getMessage() method,
// Along with the Exception we need to extends the Exception class...
// After throwing the Exception we need to handle with the try catch



import java.util.Scanner;


class InvalidUserException extends Exception{
	@Override
	public String getMessage(){
		return"Invalid Card Details Try Again!";
	}
	
}


class ATM{
	int accNum=1234;
	String pwd="ABCD";
	int ac;
	String p;
	
	void input(){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Account Number..");
		 ac=scan.nextInt();
		 scan.nextLine();
		System.out.println("Enter the Password..");
		 p=scan.nextLine();		
	}
	void validation() throws InvalidUserException {
		if(ac==accNum && p.equals(pwd)){
			System.out.println("hey User!! Enterd Correct Details...Please collect the Money");
		}
		else{
			try{
			InvalidUserException iue=new InvalidUserException();
			System.out.println(iue.getMessage());
			throw iue;
			}
			finally{
				System.out.println("Hey User!! Entered wrong details ");
			}
		}
		}
}

class Bank{
	void init(){
		ATM a1=new ATM();
		try{
			a1.input();
		    a1.validation();
		}
		catch(Exception e1){
			try{
				a1.input();
				a1.validation();
			}
			catch(Exception e2){
				try{
					a1.input();
			       	a1.validation();
				}
					catch(Exception e3){
						System.out.println("Card Blocked!! Please contact the Nearest Bank");
					}
			}
			
		}
		
		
	}
}

public class DayElevenExceptionsCustom02{
	public  static void main(String[] args){
		Bank b1=new Bank();
		b1.init();
	}
}
=======
// To use the CustomException we need to override the custom getMessage() method,
// Along with the Exception we need to extends the Exception class...
// After throwing the Exception we need to handle with the try catch



import java.util.Scanner;


class InvalidUserException extends Exception{
	@Override
	public String getMessage(){
		return"Invalid Card Details Try Again!";
	}
	
}


class ATM{
	int accNum=1234;
	String pwd="ABCD";
	int ac;
	String p;
	
	void input(){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Account Number..");
		 ac=scan.nextInt();
		 scan.nextLine();
		System.out.println("Enter the Password..");
		 p=scan.nextLine();		
	}
	void validation() throws InvalidUserException {
		if(ac==accNum && p.equals(pwd)){
			System.out.println("hey User!! Enterd Correct Details...Please collect the Money");
		}
		else{
			try{
			InvalidUserException iue=new InvalidUserException();
			System.out.println(iue.getMessage());
			throw iue;
			}
			finally{
				System.out.println("Hey User!! Entered wrong details ");
			}
		}
		}
}

class Bank{
	void init(){
		ATM a1=new ATM();
		try{
			a1.input();
		    a1.validation();
		}
		catch(Exception e1){
			try{
				a1.input();
				a1.validation();
			}
			catch(Exception e2){
				try{
					a1.input();
			       	a1.validation();
				}
					catch(Exception e3){
						System.out.println("Card Blocked!! Please contact the Nearest Bank");
					}
			}
			
		}
		
		
	}
}

public class DayElevenExceptionsCustom02{
	public  static void main(String[] args){
		Bank b1=new Bank();
		b1.init();
	}
}
>>>>>>> c8e296b81ff23e9186dd3b26826c22fa73d7a054
