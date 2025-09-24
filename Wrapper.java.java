public class SP6 {
    public static void main(String[] args) {
        // Autoboxing: Primitive 'int' automatically converted to 'Integer' object
        int primitiveInt = 100;
        Integer wrappedInt = primitiveInt; // Autoboxing

        // Unboxing: 'Integer' object automatically converted back to primitive 'int'
        int unwrappedInt = wrappedInt; // Unboxing

        // Using a utility method from a Wrapper class
        String strNumber = "456";
        int parsedInt = Integer.parseInt(strNumber); // Parses a String to an int

        // Demonstrating a constant from a Wrapper class
        System.out.println("Maximum value of an Integer: " + Integer.MAX_VALUE);

        // Outputting the values
        System.out.println("Original primitive int: " + primitiveInt);
        System.out.println("Autoboxed Integer object: " + wrappedInt);
        System.out.println("Unboxed primitive int: " + unwrappedInt);
        System.out.println("Parsed int from string: " + parsedInt);
    }
}