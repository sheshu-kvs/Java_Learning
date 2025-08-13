
import java.util.*;

class Person{
  
    private int id;
    private String name;
    private String phno;
    private String email;

   public Person(){

   }
    public Person(int id,String name,String phno,String email){
        this.id=id;
        this.name=name;
        this.phno=phno;
        this.email=email;

    }

 
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getPhNo(){
        return phno;
    }
    public String getEmail(){
        return email;
    }

 


    public void setName(String name){
        this.name=name;
    }

     public void setPhNo(String phno){
        this.phno=phno;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public String toString(){
       return"Employee Details[Id:"+id+ " Name:"+name+ " PhNo:"+phno+ " email:"+email+"]";
    }
}
public class CrudCmd123 {



    private static ArrayList<Person> person1213=new ArrayList<>();
 
    private static Scanner scan=new Scanner(System.in);


    public static void main(String[] args) {
        // String defaultItems[]=null;

    // for(String val:defaultItems){
    //    System.out.println("\nEmployee Details In the Emloyee Database");
    //    int id,String name,String phno,String email
    person1213.add(new Person(1, "alex", "8978211926", "alex@gmail.com"));
    person1213.add(new Person(2, "Elon", "9008532514", "elon@gmail.com"));
    person1213.add(new Person(3, "elex", "9878211926", "elex@gmail.com"));
    person1213.add(new Person(4, "xavier", "8978211926", "xavier@gmail.com"));
        // person1213.add(new person(1, "Alex", "8978211926"));
        // person1213.add(new person(2, "Elon", "9008532514", "Elon@gmail.com"));
        // person1213.add(new person(3, "Tim", "7204375248", "Tim@gmail.com"));
   
        // // // System.out.println(person1213.size());
        // for(person val:person1213){
        //     System.out.println(val);
        // }
    // }

    if(person1213.size()<=0){
        System.out.println("Hello Welcome Employee Database!!");
        System.out.println("Hello Employee there is no Employees Present in the Employee Database, please add the Employee Detials");
        System.out.println("Please select the option");
        System.out.println("1 Add Employee!!");
           System.out.println("2 Exit!!");
        String expression=scan.next();
        switch(expression){
            case"1":
            addEmployee();
            break;
            case"2":
            System.out.println("Adding the Employee Database is Completed! TQ!!");
            return;
            default:
            System.out.println("Hey Employee selected the Wrong Option..");
        }
    }
    

      boolean running=true;
      while(running){
        System.out.println("\nWelcome to the Employee DataBase!!");
        System.out.println("1 add Employee");
        System.out.println("2 Update Employee");
        System.out.println("3 See all employee");
        System.out.println("4 Delete one employee using the Id");
        System.out.println("5 See the one Employee");
        System.out.println("6 delete all the  Employee");
        System.out.println("7 Exit");
        String expre= scan.next();
    
        switch(expre){
            case "1":
            System.out.println("Please add the Employee Details:");
            addEmployee();
            break;

            case "2":
            System.out.println("Please Update the Employee you want:");
            updateEmployee();
            break;

            case "3":
            System.out.println("Please see all the Employess..");
            seeallEmployee();
            break;

            case "4":
            // System.out.println("Hey Delete One Employee using the Id");
                System.out.println("Before  deletion of all the employes.Select Which Employee You Want Delete!!");
                 for(int i=0;i<person1213.size();i++){
                System.out.println("Employee Details:"+person1213.get(i));
                } 
                deleteOneEmployee();
            // System.out.println("Afer  deletion of all the employes");
            //  for(int i=0;i<person1213.size();i++){
            // System.out.println("Employee Details:"+person1213.get(i));
            //   } 
            break;

            case "5":
            System.out.println("See the One Employee");
            seeOneEmployee();
            break;

            case "6":
            System.out.println("Delete all the Employess");
            deleteAllEmployee();
            System.out.println("All Employees Deleted Successfully!!");
            break;

            case "7":
            System.out.println("Exiting the Employee Database!!");
            running=false;
            break;

            default:
            System.out.println("Invalid Please select the Valid Option..");

        }
        }
    }
  

    public static boolean validatePhone(String phno){
        if(phno==null){
            return false;
        }
       if(phno.length()!=10){
        return false;
       }
       char ch=phno.charAt(0);
       if(ch!='6'&& ch!='7' && ch!='8' && ch!='9'){
        return false;
       }
       return true;
    }

    public static boolean validateEmail(String email){
        for(char a1:email.toCharArray())
        {
            
            if(!Character.isLetterOrDigit(a1) &&(email.contains("@")&&(email.contains(".")))){
                return true;
            }
            
        }

        return false;
   
    }
    

