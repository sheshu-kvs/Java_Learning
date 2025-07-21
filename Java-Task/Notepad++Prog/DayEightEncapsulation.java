


//Encapsulation:Each and every object was very  important part that is the data to provide the security to that data using the keyword as the Private.
// and controlled acces through the setters and the getters 


import java.util.Scanner;
class Student{
	private int id;
	private String Name;
	private String Address;
	
	
	public void  setId(int id){
		this.id=id;
	}
	public void setName(String Name){
	this.Name=Name;
	}
	public void  setAddress(String Address){
	this.Address=Address;
	}
	
	public int getId(){
	
	return id;
	}
	public String getName(){
		return Name;
	}
	public String getAddress(){
		return Address;
	}
	
	
	// public toString(){
	// return
	
	// }
}
public class DayEightEncapsulation	{
public static void main(String[] args){
	
	// Student s1=new Student();
	// s1.setId(101);
	// s1.setName("Alex12");
	// s1.setAddress("Mantralayam");
		
	// System.out.println(s1.getId());
	// System.out.println(s1.getName());
	// System.out.println(s1.getAddress());
	
	
	// for the user input
	Scanner scan=new Scanner(System.in);
	
	System.out.println("Enter the Number of the Students::");
	int n = scan.nextInt();
	Student s1[]=new Student[n];
	
	for(int i=0;i<n;i++){
	
	s1[i]=new Student();
	System.out.println("Enter the Id:");
	int id=scan.nextInt();
	System.out.println("Enter  the Name:");
	// scan.nextLine();
	String Name=scan.nextLine();
	System.out.println("Enter the Address");
	String Address=scan.nextLine();
	s1[i].setId(id);
	s1[i].setName(Name);
	s1[i].setAddress(Address);
	}
	for(int i=0;i<n;i++){
	System.out.println("Id:"+s1[i].getId());
	System.out.println("Name:"+s1[i].getName());
	System.out.println("Address:"+s1[i].getAddress());
	}
		
}
	
	
}
	
	
	