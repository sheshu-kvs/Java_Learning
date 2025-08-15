// here we are using the single run method calling the Multiple instructions..

import java.util.Scanner;

class MultiTask extends Thread{
    
    
    public void run(){
        Thread t=Thread.currentThread();
        // System.out.println(t.getName());
        String name=t.getName();
        if(name.equals("add")){
            add();
        }
        else if(name.equals("Char")){
            Char();
        }
        else if(name.equals("Num")){
            Num();
        }
    }

    public void add(){
         Scanner scan=new Scanner(System.in);
        System.out.println("Adding the Two Numbers Started..");
        System.out.println("Enter the First Number1:");
        int a=scan.nextInt();
        System.out.println("Enter the Second Number2:");
        int b=scan.nextInt();

        System.out.println("Addition of the Two Numbers:"+(a+b));
    }
    public void Char(){
        System.out.println("Printting the Characters to be Started..");
        for(int i=65;i<75;i++){
            System.out.println((char)i);
            try {
                Thread.sleep(3000);
            } catch (Exception e) {
             e.printStackTrace();
                        
            }

        }
    }

    public void Num(){
        System.out.println("Printing the Numbers Started...");
        for(int i=0;i<10;i++){
            System.out.println(i);
            try {
                Thread.sleep(3000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}


public class Multi05 {
    
public static void main(String[] args) {
    MultiTask m1=new MultiTask();
    MultiTask m2=new MultiTask();
    MultiTask m3=new MultiTask();


    m1.setName("add");
    m2.setName("Char");
    m3.setName("Num");

    m1.start();
    m2.start();
    m3.start();
    
}    
}
