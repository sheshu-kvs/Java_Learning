class Vehicle{
	public String Made="Chennai";
	public String model="Generic Model";
	public int year=2023;
	

}
class Car extends Vehicle{

   public String model="Fortuner0123";
   public int year=2024;
   public String CarName="Fortuner";
  
	
	void displayCarproperties(){
		System.out.println("The Car  Details was:");
		System.out.println("The Car Made in:"+super.Made);
		System.out.println("The Vehicle Model Was:"+super.model);
		// Using the Super keyword we can access the properties in the super class
		System.out.println("The Car Model Was:"+model);
		System.out.println("In the Car Body was Built in the :"+year);
		// System.out.println("The Car Name Was the"+CarName);
	}
}
class Motorcycle extends Vehicle{
	
	public String model="Splendor125cc";
	public String color="blue-slash-black";
	
	void displayMotorCycleproperties(){
		System.out.println("The Motorcycle Details:");
		System.out.println("The Motorcycle was Made in"+super.Made);
		System.out.println("The Vehicle  was Made in"+super.model);
		System.out.println("the  bike model was the"+model);
		System.out.println("in the year it was built"+year);
		System.out.println("The bike color was the "+color);
	}
	


}




public class DayTenInheritance02{
	public static void main(String[] args){
		 Vehicle v1=new Vehicle();
		 // System.out.println("The Vehicle model was the:"+v1.model);
		 Car c=new Car();
		
	      // cv1.displayCarproperties();
		 v1=c;
		 ((Car)v1).displayCarproperties();
		 
		 Motorcycle m1=new Motorcycle();
		 v1=m1;
		 ((Motorcycle)v1).displayMotorCycleproperties();
		
		 
	}
}