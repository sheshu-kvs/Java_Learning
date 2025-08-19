package JavaCoding;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Emp{
    private int id;
    private String name;
    private String role;
    private String email;
    private String phone;
    private double salary;

   


    
    public Emp(int id, String name, String role, String email, String phone, double salary) {
        this.id = id;
        this.name = name;
        this.role = role;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
    }


  public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }





    public void setName(String name) {
        this.name = name;
    }





    public String getRole() {
        return role;
    }





    public void setRole(String role) {
        this.role = role;
    }





    public String getEmail() {
        return email;
    }





    public void setEmail(String email) {
        this.email = email;
    }





    public String getPhone() {
        return phone;
    }





    public void setPhone(String phone) {
        this.phone = phone;
    }





    public double getSalary() {
        return salary;
    }





    public void setSalary(double salary) {
        this.salary = salary;
    }


    @Override
    public String toString() {
        return "Emp [id=" + id + ", name=" + name + ", role=" + role + ", email=" + email + ", phone=" + phone
                + ", salary=" + salary + "]";
    }

    


}


public class CmdBasedCrud{
     private static Map<Integer,Emp> hashmap=new HashMap<>();
     private static Scanner scan=new Scanner(System.in);
     private static int increm=1;
    public static void main(String[] args) {
        // ===Adding the Employee Details===
        // int IDIN=GenerateID(increm);
        hashmap.put(increm,new Emp(increm++, "Tim", "CEO", "tim@gmail.com", "7204375248", 45002.34));
        hashmap.put(increm,new Emp(increm++, "Zeniva", "HR", "zeniva@gmail.com", "6303365716", 35002.34));
        hashmap.put(increm,new Emp(increm++, "Tema", "IT", "tema@gmail.com", "65123456891", 39000.34));
        hashmap.put(increm,new Emp(increm++, "Daya", "BDE", "daya@gmail.com", "7802458599", 23000.34));
        hashmap.put(increm,new Emp(increm++, "tels", "CEO", "tels@gmail.com", "6523249505", 54002.34));
        hashmap.put(increm,new Emp(increm++, "dele", "CEO", "dele@gmail.com", "6300365912", 45002.34));
        hashmap.put(increm,new Emp(increm++, "Cook", "HR", "cook@gmail.com", "7304351281", 54002.34));
       
            System.out.println("******Welcome to the Employee DataBase*****");
                String t="""
                        For adding the values::
                        ->add "Name" "Role" "tim@gmail.com" "9192929229" 490000.023

                        For Update the Values::
                        ->update 1 salary 9000.23

                        For Delete Values::
                        ->delete 1

                        For list of the Values::
                        ->list
                        """;
                        System.out.println(t);
            //  System.out.println("----Help-----");
            // String expr=scan.next().toLowerCase();
            // switch(expr){
            //     case"help":
            //     System.out.println("Hlo welcome to the Employee Database!!");
            //     String t="""
            //             For adding the values::
            //             ->add "Alex" "IT" "tim@gmail.com" "9192929229" 490000.023
            //             For Update the Values::
            //             ->update 1 salary 9000.23
            //             For Delete Values::
            //             ->delete 1
            //             For list of the Values::
            //             ->list
            //             """;
            //             System.out.println(t);
            //             break;
            //             default:
            //             System.out.println("Please Enter the Valid Format!!");
            // }




        boolean running=true;

        while(running){

        System.out.print(">");
    
        String s1=scan.nextLine().trim();
        String[] comand=s1.split(" ");
        switch(comand[0].toLowerCase()){
            case"add":
             if(comand.length < 6){
            System.out.println("Hey user Please Enter the Valid format..");
            System.out.println("For Example..");
            String text="""
                    add "Alex" "IT" "tim@gmail.com" "9192929229" 490000.023
                    """;
            System.out.println(text);
            break;
            
            }
            // if(comand.length==4){
            String name=comand[1].replace("\"", "");
            String role=comand[2].replace("\"", "");
            // String email=comand[3].replace("\"","");
            String email;
            do{
                email=comand[3].replace("\"","");
                if(!validEmail(email)){
                    System.out.println("Hey user enter the Valid Email");
                    System.out.println("It Should contains the @ or .");
                    System.out.println("Enter the email");
                    email=scan.nextLine().replace("\"","");
                    comand[3]=email;
                }

            }while(!validEmail(email));
            // String phone=comand[4].replace("\"","");
            String phone ;
            // validatephone(phone);

               do { 
                 phone=comand[4].replace("\"","");
                if(!validatephone(phone)){
                System.out.println("Please enter the Valid Format..");
                System.out.println("The Phone Number Must Start From..");
                System.out.println("6,7,8,9");
                System.out.println("Enter the Phone Again..");
                 phone=scan.nextLine().replace("\"", "");
                 comand[4]=phone;
                }
            }while(!validatephone(phone));
           
           
            double sal=Double.parseDouble(comand[5]);
            addEmp(increm,name,role,email,phone,sal);
            System.out.println("Added Succfully");
            for(Emp l1:hashmap.values()){
            System.out.println(l1);
             }
            // }
            break;
        case"list":
        listEmp();
        break;
        case"update":
        if(comand.length<4){
            System.out.println("Hey Employee Enter the Valid format..");
            String text="""
                    update 1 salary 9000.23
                    """;
                    System.out.println(text);
                    break;
        }
        int updatedId=Integer.parseInt(comand[1]);  //id 
        String  filed=comand[2].toLowerCase();  //field(salary)8500
        String val=comand[3];  //new Val

        updateEmp(updatedId,filed,val);

        break;
        case"delete":
        int deletedId=Integer.parseInt(comand[1]);
        deleteEmp(deletedId);
        break;
        default:
        System.out.println("Invalid Credentials");
        }

        }


        
    }
    private static void updateEmp(int updatedId, String filed, String val) {
        Emp e1=hashmap.get(updatedId);
        if(hashmap.containsKey(updatedId)){
        switch(filed.toLowerCase()){
            case"name":
            e1.setName(val);
            break;
            case"role":
            e1.setRole(val);
            break;
            case"salary":
            e1.setSalary(Double.parseDouble(val));
            break;
        }
    }
    else{
        System.out.println("Hey Employee Entered Id "+updatedId+" is not present");
    }
    }
   
