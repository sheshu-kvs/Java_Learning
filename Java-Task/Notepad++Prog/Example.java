import java.util.*;
class person{
    private int id;
    private String name;
    private String phno;
    private String email;
    public person(int id,String name,String phno,String email){
        this.id=id;
        this.name=name;
        this.email=email;
        this.phno=phno;

    }
   
    public int getId(){
        return id;
    }
    public String getName(){
        return name;

    }
    public String getEmail(){
        return email;
    }
    public String getPhone(){
        return phno;
    }


    public String toString(){
        return "Id"+id+"Name:"+name+"Phone Number"+phno+"Email"+email;
    }
}
public class Example {
    private static Scanner scan=new Scanner(System.in);
     private static   ArrayList<person> p11=new ArrayList<>();
    public static void main(String[] args) {
        p11.add(new person(1, "Alex", "Alex@gmail.com"));
        p11.add(new person(2, "Elon", "Elon@gmail.com"));
        p11.add(new person(3, "Tim", "Tim@gmail.com"));

       for(person p12:p11){
        System.out.println(p12);
       }
         add();
        
    }
    private static void add(){
         System.out.println("Enter the Id");
        int id=scan.nextInt();
        for(person p234:p11){
            if(p234.getId()==id){
                System.out.println("Already Exists");
            }
        }
    }
    
}
