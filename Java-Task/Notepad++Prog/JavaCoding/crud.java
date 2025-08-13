package JavaCoding;
import java.util.*;
class employee{
    private int Id;
    private String EmpName;
    private float salary;

  public employee(){

  }
    public employee(int Id,String EmpName,float salary){
        this.Id=Id;
        this.EmpName=EmpName;
        this.salary=salary;
    }
    public void setName(String EmpName){
        this.EmpName=EmpName;
    }
    public void setSalary(float salary){
        this.salary=salary;
    }
    
    public int getId(){
        return Id;
    }
    public String getName(){
        return EmpName;
    }
    public float getSalary(){
        return salary;
    }

    public String toString(){
        return "Id:"+Id+" Employee Name "+EmpName+" Salary "+salary;
    }
}
public class crud {
     private static Scanner scan=new Scanner(System.in);
    //   private static  employee []e1 =new employee[3] ;
    private static ArrayList<employee> e123=new ArrayList<>();
    public static void main(String[] args) {
        
        e123.add(new employee(10, "Elon", 12901));
        e123.add(new employee(11, "bathiya", 29012));
        e123.add(new employee(12, "Miyq", 30901));
        e123.add(new employee(13, "Perin", 4000));
        e123.add(new employee(14, "ZelenSkey", 29012));

       
       
        boolean running=true;
        while(running){
            System.out.println("Hello Welcome to the Employee Database");
            System.out.println("Please Select the Option..");
            System.out.println("1 Add");
            System.out.println("2 See all the Employee");
            System.out.println("3 Delete one Employee");
            System.out.println("4 Update EmpName");
            System.out.println("5 Update EmpSalary");
            System.out.println("6 Exit");
            String expr=scan.next();
            switch(expr){
                case"1":
                addEmp();
                break;
                case"2":
                System.out.println("The List of the Employees in the DataBase..");
                for(int i=0;i<e123.size();i++){
                    System.out.println(e123.get(i));
                }
                break;
                case"3":
                deleteEmp();
                break;
                case"4":
                UpdateEmpName();
                break;
                case"5":
                updateEmpSalary();
                break;
                 case"6":
                System.out.println("you are going the out off the states.");
                running=false;
                break;
                default:
                System.out.println("Please enter the Valid Information..");
            }

        
        }
    }

    private static void updateEmpSalary() {
        boolean found=false;
        System.out.println("Enter the Id want to UpdateSalary");
        int updatedId=scan.nextInt();
        System.out.println("Enter the Salary want to Update...");
        float sal=scan.nextFloat();
        for(int i=0;i<e123.size();i++){
            if(e123.get(i).getId()==updatedId){
                found=true;
                e123.get(i).setSalary(sal);
            }
        }
        if(found){
             System.out.println("After Updating the Salary values to be");
             for(int i=0;i<e123.size();i++){
            System.out.println(e123.get(i));
           }
        }
        else{
              System.out.println("Entered Id was Not Found..");
        }
       

    }

    private static void UpdateEmpName() {
        boolean found=false;
        System.out.println("Enter the Id want to UpdateName");
        int UpdateId=scan.nextInt();
        System.out.println("Enter the Name to Update");
        String UpdatedName=scan.next();
        for(int i=0;i<e123.size();i++){
            if(e123.get(i).getId()==UpdateId){
                found=true;
                e123.get(i).setName(UpdatedName);
            }
        }
    
        if(found){   
            System.out.println("Enterd Name was the Successfully Updated::");
            for(int i=0;i<e123.size();i++){
            System.out.println(e123.get(i));
           }
        }
        else{
           System.out.println("Entered Id was Not Found..");
        }
    }

    private static void addEmp() {
        
             System.out.println("Enter the EId");                    
            int Id=scan.nextInt();
            System.out.println("Enter the EmpName");
            String EmpName=scan.next();
            System.out.println("Enter the EmpSalary..");
            float salary=scan.nextInt();
            // e[0]=new employee(Id, EmpName, salary);
            e123.add(new employee(Id, EmpName, salary));

        }


        public static void deleteEmp(){
            System.out.println("Enter the Id want To Delete");
            int a1=scan.nextInt();
            boolean found=false;
        for(int i=e123.size()-1;i>=0;i--){
            if(e123.get(i).getId()==a1){
                e123.remove(i);
                found=true;
            }
        }
       
        if(found){
            System.out.println("Entered Employee Id was deleted Successfully");
        }
        else{
             System.out.println("Entered Employee Id was Not Found..");
        }
       
        }
       
        }

    