    public static void addEmployee(){
            boolean running=false;
        //    do{
             System.out.println("Enter the Id:");
            int id=scan.nextInt();
             for(Person p234:person1213){
             if(p234.getId()==id){
                System.out.println("Already Exists");
                return;
               }
             }
           

             System.out.println("Enter the Name:");
             String name=scan.next();
            
           String phno;
            do{
            System.out.println("Enter the PhoneNumber:");
             phno=scan.next();
            if(!validatePhone(phno)){
                System.out.println("Hey Employee Please enter the Valid PhoneNumber..");
                System.out.println("Please follow the Format..");
                System.out.println("Number start from the 6, 7, 8, 9. and  It Should 10 Digits..");
            }
             }while(!validatePhone(phno));


            String email;
            do{
                System.out.println("Enter the Email:");
                email=scan.next();
                if(!validateEmail(email)){
                    System.out.println("Hey User Enterd the Wrong Mail Can Check the Format");
                    System.out.println("@ Or . Should be There in Email.");
                }

            }while(!validateEmail(email));


            person1213.add(new Person(id, name, phno, email));
            



        
           

            System.out.println("*******************************");
            System.out.println("Added Successfully Employees:");
            for(int i=0;i<person1213.size();i++){
            System.out.println(person1213.get(i).getName());
            }
           
            

        }

    public static void updateEmployee(){
       System.out.println("Please Enter the Id want To Update..");
        int updateId=scan.nextInt();
        boolean found=false;
       for(int i=0;i<person1213.size();i++){
        if(person1213.get(i).getId()==updateId){
            found=true;
            System.out.println("Hlo!! Employee what you want to update");
            System.out.println("1 Name");
            System.out.println("2 Phone Number");
            System.out.println("3 Email");
            char expr=scan.next().charAt(0);
            switch(expr){
                case '1':
                System.out.println("Enter the updated Employee Name:");
                String nam=scan.next();
                person1213.get(i).setName(nam);
                System.out.println("The Updated Employee Name:");
                System.out.println(person1213.get(i));
                break;
                case '2':
                System.out.println("Enter the Phone Number You want to Update..");
                String ph=scan.next();
                person1213.get(i).setPhNo(ph);
                System.out.println("The Updated Phone Number:");
               System.out.println(person1213.get(i));
                break;
                case '3':
                System.out.println("Enter the Email You want to Update..");
                String email=scan.next();
                person1213.get(i).setEmail(email);
                System.out.println("The Updated Email");
                System.out.println(person1213.get(i));
                break;
                default:
                System.out.println("InValid ,Please enter the Valid Information..");


            }

        }
     }
      if(!found){
            System.out.println("Entered Id is Not There"+updateId);
        }

    }

    public static void seeallEmployee(){
        boolean found=false;
        
        for(int i=0;i<person1213.size();i++){
            found=true;
            System.out.println(person1213.get(i));
        }
        if(!found){
            System.out.println("Hey Employee There is No employees are there!!");
        }
    }

    public static void  deleteOneEmployee(){
         boolean found=false;
       
        System.out.println("Hey Employee Please Enter the Id Want to delete..");
        int deletedId=scan.nextInt();
        System.out.println("Are You sure You Want to delete the Employee(Yes/No)");
        String exp=scan.next();
        switch(exp){
            case"Yes":
                   Iterator<Person> personIterator=person1213.iterator();
                   while(personIterator.hasNext()){
                   Person p1=personIterator.next();
                   if(p1.getId()==deletedId){
                           found=true;                
                        personIterator.remove();
                       break;
                     }
                   }
        
                   if(!found){
                       System.out.println("Hey Employee the Id Was not Present..");
                        return;
                           }
                        System.out.println("Afer  deletion of all the employes");
                         for(int i=0;i<person1213.size();i++){
                        System.out.println("Employee Details:"+person1213.get(i));
                         }  
                       System.out.println("Hey Employee Enterd Employee Id Succesfully Deleted!!");
                     break;
        case "No":
        System.out.println("You Clicked the No Option..");
        break;
        default:
        System.out.println("Invalid Option Please Select the Valid!!");
        }
        
         
           
        }



        public static void deleteAllEmployee(){
            // for(int i=0;i<person1213.size();i++){
                person1213.clear();
            // }
        }
        public static void seeOneEmployee(){
            System.out.println("Hey! Employee please enter the id want to see");
            int Enterdid=scan.nextInt();
            boolean found=false;
            for(int i=0;i<person1213.size();i++){
                if(person1213.get(i).getId()==Enterdid){
                    found=true;
                    System.out.println(person1213.get(i));
                }
            }
            if(!found){
                System.out.println("Hey User Enterd Id is Not Present"+Enterdid);
            }

        }
    }

    
    








