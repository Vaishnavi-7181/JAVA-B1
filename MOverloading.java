class MOverloading {

    // Method 1: Adds two integers
    int add(int a, int b) {
        return a + b;
    }

    // Method 2: Adds three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method 3: Adds two doubles
    double add(double a, double b) {
        return a + b;
    }

    // Method 4: Adds a string and an integer (returns concatenated string)
    String add(String s, int n) {
        return s + n;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("add(int, int): " + calc.add(10, 20));
        System.out.println("add(int, int, int): " + calc.add(5, 15, 25));
        System.out.println("add(double, double): " + calc.add(3.5, 2.5));
        System.out.println("add(String, int): " + calc.add("Age: ", 30));
    }
}
