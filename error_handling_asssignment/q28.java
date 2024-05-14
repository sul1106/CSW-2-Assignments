public class q28 {
    public static void main(String[] args) {
        try {
            // Trigger StackOverflowError by calling recursive method
            recursiveMethod(1);
        } catch (StackOverflowError e) {
            System.out.println("StackOverflowError caught!");
        }
    }

    public static void recursiveMethod(int counter) {
        System.out.println("Method call: " + counter);
        recursiveMethod(counter + 1); // Recursive call without base case
    }
}
