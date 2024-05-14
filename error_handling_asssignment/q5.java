import java.util.Scanner;

public class q5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a value for x: ");
            double x = scanner.nextDouble();
            if (x <= 0) {
                throw new NullPointerException("Invalid input: x must be greater than 0");
            }
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    // Method to perform complex mathematical computations
    
}
