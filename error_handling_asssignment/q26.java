class MethodNotFoundException extends Exception {
    public MethodNotFoundException(String message) {
        super(message);
    }
}

public class q26 {
    public static void main(String[] args) {
        try {
            // Attempt to load a non-existent class
            Class.forName("NonExistentClass");
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException caught: " + e.getMessage());
        }

        try {
            // Attempt to call a non-existent method
            callNonExistentMethod();
        } catch (MethodNotFoundException e) {
            System.out.println("MethodNotFoundException caught: " + e.getMessage());
        } finally {
            // This block is always executed, regardless of whether an exception occurred or not
            System.out.println("Finally block executed");
        }
    }

    public static void callNonExistentMethod() throws MethodNotFoundException {
        // Simulate a situation where a method is not found
        throw new MethodNotFoundException("Method not found: callNonExistentMethod");
    }
}
