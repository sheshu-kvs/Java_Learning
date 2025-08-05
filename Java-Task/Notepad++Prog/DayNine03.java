/*- Classes and Objects
Class :A class is the blueprint of the object.
>An class has the variables,methods,constructors
Object: An object is the instance of the class.
>the world is the collection of the object.
>Every object is the Category or Type.
>Every object has the properties and the Behaviours..

**/
// class Bank{
	
	// public static int accNum=129033;
	// public String Name;
	
	
	// public void disp(int accNum,String Name){
		// System.out.println("The Account Number is the:"+accNum);
		// System.out.println("The Name of the Bank is the:"+Name);
	// }
	
// }
// public class DayNine03{
// public static void main(String[] args){
	// Bank b1=new Bank();
	// b1.disp(12344,"SBI");
	// System.out.println(Bank.accNum);
// }
// }
/*Static::
An Static is the without creating the objects we can call the  methods, and the variables.
An static block are used to execute the Before the Main Method  
*/

// public class DayNine03{
	
	  // static int LuckNum=1293495;
	
	// static{
		// System.out.println("First Static block..2");
		// System.out.println("Inside the static block we are useing the static variable"+LuckNum);
	    // LuckNum=999999;
	// }
	// static {
		// System.out.println("Second static Block...2");
		// System.out.println("using the First static block variable"+LuckNum);
	// }
// public static void main(String[] args){
	
	// System.out.println("Main Methd");
	// System.out.println("Static blocks"+LuckNum);
	// in this we are executed the without creating the class object we are calling the methods and the variables
	
	   
	// }
// }

/*Constructor :
An Constructor by default it is a setter method is the Same Name as the Class Name..
An Constructor does not have the return Type..

two Constructor
default constructor :A constructor without any Parameters ,in java by default constructor will be there.
Parameterized Constructor:An Constructor has the  parameters. is called has the parameterized constructor..


this keyword are used to the current instance of the object ,also to differentiate between the Local Variables
and the Instance  Variables..

*/
class Person{
	private int Id;
	private String Name;
	private String Address;
	
	
	public Person(int Id,String Name,String Address){
		this.Id=Id;
		this.Name=Name;
		this.Address=Address;
	}
	public int getId(){
		return Id;
	}
	public String getName(){
		return Name;
	}
	public String getAddress(){
		return Address;
	}
	
	
	public String toString(){
	return "Id:"+getId()+"Name:"+getName()+"Address:"+getAddress();
	}
	

// }



public class DayNine03{
public static void main(String[] args){
	Person p1=new Person(10,"Ferin Floria","Dellis");
	System.out.println(p1);

}
}


/*Inhertency : an Inhertency is the accquring the properties from the one class to the another class.
there are 6 Types of the Inheritency
>Single level Inhertency.
>Multilevel Inheritency.
>Multiple Inheritency.
>Hybrid Inheritency.
>Hierarchical Inheritency.
>Cyclic Inheritency.

But Java Supports the 4 :Single Level,MultiLevel,Hybrid,Hierarchical..

Single Level:An Single level inhertency there is only one parent class and the one child class.

Multilevel:An Multilevel is the one class is inherited from the another class that class is inherited from the other.. 

Multiple Inheritency: an Multiple inhertency is not supported because one child class cannot inherit from the Two parent 
class.

Hybrid:An Hybrid is the combination of the Hiearchical , Single Inhertency.

Cyclic Inhertency:An one Class is the cannot inherit from the other class.


Single Level Inhertency:
An Sigle level in


*/


class A{
	
	void disp(){
	System.out.println("A Class is displaying..");
	}
}
class B extends A{
	
	void show(){
	System.out.println("B class is displaying..");
	}
	
}
class C extends A{
	void cdisp(){
	System.out.println("C Class is diplaying..");
	}
}
class D extends B{
	void ddisp(){
	System.out.println("D is displaying...");
	}
}




public class DayNine03{
public static void main(String[] args){
    D b1=new D();
	b1.disp();
	b1.show();
	
	b1.ddisp();
}
}


/*Inheritency methods:
>Inherited method.
>Overriding method.
>Specialized method.
An Inherited methods is the where child class is inherited from the parent class to the subclass..
An Overriding method is the where child class is inherited from the parent class to sub class changing the method body is known as the Method Overriding
An Specialized method is the where child class is only having parent class is not having..
 */
 
 /* Method Overriding  */
 class A{
	 void disp(){
		 System.out.println("Class A is Displaying...");
	 }
 }
 class B extends A{
  void disp(){
		 System.out.println("Class B is Displaying...")	;
	 }
	void show(){
	System.out.println("Class B Specialized method..");
	
	}
 
 }
public class DayNine03{
public static void main(String[] args){
	B b1=new B();
	b1.disp();
	b1.show();
}
}


class Plane{
	void takeoff(){
	System.out.println("A normal Plane can Take off");
	}

	void fly(){
		System.out.println("A Normal Plane can Fly...");
	}
	void land(){
		System.out.println("A normal Plane can land");
}
}
class CargoPlane extends Plane{
	
	void takeoff(){
	System.out.println("A Cargo Plane can Take off");
	}

	void fly(){
		System.out.println("A Cargo Plane can Fly...");
	}
	
	void land(){
		System.out.println("A CargoPlane can land");
}
}
class FighterPlane extends Plane{
	
	void takeoff(){
	System.out.println("A Fighter  Plane can Take off");
	}

	void fly(){
		System.out.println("A Fighter  Plane can Fly..");
	}
	
	void land(){
		System.out.println("A  Fighter  Plane can land");
   }
	void special(){
		System.out.println("This is the specialized method of the FighterPlane...");
	}
}
class Airport{
	void show(Plane p){
		p.takeoff();
		p.fly();
		p.land();
	}
	}






public  class DayNine03{
public static void main(String[] args){
	Plane p;
	FighterPlane fp =new FighterPlane();
	CargoPlane cp=new CargoPlane();
	
	Airport a=new Airport();
	a.show(fp);
	a.show(cp);
	
	p=cp;
	p.takeoff();
	p.fly();
	p.land();
	p=fp;
	p.takeoff();
	p.fly();
	p.land();
   
   
   
	}
}


/*Abstraction :
An abstraction is the hiding the implementation details showing only the essential information to the user
>An abstract class have the normal methods and the abstract methods..
>in a class if the methods are abstract we need to declare the abstract keyword to the class.
>a Normal class can extend the abstract class.
>an abstract class can extend the normal class.
*/


class Bird{
	abstract void fly();
}	
public  class DayNine03{
public static void main(String[] args){
}
}

class Bird{
	abstract void fly();
}	
public  class DayNine03{
public static void main(String[] args){
}
}
