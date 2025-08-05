

import java.util.Scanner;
public class addition{
public static void main(String[] args){
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the Options");
	System.out.println("Add sub mul div");
    String expre=scan.nextLine().toLowerCase();
	System.out.println("Enter the A Value..");
	int a=scan.nextInt();
	System.out.println("Enter the B Value..");
	int b=scan.nextInt();
	// if(expre.equals(Add)){
		// System.out.println(a+b);
	// }
	// else{
		// System.out.println("Please enter the valid i/p");
		// }
	
	
	switch(expre){
		case "add":
		System.out.println(a+b);
		break;
		case "sub":
		System.out.println(a-b);
		break;
		case "mul":
		System.out.println(a*b);
		break;
		case "div":
		System.out.println(a/b);
		break;
		default:
		System.out.println("Please enter the valid input");
	
	}
    


}
}