class MParameters {

    // Method with parameters and int return type
    int add(int a, int b) {
        return a + b;
    }

    // Method with parameters and double return type
    double multiply(double x, double y) {
        return x * y;
    }

    // Method with parameters and String return type
    String greet(String name) {
        return "Hello, " + name + "!";
    }

    // Method with no parameters and void return type
    void showMessage() {
        System.out.println("Welcome to Math Operations!");
    }
}

public class Main {
    public static void main(String[] args) {
        MathOperations mo = new MathOperations();

        mo.showMessage(); // void method

        int sum = mo.add(10, 20);
        System.out.println("Sum: " + sum);

        double product = mo.multiply(3.5, 2.0);
        System.out.println("Product: " + product);

        String message = mo.greet("Amit");
        System.out.println(message);
    }
}
