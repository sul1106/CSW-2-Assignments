import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class q24 {
    public static void main(String[] args) {
        try {
            
            File file = new File("non_existent_file.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
           
        } catch (FileNotFoundException e) {
           
            System.out.println("File not found: " + e.getMessage());
        }
    }
}
