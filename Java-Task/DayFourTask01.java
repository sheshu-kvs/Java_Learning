/*conditionals in Java
*If:It executes the block of the code if the given condition is true.
* ex: int mark = 78;
        if (mark > 75) {
            System.out.println("First Division...");
        } 
/*If-else
 * Executes the block of the code if the given condition is false.
 * ex: int mark = 69;
        if (mark > 75) {
            System.out.println("First Division...");
        } else {
            System.out.println("Second Division..");
        }
 * 
 * elseIf
 * it allows you to the testing multiple conditions sequentially.
 * 
 * switch 
 * A switch is multi-way branching  based  value of an expression.
 */

public class DayFourTask01 {

    public static void main(String args[]) {
        int mark = 80;
        if (mark > 75) {
            System.out.println("First Division...");
        } else if (mark > 60) {
            System.out.println("Second Division..");
        } else if (mark > 35) {
            System.out.println("Passed..");
        } else {
            System.out.println("Failed! Write once Again..");
        }
    }

}
