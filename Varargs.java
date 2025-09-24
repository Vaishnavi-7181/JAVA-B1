public class Varargs {

    // Method that takes variable number of integers
    static int sum(int... numbers) {
        int total = 0;
        for (int num : numbers) {
            total += num;
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println("Sum of 1, 2, 3: " + sum(1, 2, 3));
        System.out.println("Sum of 10, 20: " + sum(10, 20));
        System.out.println("Sum of no arguments: " + sum());
    }
}
