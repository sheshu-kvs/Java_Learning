
import java.util.Scanner;

public class DayThree01 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the First Number.");
        int num1 = scan.nextInt();
        System.out.println("Enter the Second Number.");
        int num2 = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter the Operator you want(add,diff,mul,div)");
        String oper = scan.nextLine().toLowerCase();

        switch (oper) {
            case "add":
                add1(num1, num2);
                break;
            case "diff":
                diff(num1, num2);
                break;
            case "mul":
                mul(num1, num2);
                break;
            case "div":
                if (num2 != 0) {
                    div(num1, num2);
                } else {
                    System.out.println("The Number is Not divided by zero");
                }
                break;

            default:
                System.out.println("Please enter the valid Input");
        }

        // if (oper == '+') {
        //     add1(num1, num2);
        // } else if (oper == '-') {
        //     diff(num1, num2);
        // } else if (oper == '*') {
        //     mul(num1, num2);
        // } else if (oper == '/') {
        //     div(num1, num2);
        // } else {
        //     System.out.println("Invalid Operator..Pleas enter the Valid operator");
        // }
    }

    public static void add1(int num1, int num2) {
        System.out.println("Added from the two numbers:" + (num1 + num2));
    }

    public static void diff(int num1, int num2) {
        System.out.println("substraction from the two numbers:" + (num1 - num2));
    }

    public static void mul(int num1, int num2) {
        System.out.println("Multiplication from the two numbers:" + (num1 * num2));
    }

    public static void div(int num1, int num2) {
        System.out.println("Division from the two numbers:" + (num1 / num2));
    }
}
