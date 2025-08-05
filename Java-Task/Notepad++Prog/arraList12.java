import java.util.*;

class Employee {
    int id;
    String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return "ID: " + id + ", Name: " + name;
    }
}

public class arralist12 {
    public static void main(String[] args) {
        ArrayList<Employee> empList = new ArrayList<>();

        empList.add(new Employee(1, "Alice"));
        empList.add(new Employee(2, "Bob"));
        empList.add(new Employee(3, "Charlie"));
        empList.add(new Employee(4, "David"));
        empList.add(new Employee(5, "Eve"));

        System.out.println("Before Deletion:");
        for (Employee e : empList) {
            System.out.println(e);
        }

        // Let's say we want to delete employee with id = 3
        int deleteId = 3;

        Employee toDelete = null;
        for (Employee e : empList) {
            if (e.id == deleteId) {
                toDelete = e;
                break;
            }
        }

        if (toDelete != null) {
            empList.remove(toDelete);
            System.out.println("\nEmployee with ID " + deleteId + " deleted.");
        } else {
            System.out.println("\nEmployee not found.");
        }

        System.out.println("\nAfter Deletion:");
        for (Employee e : empList) {
            System.out.println(e);
        }
    }
}