    private static void deleteEmp(int deletedId) {
        boolean found=false;
        // if(hashmap.get(deletedId).getId())
        // for(int i=0;i<hashmap.size();i++){
        //     Emp inp=hashmap.get(deletedId);
        //     if(inp.getId()==deletedId){
        //         found =true;
        //         hashmap.remove(deletedId);
        //     }
        // }
        if(hashmap.containsKey(deletedId)){
            found=true;
            hashmap.remove(deletedId);
             System.out.println("Hi Employee "+deletedId+" Succesfully deleted");
        }
        else{
            System.out.println("Entered Id is the Not present in the Employee DB.."+deletedId);
        }
       
        // if(!found){
        //     System.out.println("Hey Employee Entered Id is not Found.."+deletedId);
        // }
        }
    
    private static void listEmp() {
        for(Emp l1:hashmap.values()){
            System.out.println(l1);
        }
    }
    private static int addEmp(int id, String name, String role,String email,String phone, double sal) {
      

        hashmap.put(increm,new Emp(id, name, role, email, phone, sal));
        return increm++;
        
    }

    public static boolean validatephone(String phone){
        if(phone.length()!=10){
          return false;
        }
        for(int i=0;i<phone.length();i++){
            char ch=phone.charAt(0);
            if(ch ==6 || ch ==7 || ch ==8 || ch ==9){
             return false;                
            }
        }
       return true;        
    }

    public static boolean validEmail(String email){
        if(!email.contains(".")){
            return false;
        }
        if(!email.contains("@")){
            return false;
        }
        return true;
    }

    public static int GenerateID(int id123){
        return id123++;
    }

}