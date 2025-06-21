public class Main {
    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager(5);  

        manager.addEmployee(new Employee(101, "Nithish", "Developer", 50000));
        manager.addEmployee(new Employee(102, "Sanjeev", "Designer", 48000));
        manager.addEmployee(new Employee(103, "Lokesh", "Manager", 75000));

        manager.listEmployees();

        System.out.println("\nSearch Employee by ID 102:");
        Employee found = manager.searchById(102);
        if (found != null) found.display();
        else System.out.println("Not found");

        System.out.println("\nDelete Employee ID 102:");
        manager.deleteEmployee(102);
        manager.listEmployees();
    }
}
