class COverloading{
    String name;
    int age;
    String department;

    // Constructor 1: No parameters
    Employee() {
        name = "Unknown";
        age = 0;
        department = "Not Assigned";
    }

    // Constructor 2: One parameter
    Employee(String n) {
        name = n;
        age = 25; // default age
        department = "General";
    }

    // Constructor 3: Two parameters
    Employee(String n, int a) {
        name = n;
        age = a;
        department = "General";
    }

    // Constructor 4: Three parameters
    Employee(String n, int a, String d) {
        name = n;
        age = a;
        department = d;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age + ", Department: " + department);
    }
}

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee("Ravi");
        Employee e3 = new Employee("Sneha", 30);
        Employee e4 = new Employee("Amit", 28, "HR");

        e1.display();
        e2.display();
        e3.display();
        e4.display();
    }
}
