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
    public static void main(String[] args) {
        
        // employee e1=new employee(9,"Alex", 290342f);
        // e1=new employee(10,"james", 290342f);
        // e1=new employee(11,"Gosling", 290342f);


        Scanner scan=new Scanner(System.in);
        // int num=scan.nextInt();
        employee []e=new employee[5];
        ArrayList<employee> e1=new ArrayList<>();
        System.out.println(e1.size());
        // for(int i=0;i<e.length;i++){
            System.out.println("Enter the EId");                    
            int Id=scan.nextInt();
            System.out.println("Enter the EmpName");
            String EmpName=scan.next();
            System.out.println("Enter the EmpSalary..");
            float salary=scan.nextInt();
            // e[0]=new employee(Id, EmpName, salary);
            e1.add(new employee(Id, EmpName, salary));
            
        // }

        for(employee a2:e1){
            System.out.println(a2);
        }
       
        
    }
    
}
