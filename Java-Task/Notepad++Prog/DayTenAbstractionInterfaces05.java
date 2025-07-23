


// abstract class Empolyee{
	// public  int id;
	// public String Name;
	// abstract void calculateSalary();
// }
// class FullTimeEmployee extends  Empolyee{
	// public String Name="Sheshu";
	// public int id=1122;
	
	// public void calculateSalary(){
		// System.out.println(id+":Id of the fulltimeEmployee");
	    // System.out.println(Name+":the Employee worked on the 8 hrs");
		// System.out.println("The salary of the employee is 20000");
		// }
	
// }
// class partTimeEmployee extends  Empolyee{
	// public String Name="Sheshu";
	// public int id=1122;
	// public void calculateSalary(){
		
	    // System.out.println("partTime employee Id was the:"+id);
	    // System.out.println("partTime employee worked on the 5hrs:"+Name);
		// System.out.println("The salary of the employee is 10000");
		// }
	
	
	
// }







// public class DayTen05{
	// public static void main(String[] args){
		// FullTimeEmployee f1=new FullTimeEmployee();
	    // f1.calculateSalary();
	
		// partTimeEmployee p1=new partTimeEmployee();
		// p1.calculateSalary();
		
	// }
// }


interface Flyable{
	void fly();
	
}
interface Swimmable{
	 void swim();
}

class Duck implements Flyable,Swimmable{
	@Override
	public void fly(){
		System.out.println("An Duck can fly...");
	}
	@Override
	public void swim(){
		System.out.println("An Duck can Swim...");
	}
	
}
class Airplane implements Flyable{
	@Override
	public void fly(){
	System.out.println("An Airplane can only fly..");
	}
	
}
class Fish implements Swimmable{
	@Override
	public void swim(){
	System.out.println("An Fish can swim...");
	}

}
public class DayTen05{
	public static void main(String[] args){
		Duck d1=new Duck();
		d1.fly();
		d1.swim();
		
		Airplane a1=new Airplane();
		a1.fly();
		
		Fish f1=new Fish();
		f1.swim();
		
		
	}
}