public class EmployeeTest {
    public static void main(String[] args) {
        EmployeeManagementSystem system = new EmployeeManagementSystem(5);

        system.addEmployee(new Employee(1, "Sowmya", "Developer", 50000));
        system.addEmployee(new Employee(2, "Ravi", "Tester", 40000));
        system.addEmployee(new Employee(3, "Anu", "Manager", 65000));

        System.out.println("\nAll Employees:");
        system.displayEmployees();

        System.out.println("\nSearching for Employee ID 2:");
        Employee found = system.searchEmployee(2);
        if (found != null) {
            System.out.println(found);
        } else {
            System.out.println("Employee not found.");
        }

        System.out.println("\nDeleting Employee ID 1:");
        system.deleteEmployee(1);

        System.out.println("\nEmployees after deletion:");
        system.displayEmployees();
    }
}