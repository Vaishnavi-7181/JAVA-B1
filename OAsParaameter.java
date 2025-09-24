class OAsParaameter {
    String name;
    int age;

    // Constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display person details
    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class ObjectDemo {

    // Method that takes a Person object and returns a new Person with updated age
    static Person celebrateBirthday(Person p) {
        return new Person(p.name, p.age + 1); // returns a new object
    }

    public static void main(String[] args) {
        Person original = new Person("Aarav", 25);
        original.display();

        Person updated = celebrateBirthday(original);
        updated.display();
    }
}
