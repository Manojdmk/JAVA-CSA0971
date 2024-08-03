import java.util.ArrayList;
import java.util.Scanner;

class Employee {
    String id, name; double salary; 
    Employee(String id, String name, double salary) { this.id = id; this.name = name; this.salary = salary; }
    public String toString() { return id + ": " + name + " ($" + salary + ")"; }
}

class EmployeeManagement {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Add Employee (id name salary) or type 'exit': ");
            String input = scanner.nextLine();
            if (input.equals("exit")) break;
            String[] data = input.split(" ");
            employees.add(new Employee(data[0], data[1], Double.parseDouble(data[2])));
            employees.forEach(System.out::println);
        }
        scanner.close();
    }
}
