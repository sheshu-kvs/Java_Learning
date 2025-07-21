// Encapsulation: An Encapsulation is the one of the pillar of the OOP's Concept. Each and Every Object Was very important part That is the data.
// To provide the data to the security we are using the Private Keyword , to caontrolled access through the setters and the getters.

import java.util.*;
class Student{
	private int id;
	private String Name;
	private String Address;
	
	
	public void setId(int id){
		this.id=id;
	}
    public void setName(String Name){
	this.Name=Name;
	}
	public void setAddress(String Address){
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
	

}

public class DayNine02{
public static void main(String[] args){
	Scanner scan=new Scanner(System.in);

	// s1.setId(1);
	// s1.setName("Alex");
	// s1.setAddress("Dellas");
	
	// System.out.println(s1.getId());
	// System.out.println(s1.getName());
	// System.out.println(s1.getAddress
	
	// Student s1=new Student();
	System.out.println("Enter the Number of the Students:");
	int n=scan.nextInt();
	Student s1[]=new Student[n];
	
	for(int i=0;i<n;i++){
	s1[i]=new Student();
	System.out.println("Enter the Id Of the Student");
	int id=scan.nextInt();
	scan.nextLine();
	System.out.println("Enter the Name of the Student:");
	String Name=scan.nextLine();
	System.out.println("Enter the Address of the Student");
	String Address=scan.nextLine();
	
	
	s1[i].setId(id);
	s1[i].setName(Name);
	s1[i].setAddress(Address);
	}
	
	for(int i=0;i<n;i++){
		System.out.println("ID:"+s1[i].getId());
		System.out.println("Name:"+s1[i].getName());
		System.out.println("Address:"+s1[i].getAddress());
	}
	
	
	




}
}