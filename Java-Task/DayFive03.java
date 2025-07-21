/*An array is the Collection of the homogenous elements in the Java 
 * which means an array is the datastrcture that allows you to the store the multiple values on the single variable
 * with the same data type
 * Disadvantages 
 * an Array can store only the homogenous elements of the data.
 * an arrays cannot grow or shrink in the size
 * There is the one Dimensional Array, and the Two Dimensional Array
 * Regular Array: an array it is the equal Number of the Columns..
 * Jagged array:it is store the unequal Number of the Columns
 * 
 * example of the  one dimen
 *  Scanner scan=new Scanner(System.in);
        System.out.println("Enter the array ");
        int num=scan.nextInt();
         System.out.println("Enter the array with the elements..");
        int a[]=new int[num];
        for(int i=0;i<a.length;i++){
            a[i]=scan.nextInt();
        }
        System.out.println("The Array Elements You Entered..");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
            // System.out.println(); 
        }

        System.out.println("The Accessed Array elements is the..");
          System.out.print(a[5]);
 * 
 */


import java.util.Scanner;
public class DayFive03{
    public static void main(String[] args){
        int a[][]={{10,20,30},{40,50,60},{70,80,90}};
        // System.out.println(a[0][0]);
        // System.out.println(a[0][1]);
        // System.out.println(a[0][2]);
          System.out.println(a[1][0]);
        System.out.println(a[1][1]);
        System.out.println(a[1][2]);
       }
}