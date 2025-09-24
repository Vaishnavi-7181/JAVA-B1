public class SP5 {
    public static void main(String[] args) {
        // Declare and initialize boolean variables
        boolean condition1 = true;
        boolean condition2 = false;
        boolean condition3 = true;

        System.out.println("Original conditions:");
        System.out.println("condition1: " + condition1); // Output: true
        System.out.println("condition2: " + condition2); // Output: false
        System.out.println("condition3: " + condition3); // Output: true
        System.out.println();

        // Logical AND (&&)
        // Returns true only if both operands are true
        boolean andResult1 = condition1 && condition2; // true && false = false
        boolean andResult2 = condition1 && condition3; // true && true = true
        System.out.println("Logical AND (&&):");
        System.out.println("condition1 && condition2: " + andResult1); // Output: false
        System.out.println("condition1 && condition3: " + andResult2); // Output: true
        System.out.println();

        // Logical OR (||)
        // Returns true if at least one operand is true
        boolean orResult1 = condition1 || condition2; // true || false = true
        boolean orResult2 = condition2 || condition2; // false || false = false
        System.out.println("Logical OR (||):");
        System.out.println("condition1 || condition2: " + orResult1); // Output: true
        System.out.println("condition2 || condition2: " + orResult2); // Output: false
        System.out.println();

        // Logical NOT (!)
        // Reverses the logical state of the operand
        boolean notResult1 = !condition1; // !true = false
        boolean notResult2 = !condition2; // !false = true
        System.out.println("Logical NOT (!):");
        System.out.println("!condition1: " + notResult1); // Output: false
        System.out.println("!condition2: " + notResult2); // Output: true
        System.out.println();

        // Combining operators
        boolean combinedResult = (condition1 && !condition2) || condition3; // (true && true) || true = true || true = true
        System.out.println("Combined operators: (condition1 && !condition2) || condition3");
        System.out.println("Result: " + combinedResult); // Output: true
    }
}