public class EmployeeManager {
    private Employee[] employees;
    private int size;

    public EmployeeManager(int capacity) {
        employees = new Employee[capacity];
        size = 0;
    }

    
    public void addEmployee(Employee e) {
        if (size < employees.length) {
            employees[size++] = e;
            System.out.println("Employee added: " + e.name);
        } else {
            System.out.println("Cannot add more employees (array full).");
        }
    }

    
    public Employee searchById(int id) {
        for (int i = 0; i < size; i++) {
            if (employees[i].employeeId == id) {
                return employees[i];
            }
        }
        return null;
    }

    public void listEmployees() {
        if (size == 0) {
            System.out.println("No employees found.");
        } else {
            System.out.println("Employee List:");
            for (int i = 0; i < size; i++) {
                employees[i].display();
            }
        }
    }

 
    public void deleteEmployee(int id) {
        for (int i = 0; i < size; i++) {
            if (employees[i].employeeId == id) {
                
                for (int j = i; j < size - 1; j++) {
                    employees[j] = employees[j + 1];
                }
                employees[--size] = null;
                System.out.println("Employee with ID " + id + " deleted.");
                return;
            }
        }
        System.out.println(" Employee not found.");
    }
}
