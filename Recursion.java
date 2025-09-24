public class Recursion {

    // Recursive method to find nth Fibonacci number
    static int fibonacci(int n) {
        if (n <= 1) {
            return n; // Base cases: fib(0) = 0, fib(1) = 1
        }
        return fibonacci(n - 1) + fibonacci(n - 2); // Recursive calls
    }

    public static void main(String[] args) {
        int count = 10;
        System.out.println("Fibonacci sequence up to " + count + " terms:");
        for (int i = 0; i < count; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}
