
import java.util.Scanner;

public class scannerExample {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Name:");
        String Name = scan.nextLine();
        System.out.println("Enter the Age:");
        int age = scan.nextInt();
        System.out.println("\n Name :" + Name + " " + "\n and the Age is:" + age);
        scan.close();
        // if we not close the scanner means resource leak will happen.. waste of the memory
    }
}
