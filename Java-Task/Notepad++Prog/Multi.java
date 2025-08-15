/* ====MultiThreading=====
 * The process of the executing the program independtly..
 * Thread: A set of the Instructions which are executing indedpendtly(A set of the 
 * Instructions which are excuting the Independtly)...
 * Mutithreading : An Mt is the process of the excuting the Multiple threads indenpendtly.. 
 */

import java.util.Scanner;

class Amy extends Thread {
    public void run(){
        Scanner scan=new Scanner(System.in);


        System.out.println("Enter the Number:");
        int a=scan.nextInt();
        System.out.println("Enter the Second Number:");
        int b=scan.nextInt();
        System.out.println("The Sum of the Two Numbers:"+(a+b));
 }
}
class zemin extends Thread{
  public void run(){
       System.out.println("Printing the Numbers:");
     Scanner scan=new Scanner(System.in);
        for(int i=0;i<10;i++){
            System.out.println(i);
            try{
                Thread.sleep(2000);
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
  }

}


class vilma extends Thread{
    public void run(){
     Scanner scan=new Scanner(System.in);
         System.out.println("Printing the Characters..");
        for(int i=97;i<120;i++){
            System.out.println((char)i);
            try{
            Thread.sleep(2000);
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
       
    }
}

public class Multi {
    public static void main(String[] args) {
        Amy a1=new Amy();
       vilma v1=new vilma();
       zemin z1=new zemin();

       a1.start();
       v1.start();
       z1.start();



        
    }  
}
